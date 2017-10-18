
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Ivan Cabarkapa
 */
public class MyProfilePage extends Environment {
    
    // Element initialization
    public static WebElement element = null;
    private static String tempString = null; 
    
    // Page elements (WebElements)
    public static WebElement amountValue (WebDriver driver){
    element = driver.findElement(By.id("lblAmountVal"));
    return element;
    }
    
    public static WebElement tabDepositsWithdrawals (WebDriver driver){
    element = driver.findElement(By.id("tabPayment"));
    return element;
    }
    
    public static WebElement testCardDepositButton (WebDriver driver){
    element = driver.findElement(By.id("2"));
    return element;
    }

    // HTML of opened page is extracted to String (used for verification)
    public static String wholePageElements (WebDriver driver){
    tempString = driver.findElement(By.tagName("html")).getText();
    return tempString;
    }
    
    public static WebElement amountField (WebDriver driver){
    element = driver.findElement(By.id("amount"));
    return element;
    }
    
    public static WebElement submitButton (WebDriver driver){
    element = driver.findElement(By.id("saveProfile"));
    return element;
    }
    
    public static WebElement cancelButton (WebDriver driver){
    element = driver.findElement(By.id("btnCancel"));
    return element;
    }
    
    public static WebElement proceedDepositButton (WebDriver driver){
    element = driver.findElement(By.id("btnProceed"));
    return element;
    }
    
    public static String getCurrentUrl(WebDriver driver){ 
    tempString = driver.getCurrentUrl(); 
    return tempString; 
    }
    
    public static WebElement depositButton (WebDriver driver){
    element = driver.findElement(By.id("deposit"));
    return element;
    }
    
    public static WebElement depositHeader (WebDriver driver){
    element = driver.findElement(By.id("divForDeposit"));
    return element;
    }
    
    public static WebElement depositForm (WebDriver driver){
    element = driver.findElement(By.id("depositForm"));
    return element;
    }
    
    public static WebElement paymentMethodsTable (WebDriver driver){
    element = driver.findElement(By.id("paymentMethodsDiv"));
    return element;
    }
    
}
