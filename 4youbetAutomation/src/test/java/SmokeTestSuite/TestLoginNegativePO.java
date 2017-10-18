
package SmokeTestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Action;
import pageObjects.Environment;
import pageObjects.PortalPage;

/**
 *
 * @author Ivan Cabarkapa
 * 
 */

public class TestLoginNegativePO {
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
    public void LoginNegativePO() {
        // User login with wrong password
        Action.login(wd, PortalPage.PlayerUsername, "WRONG");
        // Assert URL
        assertTrue("\"Domain\" is not correct ", PortalPage.getCurrentUrl(wd).equals(PortalPage.PortalLoginURL));
        // Validate if "Login failed" popup appears
        assertTrue("\"Login failed header\" is not correct ", (PortalPage.popupLoginFailedHeader(wd).isDisplayed()));
        assertTrue("\"Login failed body\" is not correct ", (PortalPage.popupLoginFailedBody(wd).isDisplayed()));
        assertTrue("\"Login failed text\" is not correct ", (PortalPage.popupLoginFailedBody(wd).getText().equals("Invalid Login Details.")));
        // Close "Login failed" popup window
        PortalPage.popupLoginFailedCloseButton(wd).click();
    }
    
    @After
    public void tearDown() {
        wd.quit();
    }
} 
