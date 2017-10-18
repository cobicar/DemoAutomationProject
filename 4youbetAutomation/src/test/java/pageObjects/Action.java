package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

/**
 *
 * @author Ivan Cabarkapa
 */
public class Action {
        
        // Login to domain with username and password already defined (in Environment.java)
        public static void login(WebDriver driver){
        PortalPage.open(driver);
        PortalPage.usernameField(driver).click();        
        PortalPage.usernameField(driver).clear();
        PortalPage.usernameField(driver).sendKeys(PortalPage.PlayerUsername);
        PortalPage.passwordField(driver).click();
        PortalPage.passwordField(driver).clear();
        PortalPage.passwordField(driver).sendKeys(PortalPage.PlayerPassword);
        PortalPage.loginButton(driver).click();
        }
        
        // Login to domain with any username and password
        public static void login(WebDriver driver, String username, String password){
        PortalPage.open(driver);
        PortalPage.usernameField(driver).click();        
        PortalPage.usernameField(driver).clear();
        PortalPage.usernameField(driver).sendKeys(username);
        PortalPage.passwordField(driver).click();
        PortalPage.passwordField(driver).clear();
        PortalPage.passwordField(driver).sendKeys(password);
        PortalPage.loginButton(driver).click();
        }
        
        //Fluent wait for specified element
        public static void fluentWait(WebDriver driver, WebElement element){
        FluentWait wait = new FluentWait(driver)
       .withTimeout(30, TimeUnit.SECONDS)
       .pollingEvery(1, TimeUnit.SECONDS)
       .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        
    }
