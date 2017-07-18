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

public class Accordion1 {
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
  public void testMap2() throws Exception {
    driver.get(baseUrl + "/ModSolarPlatform/login.jsp;jsessionid=F33B6C551CBA0A359E87354993539EFA");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("christianqa");
    driver.findElement(By.id("password")).clear();
    
    driver.findElement(By.id("password")).sendKeys("qa");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.cssSelector("div.newLeadList")).click();
    driver.findElement(By.id("tabResidential")).click();
    driver.findElement(By.id("firstNameResidential")).clear();
    driver.findElement(By.id("firstNameResidential")).sendKeys("christian");
    driver.findElement(By.id("lastNameResidential")).clear();
    driver.findElement(By.id("lastNameResidential")).sendKeys("Mabila");
    driver.findElement(By.id("addressResidential")).clear();
    driver.findElement(By.id("addressResidential")).sendKeys("600 Clipper rd");
    driver.findElement(By.id("cityResidential")).clear();
    driver.findElement(By.id("cityResidential")).sendKeys("Belmont");
    new Select(driver.findElement(By.id("stateResidential"))).selectByVisibleText("California");
    //driver.findElement(By.id("zipCodeResidential")).clear();
    //driver.findElement(By.id("zipCodeResidential")).sendKeys("90042");
    driver.findElement(By.cssSelector("#zipCodeResidential")).clear();
    driver.findElement(By.cssSelector("#zipCodeResidential")).sendKeys("90042");
    Thread.sleep(1500);
    driver.findElement(By.id("emailResidential")).clear();
    driver.findElement(By.id("emailResidential")).sendKeys("christianmodsolar@gmail.com");
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).clear();
    driver.findElement(By.id("utilityTaxRateInputAddressResidential")).sendKeys("1.2");
    driver.findElement(By.id("averageMonthlyBillResidential")).clear();
    driver.findElement(By.id("averageMonthlyBillResidential")).sendKeys("225");
    driver.findElement(By.id("nextBtn")).click();
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
    driver.findElement(By.cssSelector("div.pgNext.right > input.btn")).click();
    driver.findElement(By.xpath("//div[@id='accordion']")).click();
    driver.findElement(By.id("regionsPaneTitle")).click();
    
    //Clicking inside the Triangle 1
    
    WebElement eI = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));
    
    new Actions(driver)
    
    .moveToElement(eI, 0, 0)
    .moveByOffset(520, 255)
    .click()
    .build()
    .perform();
    
    Thread.sleep(1000);
    
 //Clicking inside the Triangle 1
    
    WebElement eS = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[5]/div[2]/div[2]/div/div[1]/div[2]"));
    
    new Actions(driver)
    .moveToElement(eS, 0, 0)
    .moveByOffset(520, 255)
    .click()
    .build()
    .perform();
    Thread.sleep(1000);
    driver.findElement(By.id("accordion")).click();
    driver.findElement(By.id("mountTypeRegion1")).click();
    new Select(driver.findElement(By.id("mountTypeRegion1"))).selectByVisibleText("Flat Roof");
    driver.findElement(By.cssSelector("#mountTypeRegion1 > option[value=\"1\"]")).click();
    driver.findElement(By.id("mountTypeRegion1")).click();
    new Select(driver.findElement(By.id("mountTypeRegion1"))).selectByVisibleText("Ground Mount");
    driver.findElement(By.cssSelector("#mountTypeRegion1 > option[value=\"2\"]")).click();
    driver.findElement(By.id("mountTypeRegion1")).click();
    new Select(driver.findElement(By.id("mountTypeRegion1"))).selectByVisibleText("Flat Roof");
    driver.findElement(By.cssSelector("#mountTypeRegion1 > option[value=\"1\"]")).click();
    driver.findElement(By.id("mountTypeRegion1")).click();
    driver.findElement(By.id("mountTypeRegion1")).click();
    new Select(driver.findElement(By.id("mountTypeRegion1"))).selectByVisibleText("Sloped Roof");
    driver.findElement(By.cssSelector("#mountTypeRegion1 > option[value=\"0\"]")).click();
    ////driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[4]/form/div[2]/div/div[3]/div[1]/div[2]/div/input")).click();
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[4]/form/div[2]/div/div[3]/div[1]/div[2]/div/input")).clear();
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[4]/form/div[2]/div/div[3]/div[1]/div[2]/div/input")).sendKeys("52");
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[4]/form/div[2]/div/div[3]/div[1]/div[2]/div/input")).click();
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[4]/form/div[2]/div/div[3]/div[1]/div[2]/div/input")).clear();
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[4]/form/div[2]/div/div[3]/div[1]/div[2]/div/input")).sendKeys("18");
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[4]/form/div[2]/div/div[3]/div[1]/div[2]/div/input")).click();
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[4]/form/div[2]/div/div[3]/div[1]/div[2]/div/input")).clear();
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[4]/form/div[2]/div/div[3]/div[1]/div[2]/div/input")).sendKeys("45");
    driver.findElement(By.id("mountTypeRegion1")).click();
    new Select(driver.findElement(By.id("mountTypeRegion1"))).selectByVisibleText("Flat Roof");
    driver.findElement(By.cssSelector("#mountTypeRegion1 > option[value=\"1\"]")).click();
    driver.findElement(By.id("mountTypeRegion1")).click();
    new Select(driver.findElement(By.id("mountTypeRegion1"))).selectByVisibleText("Sloped Roof");
    driver.findElement(By.cssSelector("#mountTypeRegion1 > option[value=\"0\"]")).click();
    driver.findElement(By.id("mountTypeRegion1")).click();
    
    new Select(driver.findElement(By.id("mountTypeRegion1"))).selectByVisibleText("Flat Roof");
    driver.findElement(By.cssSelector("#mountTypeRegion1 > option[value=\"1\"]")).click();
    driver.findElement(By.id("mountTypeRegion1")).click();
    new Select(driver.findElement(By.id("mountTypeRegion1"))).selectByVisibleText("Ground Mount");
    driver.findElement(By.cssSelector("#mountTypeRegion1 > option[value=\"2\"]")).click();
    driver.findElement(By.cssSelector("label.overTxtLabel")).click();
    driver.findElement(By.id("proposalName")).sendKeys("AUTOMATION TEST");
    driver.findElement(By.id("regionsPaneTitle")).click();
    driver.findElement(By.id("regionsPaneTitle")).click();
    Thread.sleep(500);
    ///driver.findElement(By.id("squareUpButton2")).click();
    driver.findElement(By.xpath("//input[@id='snapAzimuthButton1']")).click();
    driver.findElement(By.xpath("//input[@id='applySetbacksButton1']")).click();
    ///assertEquals("Setbacks cannot be less than zero.", closeAlertAndGetItsText());
   //// driver.findElement(By.id("delPolygonButton2")).click();
    Thread.sleep(1000);
    ///driver.findElement(By.id("squareUpButton3")).click();
    ///driver.findElement(By.id("squareUpButton3")).click();
    driver.findElement(By.id("accordion")).click();
    driver.findElement(By.cssSelector("div[title=\"Pan up\"]")).click();
    driver.findElement(By.cssSelector("div[title=\"Pan right\"]")).click();
    driver.findElement(By.cssSelector("div[title=\"Pan down\"]")).click();
    driver.findElement(By.cssSelector("div[title=\"Pan left\"]")).click();
    driver.findElement(By.cssSelector("div[title=\"Zoom out\"] > img")).click();
    driver.findElement(By.cssSelector("div[title=\"Zoom in\"] > img")).click();
    driver.findElement(By.id("accordion")).click();
     /////
    /////
    ////
    ///no need driver.findElement(By.xpath("//div[@id='solutionCategory']/ul/li[2]/h3")).click();
    ///no need driver.findElement(By.cssSelector("span.arrow")).click();
    driver.findElement(By.xpath("//input[@value='Next']")).click();
    driver.findElement(By.id("accordion")).click();
    driver.findElement(By.id("accordionTitleText")).click();
    driver.findElement(By.id("accordion")).click();
    driver.findElement(By.id("nextButton")).click();
    driver.findElement(By.id("accordion")).click();
    driver.findElement(By.id("contentUsagePaneTitle")).click();
    driver.findElement(By.id("accordion")).click();
    Thread.sleep(1000);
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
    //////errror--- driver.findElement(By.id("supplyLeadDetailsBtn1")).click();
    driver.findElement(By.id("accordion")).click();
    /////driver.findElement(By.id("accordion")).click();
    //////driver.findElement(By.id("accordion")).click();
    Thread.sleep(1500);
   
    /////driver.findElement(By.id("backBtn")).click();
    ////driver.findElement(By.cssSelector("label > input[type=\"button\"]")).click();
    //Click on Next button 
    
   
	driver.findElement(By.xpath("//input[@id='nextButton']")).click();
	
	 ///PREVIEW PAGE STARTS HERE
	Thread.sleep(2000);
	
	driver.findElement(By.id("accordion")).click();
	Thread.sleep(250);
	 driver.findElement(By.cssSelector("#buyForCashCheckbox")).click();
	 Thread.sleep(250);
	driver.findElement(By.cssSelector("#nextButton")).click();
	Thread.sleep(1000);

    
  
    // ERROR: Caught exception [unknown command []]
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

