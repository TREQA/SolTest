package MODSOLAR_PLATFORM_OFFICIAL_REGRESSION_QA;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class NEWLEAD_OFFICIAL_QA {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  

  

  @Before
  public void setUp() throws Exception {
	FirefoxProfile firefoxProfile = new FirefoxProfile();
    driver = new FirefoxDriver();
    baseUrl = "https://qa.modsolar.net/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

 @Test
 public void testNewLead() throws Exception {
driver.get(baseUrl + "/ModSolarPlatform/login.jsp");
driver.findElement(By.id("username")).sendKeys("jakeautomation");
driver.findElement(By.id("password")).sendKeys("qa");
driver.findElement(By.name("submit")).click();
driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
//driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("69");
Thread.sleep(2000);
driver.findElement(By.cssSelector("div.newLeadList")).click();
 Thread.sleep(2000);
 driver.findElement(By.id("tabResidential")).click();
 Thread.sleep(2000);
 driver.findElement(By.linkText("Home")).click();
 Thread.sleep(2000);
 driver.findElement(By.cssSelector("div.newLeadList")).click();
 Thread.sleep(2000);
 driver.findElement(By.id("tabCommercial")).click();
 Thread.sleep(2000);
 driver.findElement(By.linkText("Home")).click();
 Thread.sleep(2000);
 driver.findElement(By.cssSelector("div.newLeadList")).click();
 Thread.sleep(2000);
 driver.findElement(By.id("tabMunicipal")).click();
 Thread.sleep(2000);
 driver.findElement(By.linkText("Home")).click();
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
