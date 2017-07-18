package USPROD;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MSPPREFERREDINV3045 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://platform.modsolar.net/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMSPPREFERREDINV3045() throws Exception {
    driver.get(baseUrl + "/login.jsp;jsessionid=0C3133BC223F105CB05273F2294266D9");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("mabila");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("idia26maha83");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("3211");
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/div/table/tbody/tr/td[1]")).click();
    //driver.
    driver.findElement(By.cssSelector("div.newLeadList")).click();
    driver.findElement(By.id("tabResidential")).click();
    driver.findElement(By.id("firstNameResidential")).clear();
    driver.findElement(By.id("firstNameResidential")).sendKeys("AUTO_TEST1202016");
    driver.findElement(By.id("lastNameResidential")).clear();
    driver.findElement(By.id("lastNameResidential")).sendKeys("AUTO_TEST1202016");
    driver.findElement(By.id("addressResidential")).clear();
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
    driver.findElement(By.id("yearlyUsageResidential")).sendKeys("120");
    driver.findElement(By.id("nextBtn")).click();
   // driver.findElement(By.xpath("//div[@id='mapCanvas']/div/div/div[2]")).click();
    //driver.findElement(By.xpath("//div[@id='mapCanvas']/div/div/div[2]")).click();
    //driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
    // /html/body/div[1]/div/div[2]/div[3]/div[6]/table/tbody/tr/td
Thread.sleep(8000);

    WebElement mainCanvas = driver.findElement(By.xpath(".//*[@id='mapCanvas']/div/div[1]/div[2]"));

    Actions mouseAction = new Actions(driver);

    mouseAction.moveToElement(mainCanvas); 

    mouseAction.contextClick(mainCanvas); 

    mouseAction.moveByOffset(5, 25);

    mouseAction.sendKeys(Keys.ARROW_DOWN);

    mouseAction.sendKeys(Keys.RETURN);
    //mouseAction.keyDown(Keys.ARROW_DOWN);
    //mouseAction.moveToElement(subMenu);

    mouseAction.click();

    mouseAction.perform();

    WebElement mainCanvas2 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));

    Actions mouseAction2 = new Actions(driver);

    mouseAction2.moveToElement(mainCanvas2); 

    mouseAction2.contextClick(mainCanvas2); 

    mouseAction2.moveByOffset(70, 50);

    mouseAction2.sendKeys(Keys.ARROW_DOWN);

    mouseAction2.sendKeys(Keys.RETURN);
    //mouseAction.keyDown(Keys.ARROW_DOWN);
    //mouseAction.moveToElement(subMenu);

    mouseAction2.click();

    mouseAction2.perform();


    WebElement mainCanvas3 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));

    Actions mouseAction3 = new Actions(driver);

    mouseAction3.moveToElement(mainCanvas3); 

    mouseAction3.contextClick(mainCanvas3); 

    mouseAction3.moveToElement(mainCanvas2, 500, 220);

    mouseAction3.sendKeys(Keys.ARROW_DOWN);

    mouseAction3.sendKeys(Keys.RETURN);
    //mouseAction.keyDown(Keys.ARROW_DOWN);
    //mouseAction.moveToElement(subMenu);

    mouseAction3.click();

    mouseAction3.perform();

    //Clicking inside the Triangle 

    WebElement e = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));

    new Actions(driver)
    .moveToElement(e, 0, 0)
    .moveByOffset(520, 255)
    .click()
    .build()
    .perform();


Thread.sleep(2000);

   // driver.findElement(By.id("nextButton")).click();
    driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
    ///html/body/div[1]/div/div[2]/div[6]/div[2]/input
    ///html/body/div[1]/div/div[2]/div[6]/div[2]/input
    ///html/body/div[1]/div/div[2]/div[6]/div[2]/input

    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("AUT");
    driver.findElement(By.cssSelector("td.sorting_1")).click();
    Thread.sleep(500);
 WebElement newlead1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[6]/table/tbody/tr/td"));

    Actions mouseAction4 = new Actions(driver);

    mouseAction4.moveToElement(newlead1);
    mouseAction4.perform();

    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    driver.findElement(By.id("cloneProposal")).click();
    driver.findElement(By.id("incentivesBreadcrumb")).click();
    driver.findElement(By.xpath("(//input[@value='Close'])[4]")).click();
    driver.findElement(By.xpath("(//input[@value='Close'])[3]")).click();
    driver.findElement(By.xpath("(//input[@value='Close'])[2]")).click();
    driver.findElement(By.xpath("//input[@value='Close']")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    driver.findElement(By.id("deleteProposal")).click();
    driver.findElement(By.cssSelector("label > input[type=\"button\"]")).click();
  }

  private Actions build() {
// TODO Auto-generated method stub
return null;
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