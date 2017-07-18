
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

public class INSTALLERSUPERVISOR_Regression_Official1 {
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
  public void testInstallerUser() throws Exception {
	  driver.get(baseUrl + "/ModSolarPlatform/login.jsp");
	   driver.findElement(By.id("username")).clear();
	   driver.findElement(By.id("username")).sendKeys("christian");
	   driver.findElement(By.id("password")).clear();
	   driver.findElement(By.id("password")).sendKeys("idia26maha83");
	   driver.findElement(By.name("submit")).click();
	   driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
	   driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
	   driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("69");
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//table[@id='clientsTable']/tbody/tr[5]/td")).click();
		   
    driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("rheingold");
    
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    new Select(driver.findElement(By.cssSelector("div.leadInfoContainer > div > select"))).selectByVisibleText("Magnus");
    driver.findElement(By.cssSelector("div.closeButton")).click();
    
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[2]/div[3]/a")).click();

    
    driver.findElement(By.cssSelector("div.newLeadList")).click();
    driver.findElement(By.linkText("Home")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='leadsTable_wrapper']/div[2]/div/div/table/thead/tr/th[9]/div/div/span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("rheingold");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[2]/div[3]/a")).click();
    
    
    //create a web element
    WebElement Jake = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[3]/div/div/div[2]/div[1]/div/table/thead/tr/th[4]/div/div[1]"));
    //create an action
    Actions action = new Actions(driver);
    //mouse hover to element
    action.moveToElement(Jake).perform();
    
    
    WebElement Jake1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[3]/div/div/div[2]/div[1]/div/table/thead/tr/th[4]/div/div[2]"));
    
    Actions action1 = new Actions(driver);
    
    action1.click(Jake1).perform();
    
    Thread.sleep(2000);
    
    WebElement Jake2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[3]/div/div/div[2]/div[1]/div/table/thead/tr/th[4]/div/div[2]/div/div[4]"));
    
    Actions action2 = new Actions(driver);
    
    action2.moveToElement(Jake2).perform();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[3]/div/div/div[2]/div[1]/div/table/thead/tr/th[4]/div/div[2]/div/div[4]/div/div[1]/div/div/input[1]")).clear();
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[3]/div/div/div[2]/div[1]/div/table/thead/tr/th[4]/div/div[2]/div/div[4]/div/div[1]/div/div/input[1]")).sendKeys("05/01/2015");
    
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[3]/div/div/div[2]/div[1]/div/table/thead/tr/th[4]/div/div[2]/div/div[4]/div/div[1]/div/div/input[2]")).clear();
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[3]/div/div/div[2]/div[1]/div/table/thead/tr/th[4]/div/div[2]/div/div[4]/div/div[1]/div/div/input[2]")).sendKeys("05/18/2015");
    
    
    
    Thread.sleep(2000);
   
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//div[@id='leadsTable_wrapper']/div[2]/div/div/table/thead/tr/th[4]/div/div")).click();
    Thread.sleep(2000);
    //driver.findElement(By.xpath("//div[@id='menu_container_leadDateTime']/div/div")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='leadsTable_wrapper']/div[2]/div/div/table/thead/tr/th[4]/div")).click();
    //driver.findElement(By.xpath("//div[@id='menu_container_leadDateTime']/div[2]/div")).click();
    Thread.sleep(2000);
    //driver.findElement(By.xpath("//div[@id='leadsTable_wrapper']/div[2]/div/div/table/thead/tr/th[4]/div/div[2]")).click();
    
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[2]/div[3]/a")).click();

    driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
    driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("rheingold");
    Thread.sleep(2000);
    
    driver.findElement(By.id("downloadDataButton")).click();
    //driver.findElement(By.id("downloadDataButton")).click();
    driver.findElement(By.cssSelector("div.newLeadList")).click();
    driver.findElement(By.id("tabResidential")).click();
    driver.findElement(By.id("tabResidential")).click();
    driver.findElement(By.id("lastNameResidential")).clear();
    driver.findElement(By.id("lastNameResidential")).sendKeys("j");
    driver.findElement(By.id("addressResidential")).clear();
    driver.findElement(By.id("addressResidential")).sendKeys("j");
    driver.findElement(By.id("cityResidential")).clear();
    driver.findElement(By.id("cityResidential")).sendKeys("j");
    new Select(driver.findElement(By.id("stateResidential"))).selectByVisibleText("California");
    driver.findElement(By.id("zipCodeResidential")).clear();
    driver.findElement(By.id("zipCodeResidential")).sendKeys("33327");
    driver.findElement(By.id("yearlyUsageResidential")).clear();
    driver.findElement(By.id("yearlyUsageResidential")).sendKeys("1");
    driver.findElement(By.id("firstNameResidential")).clear();
    driver.findElement(By.id("firstNameResidential")).sendKeys("rheingold");
    driver.findElement(By.id("nextBtn")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.linkText("Home")).click();
    Thread.sleep(2000);

    Thread.sleep(5000);
    driver.findElement(By.cssSelector("td.sorting_1")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Edit this Lead")).click();
    //driver.findElement(By.linkText("Edit this Lead")).click();
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.xpath("//table[@id='leadsTable']/tbody/tr/td[3]")).click();
    driver.findElement(By.linkText("Delete this Lead")).click();
    driver.findElement(By.cssSelector("label > input[type=\"button\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("My Profile")).click();
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("");
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("Christian");
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("");
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("Mabila");
    driver.findElement(By.id("cellPhone")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("christian@modsolar.net");
    driver.findElement(By.id("oldPassword")).clear();
    driver.findElement(By.id("oldPassword")).sendKeys("idia26maha83");
    driver.findElement(By.id("newPassword1")).clear();
    driver.findElement(By.id("newPassword1")).sendKeys("idia26maha83");
    driver.findElement(By.id("newPassword2")).clear();
    driver.findElement(By.id("newPassword2")).sendKeys("idia26maha83");
    driver.findElement(By.id("oldPassword")).clear();
    driver.findElement(By.id("oldPassword")).sendKeys("");
    driver.findElement(By.name("submit")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("oldPassword")).clear();
    driver.findElement(By.id("oldPassword")).sendKeys("idia26maha833");
    driver.findElement(By.id("oldPassword")).clear();
    driver.findElement(By.id("oldPassword")).sendKeys("idia26maha833");
    driver.findElement(By.id("newPassword1")).clear();
    driver.findElement(By.id("newPassword1")).sendKeys("idia26maha83");
    driver.findElement(By.id("newPassword2")).clear();
    driver.findElement(By.id("newPassword2")).sendKeys("idia26maha83");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.id("oldPassword")).clear();
    driver.findElement(By.id("oldPassword")).sendKeys("idia26maha83");
    driver.findElement(By.id("newPassword1")).clear();
    driver.findElement(By.id("newPassword1")).sendKeys("idia26maha83");
    driver.findElement(By.id("newPassword2")).clear();
    driver.findElement(By.id("newPassword2")).sendKeys("idia26maha833");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.id("newPassword2")).clear();
    driver.findElement(By.id("newPassword2")).sendKeys("idia26maha83");
    driver.findElement(By.name("submit")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Logout")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("username")).clear();
	   driver.findElement(By.id("username")).sendKeys("christian");
	   driver.findElement(By.id("password")).clear();
	   driver.findElement(By.id("password")).sendKeys("idia26maha83");
	   driver.findElement(By.name("submit")).click();
	   driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
	   driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
	   driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("69");
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//table[@id='clientsTable']/tbody/tr[5]/td")).click();
    driver.findElement(By.linkText("My Profile")).click();
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("Christia");
    driver.findElement(By.id("cancelButton")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Logout")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("username")).clear();
	   driver.findElement(By.id("username")).sendKeys("christian");
	   driver.findElement(By.id("password")).clear();
	   driver.findElement(By.id("password")).sendKeys("idia26maha83");
	   driver.findElement(By.name("submit")).click();
	   driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
	   driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
	   driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("69");
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//table[@id='clientsTable']/tbody/tr[5]/td")).click();
    //driver.findElement(By.name("submit")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("My Profile")).click();
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("Christia");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("Logout")).click();
    driver.findElement(By.id("username")).clear();
	   driver.findElement(By.id("username")).sendKeys("christian");
	   driver.findElement(By.id("password")).clear();
	   driver.findElement(By.id("password")).sendKeys("idia26maha83");
	   driver.findElement(By.name("submit")).click();
	   driver.findElement(By.cssSelector("input[type=\"search\"]")).click();
	   driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
	   driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("69");
	   driver.findElement(By.xpath("//table[@id='clientsTable']/tbody/tr[5]/td")).click();
	   Thread.sleep(500);
    driver.findElement(By.linkText("My Profile")).click();
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("Christian");
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.linkText("My Profile")).click();
    driver.findElement(By.linkText("My Profile")).click();
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("Christian");
    driver.findElement(By.name("submit")).click();
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
