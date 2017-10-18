package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Ivan.Cabarkapa
 */
public class RegisterPage extends Environment {
    
    // Element initialization
    public static WebElement element = null;
    private static String tempString = null;
    
    // Page elements (WebElements)
    
    public static WebElement registerButton (WebDriver driver){
    element = driver.findElement(By.linkText("REGISTER NOW!"));
    return element;
    }
    
    public static WebElement firstNameInput (WebDriver driver){
    element = driver.findElement(By.id("FirstName"));
    return element;
    }
    
    public static WebElement lastNameInput (WebDriver driver){
    element = driver.findElement(By.id("LastName"));
    return element;
    }
    
    public static WebElement emailInput (WebDriver driver){
    element = driver.findElement(By.id("Email"));
    return element;
    }
    
    public static WebElement usernameInput (WebDriver driver){
    element = driver.findElement(By.id("RegisterUsername"));
    return element;
    }
    
    public static WebElement passwordInput (WebDriver driver){
    element = driver.findElement(By.cssSelector(".col-sm-9 #Password"));
    return element;
    }
    
    public static WebElement confirmPasswordInput (WebDriver driver){
    element = driver.findElement(By.id("ConfirmPassword"));
    return element;
    }
    
    public static WebElement langSelect (WebDriver driver){
    element = driver.findElement(By.id("LanguageISO"));
    return element;
    }
    
    public static WebElement dateInput (WebDriver driver){
    element = driver.findElement(By.id("DateOfBirth"));
    return element;
    }
    
    public static WebElement genderRadio (WebDriver driver){
    element = driver.findElement(By.id("Gender"));
    return element;
    }
    
    public static WebElement promoInput (WebDriver driver){
    element = driver.findElement(By.id("Voucher"));
    return element;
    }
    
    public static WebElement phoneInput (WebDriver driver){
    element = driver.findElement(By.id("LanguageISO"));
    return element;
    }
    
    public static WebElement countrySelect (WebDriver driver){
    element = driver.findElement(By.id("CountryISO"));
    return element;
    }
    
    public static WebElement cityInput (WebDriver driver){
    element = driver.findElement(By.id("City"));
    return element;
    }
    
    public static WebElement zipInput (WebDriver driver){
    element = driver.findElement(By.id("Postcode"));
    return element;
    }
    
    public static WebElement streetInput (WebDriver driver){
    element = driver.findElement(By.id("Street"));
    return element;
    }
    
    public static WebElement currencyInput (WebDriver driver){
    element = driver.findElement(By.id("CurrencyISO"));
    return element;
    }
    
    public static WebElement captchaImage (WebDriver driver){
    element = driver.findElement(By.id("imgCaptcha"));
    return element;
    }
    
    public static WebElement captchaInput (WebDriver driver){
    element = driver.findElement(By.id("Captcha"));
    return element;
    }
    
    public static WebElement termsCheckbox (WebDriver driver){
    element = driver.findElement(By.id("cbTerms"));
    return element;
    }
    
    public static WebElement submitButton (WebDriver driver){
    element = driver.findElement(By.id("registerButton"));
    return element;
    }
    
    public static WebElement firstNameWarning (WebDriver driver){
    element = driver.findElement(By.id("FirstName-error"));
    return element;
    }
    
    public static WebElement lastNameWarning (WebDriver driver){
    element = driver.findElement(By.id("LastName-error"));
    return element;
    }
    
    public static WebElement emailWarning (WebDriver driver){
    element = driver.findElement(By.id("Email-error"));
    return element;
    }
    
    public static WebElement usernameWarning (WebDriver driver){
    element = driver.findElement(By.id("RegisterUsername-error"));
    return element;
    }
    
    public static WebElement passwordWarning (WebDriver driver){
    element = driver.findElement(By.id("Password-error"));
    return element;
    }
    
    public static WebElement confirmPasswordWarning (WebDriver driver){
    element = driver.findElement(By.id("ConfirmPassword-error"));
    return element;
    }
    
    public static WebElement phoneWarning (WebDriver driver){
    element = driver.findElement(By.id("Phone-error"));
    return element;
    }
    
    public static WebElement dateWarning (WebDriver driver){
    element = driver.findElement(By.id("DateOfBirth-error"));
    return element;
    }
    
    public static WebElement cityWarning (WebDriver driver){
    element = driver.findElement(By.id("City-error"));
    return element;
    }
    
    public static WebElement zipWarning (WebDriver driver){
    element = driver.findElement(By.id("Postcode-error"));
    return element;
    }
    
    public static WebElement addressWarning (WebDriver driver){
    element = driver.findElement(By.id("Street-error"));
    return element;
    }
    
    public static WebElement captchaWarning (WebDriver driver){
    element = driver.findElement(By.id("Captcha-error"));
    return element;
    }
    
    // HTML of opened page is extracted to String (used for verification)
    public static String wholePageElements (WebDriver driver){
    tempString = driver.findElement(By.tagName("html")).getText();
    return tempString;
    }
    
    public static String getCurrentUrl(WebDriver driver){ 
    tempString = driver.getCurrentUrl(); 
    return tempString; 
    }
}
