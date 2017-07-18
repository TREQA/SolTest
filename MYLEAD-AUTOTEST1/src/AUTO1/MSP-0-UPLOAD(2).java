package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MSP0UPLOAD2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://qa.modsolar.net/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMSP0UPLOAD2() throws Exception {
    driver.get(baseUrl + "/ModSolarPlatform/login.jsp;jsessionid=C3C02DF3D13F0A7A87AAF28278B9EAF5");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("christian");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("idia26maha83");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("0");
    driver.findElement(By.xpath("//table[@id='clientsTable']/thead/tr/th[2]/div/div")).click();
    driver.findElement(By.cssSelector("div.newLeadList")).click();
    driver.findElement(By.id("tabResidential")).click();
    driver.findElement(By.id("firstNameResidential")).clear();
    driver.findElement(By.id("firstNameResidential")).sendKeys("AUTO021416");
    driver.findElement(By.id("lastNameResidential")).clear();
    driver.findElement(By.id("lastNameResidential")).sendKeys("AUTO021416");
    driver.findElement(By.id("addressResidential")).clear();
    driver.findElement(By.id("addressResidential")).sendKeys("600 Clipper Rd");
    driver.findElement(By.id("cityResidential")).clear();
    driver.findElement(By.id("cityResidential")).sendKeys("Belmont");
    new Select(driver.findElement(By.id("stateResidential"))).selectByVisibleText("California");
    driver.findElement(By.id("zipCodeResidential")).clear();
    driver.findElement(By.id("zipCodeResidential")).sendKeys("94002");
    driver.findElement(By.id("emailResidential")).clear();
    driver.findElement(By.id("emailResidential")).sendKeys("christian@modsolar.com");
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).clear();
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).sendKeys("1.2");
    driver.findElement(By.id("yearlyUsageResidential")).clear();
    driver.findElement(By.id("yearlyUsageResidential")).sendKeys("120");
    driver.findElement(By.id("nextBtn")).click();
    driver.findElement(By.xpath("//div[@id='mapCanvas']/div/div/div[2]")).click();
    driver.findElement(By.xpath("//div[@id='mapCanvas']/div/div/div[2]")).click();
    driver.findElement(By.id("accordion")).click();
    driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
    driver.findElement(By.cssSelector("#invertersTab > h3")).click();
    driver.findElement(By.id("nextButton")).click();
    driver.findElement(By.id("selectedProgramCheckbox_563")).click();
    driver.findElement(By.id("nextButton")).click();
    driver.findElement(By.xpath("//input[@value='Yes']")).click();
    driver.findElement(By.cssSelector("label > input[type=\"button\"]")).click();
    driver.findElement(By.cssSelector("div.lightfaceFooter > label")).click();
    driver.findElement(By.id("supplyLeadDetailsBtn1")).click();
    driver.findElement(By.xpath("(//input[@value='Ok'])[2]")).click();
    driver.findElement(By.id("accordion")).click();
    driver.findElement(By.cssSelector("#proposalSettingsRegenerateProposalDiv > #regenerateButton")).click();
    driver.findElement(By.id("supplyLeadDetailsBtn1")).click();
    driver.findElement(By.cssSelector("div.uploadDocument")).click();
    driver.findElement(By.id("uploadButton")).clear();
    driver.findElement(By.id("uploadButton")).sendKeys("/Users/TORO/Desktop/Screen Shot 2015-08-06 at 10.22.27 AM.png");
    driver.findElement(By.name("displayName")).clear();
    driver.findElement(By.name("displayName")).sendKeys("TECH");
    driver.findElement(By.xpath("//input[@value='Upload Document']")).click();
    driver.findElement(By.id("saveProposalButton")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | ModSolarProposal | 30000]]
    driver.findElement(By.id("sendProposalButton")).click();
    driver.findElement(By.cssSelector("div.roar > p")).click();
    driver.findElement(By.id("submitForFundingEnabled")).click();
    driver.findElement(By.cssSelector("input.button.rightButton")).click();
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
