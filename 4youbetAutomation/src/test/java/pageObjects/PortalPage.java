package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author Ivan Cabarkapa
 */
public class PortalPage extends Environment{
    
    // Element initialization
    private static WebElement element = null;
    private static String tempString = null;
    
    // Page elements (WebElements)
    
    public static WebElement usernameField(WebDriver driver){ 
    element = driver.findElement(By.id("Username")); 
    return element; 
    }
    
    public static WebElement passwordField(WebDriver driver){ 
    element = driver.findElement(By.id("Password")); 
    return element; 
    }
    
    public static WebElement playerButton(WebDriver driver){ 
    element = driver.findElement(By.cssSelector(".logged-menu-bottom .hidden-xs")); 
    return element; 
    }
    
    public static WebElement registerButton(WebDriver driver){ 
    element = driver.findElement(By.id("join-now")); 
    return element; 
    }
    
    public static WebElement loginButton(WebDriver driver){ 
    element = driver.findElement(By.cssSelector(".userlogin .btn-login")); 
    return element; 
    }
    
    public static WebElement logoutButton(WebDriver driver){ 
    element = driver.findElement(By.linkText("LOGOUT")); 
    return element; 
    }
    
    public static WebElement profileButton(WebDriver driver){ 
    element = driver.findElement(By.id("yourBtn")); 
    return element; 
    }   
    
    public static WebElement popupLoginFailedHeader(WebDriver driver){ 
    element = driver.findElement(By.id("ui-id-2")); 
    return element; 
    }
    
    public static WebElement popupLoginFailedBody(WebDriver driver){ 
    element = driver.findElement(By.id("ui-id-1")); 
    return element; 
    }
    
    public static WebElement popupLoginFailedCloseButton(WebDriver driver){ 
    element = driver.findElement(By.cssSelector(".ui-icon-closethick")); 
    return element; 
    }
    
    public static void open(WebDriver driver){
        driver.get(PortalURL);
    }
    
    public static String getCurrentUrl(WebDriver driver){ 
    tempString = driver.getCurrentUrl(); 
    return tempString; 
    }
    
    public static WebElement depositButton (WebDriver driver){
    element = driver.findElement(By.xpath("//span[contains(.,'Deposit')]"));
    return element;
    }
    
}
