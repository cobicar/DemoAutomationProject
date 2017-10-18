
package SmokeTestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import pageObjects.Action;
import pageObjects.Environment;
import pageObjects.MyProfilePage;
import pageObjects.PortalPage;

/**
 *
 * @author Ivan Cabarkapa
 * 
 */

public class TestLoginLogoutPO {
    ChromeDriver wd;
    
    @Before
    public void setUp() throws Exception {
        //Start Chrome browser and maximize browser window
        System.setProperty(Environment.DriverConfig,Environment.ChromeDriverPath);
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().window().maximize();
    }
    
    @Test
    public void LoginLogout() throws InterruptedException{
        // User login
        Action.login(wd);
        // Navigate to My profile page
        PortalPage.playerButton(wd).click();
        // Assert current url
        assertTrue("\"Domain\" is not correct ",(PortalPage.getCurrentUrl(wd).equals(Environment.PortalUserURL)));
        // Wait for DOM to refresh and validate submit button
        Action.fluentWait(wd, MyProfilePage.submitButton(wd));
        // User logout
        assertTrue(PortalPage.logoutButton(wd).isDisplayed());
        PortalPage.logoutButton(wd).click();
        // Assert elements upon logout
        assertTrue("\"Username filed\" is not displayed ", PortalPage.usernameField(wd).isDisplayed());
        assertTrue("\"Password filed\" is not displayed ", PortalPage.passwordField(wd).isDisplayed());
    }
    
    @After
    public void tearDown() {
        wd.quit();
    }
}

