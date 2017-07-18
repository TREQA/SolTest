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

public class NAMEADDRESSUSAGE_Regression_Official1 {
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
  
  public void test1() throws Exception {
	  driver.get(baseUrl + "/login.jsp;jsessionid=1325FE05056A65854BF733D5E141A812");
    ///driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("christianprod");
    ///driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("qa");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("rheingold");
    
    driver.findElement(By.cssSelector("div.newLeadList")).click();

    driver.findElement(By.id("tabCommercial")).click();
    driver.findElement(By.xpath("(//input[@id='businessName'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@id='businessName'])[2]")).sendKeys("Jake");
    Thread.sleep(2000);
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.id("firstNameCommercial")).clear();
    driver.findElement(By.id("firstNameCommercial")).sendKeys("Jake");
    Thread.sleep(2000);
    driver.findElement(By.id("lastNameCommercial")).clear();
    driver.findElement(By.id("lastNameCommercial")).sendKeys("Rheingold");
    Thread.sleep(2000);
    driver.findElement(By.id("addressCommercial")).clear();
    driver.findElement(By.id("addressCommercial")).sendKeys("2899 Boogie");
    driver.findElement(By.id("cityCommercial")).clear();
    driver.findElement(By.id("cityCommercial")).sendKeys("Weston");
    new Select(driver.findElement(By.id("stateCommercial"))).selectByVisibleText("California");
    driver.findElement(By.id("zipCodeCommercial")).clear();
    driver.findElement(By.id("zipCodeCommercial")).sendKeys("33327");
    driver.findElement(By.id("background")).click();
    driver.findElement(By.id("yearlyUsageCommercial")).clear();
    driver.findElement(By.id("yearlyUsageCommercial")).sendKeys("10");
    driver.findElement(By.id("nextBtn")).click();
    driver.findElement(By.linkText("Home")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("rheingold");
    
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Edit this Lead")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("leadTypeResidential")).click();
    Thread.sleep(2000);
    //driver.findElement(By.name("submit")).click();
    //driver.findElement(By.name("submit")).click();
    driver.findElement(By.xpath("//div[3]/input")).click();
    
    driver.findElement(By.linkText("Home")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("rheingold");

    driver.findElement(By.cssSelector("div.newLeadList")).click();
    driver.findElement(By.id("tabResidential")).click();
    driver.findElement(By.id("firstNameResidential")).clear();
    driver.findElement(By.id("firstNameResidential")).sendKeys("*/-*/*-");
    Thread.sleep(2000);
    driver.findElement(By.id("lastNameResidential")).clear();
    driver.findElement(By.id("lastNameResidential")).sendKeys("/*-/*");
    Thread.sleep(2000);
    driver.findElement(By.id("firstNameResidential")).clear();
    driver.findElement(By.id("firstNameResidential")).sendKeys("");
    Thread.sleep(2000);
    driver.findElement(By.id("lastNameResidential")).clear();
    driver.findElement(By.id("lastNameResidential")).sendKeys("");
    driver.findElement(By.id("nextBtn")).click();
    driver.findElement(By.id("firstNameResidential")).clear();
    driver.findElement(By.id("firstNameResidential")).sendKeys("Jake");
    driver.findElement(By.id("lastNameResidential")).clear();
    driver.findElement(By.id("lastNameResidential")).sendKeys("Rheingold");
    driver.findElement(By.id("addressResidential")).clear();
    driver.findElement(By.id("addressResidential")).sendKeys("2495 Eagle Watch Lane");
    driver.findElement(By.id("cityResidential")).clear();
    driver.findElement(By.id("cityResidential")).sendKeys("Weston");
    new Select(driver.findElement(By.id("stateResidential"))).selectByVisibleText("California");
    driver.findElement(By.id("zipCodeResidential")).clear();
    driver.findElement(By.id("zipCodeResidential")).sendKeys("3332*/");
    driver.findElement(By.id("nextBtn")).click();
    driver.findElement(By.id("zipCodeResidential")).clear();
    driver.findElement(By.id("zipCodeResidential")).sendKeys("33327");
    driver.findElement(By.id("background")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("yearlyUsageResidential")).clear();
    driver.findElement(By.id("yearlyUsageResidential")).sendKeys("10");
    Thread.sleep(2000);
    driver.findElement(By.id("nextBtn")).click();
    //driver.findElement(By.xpath("//div[@id='mapCanvas']/div/div/div[2]")).click();
    //driver.findElement(By.xpath("//div[@id='mapCanvas']/div/div/div[2]")).click();
    //driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
    //driver.findElement(By.xpath("//div[@id='solutionCategory']/ul/li[2]/h3")).click();
    //driver.findElement(By.cssSelector("span.arrow")).click();
    Thread.sleep(2000);
    
 WebElement mainCanvas = driver.findElement(By.xpath(".//*[@id='mapCanvas']/div/div[1]/div[2]"));
    
    Thread.sleep(2000);
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
    
    
    
    driver.findElement(By.id("background")).click();
    Thread.sleep(2000);
    //driver.findElement(By.id("nextButton")).click();
    //driver.findElement(By.id("nextButton")).click();
    driver.findElement(By.xpath("//input[@value='Next']")).click();
    Thread.sleep(2000);
    //driver.findElement(By.id("supplyLeadDetailsBtn1")).click();
    driver.findElement(By.xpath("//div[@id='solutionCategory']/ul/li[2]/h3")).click();
    driver.findElement(By.xpath("//div[@id='solutionCategory']/div[2]/div[2]/div/div/span[2]")).click();
    driver.findElement(By.xpath("//li[2]/span")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='Next']")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//div[@id='content']/div[6]/div[2]/input")).click();
    //driver.findElement(By.id("nextBtn")).click();
    driver.findElement(By.xpath("//input[@id='supplyLeadDetailsBtn1']")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("(//input[@value='Cancel'])[2]")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[5]")).click();
    //driver.findElement(By.id("slickid__")).click();
    driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
    driver.findElement(By.xpath("//li[@onclick='proposalActionsModal.close();editProposal();']")).click();
    
    driver.findElement(By.id("addressBreadcrumb")).click();
    
    driver.findElement(By.id("emailResidential")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("emailResidential")).sendKeys("jakemodsolar@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.id("nextBtn")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='Next']")).click();
    driver.findElement(By.xpath("//div[@id='solutionCategory']/ul/li[2]/h3")).click();
    driver.findElement(By.xpath("//div[@id='solutionCategory']/div[2]/div[2]/div/div/span[2]")).click();
    driver.findElement(By.xpath("//li[2]/span")).click();
    Thread.sleep(2000);
    //driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
    //driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
    //driver.findElement(By.id("nextButton")).click();
    //driver.findElement(By.id("nextButton")).click();
    driver.findElement(By.xpath("//input[@value='Next']")).click();
    Thread.sleep(2000);
    //driver.findElement(By.id("supplyLeadDetailsBtn1")).click();
    driver.findElement(By.xpath("//div[@id='content']/div[6]/div[2]/input")).click();
    //driver.findElement(By.id("nextBtn")).click();
    driver.findElement(By.xpath("//input[@id='supplyLeadDetailsBtn1']")).click();
    Thread.sleep(2000);
    
    
    //driver.findElement(By.xpath("//div[@id='solutionCategory']/ul/li[2]/h3")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='Save']")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("sendProposalButton")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("leadphone")).clear();
    driver.findElement(By.id("leadphone")).sendKeys("9543260768");
    driver.findElement(By.xpath("//input[@value='Save']")).click();
    Thread.sleep(2000);
    
    
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[5]")).click();
    driver.findElement(By.linkText("Edit this Lead")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("");

    //driver.findElement(By.name("submit")).click();
    //driver.findElement(By.name("submit")).click();
    driver.findElement(By.xpath("//div[3]/input")).click();
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    //driver.findElement(By.id("slickid__")).click();
    driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
    driver.findElement(By.cssSelector("li.onlyIfConfigurationComplete.onlyIfProposalReady")).click();
    driver.findElement(By.id("leademail")).clear();
    driver.findElement(By.id("leademail")).sendKeys("jakemodsolar@gmail.com");
    driver.findElement(By.xpath("//input[@value='Save']")).click();
    driver.findElement(By.id("sendProposalButton")).click();
    driver.findElement(By.linkText("Home")).click();
    Thread.sleep(2000);
    //
    
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    //driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
    driver.findElement(By.cssSelector("div.newLeadList")).click();
    
    
    driver.findElement(By.id("tabResidential")).click();
    driver.findElement(By.id("firstNameResidential")).clear();
    driver.findElement(By.id("firstNameResidential")).sendKeys("Jake");
    driver.findElement(By.id("lastNameResidential")).clear();
    driver.findElement(By.id("lastNameResidential")).sendKeys("Rheingold");
    driver.findElement(By.id("addressResidential")).clear();
    driver.findElement(By.id("addressResidential")).sendKeys("2495 Eagle Watch Lane");
    driver.findElement(By.id("cityResidential")).clear();
    driver.findElement(By.id("cityResidential")).sendKeys("Belmont");
    new Select(driver.findElement(By.id("stateResidential"))).selectByVisibleText("California");
    driver.findElement(By.id("zipCodeResidential")).clear();
    driver.findElement(By.id("zipCodeResidential")).sendKeys("33327");
    driver.findElement(By.id("background")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("phoneResidential")).clear();
    driver.findElement(By.id("phoneResidential")).sendKeys("9543260768");
    driver.findElement(By.id("emailResidential")).clear();
    driver.findElement(By.id("emailResidential")).sendKeys("jakemodsolar@gmail.com");
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).clear();
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).sendKeys("1.2");
    driver.findElement(By.id("averageMonthlyBillResidential")).clear();
    driver.findElement(By.id("averageMonthlyBillResidential")).sendKeys("15");
    Thread.sleep(2000);
    driver.findElement(By.id("nextBtn")).click();
    Thread.sleep(2000);
    
    WebElement mainCanvas1 = driver.findElement(By.xpath(".//*[@id='mapCanvas']/div/div[1]/div[2]"));
    Thread.sleep(2000);
    
    Actions mouseAction1 = new Actions(driver);
    
    mouseAction1.moveToElement(mainCanvas1); 
    
    mouseAction1.contextClick(mainCanvas1); 
    
    mouseAction1.moveByOffset(5, 25);
        
    mouseAction1.sendKeys(Keys.ARROW_DOWN);
    
    mouseAction1.sendKeys(Keys.RETURN);
    //mouseAction.keyDown(Keys.ARROW_DOWN);
    //mouseAction.moveToElement(subMenu);
      
    mouseAction1.click();
    
    mouseAction1.perform();
    
    WebElement mainCanvas21 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));
    
    Actions mouseAction21 = new Actions(driver);
    
    mouseAction21.moveToElement(mainCanvas21); 
    
    mouseAction21.contextClick(mainCanvas21); 
    
    mouseAction21.moveByOffset(70, 50);
    
    mouseAction21.sendKeys(Keys.ARROW_DOWN);
    
    mouseAction21.sendKeys(Keys.RETURN);
    //mouseAction.keyDown(Keys.ARROW_DOWN);
    //mouseAction.moveToElement(subMenu);
      
    mouseAction21.click();
    
    mouseAction21.perform();
    
    
    WebElement mainCanvas31 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));
    
    Actions mouseAction31 = new Actions(driver);
    
    mouseAction31.moveToElement(mainCanvas31); 
    
    mouseAction31.contextClick(mainCanvas31); 
    
    mouseAction31.moveToElement(mainCanvas21, 500, 220);
    
    mouseAction31.sendKeys(Keys.ARROW_DOWN);
    
    mouseAction31.sendKeys(Keys.RETURN);
    //mouseAction.keyDown(Keys.ARROW_DOWN);
    //mouseAction.moveToElement(subMenu);
      
    mouseAction31.click();
    
    mouseAction31.perform();
    
    //Clicking inside the Triangle 
      
    WebElement e1 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));
    
    new Actions(driver)
    .moveToElement(e1, 0, 0)
    .moveByOffset(520, 255)
    .click()
    .build()
    .perform();

             
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//input[@value='Next']")).click();
     Thread.sleep(8000);
     
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
        
      //Click on Next button 
      driver.findElement(By.xpath("//input[@value='Next']")).click();
      Thread.sleep(8000);
      
      driver.findElement(By.id("selectedProgramCheckbox_177")).click();
      Thread.sleep(8000);
      
      //Click on Next button 
      driver.findElement(By.xpath("//input[@id='nextButton']")).click();
      Thread.sleep(2000);
      
      //Click on Next button
      driver.findElement(By.id("supplyLeadDetailsBtn1")).click();
      Thread.sleep(3000);
      
      driver.findElement(By.linkText("Home")).click();
      Thread.sleep(2000);
        
    
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    //driver.findElement(By.id("slickid__")).click();    
    driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
    driver.findElement(By.xpath("//li[@onclick='proposalActionsModal.close();editProposal();']")).click();
    //driver.findElement(By.cssSelector("li.onlyIfConfigurationComplete.onlyIfProposalReady")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("addressBreadcrumb")).click();
    Thread.sleep(2000);
    
    //////
    
    driver.findElement(By.id("mapBreadcrumb")).click();
    driver.findElement(By.id("regionIcon1")).click();
    driver.findElement(By.id("mountTypeRegion1")).click();
    new Select(driver.findElement(By.id("mountTypeRegion1"))).selectByVisibleText("Flat Roof");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("option[name=\"flatRoofOpt\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("addressBreadcrumb")).click();
    driver.findElement(By.id("yearlyUsageResidential")).clear();
    driver.findElement(By.id("yearlyUsageResidential")).sendKeys("");
    //driver.findElement(By.id("averageMonthlyBillResidential")).clear();
    driver.findElement(By.cssSelector("#averageMonthlyBillResidential")).clear();
    //driver.findElement(By.id("averageMonthlyBillResidential")).sendKeys("");
    driver.findElement(By.cssSelector("#averageMonthlyBillResidential")).sendKeys("");
    driver.findElement(By.id("nextBtn")).click();
    driver.findElement(By.id("averageMonthlyBillResidential")).clear();
    driver.findElement(By.id("averageMonthlyBillResidential")).sendKeys("###");
    driver.findElement(By.id("averageMonthlyBillResidential")).clear();
    driver.findElement(By.id("averageMonthlyBillResidential")).sendKeys("100");
    driver.findElement(By.cssSelector("#averageMonthlyBillResidential")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("yearlyUsageResidential")).clear();
    driver.findElement(By.id("yearlyUsageResidential")).sendKeys("@#$$");
    driver.findElement(By.id("yearlyUsageResidential")).clear();
    driver.findElement(By.id("yearlyUsageResidential")).sendKeys("1000");
    driver.findElement(By.id("nextBtn")).click();
    driver.findElement(By.id("contentUsagePaneTitle")).click();
    
    driver.findElement(By.id("addressBreadcrumb")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("averageMonthlyBillResidential")).clear();
    driver.findElement(By.id("averageMonthlyBillResidential")).sendKeys("-20");
    driver.findElement(By.id("yearlyUsageResidential")).clear();
    driver.findElement(By.id("yearlyUsageResidential")).sendKeys("");
    driver.findElement(By.id("averageMonthlyBillResidential")).clear();
    driver.findElement(By.id("averageMonthlyBillResidential")).sendKeys("");
    driver.findElement(By.linkText("Enter Monthly Amounts")).click();
    Thread.sleep(2000);    
    driver.findElement(By.id("month00Residential")).clear();
    driver.findElement(By.id("month00Residential")).sendKeys("1");
    driver.findElement(By.id("month01Residential")).click();
    driver.findElement(By.id("month01Residential")).clear();
    driver.findElement(By.id("month01Residential")).sendKeys("1");
    driver.findElement(By.id("month02Residential")).clear();
    driver.findElement(By.id("month02Residential")).sendKeys("1");
    driver.findElement(By.id("month03Residential")).clear();
    driver.findElement(By.id("month03Residential")).sendKeys("1");
    driver.findElement(By.id("month04Residential")).clear();
    driver.findElement(By.id("month04Residential")).sendKeys("1");
    driver.findElement(By.id("month05Residential")).clear();
    driver.findElement(By.id("month05Residential")).sendKeys("1");
    driver.findElement(By.id("month06Residential")).clear();
    driver.findElement(By.id("month06Residential")).sendKeys("1");
    driver.findElement(By.id("month07Residential")).clear();
    driver.findElement(By.id("month07Residential")).sendKeys("1");
    driver.findElement(By.id("month08Residential")).clear();
    driver.findElement(By.id("month08Residential")).sendKeys("1");
    driver.findElement(By.id("month09Residential")).clear();
    driver.findElement(By.id("month09Residential")).sendKeys("1");
    driver.findElement(By.id("month10Residential")).clear();
    driver.findElement(By.id("month10Residential")).sendKeys("1");
    driver.findElement(By.id("month11Residential")).clear();
    driver.findElement(By.id("month11Residential")).sendKeys("1");
    driver.findElement(By.id("averageMonthlyBillResidential")).clear();
    driver.findElement(By.id("averageMonthlyBillResidential")).sendKeys("20");
    Thread.sleep(2000);
    driver.findElement(By.id("nextBtn")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("addressBreadcrumb")).click();
    Thread.sleep(2000);
    
    ///
    
    
    new Select(driver.findElement(By.id("utilityRatesResidential"))).selectByVisibleText("User Defined - Test Test Test");
    driver.findElement(By.id("mapBreadcrumb")).click();
    driver.findElement(By.id("utilityRatesPaneTitle")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("addressBreadcrumb")).click();
    Thread.sleep(2000);
    new Select(driver.findElement(By.id("utilityRatesResidential"))).selectByVisibleText("Enter a Rate Manually");
    driver.findElement(By.id("radio-const-Residential")).click();
    driver.findElement(By.id("rate-const-Residential")).clear();
    driver.findElement(By.id("rate-const-Residential")).sendKeys("^&^&");
    driver.findElement(By.id("radio-tiered-Residential")).click();
    driver.findElement(By.id("tier0UpperBoundResidential")).clear();
    driver.findElement(By.id("tier0UpperBoundResidential")).sendKeys("###");
    driver.findElement(By.id("tier0RateResidential")).clear();
    driver.findElement(By.id("tier0RateResidential")).sendKeys("&*&");
    driver.findElement(By.id("tier1UpperBoundResidential")).clear();
    driver.findElement(By.id("tier1UpperBoundResidential")).sendKeys("");
    driver.findElement(By.id("tier1RateResidential")).clear();
    driver.findElement(By.id("tier1RateResidential")).sendKeys("");
    driver.findElement(By.id("tier2UpperBoundResidential")).clear();
    driver.findElement(By.id("tier2UpperBoundResidential")).sendKeys("");
    driver.findElement(By.id("tier2RateResidential")).clear();
    driver.findElement(By.id("tier2RateResidential")).sendKeys("");
    driver.findElement(By.id("tier3UpperBoundResidential")).clear();
    driver.findElement(By.id("tier3UpperBoundResidential")).sendKeys("");
    driver.findElement(By.id("tier3RateResidential")).clear();
    driver.findElement(By.id("tier3RateResidential")).sendKeys("");
    driver.findElement(By.id("tier0UpperBoundResidential")).clear();
    driver.findElement(By.id("tier0UpperBoundResidential")).sendKeys("300");
    driver.findElement(By.id("tier0RateResidential")).clear();
    driver.findElement(By.id("tier0RateResidential")).sendKeys("5");
    driver.findElement(By.id("nextBtn")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("addressBreadcrumb")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("tier1UpperBoundResidential")).clear();
    driver.findElement(By.id("tier1UpperBoundResidential")).sendKeys("500");
    driver.findElement(By.id("tier1RateResidential")).clear();
    driver.findElement(By.id("tier1RateResidential")).sendKeys("5");
    driver.findElement(By.id("tier2UpperBoundResidential")).clear();
    driver.findElement(By.id("tier2UpperBoundResidential")).sendKeys("799");
    driver.findElement(By.id("tier2RateResidential")).clear();
    driver.findElement(By.id("tier2RateResidential")).sendKeys("5");
    driver.findElement(By.id("tier3UpperBoundResidential")).clear();
    driver.findElement(By.id("tier3UpperBoundResidential")).sendKeys("1000");
    driver.findElement(By.id("tier3RateResidential")).clear();
    driver.findElement(By.id("tier3RateResidential")).sendKeys("5");
    driver.findElement(By.id("background")).click();
    driver.findElement(By.xpath("//tr[@id='tier3RowResidential']/td/img")).click();
    //driver.findElement(By.id("deleteTier3")).click();
    driver.findElement(By.id("background")).click();
    //driver.findElement(By.id("deleteTier3")).click();
    //driver.findElement(By.id("background")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("deleteTier2")).click();
    driver.findElement(By.id("deleteTier1")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("tier0UpperBoundResidential")).clear();
    Thread.sleep(2000);
    //driver.findElement(By.id("nextBtn")).click();
    
    // fail
    
    //driver.findElement(By.xpath("//div[5]/div/input")).click();
   // Thread.sleep(2000);
   // driver.findElement(By.id("utilityRatesPaneTitle")).click();
   // Thread.sleep(2000);
   // driver.findElement(By.id("addressBreadcrumb")).click();
   // Thread.sleep(2000);
   // driver.findElement(By.xpath("//tr[2]/td/label/input")).click();
   // driver.findElement(By.id("tier0UpperBoundResidential")).clear();
   // driver.findElement(By.id("tier0UpperBoundResidential")).sendKeys("100");
   // driver.findElement(By.id("tier0RateResidential")).clear();
   // driver.findElement(By.id("tier0RateResidential")).sendKeys("5");
    
   // Thread.sleep(2000);
   // driver.findElement(By.id("background")).click();
   // Thread.sleep(2000);
   // driver.findElement(By.id("tier1RateResidential")).clear();
   // Thread.sleep(2000);
    //driver.findElement(By.id("background")).click();
   // driver.findElement(By.id("tier1RateResidential")).sendKeys("5");
   // Thread.sleep(2000);
   //A/P driver.findElement(By.id("nextBtn")).click();
    
    
    //
    
    
    ///BUSINESSADDRESS
    
    
    
    
    
    driver.findElement(By.linkText("Home")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("rheingold");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div.newLeadList")).click();

driver.findElement(By.id("tabCommercial")).click();
// ERROR: Caught exception [Error: Dom locators are not implemented yet!]
driver.findElement(By.xpath("(//input[@id='businessName'])[2]")).clear();
driver.findElement(By.xpath("(//input[@id='businessName'])[2]")).sendKeys("NAU");

driver.findElement(By.id("firstNameCommercial")).clear();
driver.findElement(By.id("firstNameCommercial")).sendKeys("%*^*&&*");
Thread.sleep(2000);
driver.findElement(By.id("lastNameCommercial")).clear();
driver.findElement(By.id("lastNameCommercial")).sendKeys("^*^&*");
Thread.sleep(2000);
driver.findElement(By.id("firstNameCommercial")).clear();
driver.findElement(By.id("firstNameCommercial")).sendKeys("Jake");
driver.findElement(By.id("lastNameCommercial")).clear();
driver.findElement(By.id("lastNameCommercial")).sendKeys("Rheingold");
driver.findElement(By.id("addressCommercial")).clear();
driver.findElement(By.id("addressCommercial")).sendKeys("2495 Eagle Watch Lane");
driver.findElement(By.id("cityCommercial")).clear();
driver.findElement(By.id("cityCommercial")).sendKeys("Belmont");
new Select(driver.findElement(By.id("stateCommercial"))).selectByVisibleText("California");
driver.findElement(By.id("zipCodeCommercial")).clear();
driver.findElement(By.id("zipCodeCommercial")).sendKeys("$$$$");
driver.findElement(By.id("nextBtn")).click();
driver.findElement(By.id("zipCodeCommercial")).clear();
driver.findElement(By.id("zipCodeCommercial")).sendKeys("33327");
Thread.sleep(2000);
driver.findElement(By.id("yearlyUsageCommercial")).clear();
driver.findElement(By.id("yearlyUsageCommercial")).sendKeys("10");
driver.findElement(By.id("nextBtn")).click();

WebElement mainCanvas11 = driver.findElement(By.xpath(".//*[@id='mapCanvas']/div/div[1]/div[2]"));

Thread.sleep(2000);
Actions mouseAction11 = new Actions(driver);

mouseAction11.moveToElement(mainCanvas11);

mouseAction11.contextClick(mainCanvas11);

mouseAction11.moveByOffset(5, 25);
   
mouseAction11.sendKeys(Keys.ARROW_DOWN);

mouseAction11.sendKeys(Keys.RETURN);
//mouseAction.keyDown(Keys.ARROW_DOWN);
//mouseAction.moveToElement(subMenu);
  
mouseAction11.click();

mouseAction11.perform();

WebElement mainCanvas211 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));

Actions mouseAction211 = new Actions(driver);

mouseAction211.moveToElement(mainCanvas211);

mouseAction211.contextClick(mainCanvas211);

mouseAction211.moveByOffset(70, 50);

mouseAction211.sendKeys(Keys.ARROW_DOWN);

mouseAction211.sendKeys(Keys.RETURN);
//mouseAction.keyDown(Keys.ARROW_DOWN);
//mouseAction.moveToElement(subMenu);
 
mouseAction211.click();

mouseAction211.perform();


WebElement mainCanvas311 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));

Actions mouseAction311 = new Actions(driver);

mouseAction3.moveToElement(mainCanvas311);

mouseAction3.contextClick(mainCanvas311);

mouseAction3.moveToElement(mainCanvas211, 500, 220);

mouseAction3.sendKeys(Keys.ARROW_DOWN);

mouseAction3.sendKeys(Keys.RETURN);
//mouseAction.keyDown(Keys.ARROW_DOWN);
//mouseAction.moveToElement(subMenu);
 
mouseAction3.click();

mouseAction3.perform();

//Clicking inside the Triangle
  
WebElement e11 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));

new Actions(driver)
.moveToElement(e11, 0, 0)
.moveByOffset(520, 255)
.click()
.build()
.perform();



driver.findElement(By.id("background")).click();
Thread.sleep(2000);
//driver.findElement(By.id("nextButton")).click();
//driver.findElement(By.id("nextButton")).click();
driver.findElement(By.xpath("//input[@value='Next']")).click();
Thread.sleep(2000);
//driver.findElement(By.id("supplyLeadDetailsBtn1")).click();
driver.findElement(By.xpath("//div[@id='solutionCategory']/ul/li[2]/h3")).click();
driver.findElement(By.xpath("//div[@id='solutionCategory']/div[2]/div[2]/div/div/span[2]")).click();
driver.findElement(By.xpath("//li[2]/span")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Next']")).click();
Thread.sleep(2000);    

//driver.findElement(By.xpath("//div[@id='mapCanvas']/div/div/div[2]")).click();
//driver.findElement(By.xpath("//div[@id='mapCanvas']/div/div/div[2]")).click();
//driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
//driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
//driver.findElement(By.xpath("//div[@id='solutionCategory']/ul/li[2]/h3")).click();
//driver.findElement(By.cssSelector("span.arrow")).click();
//driver.findElement(By.cssSelector("div.invertersSurroundingDiv")).click();
//driver.findElement(By.id("nextButton")).click();
//driver.findElement(By.id("nextButton")).click();
//driver.findElement(By.xpath("//input[@value='Next']")).click();
driver.findElement(By.xpath("//div[2]/input")).click();

driver.findElement(By.id("supplyLeadDetailsBtn1")).click();
driver.findElement(By.xpath("(//input[@value='Cancel'])[2]")).click();
Thread.sleep(2000);
driver.findElement(By.id("addressBreadcrumb")).click();

driver.findElement(By.id("emailCommercial")).clear();
driver.findElement(By.id("emailCommercial")).sendKeys("jakemodsolar@gmail.com");
//driver.findElement(By.id("emailCommercial")).clear();
//driver.findElement(By.id("emailCommercial")).sendKeys("");
Thread.sleep(2000);
driver.findElement(By.id("emailStage")).click();
//driver.findElement(By.id("nextBtn")).click();
Thread.sleep(2000);
driver.findElement(By.id("leadphone")).clear();
driver.findElement(By.id("leadphone")).sendKeys("9543260768");
Thread.sleep(2000);
driver.findElement(By.id("leademail")).clear();
Thread.sleep(2000);
driver.findElement(By.id("leademail")).sendKeys("jakemodsolar@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Save']")).click();
Thread.sleep(2000);
driver.findElement(By.id("sendProposalButton")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("Home")).click();
    
    //MUNICIPAL

driver.findElement(By.linkText("Home")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("rheingold");
Thread.sleep(2000);
driver.findElement(By.cssSelector("div.newLeadList")).click();

driver.findElement(By.id("tabMunicipal")).click();
//ERROR: Caught exception [Error: Dom locators are not implemented yet!]
driver.findElement(By.xpath("(//input[@id='businessName'])[3]")).clear();
driver.findElement(By.xpath("(//input[@id='businessName'])[3]")).sendKeys("NAU");

driver.findElement(By.id("firstNameMunicipal")).clear();
driver.findElement(By.id("firstNameMunicipal")).sendKeys("%*^*&&*");
Thread.sleep(2000);
driver.findElement(By.id("lastNameMunicipal")).clear();
driver.findElement(By.id("lastNameMunicipal")).sendKeys("^*^&*");
Thread.sleep(2000);
driver.findElement(By.id("firstNameMunicipal")).clear();
driver.findElement(By.id("firstNameMunicipal")).sendKeys("Jake");
driver.findElement(By.id("lastNameMunicipal")).clear();
driver.findElement(By.id("lastNameMunicipal")).sendKeys("Rheingold");
driver.findElement(By.id("addressMunicipal")).clear();
driver.findElement(By.id("addressMunicipal")).sendKeys("2495 Eagle Watch Lane");
driver.findElement(By.id("cityMunicipal")).clear();
driver.findElement(By.id("cityMunicipal")).sendKeys("Belmont");
new Select(driver.findElement(By.id("stateMunicipal"))).selectByVisibleText("California");
driver.findElement(By.id("zipCodeMunicipal")).clear();
driver.findElement(By.id("zipCodeMunicipal")).sendKeys("$$$$");
driver.findElement(By.id("nextBtn")).click();
driver.findElement(By.id("zipCodeMunicipal")).clear();
driver.findElement(By.id("zipCodeMunicipal")).sendKeys("33327");
Thread.sleep(2000);
driver.findElement(By.id("yearlyUsageMunicipal")).clear();
driver.findElement(By.id("yearlyUsageMunicipal")).sendKeys("10");
driver.findElement(By.id("nextBtn")).click();

WebElement mainCanvas111 = driver.findElement(By.xpath(".//*[@id='mapCanvas']/div/div[1]/div[2]"));

Thread.sleep(2000);
Actions mouseAction111 = new Actions(driver);

mouseAction111.moveToElement(mainCanvas111);

mouseAction111.contextClick(mainCanvas111);

mouseAction111.moveByOffset(5, 25);

mouseAction111.sendKeys(Keys.ARROW_DOWN);

mouseAction111.sendKeys(Keys.RETURN);
//mouseAction.keyDown(Keys.ARROW_DOWN);
//mouseAction.moveToElement(subMenu);

mouseAction111.click();

mouseAction111.perform();

WebElement mainCanvas2111 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));

Actions mouseAction2111 = new Actions(driver);

mouseAction211.moveToElement(mainCanvas2111);

mouseAction211.contextClick(mainCanvas2111);

mouseAction211.moveByOffset(70, 50);

mouseAction211.sendKeys(Keys.ARROW_DOWN);

mouseAction211.sendKeys(Keys.RETURN);
//mouseAction.keyDown(Keys.ARROW_DOWN);
//mouseAction.moveToElement(subMenu);

mouseAction211.click();

mouseAction211.perform();


WebElement mainCanvas3111 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));

Actions mouseAction3111 = new Actions(driver);

mouseAction3.moveToElement(mainCanvas3111);

mouseAction3.contextClick(mainCanvas3111);

mouseAction3.moveToElement(mainCanvas2111, 500, 220);

mouseAction3.sendKeys(Keys.ARROW_DOWN);

mouseAction3.sendKeys(Keys.RETURN);
//mouseAction.keyDown(Keys.ARROW_DOWN);
//mouseAction.moveToElement(subMenu);

mouseAction3.click();

mouseAction3.perform();

//Clicking inside the Triangle

WebElement e111 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));

new Actions(driver)
.moveToElement(e111, 0, 0)
.moveByOffset(520, 255)
.click()
.build()
.perform();



driver.findElement(By.id("background")).click();
Thread.sleep(2000);
//driver.findElement(By.id("nextButton")).click();
//driver.findElement(By.id("nextButton")).click();
driver.findElement(By.xpath("//input[@value='Next']")).click();
Thread.sleep(2000);
//driver.findElement(By.id("supplyLeadDetailsBtn1")).click();
driver.findElement(By.xpath("//div[@id='solutionCategory']/ul/li[2]/h3")).click();
driver.findElement(By.xpath("//div[@id='solutionCategory']/div[2]/div[2]/div/div/span[2]")).click();
driver.findElement(By.xpath("//li[2]/span")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Next']")).click();
Thread.sleep(2000);    

//driver.findElement(By.xpath("//div[@id='mapCanvas']/div/div/div[2]")).click();
//driver.findElement(By.xpath("//div[@id='mapCanvas']/div/div/div[2]")).click();
//driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
//driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
//driver.findElement(By.xpath("//div[@id='solutionCategory']/ul/li[2]/h3")).click();
//driver.findElement(By.cssSelector("span.arrow")).click();
//driver.findElement(By.cssSelector("div.invertersSurroundingDiv")).click();
//driver.findElement(By.id("nextButton")).click();
//driver.findElement(By.id("nextButton")).click();
//driver.findElement(By.xpath("//input[@value='Next']")).click();
driver.findElement(By.xpath("//div[2]/input")).click();

driver.findElement(By.id("supplyLeadDetailsBtn1")).click();
driver.findElement(By.xpath("(//input[@value='Cancel'])[2]")).click();
Thread.sleep(2000);
driver.findElement(By.id("addressBreadcrumb")).click();

driver.findElement(By.id("emailMunicipal")).clear();
driver.findElement(By.id("emailMunicipal")).sendKeys("jakemodsolar@gmail.com");
//driver.findElement(By.id("emailCommercial")).clear();
//driver.findElement(By.id("emailCommercial")).sendKeys("");
Thread.sleep(2000);
driver.findElement(By.id("emailStage")).click();
//driver.findElement(By.id("nextBtn")).click();
Thread.sleep(2000);
driver.findElement(By.id("leadphone")).clear();
driver.findElement(By.id("leadphone")).sendKeys("9543260768");
Thread.sleep(2000);
driver.findElement(By.id("leademail")).clear();
Thread.sleep(2000);
driver.findElement(By.id("leademail")).sendKeys("jakemodsolar@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Save']")).click();
Thread.sleep(2000);
driver.findElement(By.id("sendProposalButton")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("Home")).click();


    ///THE REST

driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("rheingold");
driver.findElement(By.cssSelector("div.newLeadList")).click();
driver.findElement(By.id("tabResidential")).click();
driver.findElement(By.id("firstNameResidential")).clear();
driver.findElement(By.id("firstNameResidential")).sendKeys("Jake");
driver.findElement(By.id("lastNameResidential")).clear();
driver.findElement(By.id("lastNameResidential")).sendKeys("Rheingold");
driver.findElement(By.id("addressResidential")).clear();
driver.findElement(By.id("addressResidential")).sendKeys("2495 Eagle Watch Lane");
driver.findElement(By.id("cityResidential")).clear();
driver.findElement(By.id("cityResidential")).sendKeys("Belmont");
new Select(driver.findElement(By.id("stateResidential"))).selectByVisibleText("California");
driver.findElement(By.id("zipCodeResidential")).clear();
driver.findElement(By.id("zipCodeResidential")).sendKeys("33327");
driver.findElement(By.id("yearlyUsageResidential")).clear();
driver.findElement(By.id("yearlyUsageResidential")).sendKeys("1");
driver.findElement(By.id("nextBtn")).click();

WebElement mainCanvas1111 = driver.findElement(By.xpath(".//*[@id='mapCanvas']/div/div[1]/div[2]"));

Actions mouseAction1111 = new Actions(driver);

mouseAction1111.moveToElement(mainCanvas1111); 

mouseAction1111.contextClick(mainCanvas1111); 

mouseAction1111.moveByOffset(5, 25);
    
mouseAction1111.sendKeys(Keys.ARROW_DOWN);

mouseAction1111.sendKeys(Keys.RETURN);
//mouseAction.keyDown(Keys.ARROW_DOWN);
//mouseAction.moveToElement(subMenu);
  
mouseAction1111.click();

mouseAction1111.perform();

WebElement mainCanvas21111 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));

Actions mouseAction21111 = new Actions(driver);

mouseAction21111.moveToElement(mainCanvas21111); 

mouseAction21111.contextClick(mainCanvas21111); 

mouseAction21111.moveByOffset(70, 50);

mouseAction21111.sendKeys(Keys.ARROW_DOWN);

mouseAction21111.sendKeys(Keys.RETURN);
//mouseAction.keyDown(Keys.ARROW_DOWN);
//mouseAction.moveToElement(subMenu);
  
mouseAction21111.click();

mouseAction21111.perform();


WebElement mainCanvas31111 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));

Actions mouseAction31111 = new Actions(driver);

mouseAction31111.moveToElement(mainCanvas31111); 

mouseAction31111.contextClick(mainCanvas31111); 

mouseAction31111.moveToElement(mainCanvas21111, 500, 220);

mouseAction31111.sendKeys(Keys.ARROW_DOWN);

mouseAction31111.sendKeys(Keys.RETURN);
//mouseAction.keyDown(Keys.ARROW_DOWN);
//mouseAction.moveToElement(subMenu);
  
mouseAction31111.click();

mouseAction31111.perform();

//Clicking inside the Triangle 
  
WebElement e1111 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));

new Actions(driver)
.moveToElement(e1111, 0, 0)
.moveByOffset(520, 255)
.click()
.build()
.perform();


driver.findElement(By.xpath("//div[@id='mapCanvas']/div/div/div[2]")).click();
driver.findElement(By.id("contentUsagePaneTitle")).click();
driver.findElement(By.id("utilityRatesPaneTitle")).click();
driver.findElement(By.id("regionsPaneTitle")).click();
driver.findElement(By.id("shadingPaneTitle")).click();
driver.findElement(By.id("shadingPercentage")).click();
driver.findElement(By.id("shadingPercentage")).click();
driver.findElement(By.id("shadingPercentage")).clear();
driver.findElement(By.id("shadingPercentage")).sendKeys("90");
driver.findElement(By.id("shadingPercentage")).click();
driver.findElement(By.id("shadingPercentage")).clear();
driver.findElement(By.id("shadingPercentage")).sendKeys("90");
driver.findElement(By.id("shadingPercentage")).click();
driver.findElement(By.id("shadingPercentage")).clear();
driver.findElement(By.id("shadingPercentage")).sendKeys("$%$");
driver.findElement(By.id("shadingPercentage")).clear();
driver.findElement(By.id("shadingPercentage")).sendKeys("$%$");
driver.findElement(By.id("month02Shading")).click();
driver.findElement(By.id("month02Shading")).click();
driver.findElement(By.id("month02Shading")).click();
driver.findElement(By.id("month02Shading")).click();
driver.findElement(By.id("month02Shading")).clear();
driver.findElement(By.id("month02Shading")).sendKeys("67");
driver.findElement(By.id("month03Shading")).clear();
driver.findElement(By.id("month03Shading")).sendKeys("");
driver.findElement(By.id("month03Shading")).click();
driver.findElement(By.id("month03Shading")).clear();
driver.findElement(By.id("month03Shading")).sendKeys("$%$");
driver.findElement(By.id("productionPaneTitle")).click();
driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
driver.findElement(By.xpath("//div[@id='solutionCategory']/ul/li[2]/h3")).click();
driver.findElement(By.cssSelector("span.text")).click();
driver.findElement(By.cssSelector("div.invertersSurroundingDiv")).click();
driver.findElement(By.id("nextButton")).click();
driver.findElement(By.id("mapBreadcrumb")).click();
driver.findElement(By.id("productionPaneTitle")).click();
driver.findElement(By.id("shadingPaneTitle")).click();
driver.findElement(By.id("shadingPercentage")).click();
driver.findElement(By.id("shadingPercentage")).clear();
driver.findElement(By.id("shadingPercentage")).sendKeys("100");
driver.findElement(By.id("productionPaneTitle")).click();
driver.findElement(By.id("adjustedTotalProduction")).click();
driver.findElement(By.linkText("Show Monthly Values")).click();
driver.findElement(By.linkText("Hide Monthly Values")).click();
driver.findElement(By.id("shadingPaneTitle")).click();
driver.findElement(By.id("shadingPercentage")).click();
driver.findElement(By.id("shadingPercentage")).click();
driver.findElement(By.id("shadingPercentage")).click();
driver.findElement(By.id("shadingPercentage")).clear();
driver.findElement(By.id("shadingPercentage")).sendKeys("0");
driver.findElement(By.id("productionPaneTitle")).click();
driver.findElement(By.id("totalProductionData")).click();
driver.findElement(By.id("totalProductionData")).click();
driver.findElement(By.id("totalProductionData")).click();
driver.findElement(By.id("productionPaneTitle")).click();
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

