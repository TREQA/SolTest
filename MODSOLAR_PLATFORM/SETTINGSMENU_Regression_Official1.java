package MODSOLAR_PLATFORM_OFFICIAL_REGRESSION_QA;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SETTINGSMENU_Regression_Official1 {
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
  public void testSettings1A() throws Exception {
    driver.get(baseUrl + "/ModSolarPlatform/login.jsp");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("christian");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("idia26maha83");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("MS Admin")).click();
    driver.findElement(By.xpath("//table[@id='clientsTable']/thead/tr/th[2]/div/div/span")).click();
    driver.findElement(By.xpath("//table[@id='clientsTable']/tbody/tr/td[2]")).click();
    driver.findElement(By.linkText("Settings")).click();
    driver.findElement(By.linkText("Your Financing")).click();
    driver.findElement(By.cssSelector("div.addNewProgramThumbnail.newProgram")).click();
    // ERROR: Caught exception [unknown command []]
    driver.findElement(By.name("submitLease")).click();
    driver.findElement(By.id("programName")).clear();
    driver.findElement(By.id("programName")).sendKeys("AutomationA1");
    driver.findElement(By.id("startDate")).clear();
    driver.findElement(By.id("startDate")).sendKeys("05/21/2015");
    driver.findElement(By.id("endDate")).clear();
    driver.findElement(By.id("endDate")).sendKeys("05/28/2015");
    driver.findElement(By.id("projectStartDate")).clear();
    driver.findElement(By.id("projectStartDate")).sendKeys("05/22/2015");
    driver.findElement(By.id("projectCompletionDate")).clear();
    driver.findElement(By.id("projectCompletionDate")).sendKeys("05/28/2015");
    driver.findElement(By.id("minSystemSize")).clear();
    driver.findElement(By.id("minSystemSize")).sendKeys("15");
    driver.findElement(By.id("maxSystemSize")).clear();
    driver.findElement(By.id("maxSystemSize")).sendKeys("25");
    driver.findElement(By.id("minAmountFinanced")).clear();
    driver.findElement(By.id("minAmountFinanced")).sendKeys("10000");
    driver.findElement(By.id("maxAmountFinanced")).clear();
    driver.findElement(By.id("maxAmountFinanced")).sendKeys("15000");
    driver.findElement(By.id("earlyBuyout1")).click();
    driver.findElement(By.id("leadTypeRes")).click();
    driver.findElement(By.id("leadTypeCom")).click();
    driver.findElement(By.id("leadTypeMun")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=states | label=AZ]]
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[2]/form/fieldset/div/table/tbody/tr[10]/td[2]/div/select/option[3]")).click();
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.id("minTerm")).clear();
    driver.findElement(By.id("minTerm")).sendKeys("1");
    driver.findElement(By.id("maxTerm")).clear();
    driver.findElement(By.id("maxTerm")).sendKeys("5");
    driver.findElement(By.id("downPaymentPoints")).clear();
    driver.findElement(By.id("downPaymentPoints")).sendKeys("5000");
    driver.findElement(By.id("balloonPoints")).clear();
    driver.findElement(By.id("balloonPoints")).sendKeys("1.4");
    driver.findElement(By.id("costReductionPercentage")).clear();
    driver.findElement(By.id("costReductionPercentage")).sendKeys("30");
    driver.findElement(By.id("interestRate")).clear();
    driver.findElement(By.id("interestRate")).sendKeys("6");
    driver.findElement(By.id("ppaEscalator")).clear();
    driver.findElement(By.id("ppaEscalator")).sendKeys("5");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.name("paramDesc")).clear();
    driver.findElement(By.name("paramDesc")).sendKeys("AutomationPARAM1");
    driver.findElement(By.name("paramMinValue")).clear();
    driver.findElement(By.name("paramMinValue")).sendKeys("05");
    driver.findElement(By.name("paramMaxValue")).clear();
    driver.findElement(By.name("paramMaxValue")).sendKeys("10");
    driver.findElement(By.id("buttonAdd")).click();
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.id("addAnotherProgramButton")).click();
    driver.findElement(By.name("submitLoan")).click();
    driver.findElement(By.id("programName")).clear();
    driver.findElement(By.id("programName")).sendKeys("AutomationA2");
    driver.findElement(By.id("startDate")).clear();
    driver.findElement(By.id("startDate")).sendKeys("05/21/2015");
    driver.findElement(By.id("endDate")).clear();
    driver.findElement(By.id("endDate")).sendKeys("05/28/2015");
    driver.findElement(By.id("projectStartDate")).clear();
    driver.findElement(By.id("projectStartDate")).sendKeys("05/22/2015");
    driver.findElement(By.id("projectCompletionDate")).clear();
    driver.findElement(By.id("projectCompletionDate")).sendKeys("05/28/2015");
    driver.findElement(By.id("minSystemSize")).clear();
    driver.findElement(By.id("minSystemSize")).sendKeys("15");
    driver.findElement(By.id("maxSystemSize")).clear();
    driver.findElement(By.id("maxSystemSize")).sendKeys("25");
    driver.findElement(By.id("minAmountFinanced")).clear();
    driver.findElement(By.id("minAmountFinanced")).sendKeys("10000");
    driver.findElement(By.id("maxAmountFinanced")).clear();
    driver.findElement(By.id("maxAmountFinanced")).sendKeys("15000");
    driver.findElement(By.id("earlyBuyout1")).click();
    driver.findElement(By.id("leadTypeRes")).click();
    driver.findElement(By.id("leadTypeCom")).click();
    driver.findElement(By.id("leadTypeMun")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=states | label=AZ]]
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[2]/form/fieldset/div/table/tbody/tr[10]/td[2]/div/select/option[3]")).click();
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.id("minTerm")).clear();
    driver.findElement(By.id("minTerm")).sendKeys("1");
    driver.findElement(By.id("maxTerm")).clear();
    driver.findElement(By.id("maxTerm")).sendKeys("5");
    driver.findElement(By.id("downPaymentPoints")).clear();
    driver.findElement(By.id("downPaymentPoints")).sendKeys("5000");
    driver.findElement(By.id("balloonPoints")).clear();
    driver.findElement(By.id("balloonPoints")).sendKeys("1.4");
    ///driver.findElement(By.id("costReductionPercentage")).clear();
    ////driver.findElement(By.id("costReductionPercentage")).sendKeys("30");
    driver.findElement(By.id("interestRate")).clear();
    driver.findElement(By.id("interestRate")).sendKeys("6");
    ///driver.findElement(By.id("ppaEscalator")).clear();
    ///driver.findElement(By.id("ppaEscalator")).sendKeys("5");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.name("paramDesc")).clear();
    driver.findElement(By.name("paramDesc")).sendKeys("AutomationPARAM1");
    driver.findElement(By.name("paramMinValue")).clear();
    driver.findElement(By.name("paramMinValue")).sendKeys("05");
    driver.findElement(By.name("paramMaxValue")).clear();
    driver.findElement(By.name("paramMaxValue")).sendKeys("10");
    driver.findElement(By.id("buttonAdd")).click();
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.id("addAnotherProgramButton")).click();
    ////driver.findElement(By.id("backButton")).click();
    driver.findElement(By.name("submitPowerPurchase")).click();
    driver.findElement(By.id("programName")).clear();
    driver.findElement(By.id("programName")).sendKeys("AutomationA2");
    driver.findElement(By.id("startDate")).clear();
    driver.findElement(By.id("startDate")).sendKeys("05/21/2015");
    driver.findElement(By.id("endDate")).clear();
    driver.findElement(By.id("endDate")).sendKeys("05/28/2015");
    driver.findElement(By.id("projectStartDate")).clear();
    driver.findElement(By.id("projectStartDate")).sendKeys("05/22/2015");
    driver.findElement(By.id("projectCompletionDate")).clear();
    driver.findElement(By.id("projectCompletionDate")).sendKeys("05/28/2015");
    driver.findElement(By.id("minSystemSize")).clear();
    driver.findElement(By.id("minSystemSize")).sendKeys("15");
    driver.findElement(By.id("maxSystemSize")).clear();
    driver.findElement(By.id("maxSystemSize")).sendKeys("25");
    driver.findElement(By.id("minAmountFinanced")).clear();
    driver.findElement(By.id("minAmountFinanced")).sendKeys("10000");
    driver.findElement(By.id("maxAmountFinanced")).clear();
    driver.findElement(By.id("maxAmountFinanced")).sendKeys("15000");
    driver.findElement(By.id("earlyBuyout1")).click();
    driver.findElement(By.id("leadTypeRes")).click();
    driver.findElement(By.id("leadTypeCom")).click();
    driver.findElement(By.id("leadTypeMun")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=states | label=AZ]]
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[2]/form/fieldset/div/table/tbody/tr[10]/td[2]/div/select/option[3]")).click();
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.id("minTerm")).clear();
    driver.findElement(By.id("minTerm")).sendKeys("1");
    driver.findElement(By.id("maxTerm")).clear();
    driver.findElement(By.id("maxTerm")).sendKeys("5");
    driver.findElement(By.id("ppaRate")).clear();
    driver.findElement(By.id("ppaRate")).sendKeys("5000");
    driver.findElement(By.id("ppaDiscount")).clear();
    driver.findElement(By.id("ppaDiscount")).sendKeys("1.4");
    ///driver.findElement(By.id("costReductionPercentage")).clear();
    ////driver.findElement(By.id("costReductionPercentage")).sendKeys("30");
    driver.findElement(By.id("ppaEscalator")).clear();
    driver.findElement(By.id("ppaEscalator")).sendKeys("6");
    ///driver.findElement(By.id("ppaEscalator")).clear();
    ///driver.findElement(By.id("ppaEscalator")).sendKeys("5");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.name("paramDesc")).clear();
    driver.findElement(By.name("paramDesc")).sendKeys("AutomationPARAM1");
    driver.findElement(By.name("paramMinValue")).clear();
    driver.findElement(By.name("paramMinValue")).sendKeys("05");
    driver.findElement(By.name("paramMaxValue")).clear();
    driver.findElement(By.name("paramMaxValue")).sendKeys("10");
    driver.findElement(By.id("buttonAdd")).click();
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.id("addAnotherProgramButton")).click();
    ////driver.findElement(By.id("backButton")).click();
    // ERROR: Caught exception [unknown command []]
    
    
    ///Data Attributes
    
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.linkText("Settings")).click();
    driver.findElement(By.linkText("Data Attributes")).click();
    driver.findElement(By.id("addButton")).click();
    driver.findElement(By.cssSelector("#dataAttribute_-1 > input.submit.dataAttributeDeleteButton")).click();
    driver.findElement(By.id("addButton")).click();
    new Select(driver.findElement(By.id("keySelect"))).selectByVisibleText("apiAlertsConfig");
    new Select(driver.findElement(By.id("keySelect"))).selectByVisibleText("automaticCSICalculation");
    new Select(driver.findElement(By.id("keySelect"))).selectByVisibleText("backOfficeDetour");
    new Select(driver.findElement(By.id("keySelect"))).selectByVisibleText("bpmInfo");
    new Select(driver.findElement(By.id("keySelect"))).selectByVisibleText("crmService");
    new Select(driver.findElement(By.id("keySelect"))).selectByVisibleText("defaultSetbacks");
    new Select(driver.findElement(By.id("keySelect"))).selectByVisibleText("dealersInheritStates");
    new Select(driver.findElement(By.id("keySelect"))).selectByVisibleText("dealerNameForLease");
    new Select(driver.findElement(By.id("keySelect"))).selectByVisibleText("crmAuthInfo");
    new Select(driver.findElement(By.id("keySelect"))).selectByVisibleText("bpmInfo");
    driver.findElement(By.cssSelector("textarea")).clear();
    driver.findElement(By.cssSelector("textarea")).sendKeys("Automation Purpose");
    driver.findElement(By.xpath("//a[contains(text(),'Data Attributes')]")).click();
    Thread.sleep(500);
    ///driver.findElement(By.xpath("//input[@value='Edit']")).click();
    Thread.sleep(1500);
    //driver.findElement(By.cssSelector("#dataAttribute_-1 > input.submit.dataAttributeEditButton")).click();
    //driver.findElement(By.xpath("//span[@id='dataAttribute_1891']/input")).click();
    //driver.findElement(By.cssSelector("textarea")).clear();
    Thread.sleep(2000);
    ///driver.findElement(By.cssSelector("textarea")).sendKeys("Automation Purpose -- Changing For automation");
    Thread.sleep(2000);
    ///driver.findElement(By.xpath("//input[@value='Done']")).click();
    Thread.sleep(2000);
    ///driver.findElement(By.xpath("//input[@value='Delete']")).click();
    ///driver.findElement(By.xpath("//input[@value='No']")).click();
    ///driver.findElement(By.xpath("//input[@value='Delete']")).click();
    ///driver.findElement(By.xpath("(//input[@value='Yes'])[2]")).click();
    
    //Equipment Derates
    
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.linkText("Settings")).click();
    driver.findElement(By.linkText("Equipment Derates")).click();
    driver.findElement(By.id("derateSystem")).click();
    driver.findElement(By.id("systemStringDerateFactor")).clear();
    driver.findElement(By.id("systemStringDerateFactor")).sendKeys("0.771");
    driver.findElement(By.id("systemMicroDerateFactor")).clear();
    driver.findElement(By.id("systemMicroDerateFactor")).sendKeys("0.822");
    driver.findElement(By.id("systemStringDerateFactor")).clear();
    driver.findElement(By.id("systemStringDerateFactor")).sendKeys("0.770");
    driver.findElement(By.id("systemMicroDerateFactor")).clear();
    driver.findElement(By.id("systemMicroDerateFactor")).sendKeys("0.820");
    driver.findElement(By.id("systemDerateSubmit")).click();
    driver.findElement(By.id("derateComponent")).click();
    driver.findElement(By.id("mismatch")).clear();
    driver.findElement(By.id("mismatch")).sendKeys("0.981");
    driver.findElement(By.id("mismatch")).clear();
    driver.findElement(By.id("mismatch")).sendKeys("0.980");
    driver.findElement(By.id("diodesMicro")).clear();
    driver.findElement(By.id("diodesMicro")).sendKeys("0.996");
    driver.findElement(By.id("diodesMicro")).clear();
    driver.findElement(By.id("diodesMicro")).sendKeys("0.995");
    driver.findElement(By.id("sunTracking")).clear();
    driver.findElement(By.id("sunTracking")).sendKeys("1.002");
    driver.findElement(By.id("sunTracking")).clear();
    driver.findElement(By.id("sunTracking")).sendKeys("1.000");
    driver.findElement(By.id("sunTrackingMicro")).clear();
    driver.findElement(By.id("sunTrackingMicro")).sendKeys("1.003");
    driver.findElement(By.id("sunTrackingMicro")).clear();
    driver.findElement(By.id("sunTrackingMicro")).sendKeys("1.000");
    driver.findElement(By.id("age")).clear();
    driver.findElement(By.id("age")).sendKeys("1.005");
    driver.findElement(By.id("age")).clear();
    driver.findElement(By.id("age")).sendKeys("1.000");
    driver.findElement(By.id("ageMicro")).clear();
    driver.findElement(By.id("ageMicro")).sendKeys("1.005");
    driver.findElement(By.id("ageMicro")).clear();
    driver.findElement(By.id("ageMicro")).sendKeys("1.000");
    driver.findElement(By.id("componentDerateSubmit")).click();
    driver.findElement(By.id("age")).clear();
    driver.findElement(By.id("age")).sendKeys("1.001");
    driver.findElement(By.id("age")).clear();
    driver.findElement(By.id("age")).sendKeys("1.000");
    driver.findElement(By.id("acWiringMicro")).clear();
    driver.findElement(By.id("acWiringMicro")).sendKeys("0.985");
    driver.findElement(By.id("restoreDefaults")).click();
    driver.findElement(By.id("mismatch")).clear();
    driver.findElement(By.id("mismatch")).sendKeys("0.982");
    driver.findElement(By.id("acWiringMicro")).clear();
    driver.findElement(By.id("acWiringMicro")).sendKeys("0.880");
    driver.findElement(By.id("systemAvailabilityMicro")).click();
    driver.findElement(By.id("acWiringMicro")).clear();
    driver.findElement(By.id("acWiringMicro")).sendKeys("0.988");
    driver.findElement(By.id("restoreDefaults")).click();
    driver.findElement(By.id("componentDerateSubmit")).click();
    driver.findElement(By.linkText("Home")).click();
    
    
    //Widgets
    
    driver.findElement(By.linkText("Settings")).click();
    driver.findElement(By.linkText("Widget Settings")).click();
    Thread.sleep(5000);
    //////driver.findElement(By.id("widgetScreenMessage")).clear();
    ////Thread.sleep(1000);
    driver.findElement(By.id("widgetScreenMessage")).sendKeys("Hello. This your friendly widget speaking.\nIf you would like to go back to our home page, please click on the following link: http://qa.modsolar.net\n1) abcdefghijklmnopqrstuvwxyz.2) abcdefghijklmnopqrstuvwxyz.\n3) abcdefghijklmnopqrstuvwxyz.\n4) abcdefghijklmnopqrstuvwxyz\n5) abcdefghijklmnopqrstuvwxyz.test");
    Thread.sleep(1000);
    ////driver.findElement(By.id("widgetScreenMessage")).clear();
    Thread.sleep(1000);
    ////driver.findElement(By.id("widgetScreenMessage")).sendKeys("Hello. This your friendly widget speaking.\nIf you would like to go back to our home page, please click on the following link: http://qa.modsolar.net\n1) abcdefghijklmnopqrstuvwxyz.2) abcdefghijklmnopqrstuvwxyz.\n3) abcdefghijklmnopqrstuvwxyz.\n4) abcdefghijklmnopqrstuvwxyz\n5) abcdefghijklmnopqrstuvwxyz");
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("assignedTo"))).selectByVisibleText("Gayle3");
    new Select(driver.findElement(By.id("assignedTo"))).selectByVisibleText("gayle1");
    /////driver.findElement(By.id("emailSenderName")).clear();
    driver.findElement(By.id("emailSenderName")).sendKeys("Gayle Widget");
    ///driver.findElement(By.id("emailSenderAddress")).clear();
    //driver.findElement(By.id("emailSenderAddress")).sendKeys("gayle@modsolar.net-test");
    //driver.findElement(By.id("emailSenderAddress")).clear();
    driver.findElement(By.id("emailSenderAddress")).sendKeys("gayle@modsolar.net");
    ////driver.findElement(By.id("emailSubject")).clear();
    ////driver.findElement(By.id("emailSubject")).sendKeys("Widget Test-test");
    /////driver.findElement(By.id("emailSubject")).clear();
    driver.findElement(By.id("emailSubject")).sendKeys("Widget Test");
    ////driver.findElement(By.id("emailBcc")).clear();
    ////driver.findElement(By.id("emailBcc")).sendKeys("gayle.tye@comcast.net-test");
    ////driver.findElement(By.id("emailBcc")).clear();
    driver.findElement(By.id("emailBcc")).sendKeys("gayle.tye@comcast.net");
    ///driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    ////driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("gayle.tye640@gmail.com-test");
    ////driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("gayle.tye640@gmail.com");
    /////driver.findElement(By.id("followupMessage")).clear();
    ////driver.findElement(By.id("followupMessage")).sendKeys("This is the Follow-Up Message Text.Second Line of the Follow up message text.-test");
    ///driver.findElement(By.id("followupMessage")).clear();
    driver.findElement(By.id("followupMessage")).sendKeys("This is the Follow-Up Message Text.Second Line of the Follow up message text.");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("Home")).click();
    
    
    ///Add Inverters
    
    driver.findElement(By.linkText("Settings")).click();
    driver.findElement(By.linkText("Inverters")).click();
    driver.findElement(By.id("derateSystem")).click();
    driver.findElement(By.id("addButton")).click();
    new Select(driver.findElement(By.id("inverterManufacturerList"))).selectByVisibleText("Unknown or not listed");
    new Select(driver.findElement(By.id("inverterModelList"))).selectByVisibleText("Unknown or not listed");
    driver.findElement(By.cssSelector("#inverterModelList > option[value=\"empty\"]")).click();
    driver.findElement(By.id("inverterDisplayName")).clear();
    driver.findElement(By.id("inverterDisplayName")).sendKeys("Automation TEST");
    driver.findElement(By.id("inverterRating")).clear();
    driver.findElement(By.id("inverterRating")).sendKeys("15");
    driver.findElement(By.id("inverterMicro")).click();
    driver.findElement(By.id("inverterString")).click();
    driver.findElement(By.id("inverterEfficiency")).clear();
    driver.findElement(By.id("inverterEfficiency")).sendKeys("1.2");
    driver.findElement(By.id("inverterHasMeter")).click();
    driver.findElement(By.id("enabled")).click();
    driver.findElement(By.id("enabled")).click();
    driver.findElement(By.id("preferredInverter")).click();
    driver.findElement(By.id("preferredInverter")).click();
    driver.findElement(By.id("cancelButton")).click();
    driver.findElement(By.id("addButton")).click();
    new Select(driver.findElement(By.id("inverterManufacturerList"))).selectByVisibleText("ABB");
    new Select(driver.findElement(By.id("inverterModelList"))).selectByVisibleText("Unknown or not listed");
    driver.findElement(By.cssSelector("#inverterModelList > option[value=\"empty\"]")).click();
    new Select(driver.findElement(By.id("inverterManufacturerList"))).selectByVisibleText("Unknown or not listed");
    driver.findElement(By.id("inverterDisplayName")).clear();
    driver.findElement(By.id("inverterDisplayName")).sendKeys("Automation TEST");
    driver.findElement(By.id("inverterRating")).clear();
    driver.findElement(By.id("inverterRating")).sendKeys("1.2");
    driver.findElement(By.id("inverterMicro")).click();
    driver.findElement(By.id("inverterEfficiency")).clear();
    driver.findElement(By.id("inverterEfficiency")).sendKeys("1.2");
    driver.findElement(By.id("inverterHasMeter")).click();
    driver.findElement(By.id("enabled")).click();
    driver.findElement(By.id("enabled")).click();
    driver.findElement(By.id("preferredInverter")).click();
    driver.findElement(By.id("preferredInverter")).click();
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.id("derateComponent")).click();
    driver.findElement(By.id("addButton")).click();
    new Select(driver.findElement(By.id("inverterManufacturerList"))).selectByVisibleText("Unknown or not listed");
    new Select(driver.findElement(By.id("inverterModelList"))).selectByVisibleText("Unknown or not listed");
    driver.findElement(By.cssSelector("#inverterModelList > option[value=\"empty\"]")).click();
    driver.findElement(By.id("inverterDisplayName")).clear();
    driver.findElement(By.id("inverterDisplayName")).sendKeys("Automation Test Two");
    driver.findElement(By.id("inverterRating")).clear();
    driver.findElement(By.id("inverterRating")).sendKeys("15");
    driver.findElement(By.id("inverterMicro")).click();
    driver.findElement(By.id("inverterString")).click();
    driver.findElement(By.id("inverterEfficiency")).clear();
    driver.findElement(By.id("inverterEfficiency")).sendKeys("1.2");
    driver.findElement(By.id("inverterDeRate")).clear();
    driver.findElement(By.id("inverterDeRate")).sendKeys("1");
    driver.findElement(By.id("inverterHasMeter")).click();
    driver.findElement(By.id("inverterHasMeter")).click();
    driver.findElement(By.id("enabled")).click();
    driver.findElement(By.id("inverterHasMeter")).click();
    driver.findElement(By.id("enabled")).click();
    driver.findElement(By.id("preferredInverter")).click();
    driver.findElement(By.id("preferredInverter")).click();
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.linkText("Settings")).click();
    driver.findElement(By.linkText("Inverters")).click();
    driver.findElement(By.xpath("//span/div[2]")).click();
    driver.findElement(By.name("efficiency")).clear();
    driver.findElement(By.name("efficiency")).sendKeys("95");
    driver.findElement(By.name("efficiency")).clear();
    driver.findElement(By.name("efficiency")).sendKeys("96");
    driver.findElement(By.name("submit")).click();
    
    //Contract Templates
    
    driver.findElement(By.linkText("Settings")).click();
    driver.findElement(By.linkText("Contract Templates")).click();
    driver.findElement(By.cssSelector("div.addNewTemplateThumbnail")).click();
    driver.findElement(By.id("documentName_-1")).clear();
    driver.findElement(By.id("documentName_-1")).sendKeys("AUTOMATION TEST_CASE_ID1");
    driver.findElement(By.id("residential_-1")).click();
    driver.findElement(By.id("commercial_-1")).click();
    driver.findElement(By.id("municipal_-1")).click();
    new Select(driver.findElement(By.id("states_-1"))).selectByVisibleText("CA");
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=programs_-1 | label=Basic PPA]]
    driver.findElement(By.id("displayButton_-1")).click();
    driver.findElement(By.cssSelector("input.submit")).click();
  
    ///Add a state
    
    driver.findElement(By.linkText("Settings")).click();
    driver.findElement(By.linkText("Your States + SRECs")).click();
    driver.findElement(By.id("addButton")).click();
    new Select(driver.findElement(By.id("stateSelect"))).selectByVisibleText("American Samoa (AS)");
    driver.findElement(By.cssSelector("option[value=\"3\"]")).click();
    driver.findElement(By.cssSelector("#state_-1 > input.submit.stateEditButton")).click();
    driver.findElement(By.cssSelector("input.submit.stateEditButton")).click();
    driver.findElement(By.cssSelector("input.submit.stateEditButton")).click();
    
    
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
