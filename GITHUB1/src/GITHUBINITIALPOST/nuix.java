package GITHUBINITIALPOST;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
;

public class nuix {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test 
  public void testNuix() throws Exception {
	//Navigate to Google
	driver.get(baseUrl);
    //Search for 'slickdeals'
	driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("slickdeals");
    Thread.sleep(2000);
    //Click on link to slickdeal.com
    driver.findElement(By.linkText("Slickdeals: The Best Deals, Coupons, Promo Codes ...")).click();
    //driver.findElement(By.linkText("classic view")).click();
    Thread.sleep(2000);
    //Click on banner link to switch to classic view
    driver.findElement(By.linkText("classic view")).click();
    Thread.sleep(3000);
    //Take a screen capture
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile, new File("/Users/TORO/Desktop/vera.png"),true);
      	
    }
    
  @After
   public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
