package SmokeTestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Action;
import pageObjects.Environment;
import pageObjects.MyProfilePage;
import pageObjects.PortalPage;

/**
 *
 * @author Ivan Cabarkapa
 */
public class TestAmountInputPO {
    
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
    public void AmountInputPO() throws InterruptedException {
        // User login
        Action.login(wd);        
        // Click on Deposit button
        assertTrue(PortalPage.depositButton(wd).isDisplayed());
        PortalPage.depositButton(wd).click();
        // Wait for tab to load
        Action.fluentWait(wd, MyProfilePage.tabDepositsWithdrawals(wd));
        // Assert tab name
        assertTrue("\"Deposits & Withdrawals\" not shown correctly ",(MyProfilePage.tabDepositsWithdrawals(wd).getText().contains("Deposits & Withdrawals")));
        // Wait for page to load elements
        assertTrue(MyProfilePage.depositHeader(wd).isDisplayed());
        assertTrue(MyProfilePage.depositForm(wd).isDisplayed());
        assertTrue(MyProfilePage.paymentMethodsTable(wd).isDisplayed());
        // Click deposit on test card 3
        Thread.sleep(1000);
        assertTrue(MyProfilePage.testCardDepositButton(wd).isDisplayed());
        MyProfilePage.testCardDepositButton(wd).click();
        // Assert empty amount filed warning
        assertTrue("\"Amount input\" filed is not color red ",(MyProfilePage.amountField(wd).getAttribute("style").contains("color: red; border-color: red;")));
        // Enter "test" to amount field
        MyProfilePage.amountField(wd).click();
        MyProfilePage.amountField(wd).clear();
        MyProfilePage.amountField(wd).sendKeys("test");
        MyProfilePage.testCardDepositButton(wd).click();
        // Assert Invalid Amount warning
        assertTrue("\"Amount input\" filed is not color red ",(MyProfilePage.amountField(wd).getAttribute("style").contains("color: red; border-color: red;")));
        // Entering correct amount (10$ in this scenario)
        Action.fluentWait(wd, MyProfilePage.amountField(wd));
        MyProfilePage.amountField(wd).clear();
        MyProfilePage.amountField(wd).sendKeys("10");
        // Click "Deposit" button for mastercard
        assertTrue(MyProfilePage.testCardDepositButton(wd).isDisplayed());
        MyProfilePage.testCardDepositButton(wd).click();
        // Validate that user can proceed with transaction
        assertTrue(MyProfilePage.proceedDepositButton(wd).isDisplayed());
    }
    
    @After
    public void tearDown() {
        wd.quit();
    }
}
