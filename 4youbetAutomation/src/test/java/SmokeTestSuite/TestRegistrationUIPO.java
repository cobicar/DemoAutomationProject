package SmokeTestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Environment;
import pageObjects.PortalPage;
import pageObjects.RegisterPage;

/**
 *
 * @author Ivan Cabarkapa
 * 
 */
public class TestRegistrationUIPO {
    
    ChromeDriver wd;
    
    @Before
    public void setUp() throws Exception {
        System.setProperty(Environment.DriverConfig,Environment.ChromeDriverPath);
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().window().maximize();
    }
    
    @Test
    public void RegistrationUIPO() throws InterruptedException {
        // Open home page
        PortalPage.open(wd);
        // Click on register button
        assertTrue(RegisterPage.registerButton(wd).isDisplayed());
        RegisterPage.registerButton(wd).click();
        // Assert current url
        assertEquals(RegisterPage.RegisterCurrentURL, RegisterPage.getCurrentUrl(wd));
        // Asssert all relevant labels
        assertTrue("\"First name\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("First name")));
        assertTrue("\"Last name\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("Last name")));
        assertTrue("\"e-mail\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("e-mail")));
        assertTrue("\"Username\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("Username")));
        assertTrue("\"Password\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("Password")));
        assertTrue("\"Confirm the Passwordv not shown correctly ",(RegisterPage.wholePageElements(wd).contains("Confirm the Password")));
        assertTrue("\"Language\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("Language")));
        assertTrue("\"Phone\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("Phone")));
        assertTrue("\"Date Of Birth\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("Date Of Birth")));
        assertTrue("\"Gender\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("Gender")));
        assertTrue("\"Promo Code\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("Promo Code")));
        assertTrue("\"Country\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("Country")));
        assertTrue("\"City\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("City")));
        assertTrue("\"ZIP\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("ZIP")));
        assertTrue("\"Address\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("Address")));
        assertTrue("\"Currency\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("Currency")));
        assertTrue("\"Enter captcha code\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("Enter captcha code")));
        assertTrue("\"Terms\" not shown correctly ",(RegisterPage.wholePageElements(wd).contains("I declare to be over 18 years and know and accept the Terms and Conditions of 4youbet.com")));
        // Print result
        System.out.println("All labels are verified on the Register page!");
        
        // Assert all important elements are present
        assertTrue(RegisterPage.firstNameInput(wd).isDisplayed());
        assertTrue(RegisterPage.lastNameInput(wd).isDisplayed());
        assertTrue(RegisterPage.emailInput(wd).isDisplayed());
        assertTrue(RegisterPage.usernameInput(wd).isDisplayed());
        assertTrue(RegisterPage.passwordInput(wd).isDisplayed());
        assertTrue(RegisterPage.confirmPasswordInput(wd).isDisplayed());
        assertTrue(RegisterPage.langSelect(wd).isDisplayed());
        assertTrue(RegisterPage.phoneInput(wd).isDisplayed());
        assertTrue(RegisterPage.dateInput(wd).isDisplayed());
        assertTrue(RegisterPage.genderRadio(wd).isDisplayed());
        assertTrue(RegisterPage.promoInput(wd).isDisplayed());
        assertTrue(RegisterPage.countrySelect(wd).isDisplayed());
        assertTrue(RegisterPage.cityInput(wd).isDisplayed());
        assertTrue(RegisterPage.zipInput(wd).isDisplayed());
        assertTrue(RegisterPage.streetInput(wd).isDisplayed());
        assertTrue(RegisterPage.currencyInput(wd).isDisplayed());
        assertTrue(RegisterPage.captchaImage(wd).isDisplayed());
        assertTrue(RegisterPage.captchaInput(wd).isDisplayed());
        assertTrue(RegisterPage.termsCheckbox(wd).isDisplayed());
        assertTrue(RegisterPage.submitButton(wd).isDisplayed());
        // Print result
        System.out.println("All elements are present on the Register page!");
        
        // Select terms and click submit button
        RegisterPage.termsCheckbox(wd).click();
        RegisterPage.submitButton(wd).click();
        // Assert warning messages
        assertTrue(RegisterPage.firstNameWarning(wd).isDisplayed());
        assertTrue(RegisterPage.lastNameWarning(wd).isDisplayed());
        assertTrue(RegisterPage.emailWarning(wd).isDisplayed());
        assertTrue(RegisterPage.usernameWarning(wd).isDisplayed());
        assertTrue(RegisterPage.passwordWarning(wd).isDisplayed());
        assertTrue(RegisterPage.confirmPasswordWarning(wd).isDisplayed());
        assertTrue(RegisterPage.dateWarning(wd).isDisplayed());
        assertTrue(RegisterPage.cityWarning(wd).isDisplayed());
        assertTrue(RegisterPage.zipWarning(wd).isDisplayed());
        assertTrue(RegisterPage.addressWarning(wd).isDisplayed());
        assertTrue(RegisterPage.captchaWarning(wd).isDisplayed());
        // Print result
        System.out.println("All warning messages are verified on the Register page!");
    }
    
    @After
    public void tearDown() {
        wd.quit();
    }
}
