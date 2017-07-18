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

public class INCENTIVES_Regression_Official1 {
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
    ////driver.findElement(By.cssSelector("div.thumbnailContainer")).click();
    driver.findElement(By.cssSelector("#content > div.thumbnailContainer > div.newLeadList")).click();

            driver.findElement(By.id("tabResidential")).click();

            driver.findElement(By.id("firstNameResidential")).clear();

            driver.findElement(By.id("firstNameResidential")).sendKeys("Automation Release0820");

            driver.findElement(By.id("lastNameResidential")).clear();

            driver.findElement(By.id("lastNameResidential")).sendKeys("Automation Release0820");

            driver.findElement(By.id("addressResidential")).clear();

            driver.findElement(By.id("addressResidential")).sendKeys("600 Clipper rd");

            driver.findElement(By.id("cityResidential")).clear();

            driver.findElement(By.id("cityResidential")).sendKeys("Belmont");

            new Select(driver.findElement(By.id("stateResidential"))).selectByVisibleText("California");

            driver.findElement(By.id("zipCodeResidential")).clear();

            driver.findElement(By.id("zipCodeResidential")).sendKeys("94002");

            Thread.sleep(2000);

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
 
      
  Thread.sleep(2000);
  //driver.findElement(By.id("next")).click();

  //driver.findElement(By.cssSelector("#panel_557 > table")).click();

  //driver.findElement(By.cssSelector("#panel_485 > table > thead > tr > td.acEnergy")).click();

 // driver.findElement(By.cssSelector("#panel_542 > table > thead > tr > td.acEnergy")).click();

  //driver.findElement(By.cssSelector("#panel_499 > table > thead > tr > td.acEnergy")).click();

  //driver.findElement(By.cssSelector("#panel_212 > div.head")).click();

  //driver.findElement(By.cssSelector("#panel_486 > table > tbody > tr > th")).click();

  //driver.findElement(By.cssSelector("div.head")).click();
  Thread.sleep(2000);
  //driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[6]/div[2]/input")).click();
  Thread.sleep(8000);
 
   //click on Inverters
   //driver.findElement(By.xpath("//h3[text()= 'Inverters']")).click();
  
   //Click on Arrow
  
   //driver.findElement(By.xpath("//span[@class = 'arrow']")).click();
  
   //Thread.sleep(1000);
   //Default Invert select
   //driver.findElement(By.xpath("html/body/ul/li[2]/span")).click();
  
   
   //Click on Arrow
   //driver.findElement(By.xpath("//span[@class = 'arrow']")).click();
    
   //Thread.sleep(2000);
    
   //Click on Next button
   //driver.findElement(By.xpath("//input[@value='Next']")).click();
   //Thread.sleep(8000);
 
  
   //Click on Next button
   driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[6]/div[2]/input")).click();
   Thread.sleep(5000);
  
   
   driver.findElement(By.linkText("Home")).click();
   Thread.sleep(2000);
   driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
   driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
   driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("rheingold");
   
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();

   driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
   driver.findElement(By.xpath("//li[@onclick='proposalActionsModal.close();editProposal();']")).click();
   Thread.sleep(2000);
   driver.findElement(By.id("incentivesBreadcrumb")).click();
   
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//form[@id='pgForm']/div/fieldset[2]/div/input")).click();

   driver.findElement(By.id("pricePerWatt")).clear();
   driver.findElement(By.id("pricePerWatt")).sendKeys("4.00");
   driver.findElement(By.id("pricePerWatt")).clear();
   driver.findElement(By.id("pricePerWatt")).sendKeys("%^%^4.0%");
   Thread.sleep(2000);
   //driver.findElement(By.id("nextButton")).click();
   Thread.sleep(2000);
   //driver.findElement(By.xpath("//table[17]/tbody/tr[2]/td[2]/div/div[2]/label/input")).click();
   //driver.findElement(By.xpath("/html/body/table[18]/tbody/tr[2]/td[2]/div/div[2]/label/input")).click();
   
   Thread.sleep(2000);
   driver.findElement(By.id("pricePerWatt")).clear();
   driver.findElement(By.id("pricePerWatt")).sendKeys("");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("pricePerWatt")).clear();
   driver.findElement(By.id("pricePerWatt")).sendKeys("4.00");
   driver.findElement(By.id("pricePerWatt")).clear();
   driver.findElement(By.id("pricePerWatt")).sendKeys("5.00");
   driver.findElement(By.cssSelector("label.overTxtLabel")).click();
   driver.findElement(By.id("proposalName")).clear();
   driver.findElement(By.id("proposalName")).sendKeys("IncentiveTest");
   driver.findElement(By.id("preCodedAdderCheckBox1")).click();
   driver.findElement(By.id("preCodedAdderVal1")).clear();
   driver.findElement(By.id("preCodedAdderVal1")).sendKeys("555.00");
   driver.findElement(By.id("preCodedAdderVal1")).clear();
   driver.findElement(By.id("preCodedAdderVal1")).sendKeys("$%^^&%");
   Thread.sleep(2000);
   driver.findElement(By.id("background")).click();

   Thread.sleep(2000);

   //driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("preCodedAdderCheckBox1")).click();
   driver.findElement(By.id("adderLab1")).clear();
   driver.findElement(By.id("adderLab1")).sendKeys("Adder1");
   driver.findElement(By.id("adderVal1")).clear();
   driver.findElement(By.id("adderVal1")).sendKeys("54.00");
   driver.findElement(By.id("adderVal1")).clear();
   driver.findElement(By.id("adderVal1")).sendKeys("%^&^%");
   Thread.sleep(2000);
   driver.findElement(By.id("discountLab1")).clear();
   driver.findElement(By.id("discountLab1")).sendKeys("Discount1");
   driver.findElement(By.id("discountVal1")).clear();
   driver.findElement(By.id("discountVal1")).sendKeys("67.00");
   driver.findElement(By.id("discountVal1")).clear();
   driver.findElement(By.id("discountVal1")).sendKeys("%^^$");
   Thread.sleep(2000);
   driver.findElement(By.id("background")).click();

   Thread.sleep(2000);

   
   //driver.findElement(By.id("nextButton")).click();
   Thread.sleep(2000);
   //driver.findElement(By.xpath("(//input[@value='Ok'])[2]")).click();
   Thread.sleep(2000);
   //driver.findElement(By.xpath("//table[18]/tbody/tr[2]/td[2]/div/div[2]/label/input")).click();

   //driver.findElement(By.id("incentive_CH17")).click();
   driver.findElement(By.xpath("//form[@id='pgForm']/div/fieldset[5]/div/input")).click();
   driver.findElement(By.xpath("//form[@id='pgForm']/div/fieldset[4]/div/input")).click();

   driver.findElement(By.xpath("//form[@id='pgForm']/div/fieldset[3]/div/input")).click();
   //driver.findElement(By.id("incentive_CH16")).click();
   
   //driver.findElement(By.id("incentive_CH15")).click();
   driver.findElement(By.xpath("//form[@id='pgForm']/div/fieldset[1]/div/input")).click();
   Thread.sleep(2000);
   //driver.findElement(By.id("incentive_CH17")).click();
   driver.findElement(By.xpath("//form[@id='pgForm']/div/fieldset[5]/div/input")).click();
   driver.findElement(By.xpath("//form[@id='pgForm']/div/fieldset[4]/div/input")).click();
   driver.findElement(By.xpath("//form[@id='pgForm']/div/fieldset[3]/div/input")).click();
   //driver.findElement(By.id("incentive_CH16")).click();
   
   //driver.findElement(By.id("incentive_CH15")).click();
   driver.findElement(By.xpath("//form[@id='pgForm']/div/fieldset[1]/div/input")).click();

   driver.findElement(By.id("incentiveLab1")).clear();
   driver.findElement(By.id("incentiveLab1")).sendKeys("Incentive1");
   driver.findElement(By.id("incentiveVal1")).clear();
   driver.findElement(By.id("incentiveVal1")).sendKeys("456.00");
   driver.findElement(By.id("incentiveVal1")).clear();
   driver.findElement(By.id("incentiveVal1")).sendKeys("%&***^%$#%");
   driver.findElement(By.id("background")).click();

   driver.findElement(By.id("pricePerWatt")).clear();
   driver.findElement(By.id("pricePerWatt")).sendKeys("$^&^%$%^***(GG%$#");
   Thread.sleep(2000);
   driver.findElement(By.id("background")).click();
   driver.findElement(By.id("nextButton")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("(//input[@value='Ok'])[2]")).click();
   //driver.findElement(By.xpath("//table[17]/tbody/tr[2]/td[2]/div/div[2]/label/input")).click();
   driver.findElement(By.cssSelector("div.closeButton")).click();
   driver.findElement(By.cssSelector("div.closeButton")).click();
   driver.findElement(By.cssSelector("div.closeButton")).click();
   //driver.findElement(By.id("adderLab18")).clear();
   //driver.findElement(By.id("adderLab18")).sendKeys("Adder1");
   //driver.findElement(By.id("adderVal18")).clear();
   //driver.findElement(By.id("adderVal18")).sendKeys("1.00");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//div[@id='addersWrapper']/fieldset[3]/input")).clear();
   driver.findElement(By.xpath("//div[@id='addersWrapper']/fieldset[3]/input")).sendKeys("Adder1");
   driver.findElement(By.xpath("//div[@id='addersWrapper']/fieldset[3]/input[2]")).clear();
   driver.findElement(By.xpath("//div[@id='addersWrapper']/fieldset[3]/input[2]")).sendKeys("1.00");
   //driver.findElement(By.id("discountLab1")).clear();
   //driver.findElement(By.id("discountLab1")).sendKeys("Discount1");
   //driver.findElement(By.id("discountVal1")).clear();
   //driver.findElement(By.id("discountVal1")).sendKeys("1.00");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//div[@id='discountsWrapper']/fieldset/input")).clear();
   driver.findElement(By.xpath("//div[@id='discountsWrapper']/fieldset/input")).sendKeys("Discount1");
   driver.findElement(By.xpath("//div[@id='discountsWrapper']/fieldset/input[2]")).clear();
   driver.findElement(By.xpath("//div[@id='discountsWrapper']/fieldset/input[2]")).sendKeys("1.00");
   //driver.findElement(By.id("incentiveLab1")).clear();
   //driver.findElement(By.id("incentiveLab1")).sendKeys("Incentive1");
   //driver.findElement(By.id("incentiveVal1")).clear();
   //driver.findElement(By.id("incentiveVal1")).sendKeys("1.00");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//div[@id='customIncentivesWrapper']/fieldset/input")).clear();
   driver.findElement(By.xpath("//div[@id='customIncentivesWrapper']/fieldset/input")).sendKeys("Incentive1");
   driver.findElement(By.xpath("//div[@id='customIncentivesWrapper']/fieldset/input[2]")).clear();
   driver.findElement(By.xpath("//div[@id='customIncentivesWrapper']/fieldset/input[2]")).sendKeys("1.00");
   
   driver.findElement(By.id("buyForCashCheckbox")).click();
   driver.findElement(By.id("nextButton")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.id("incentivesBreadcrumb")).click();

   
   driver.findElement(By.linkText("Settings")).click();
   //driver.findElement(By.linkText("Financing Programs")).click();
   Thread.sleep(2000);
   driver.findElement(By.cssSelector("html body div#background div#wrapper div#content div#navsettings ul li a.currentPage")).click();
   driver.findElement(By.linkText("Home")).click();
   driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[5]")).click();
   //driver.findElement(By.id("slickid__")).click();
   driver.findElement(By.cssSelector("div.proposalActions.proposalActionsMenuTrigger")).click();
   driver.findElement(By.xpath("//li[@onclick='proposalActionsModal.close();editProposal();']")).click();
   
   
   driver.findElement(By.id("selectedProgramCheckbox_240")).click();
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("originationFee_240")).clear();
   driver.findElement(By.id("originationFee_240")).sendKeys("@##$");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("originationFee_240")).clear();
   driver.findElement(By.id("originationFee_240")).sendKeys("");
   driver.findElement(By.id("term_240")).clear();
   driver.findElement(By.id("term_240")).sendKeys("@##");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("term_240")).clear();
   driver.findElement(By.id("term_240")).sendKeys("");
   driver.findElement(By.id("downPayment_240")).clear();
   driver.findElement(By.id("downPayment_240")).sendKeys("$%");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("downPayment_240")).clear();
   driver.findElement(By.id("downPayment_240")).sendKeys("");
   driver.findElement(By.id("balloonPayment_240")).clear();
   driver.findElement(By.id("balloonPayment_240")).sendKeys("#$%");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("balloonPayment_240")).clear();
   driver.findElement(By.id("balloonPayment_240")).sendKeys("");
   driver.findElement(By.id("selectedProgramCheckbox_240")).click();
   driver.findElement(By.id("selectedProgramCheckbox_26")).click();
   driver.findElement(By.id("originationFee_26")).clear();
   driver.findElement(By.id("originationFee_26")).sendKeys("#$%");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("originationFee_26")).clear();
   driver.findElement(By.id("originationFee_26")).sendKeys("");
   driver.findElement(By.id("term_26")).clear();
   driver.findElement(By.id("term_26")).sendKeys("#$");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("term_26")).clear();
   driver.findElement(By.id("term_26")).sendKeys("");
   driver.findElement(By.id("ppaRate_26")).clear();
   driver.findElement(By.id("ppaRate_26")).sendKeys("#%");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("ppaRate_26")).clear();
   driver.findElement(By.id("ppaRate_26")).sendKeys("");
   driver.findElement(By.id("ppaEscalator_26")).clear();
   driver.findElement(By.id("ppaEscalator_26")).sendKeys("#$%");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("ppaEscalator_26")).clear();
   driver.findElement(By.id("ppaEscalator_26")).sendKeys("");
   driver.findElement(By.id("selectedProgramCheckbox_26")).click();
   driver.findElement(By.id("selectedProgramCheckbox_68")).click();
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("originationFee_68")).clear();
   driver.findElement(By.id("originationFee_68")).sendKeys("#$");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("originationFee_68")).clear();
   driver.findElement(By.id("originationFee_68")).sendKeys("");
   driver.findElement(By.id("term_68")).clear();
   driver.findElement(By.id("term_68")).sendKeys("#$%");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("term_68")).clear();
   driver.findElement(By.id("term_68")).sendKeys("");
   driver.findElement(By.id("costReductionPercentage_68")).clear();
   driver.findElement(By.id("costReductionPercentage_68")).sendKeys("!@#$");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("costReductionPercentage_68")).clear();
   driver.findElement(By.id("costReductionPercentage_68")).sendKeys("");
   driver.findElement(By.id("downPayment_68")).clear();
   driver.findElement(By.id("downPayment_68")).sendKeys("@#%");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("downPayment_68")).clear();
   driver.findElement(By.id("downPayment_68")).sendKeys("");
   driver.findElement(By.id("balloonPayment_68")).clear();
   driver.findElement(By.id("balloonPayment_68")).sendKeys("@#$");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("balloonPayment_68")).clear();
   driver.findElement(By.id("balloonPayment_68")).sendKeys("");
   driver.findElement(By.id("interestRate_68")).clear();
   driver.findElement(By.id("interestRate_68")).sendKeys("@#$");
   driver.findElement(By.id("nextButton")).click();
   driver.findElement(By.id("selectedProgramCheckbox_68")).click();
   driver.findElement(By.id("nextButton")).click();
   //driver.findElement(By.xpath("//input[@value='Yes']")).click();
   
   Thread.sleep(2000);
   driver.findElement(By.id("mapBreadcrumb")).click();
   driver.findElement(By.id("contentUsagePaneTitle")).click();
   driver.findElement(By.id("yearlyUsageProposalSettings")).click();
   driver.findElement(By.id("yearlyUsageProposalSettings")).clear();
   driver.findElement(By.id("yearlyUsageProposalSettings")).sendKeys("");
   driver.findElement(By.id("averageMonthlyBillProposalSettings")).click();
   driver.findElement(By.id("averageMonthlyBillProposalSettings")).clear();
   driver.findElement(By.id("averageMonthlyBillProposalSettings")).sendKeys("400");
   driver.findElement(By.id("averageMonthlyBillProposalSettings")).click();
   driver.findElement(By.id("averageMonthlyBillProposalSettings")).clear();
   driver.findElement(By.id("averageMonthlyBillProposalSettings")).sendKeys("#$%");
   driver.findElement(By.id("averageMonthlyBillProposalSettings")).click();
   driver.findElement(By.id("averageMonthlyBillProposalSettings")).click();
   driver.findElement(By.id("averageMonthlyBillProposalSettings")).click();
   driver.findElement(By.id("averageMonthlyBillProposalSettings")).clear();
   driver.findElement(By.id("averageMonthlyBillProposalSettings")).sendKeys("100");
   driver.findElement(By.id("month04ProposalSettings")).click();
   driver.findElement(By.id("month04ProposalSettings")).click();
   driver.findElement(By.id("month04ProposalSettings")).clear();
   driver.findElement(By.id("month04ProposalSettings")).sendKeys("510");
   driver.findElement(By.id("contentUsagePaneTitle")).click();
   driver.findElement(By.id("addressBreadcrumb")).click();
   Thread.sleep(2000);
   driver.findElement(By.id("mapBreadcrumb")).click();
   driver.findElement(By.id("contentUsagePaneTitle")).click();
   driver.findElement(By.id("panelsBreadcrumb")).click();
   driver.findElement(By.id("nextButton")).click();
   Thread.sleep(2000);
   driver.findElement(By.id("previewBreadcrumb")).click();
   driver.findElement(By.id("emailStage")).click();
   driver.findElement(By.xpath("//input[@value='Save']")).click();
   
   Thread.sleep(2000);
   
   driver.findElement(By.id("mapBreadcrumb")).click();
   driver.findElement(By.id("addressBreadcrumb")).click();
   driver.findElement(By.id("utilityRatesResidential")).click();
   //driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[2]/div[1]/form/fieldset[2]/table[2]/tbody/tr[1]/td[2]/select/option[29]")).click();
   driver.findElement(By.xpath("//tbody[@id='usageResidential']/tr/td[2]/select")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[2]/div[1]/form/fieldset[2]/table[2]/tbody/tr[1]/td[2]/select/option[29]")).click();
   Thread.sleep(2000);
   driver.findElement(By.id("tier0UpperBoundResidential")).clear();
   driver.findElement(By.id("tier0UpperBoundResidential")).sendKeys("200");
   Thread.sleep(2000);
   driver.findElement(By.id("tier0RateResidential")).clear();
   driver.findElement(By.id("tier0RateResidential")).sendKeys("5");
   driver.findElement(By.id("background")).click();

   Thread.sleep(2000);
   driver.findElement(By.id("tier1UpperBoundResidential")).clear();
   driver.findElement(By.id("tier1UpperBoundResidential")).sendKeys("190");
   driver.findElement(By.id("nextBtn")).click();
   driver.findElement(By.id("tier1UpperBoundResidential")).clear();
   driver.findElement(By.id("tier1UpperBoundResidential")).sendKeys("300");
   driver.findElement(By.id("tier1RateResidential")).clear();
   driver.findElement(By.id("tier1RateResidential")).sendKeys("5");
   driver.findElement(By.id("nextBtn")).click();
   driver.findElement(By.id("tier2RateResidential")).clear();
   driver.findElement(By.id("tier2RateResidential")).sendKeys("4");
   driver.findElement(By.id("nextBtn")).click();
   driver.findElement(By.id("mapBreadcrumb")).click();
   Thread.sleep(2000);
   driver.findElement(By.id("utilityRatesPaneTitle")).click();
   driver.findElement(By.id("previewBreadcrumb")).click();
   driver.findElement(By.id("emailStage")).click();
   
   Thread.sleep(2000);
   
   driver.findElement(By.id("mapBreadcrumb")).click();

   driver.findElement(By.xpath("//h3[@id='shadingPaneTitle']")).click();
   driver.findElement(By.xpath("//div[@id='accordionPanes']/h3[4]")).click();
   Thread.sleep(800);
   driver.findElement(By.id("panelOrientationOptions1")).click();
   new Select(driver.findElement(By.id("panelOrientationOptions1"))).selectByVisibleText("Force landscape");
   driver.findElement(By.id("forcedLandscape1")).click();
   driver.findElement(By.id("rerunButton")).click();
   driver.findElement(By.id("betweenPanels1")).click();
   driver.findElement(By.id("betweenPanels1")).clear();
   driver.findElement(By.id("betweenPanels1")).sendKeys("2.00");
   driver.findElement(By.id("betweenRows1")).clear();
   driver.findElement(By.id("betweenRows1")).sendKeys("2.00");
   driver.findElement(By.id("rerunButton")).click();
   driver.findElement(By.id("transparentPanels")).click();
   driver.findElement(By.cssSelector("div.toggle")).click();
   driver.findElement(By.id("transparentPanels")).click();
   driver.findElement(By.id("showRegionBorders")).click();
   driver.findElement(By.id("showRegionBorders")).click();
   driver.findElement(By.id("invertColors")).click();
   driver.findElement(By.id("invertColors")).click();
   driver.findElement(By.id("shadingPaneTitle")).click();
   driver.findElement(By.id("shadingPercentage")).click();
   driver.findElement(By.id("shadingPercentage")).clear();
   driver.findElement(By.id("shadingPercentage")).sendKeys("100");
   driver.findElement(By.id("shadingPercentage")).click();
   driver.findElement(By.id("shadingPercentage")).clear();
   driver.findElement(By.id("shadingPercentage")).sendKeys("25");
   driver.findElement(By.id("shadingPercentage")).click();
   driver.findElement(By.id("shadingPercentage")).clear();
   driver.findElement(By.id("shadingPercentage")).sendKeys("-ad");
   driver.findElement(By.id("shadingPercentage")).click();
   driver.findElement(By.id("shadingPercentage")).clear();
   driver.findElement(By.id("shadingPercentage")).sendKeys("32");
   driver.findElement(By.id("shadingPaneTitle")).click();
   driver.quit();

  }
  
  
  private Object Runtime() {
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

 
