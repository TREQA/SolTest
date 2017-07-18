package MODSOLAR_PLATFORM_OFFICIAL_REGRESSION_QA;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SELECTAPANEL_Regression_Official1 {
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
  public void testSelectpanel() throws Exception {
    driver.get(baseUrl + "/ModSolarPlatform/login.jsp");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("christian");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("idia26maha83");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("MS Admin")).click();
    driver.findElement(By.xpath("//table[@id='clientsTable']/thead/tr/th[2]/div/div/span")).click();
    driver.findElement(By.xpath("//table[@id='clientsTable']/tbody/tr/td[2]")).click();
    driver.findElement(By.cssSelector("div.newLeadList")).click();
    driver.findElement(By.id("tabResidential")).click();
    driver.findElement(By.id("firstNameResidential")).clear();
    driver.findElement(By.id("firstNameResidential")).sendKeys("christian");
    driver.findElement(By.id("lastNameResidential")).clear();
    driver.findElement(By.id("lastNameResidential")).sendKeys("mabila");
    driver.findElement(By.id("addressResidential")).clear();
    driver.findElement(By.id("addressResidential")).sendKeys("600 Clipper rd");
    driver.findElement(By.id("cityResidential")).clear();
    driver.findElement(By.id("cityResidential")).sendKeys("Belmont");
    new Select(driver.findElement(By.id("stateResidential"))).selectByVisibleText("California");
    driver.findElement(By.id("zipCodeResidential")).clear();
    driver.findElement(By.id("zipCodeResidential")).sendKeys("94002");
    Thread.sleep(1500);
    driver.findElement(By.id("emailResidential")).clear();
    driver.findElement(By.id("emailResidential")).sendKeys("christianmodsolar@gmail.com");
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).clear();
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).sendKeys("1.2");
    driver.findElement(By.id("averageMonthlyBillResidential")).clear();
    driver.findElement(By.id("averageMonthlyBillResidential")).sendKeys("225");
    driver.findElement(By.id("nextBtn")).click();
    
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
    driver.findElement(By.xpath("//input[@value='Select a Panel']")).click();
    driver.findElement(By.cssSelector("#panel_557 > table")).click();
    driver.findElement(By.cssSelector("#panel_485 > table > thead > tr > td.acEnergy")).click();
    driver.findElement(By.cssSelector("#panel_542 > table > thead > tr > td.acEnergy")).click();
    driver.findElement(By.cssSelector("#panel_499 > table > thead > tr > td.acEnergy")).click();
    driver.findElement(By.cssSelector("#panel_212 > div.head")).click();
    driver.findElement(By.cssSelector("#panel_486 > table > tbody > tr > th")).click();
    driver.findElement(By.cssSelector("div.head")).click();
    
    /////Adding Accordion test cases from Map
    
    driver.findElement(By.id("accordion")).click();
    driver.findElement(By.id("accordionTitleText")).click();
    
    ///adding more 2A
    
    driver.findElement(By.id("contentUsagePaneTitle")).click();
    driver.findElement(By.id("yearlyUsageProposalSettings")).click();
    driver.findElement(By.id("yearlyUsageProposalSettings")).clear();
    driver.findElement(By.id("yearlyUsageProposalSettings")).sendKeys("");
    driver.findElement(By.id("yearlyUsageProposalSettings")).click();
    driver.findElement(By.id("yearlyUsageProposalSettings")).clear();
    driver.findElement(By.id("yearlyUsageProposalSettings")).sendKeys("4521");
    driver.findElement(By.id("yearlyUsageProposalSettings")).click();
    driver.findElement(By.id("yearlyUsageProposalSettings")).clear();
    driver.findElement(By.id("yearlyUsageProposalSettings")).sendKeys("3222");
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).click();
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).clear();
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).sendKeys("225");
    driver.findElement(By.id("yearlyUsageProposalSettings")).click();
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).click();
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).clear();
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).sendKeys("355");
    driver.findElement(By.id("yearlyUsageProposalSettings")).click();
    driver.findElement(By.id("yearlyUsageProposalSettings")).click();
    driver.findElement(By.id("yearlyUsageProposalSettings")).clear();
    driver.findElement(By.id("yearlyUsageProposalSettings")).sendKeys("");
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).click();
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).clear();
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).sendKeys("355");
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).click();
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).clear();
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).sendKeys("-522");
    driver.findElement(By.id("yearlyUsageProposalSettings")).clear();
    driver.findElement(By.id("yearlyUsageProposalSettings")).sendKeys("");
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).click();
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).clear();
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).sendKeys("-222");
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).click();
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).clear();
    driver.findElement(By.id("averageMonthlyBillProposalSettings")).sendKeys("355");
    /////////driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
   ///////// driver.findElement(By.id("contentUsagePaneTitle")).click();
   ///////// driver.findElement(By.xpath("//div[@id='solutionCategory']/ul/li[2]/h3")).click();
    ///////driver.findElement(By.cssSelector("span.arrow")).click();
    
    ///adding more 2B
    
    driver.findElement(By.id("utilityRatesPaneTitle")).click();
    driver.findElement(By.id("utilityTaxRateInputAccordion")).click();
    driver.findElement(By.id("utilityTaxRateInputAccordion")).clear();
    driver.findElement(By.id("utilityTaxRateInputAccordion")).sendKeys("2.5");
    driver.findElement(By.id("annualElectricityIncrease")).clear();
    driver.findElement(By.id("annualElectricityIncrease")).sendKeys("2.1");
    
    ///shading
    driver.findElement(By.id("shadingPaneTitle")).click();
    Thread.sleep(1500);
    ///driver.findElement(By.id("shadingPaneTitle")).click();
    driver.findElement(By.id("accordion")).click();
    Thread.sleep(1500);
    driver.findElement(By.xpath("//input[@value='Back']")).click();
Thread.sleep(1500);
   
    
    
    
    /////driver.findElement(By.id("accordion")).click();
    
    ///Above limit 
    /////----driver.findElement(By.cssSelector("input.btn")).click();
    
  
    
    
    ////driver.findElement(By.id("backButton")).click();
    driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
    
    Thread.sleep(1500);
    
    
///////the one-now driver.findElement(By.id("accordion")).click();
    
  ///add 3A
  
  driver.findElement(By.id("productionPaneTitle")).click();
  driver.findElement(By.xpath("//a[contains(text(),'Show Monthly Values')]")).click();
  driver.findElement(By.xpath("//a[contains(text(),'Hide Monthly Values')]")).click();
driver.findElement(By.id("panelDerate")).click();
 driver.findElement(By.id("panelDerate")).clear();
 driver.findElement(By.id("panelDerate")).sendKeys("2.");
 driver.findElement(By.id("panelDerate")).clear();
  driver.findElement(By.id("panelDerate")).sendKeys("1");
  driver.findElement(By.id("mismatchDerate")).clear();
 driver.findElement(By.id("mismatchDerate")).sendKeys("0.8");
 driver.findElement(By.id("mismatchDerate")).clear();
 driver.findElement(By.id("mismatchDerate")).sendKeys("0.98");
 driver.findElement(By.id("diodesDerate")).clear();
 driver.findElement(By.id("diodesDerate")).sendKeys("0.999");
 driver.findElement(By.id("dcWiringDerate")).clear();
 driver.findElement(By.id("dcWiringDerate")).sendKeys("0.996");
  driver.findElement(By.id("acWiringDerate")).clear();
  driver.findElement(By.id("acWiringDerate")).sendKeys("0.992");
  driver.findElement(By.id("soilingDerate")).clear();
  driver.findElement(By.id("soilingDerate")).sendKeys("0.994");
 driver.findElement(By.id("systemAvailabilityDerate")).clear();
 driver.findElement(By.id("systemAvailabilityDerate")).sendKeys("0.997");
 driver.findElement(By.id("sunTrackingDerate")).clear();
 driver.findElement(By.id("sunTrackingDerate")).sendKeys("0.96");
driver.findElement(By.id("ageDerate")).clear();
 driver.findElement(By.id("ageDerate")).sendKeys("0.80");
 driver.findElement(By.id("productionPaneTitle")).click();
  
  Thread.sleep(1000);
    
    
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
