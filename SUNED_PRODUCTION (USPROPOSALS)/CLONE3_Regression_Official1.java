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

public class CLONE3_Regression_Official1 {
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
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    driver.findElement(By.xpath("//td[3]/div")).click();
    //Deleting a proposal covered here
    driver.findElement(By.id("deleteProposal")).click();
    driver.findElement(By.cssSelector("label > input[type=\"button\"]")).click();
    driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
    driver.findElement(By.xpath("//li[@onclick='proposalActionsModal.close();editProposal();']")).click();
    Thread.sleep(2000);
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
    driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
    driver.findElement(By.id("cloneProposal")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    driver.findElement(By.xpath("//td[3]/div")).click();
    driver.findElement(By.id("deleteProposal")).click();
    driver.findElement(By.cssSelector("label > input[type=\"button\"]")).click();
    driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
    driver.findElement(By.xpath("//li[@onclick='proposalActionsModal.close();editProposal();']")).click();
    driver.findElement(By.xpath("//div[@id='solutionCategory']/ul/li[2]/h3")).click();
    driver.findElement(By.cssSelector("span.arrow")).click();
    driver.findElement(By.id("nextButton")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
    driver.findElement(By.id("cloneProposal")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    driver.findElement(By.xpath("//td[3]/div")).click();
    driver.findElement(By.id("deleteProposal")).click();
    driver.findElement(By.cssSelector("label > input[type=\"button\"]")).click();
    driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
    driver.findElement(By.id("cloneProposal")).click();
    driver.findElement(By.id("nextButton")).click();
    Thread.sleep(3000);
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
	Thread.sleep(2000);
	
	 driver.findElement(By.id("pricePerWatt")).clear();
	    driver.findElement(By.id("pricePerWatt")).sendKeys("523");
	    driver.findElement(By.id("pricePerWatt")).clear();
	    driver.findElement(By.id("pricePerWatt")).sendKeys("");
	    driver.findElement(By.id("pricePerWatt")).clear();
	    driver.findElement(By.id("pricePerWatt")).sendKeys("2.52");
	    driver.findElement(By.id("preCodedAdderCheckBox1")).click();
	    driver.findElement(By.id("preCodedAdderCheckBox2")).click();
	    driver.findElement(By.id("adderLab1")).clear();
	    driver.findElement(By.id("adderLab1")).sendKeys("christian_test25");
	    driver.findElement(By.id("adderVal1")).clear();
	    driver.findElement(By.id("adderVal1")).sendKeys("253.00");
	    driver.findElement(By.id("selectedProgramCheckbox_105")).click();
	    driver.findElement(By.id("pricePerWatt")).clear();
	    driver.findElement(By.id("pricePerWatt")).sendKeys("0.55");
	    driver.findElement(By.id("selectedProgramCheckbox_105")).click();
	    driver.findElement(By.id("selectedProgramCheckbox_105")).click();
	    driver.findElement(By.id("selectedProgramCheckbox_201")).click();
	    driver.findElement(By.id("accordion")).click();
	    driver.findElement(By.id("proposalDetailsPaneTitle")).click();
	    driver.findElement(By.id("templateChoice")).click();
	    new Select(driver.findElement(By.id("templateChoice"))).selectByVisibleText("2014 Combo Loan (PBI)");
	    driver.findElement(By.cssSelector("option[value=\"1130\"]")).click();
	    driver.findElement(By.id("yearlyUsage")).click();
	    driver.findElement(By.id("yearlyUsage")).clear();
	    driver.findElement(By.id("yearlyUsage")).sendKeys("52");
	    driver.findElement(By.id("numPanels")).clear();
	    driver.findElement(By.id("numPanels")).sendKeys("10");
	    driver.findElement(By.id("srecValue")).clear();
	    driver.findElement(By.id("srecValue")).sendKeys("32");
	    driver.findElement(By.id("scheduleChoice")).click();
	    new Select(driver.findElement(By.id("scheduleChoice"))).selectByVisibleText("45-day Schedule");
	    driver.findElement(By.cssSelector("option[value=\"-1\"]")).click();
	    driver.findElement(By.id("accordion")).click();
	    driver.findElement(By.id("recalculateButton_105")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("nextButton")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("accordion")).click();
	    driver.findElement(By.id("templateChoice")).click();
	    new Select(driver.findElement(By.id("templateChoice"))).selectByVisibleText("2014 Solar Own (Inside Sales)");
	    driver.findElement(By.cssSelector("option[value=\"1246\"]")).click();
	    driver.findElement(By.cssSelector("label > input[type=\"button\"]")).click();
	    driver.findElement(By.id("yearlyUsage")).click();
	    driver.findElement(By.id("yearlyUsage")).clear();
	    driver.findElement(By.id("yearlyUsage")).sendKeys("50");
	    driver.findElement(By.id("srecValue")).click();
	    driver.findElement(By.id("srecValue")).clear();
	    driver.findElement(By.id("srecValue")).sendKeys("25");
	    driver.findElement(By.cssSelector("#proposalSettingsRegenerateProposalDiv > #regenerateButton")).click();
	    driver.findElement(By.id("accordion")).click();
	    driver.findElement(By.id("accordionTitleText")).click();
	    driver.findElement(By.id("accordion")).click();
	    driver.findElement(By.id("supplyLeadDetailsBtn1")).click();
	    driver.findElement(By.id("sendProposalButton")).click();
	    driver.findElement(By.id("saveProposalButton")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | ModSolarProposal | 30000]]
	    driver.findElement(By.linkText("Home")).click();
	    driver.findElement(By.cssSelector("#tabMyDeals > div > h3")).click();
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

