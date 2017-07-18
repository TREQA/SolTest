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

public class LEADPOPUP_Regression_Official1 {
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
  //public void testLPUSignInAndSearch() throws Exception {}
      public void testGood() throws Exception {
            driver.get(baseUrl + "/ModSolarPlatform/login.jsp");
            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("username")).sendKeys("Jakeautomation");
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("qa");
            driver.findElement(By.name("submit")).click();
            driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
            
            //driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("rheingold");
            driver.findElement(By.cssSelector("div.newLeadList")).click();
            
            
            driver.findElement(By.id("tabResidential")).click();
            driver.findElement(By.id("firstNameResidential")).clear();
            driver.findElement(By.id("firstNameResidential")).sendKeys("PopUpLead");
            driver.findElement(By.id("lastNameResidential")).clear();
            driver.findElement(By.id("lastNameResidential")).sendKeys("PopUpLead");
            driver.findElement(By.id("addressResidential")).clear();
            driver.findElement(By.id("addressResidential")).sendKeys("600 Clipper Rd");
            driver.findElement(By.id("cityResidential")).clear();
            driver.findElement(By.id("cityResidential")).sendKeys("Belmont");
            new Select(driver.findElement(By.id("stateResidential"))).selectByVisibleText("California");
            driver.findElement(By.id("zipCodeResidential")).clear();
            driver.findElement(By.id("zipCodeResidential")).sendKeys("90042");
            Thread.sleep(800);
            driver.findElement(By.id("phoneResidential")).clear();
            driver.findElement(By.id("phoneResidential")).sendKeys("2153214568");
            driver.findElement(By.id("emailResidential")).clear();
            driver.findElement(By.id("emailResidential")).sendKeys("christianmodsolar@gmail.com");
            driver.findElement(By.id("utilityTaxRateInputAddressResidential")).clear();
            driver.findElement(By.id("utilityTaxRateInputAddressResidential")).sendKeys("1.2");
            driver.findElement(By.id("averageMonthlyBillResidential")).clear();
            driver.findElement(By.id("averageMonthlyBillResidential")).sendKeys("15");
            driver.findElement(By.id("nextBtn")).click();
            Thread.sleep(8000);
            
            
            driver.get(baseUrl + "/ModSolarPlatform/login.jsp");
            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("username")).sendKeys("Jakeautomation");
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("qa");
            driver.findElement(By.name("submit")).click();
            driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
            
            //driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
            driver.findElement(By.cssSelector("div.newLeadList")).click();
            
            
            driver.findElement(By.id("tabResidential")).click();
            driver.findElement(By.id("firstNameResidential")).clear();
            driver.findElement(By.id("firstNameResidential")).sendKeys("PopUpLead");
            driver.findElement(By.id("lastNameResidential")).clear();
            driver.findElement(By.id("lastNameResidential")).sendKeys("PopUpLead");
            driver.findElement(By.id("addressResidential")).clear();
            driver.findElement(By.id("addressResidential")).sendKeys("600 Clipper Rd");
            driver.findElement(By.id("cityResidential")).clear();
            driver.findElement(By.id("cityResidential")).sendKeys("Belmont");
            new Select(driver.findElement(By.id("stateResidential"))).selectByVisibleText("California");
            driver.findElement(By.id("zipCodeResidential")).clear();
            driver.findElement(By.id("zipCodeResidential")).sendKeys("90042");
            Thread.sleep(800);
            driver.findElement(By.id("phoneResidential")).clear();
            driver.findElement(By.id("phoneResidential")).sendKeys("2153214568");
            driver.findElement(By.id("emailResidential")).clear();
            driver.findElement(By.id("emailResidential")).sendKeys("christianmodsolar@gmail.com");
            driver.findElement(By.id("utilityTaxRateInputAddressResidential")).clear();
            driver.findElement(By.id("utilityTaxRateInputAddressResidential")).sendKeys("1.2");
            driver.findElement(By.id("averageMonthlyBillResidential")).clear();
            driver.findElement(By.id("averageMonthlyBillResidential")).sendKeys("15");
            driver.findElement(By.id("nextBtn")).click();
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
              Thread.sleep(2000);
              
              driver.findElement(By.id("selectedProgramCheckbox_177")).click();
              Thread.sleep(2000);
              
              //Click on Next button 
              driver.findElement(By.xpath("//input[@id='nextButton']")).click();
              Thread.sleep(2000);
              
              //Click on Next button
              driver.findElement(By.id("supplyLeadDetailsBtn1")).click();
              Thread.sleep(2000);
              
              //click on Email button
              driver.findElement(By.id("sendProposalButton")).click();
              Thread.sleep(2000);
              
              //click on Next Button
              driver.findElement(By.id("submitForFundingEnabled")).click();
              Thread.sleep(2000);
              
              //click on CashSCION
              driver.findElement(By.id("fid_177")).click();
              
              //click on Submit button 
              driver.findElement(By.xpath("//input[@value='Submit']")).click();
              Thread.sleep(2000);
              
              driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
              Thread.sleep(2000);
              driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
              driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
              ///
              driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("popuplead");
              driver.findElement(By.xpath("//div[@id='leadsTable_filter']/label/input")).click();
              Thread.sleep(4000);
              

                driver.findElement(By.cssSelector("td.sorting_1")).click();
                driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
                Thread.sleep(2000);
                driver.findElement(By.id("renameProposal")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//td[2]/div[2]/input")).clear();
                driver.findElement(By.xpath("//td[2]/div[2]/input")).sendKeys("LeadPopUpAutomation");
                Thread.sleep(2000);
                //driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
                //driver.findElement(By.cssSelector("li.onlyIfProposalComplete")).click();
                // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp |  | 30000]]
                driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
                driver.findElement(By.id("cloneProposal")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("input.btn")).click();
                driver.findElement(By.linkText("Home")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
                driver.findElement(By.cssSelector("li.onlyIfConfigurationComplete.onlyIfProposalReady")).click();
                driver.findElement(By.id("sendProposalButton")).click();
                Thread.sleep(2000);
                driver.findElement(By.linkText("Home")).click();
                Thread.sleep(2000);
                driver.findElement(By.linkText("Home")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
                //driver.findElement(By.xpath("//tr[@id='proposal_55519_52458_true_2_0_4_115_true_0']/td[3]/div")).click();
                //driver.findElement(By.xpath("//tr[@id='proposal_55519_52458_true_2_0_4_115_true_0']/td[3]/div")).click();
                driver.findElement(By.id("deleteProposal")).click();
                driver.findElement(By.cssSelector("label > input[type=\"button\"]")).click();
                driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
                driver.findElement(By.id("deleteProposal")).click();
                driver.findElement(By.xpath("(//input[@value='No'])[2]")).click();
                driver.findElement(By.cssSelector("div.closeButton")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr[2]/td[3]")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
                driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
                Thread.sleep(2000);
                ///driver.findElement(By.xpath("//li[@onclick='proposalActionsModal.close();editProposal();']")).click();
                ///driver.findElement(By.xpath("//li[@onclick='proposalActionsModal.close();editProposal();']")).click();
                driver.findElement(By.xpath("//tr[2]/td[2]/div/div/ul/li")).click();
                driver.findElement(By.linkText("Home")).click();
                Thread.sleep(2000);
                //driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr[2]/td[4]")).click();
                //driver.findElement(By.id("slickid__")).click();
                //driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
                //driver.findElement(By.id("renameProposal")).click();
                //driver.findElement(By.xpath("//td[2]/div[2]/input")).clear();
                //driver.findElement(By.xpath("//td[2]/div[2]/input")).sendKeys("Incomplete");
                driver.findElement(By.cssSelector("td.sorting_1")).click();
                driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
                Thread.sleep(2000);
                driver.findElement(By.id("renameProposal")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//td[2]/div[2]/input")).clear();
                driver.findElement(By.xpath("//td[2]/div[2]/input")).sendKeys("Incomplete");
                Thread.sleep(2000);
                
                
                driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
                Thread.sleep(500);
                driver.findElement(By.id("cloneProposal")).click();
                Thread.sleep(2000);
                driver.findElement(By.linkText("Home")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr[2]/td[5]")).click();
                driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
                Thread.sleep(2000);

                //driver.findElement(By.id("slickid__")).click();
                driver.findElement(By.id("deleteProposal")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@value='No']")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
                Thread.sleep(2000);
                driver.findElement(By.id("deleteProposal")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("(//input[@value='Yes'])[2]")).click();
                Thread.sleep(2000);
                //driver.findElement(By.linkText("Add Proposal +")).click();
                //driver.findElement(By.linkText("Add Proposal +")).click();
                driver.findElement(By.xpath("//td[2]/div/div/div/div[2]/a")).click();
                
                driver.findElement(By.id("addressResidential")).clear();
                driver.findElement(By.id("addressResidential")).sendKeys("601 Clipper Rd");
                driver.findElement(By.linkText("Home")).click();
                
                //driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr[2]/td[3]")).click();
               // driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
             //   driver.findElement(By.id("deleteProposal")).click();
            //driver.findElement(By.cssSelector("label > input[type=\"button\"]")).click();
            //    driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
            //    driver.findElement(By.id("deleteProposal")).click();
             //   driver.findElement(By.xpath("(//input[@value='Yes'])[2]")).click();
                
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr[2]/td[3]")).click();
                //driver.findElement(By.linkText("Add Proposal +")).click();
                driver.findElement(By.xpath("//td[2]/div/div/div/div[2]/a")).click();
                driver.findElement(By.linkText("Home")).click();
                driver.findElement(By.linkText("Home")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
                //driver.findElement(By.linkText("Add Proposal +")).click();
                driver.findElement(By.xpath("//td[2]/div/div/div/div[2]/a")).click();
                driver.findElement(By.linkText("Home")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr[2]/td[3]")).click();
                driver.findElement(By.id("leadComments")).clear();
                driver.findElement(By.id("leadComments")).sendKeys("test");
                driver.findElement(By.cssSelector("input.btn")).click();
                driver.findElement(By.cssSelector("div.closeButton")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr[2]/td[3]")).click();
                driver.findElement(By.id("leadComments")).clear();
                driver.findElement(By.id("leadComments")).sendKeys("test. rrrr");
                driver.findElement(By.cssSelector("div.closeButton")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr[2]/td[3]")).click();
                driver.findElement(By.id("leadComments")).clear();
                driver.findElement(By.id("leadComments")).sendKeys("");
                driver.findElement(By.cssSelector("div.closeButton")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr[2]/td[3]")).click();
                driver.findElement(By.id("leadComments")).clear();
                driver.findElement(By.id("leadComments")).sendKeys("");
                driver.findElement(By.cssSelector("input.btn")).click();
                driver.findElement(By.cssSelector("div.closeButton")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr[2]/td[3]")).click();
                new Select(driver.findElement(By.cssSelector("div.leadInfoContainer > div > select"))).selectByVisibleText("Jakeautomation");
                driver.findElement(By.linkText("Edit this Lead")).click();
                driver.findElement(By.id("cancelButton")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr[2]/td[3]")).click();
                driver.findElement(By.linkText("Edit this Lead")).click();
                driver.findElement(By.name("submit")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr[2]/td[3]")).click();
                driver.findElement(By.linkText("Delete this Lead")).click();
                driver.findElement(By.linkText("Delete this Lead")).click();
                driver.findElement(By.xpath("(//input[@value='Yes'])[2]")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
                driver.findElement(By.linkText("Low Interest")).click();
                driver.findElement(By.cssSelector("input.btn")).click();
                driver.findElement(By.cssSelector("input.btn")).click();
                driver.findElement(By.cssSelector("div.closeButton")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
                driver.findElement(By.linkText("Some Interest")).click();
                driver.findElement(By.cssSelector("div.closeButton")).click();
                driver.findElement(By.cssSelector("div.closeButton")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
                driver.findElement(By.linkText("Very Interested")).click();
                driver.findElement(By.cssSelector("div.closeButton")).click();
                driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
                driver.findElement(By.cssSelector("div.closeButton")).click();
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



