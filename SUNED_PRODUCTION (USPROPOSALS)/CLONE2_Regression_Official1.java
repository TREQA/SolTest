package SUNED_PRODUCTION;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CLONE2_Regression_Official1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();




  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://usproposal.sunedison.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  @Test
  public void testFinalclone() throws Exception {
    driver.get(baseUrl + "/ModSolarPlatform/login.jsp");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("christianqa");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("qa");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.cssSelector("div.newLeadList")).click();
    driver.findElement(By.id("tabResidential")).click();
    driver.findElement(By.id("firstNameResidential")).clear();
    driver.findElement(By.id("firstNameResidential")).sendKeys("AUTORELEASEAUG08");
    driver.findElement(By.id("lastNameResidential")).clear();
    driver.findElement(By.id("lastNameResidential")).sendKeys("AUTORELEASEAUG08");
    driver.findElement(By.id("addressResidential")).clear();
    driver.findElement(By.id("addressResidential")).sendKeys("600 Clipper rd");
    driver.findElement(By.id("cityResidential")).clear();
    driver.findElement(By.id("cityResidential")).sendKeys("Belmont");
    new Select(driver.findElement(By.id("stateResidential"))).selectByVisibleText("California");
    driver.findElement(By.id("zipCodeResidential")).clear();
    driver.findElement(By.id("zipCodeResidential")).sendKeys("90042");
    Thread.sleep(2000);
    driver.findElement(By.id("phoneResidential")).clear();
    driver.findElement(By.id("phoneResidential")).sendKeys("2153214568");
    driver.findElement(By.id("emailResidential")).clear();
    driver.findElement(By.id("emailResidential")).sendKeys("christianmodsolar@gmail.com");
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).clear();
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).sendKeys("1.2");
    driver.findElement(By.id("averageMonthlyBillResidential")).clear();
    driver.findElement(By.id("averageMonthlyBillResidential")).sendKeys("225");
    driver.findElement(By.id("nextBtn")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.id("leadsTable_filter")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("AUTORELEASEAUG08");
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    driver.findElement(By.xpath("//td[3]/div")).click();
    driver.findElement(By.id("cloneProposal")).click();
    Thread.sleep(1000);
    
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
    
    Thread.sleep(100);
    driver.findElement(By.cssSelector("#addressBreadcrumb")).click();
    driver.findElement(By.id("averageMonthlyBillResidential")).clear();
    driver.findElement(By.id("averageMonthlyBillResidential")).sendKeys("245");
    Thread.sleep(500);
    driver.findElement(By.id("averageMonthlyBillResidential")).clear();
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).clear();
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).sendKeys("2.5");
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).clear();
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).sendKeys("3.5");
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).clear();
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).sendKeys("-25.2");
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).clear();
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).sendKeys("3.3");
    driver.findElement(By.id("nextBtn")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@value='Back']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//h3[@id='productionPaneTitle']")).click();
    driver.findElement(By.id("panelDerate")).sendKeys("32");
    Thread.sleep(500);
    driver.findElement(By.id("panelDerate")).clear();
    driver.findElement(By.id("panelDerate")).sendKeys("0.10");
    driver.findElement(By.id("productionPaneTitle")).click();
    driver.findElement(By.id("proposalDetailsPaneTitle")).click();
    driver.findElement(By.id("pricePerWattProposalSettings")).clear();
    driver.findElement(By.id("pricePerWattProposalSettings")).sendKeys("4.8");
    driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
    driver.findElement(By.id("proposalDetailsPaneTitle")).click();
    driver.findElement(By.id("contentUsagePaneTitle")).click();
    driver.findElement(By.id("yearlyUsageProposalSettings")).click();
    driver.findElement(By.id("yearlyUsageProposalSettings")).clear();
    driver.findElement(By.id("yearlyUsageProposalSettings")).sendKeys("2322");
    Thread.sleep(200);
    driver.findElement(By.xpath("//h3[@id='utilityRatesPaneTitle']")).click();
    driver.findElement(By.id("utilityRatesProposalSettings")).click();
    new Select(driver.findElement(By.xpath("//select[@id='utilityRatesProposalSettings']"))).selectByVisibleText("Los Angeles Department of Water & Power - (R-3) Residential - Multi Family");
    driver.findElement(By.cssSelector("option[value=\"G&6788&225\"]")).click();
    driver.findElement(By.id("postSolarUtilityRatesProposalSettings")).click();
    new Select(driver.findElement(By.id("postSolarUtilityRatesProposalSettings"))).selectByVisibleText("Los Angeles Department of Water & Power - (R-3) Residential - Multi Family");
    driver.findElement(By.cssSelector("#postSolarUtilityRatesProposalSettings > option[value=\"G&6788&225\"]")).click();
    driver.findElement(By.id("utilityTaxRateInputAccordion")).click();
    driver.findElement(By.id("utilityTaxRateInputAccordion")).clear();
    driver.findElement(By.id("utilityTaxRateInputAccordion")).sendKeys("2.5");
    driver.findElement(By.id("annualElectricityIncrease")).clear();
    driver.findElement(By.id("annualElectricityIncrease")).sendKeys("1.8");
    driver.findElement(By.id("utilityRatesPaneTitle")).click();
    driver.findElement(By.id("regionsPaneTitle")).click();
    driver.findElement(By.id("regionsPaneTitle")).click();
    Thread.sleep(500);
    //Clicking inside the Triangle

    WebElement e1 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));

    new Actions(driver)
    .moveToElement(e1, 0, 0)
    .moveByOffset(520, 210)
    .click()
    .build()
    .perform();

   Thread.sleep(2000);
    driver.findElement(By.id("regionsPaneTitle")).click();
    driver.findElement(By.xpath("//div[@id='mapCanvas']/div/div/div[2]")).click();
    driver.findElement(By.xpath("//div[@id='mapCanvas']/div/div/div[2]")).click();
    driver.findElement(By.id("mountTypeRegion1")).click();
    new Select(driver.findElement(By.id("mountTypeRegion1"))).selectByVisibleText("Sloped Roof");
    driver.findElement(By.cssSelector("option[name=\"slopedRoofOpt\"]")).click();
    driver.findElement(By.id("mountTypeRegion1")).click();
    new Select(driver.findElement(By.id("mountTypeRegion1"))).selectByVisibleText("Flat Roof");
    driver.findElement(By.cssSelector("option[name=\"flatRoofOpt\"]")).click();
    driver.findElement(By.id("mountTypeRegion1")).click();
    new Select(driver.findElement(By.id("mountTypeRegion1"))).selectByVisibleText("Ground Mount");
    driver.findElement(By.cssSelector("option[name=\"groundMountOpt\"]")).click();
    driver.findElement(By.id("squareUpButton1")).click();
    driver.findElement(By.id("snapAzimuthButton1")).click();
    driver.findElement(By.id("applySetbacksButton1")).click();
    driver.findElement(By.id("applySetbacksButton1")).click();
    driver.findElement(By.id("regionsPaneTitle")).click();
    driver.findElement(By.id("shadingPaneTitle")).click();
    driver.findElement(By.id("shadingPercentage")).click();
    driver.findElement(By.id("shadingPercentage")).clear();
    driver.findElement(By.id("shadingPercentage")).sendKeys("100");
    driver.findElement(By.id("shadingPaneTitle")).click();
    driver.findElement(By.id("productionPaneTitle")).click();
    driver.findElement(By.linkText("Show Monthly Values")).click();
    driver.findElement(By.linkText("Hide Monthly Values")).click();
    driver.findElement(By.id("productionPaneTitle")).click();
    driver.findElement(By.id("proposalDetailsPaneTitle")).click();
    driver.findElement(By.id("pricePerWattProposalSettings")).click();
    driver.findElement(By.id("pricePerWattProposalSettings")).clear();
    driver.findElement(By.id("pricePerWattProposalSettings")).sendKeys("4.7");
    driver.findElement(By.id("yearlyUsage")).clear();
    driver.findElement(By.id("yearlyUsage")).sendKeys("23");
    driver.findElement(By.id("proposalDetailsPaneTitle")).click();
    driver.findElement(By.id("layoutPaneTitle")).click();
    driver.findElement(By.id("panelOrientationOptions1")).click();
    new Select(driver.findElement(By.id("panelOrientationOptions1"))).selectByVisibleText("Force landscape");
    driver.findElement(By.id("forcedLandscape1")).click();
    driver.findElement(By.id("rerunButton")).click();
    driver.findElement(By.id("showRegionBorders")).click();
    driver.findElement(By.id("showRegionBorders")).click();
    driver.findElement(By.id("invertColors")).click();
    driver.findElement(By.id("invertColors")).click();
    driver.findElement(By.id("rerunButton")).click();
    driver.findElement(By.id("layoutPaneTitle")).click();
  //click on Inverters
    driver.findElement(By.xpath("//h3[text()= 'Inverters']")).click();

    //Click on Arrow

    driver.findElement(By.xpath("//span[@class = 'arrow']")).click();

    Thread.sleep(1000);
    //Default Invert select
    driver.findElement(By.xpath("html/body/ul/li[2]/span")).click();


    //Click on Arrow
    driver.findElement(By.xpath("//span[@class = 'arrow']")).click();

    Thread.sleep(2000);

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

