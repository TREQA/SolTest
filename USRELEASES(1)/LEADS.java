package msprelease;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LEADS {
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
  public void testLEADS() throws Exception {
    driver.get(baseUrl + "/ModSolarPlatform/login.jsp;jsessionid=F28D0AE1A5E8D553BBF57BAC4F1931EA");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("christian");
    Thread.sleep(4500);
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("idia26maha83");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.xpath("//table[@id='clientsTable']/thead/tr/th[2]/div/div/span")).click();
    driver.findElement(By.cssSelector("div.newLeadList")).click();
    driver.findElement(By.id("tabResidential")).click();
    driver.findElement(By.id("firstNameResidential")).clear();
    driver.findElement(By.id("firstNameResidential")).sendKeys("AUTOTEST01192016");
    driver.findElement(By.id("lastNameResidential")).clear();
    driver.findElement(By.id("lastNameResidential")).sendKeys("AUTOTEST01192016");
    driver.findElement(By.id("addressResidential")).clear();
    Thread.sleep(4500);
    driver.findElement(By.id("addressResidential")).sendKeys("600 Clipper Rd");
    driver.findElement(By.id("cityResidential")).clear();
    driver.findElement(By.id("cityResidential")).sendKeys("Belmont");
    new Select(driver.findElement(By.id("stateResidential"))).selectByVisibleText("California");
    driver.findElement(By.id("zipCodeResidential")).clear();
    driver.findElement(By.id("zipCodeResidential")).sendKeys("94002");
    driver.findElement(By.id("emailResidential")).clear();
    driver.findElement(By.id("emailResidential")).sendKeys("christian@modsolar.net");
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).clear();
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).sendKeys("1.2");
    driver.findElement(By.id("yearlyUsageResidential")).clear();
    driver.findElement(By.id("yearlyUsageResidential")).sendKeys("123");
    driver.findElement(By.id("nextBtn")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("autotest");
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.cssSelector("td.sorting_1")).click();
    driver.findElement(By.id("renameProposal")).click();
    driver.findElement(By.cssSelector("#proposal_59341 > input")).clear();
    driver.findElement(By.cssSelector("#proposal_59341 > input")).sendKeys("NOW0.0 kW sloped roof");
    driver.findElement(By.id("cloneProposal")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.cssSelector("td.sorting_1")).click();
    driver.findElement(By.id("leadComments")).clear();
    driver.findElement(By.id("leadComments")).sendKeys("SAVING");
    driver.findElement(By.cssSelector("input.btn")).click();
    driver.findElement(By.cssSelector("input.btn")).click();
    driver.findElement(By.cssSelector("input.btn")).click();
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
