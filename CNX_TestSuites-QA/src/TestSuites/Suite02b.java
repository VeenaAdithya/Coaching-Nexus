package TestSuites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Suite02b {

	
	WebDriver driver;
	WebDriver driver1;
	WebDriver driver11;
	WebDriver driver111;
	WebDriver driver1111;
	

	@BeforeClass(description="Open Browser")
	public void Start()
	{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				driver=new ChromeDriver();
				
				System.out.println("Browser has started");
	
	}
	
	
	
	@Test(description="Login as Client Admin with coaching type access set as Both and edit email address")
	
	public void Login1() throws IOException
	{
		
		String clientadm=null;
		String password=null;		
		
		String clientadmemail2=null;

		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite02.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite02");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row2=sheet1.getRow(8);
		XSSFCell cell3=row2.getCell(4);
		
		clientadm=cell1.toString();
		password=cell2.toString();
		
		clientadmemail2=cell3.toString();		

	driver.get("https://cclcoachingnexus-qa.ccl.org");
	driver.manage().window().maximize();
	
WebDriverWait wait = new WebDriverWait(driver, 40);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

//Enter Client Admin email address and password

driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadm);
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(password);
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

WebDriverWait wait1 = new WebDriverWait(driver, 40);
WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));


//Assert Log in complete
Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).isEnabled());

System.out.println("HomePage is open");

//Scroll down
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000)");
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Take snapshot of home page : check learning packages available
TakesScreenshot ts=(TakesScreenshot)driver;

File source=ts.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source, new File("./Screenshots/Suite02b/01HomePage.png"));
	
System.out.println("Home page screenshot is taken");



//Click on Register button and verify

driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
TakesScreenshot ts1=(TakesScreenshot)driver;

File source1=ts1.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source1, new File("./Screenshots/Suite02b/02RegisterButton.png"));
	
System.out.println("Register Button screenshot is taken");


try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();


//Click on Admin name

driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();

try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//Click on account settings
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li/a/span[2]")).click();

//edit email address
//Assert email address is editable

WebDriverWait wait11 = new WebDriverWait(driver, 40);
WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Email\"]")));

Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"Email\"]")).isEnabled());

System.out.println("Email Address field is editable");

driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();

driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(clientadmemail2);
try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

TakesScreenshot ts11=(TakesScreenshot)driver;

File source11=ts11.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source11, new File("./Screenshots/Suite02b/03EmailAddChanged.png"));
	
System.out.println("AccountSettings page screenshot is taken, with change in email address");


//Scroll down and save

JavascriptExecutor je1 = (JavascriptExecutor)driver;
WebElement element2111 = driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je1.executeScript("arguments[0].scrollIntoView(true);", element2111);
try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();		
try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}


//Log out

driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
	Thread.sleep(4000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}



WebDriverWait wait4 = new WebDriverWait(driver, 40);
WebElement element4 = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/p/a")));


TakesScreenshot ts111=(TakesScreenshot)driver;

File source111=ts111.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source111, new File("./Screenshots/Suite02b/04LogoutPage.png"));
	
System.out.println("Logout page screenshot is taken");


driver.quit();
	


	}


//----------------------------------------------------------------------------------------------------------------------------




 @Test(dependsOnMethods="Login1",description="Log in as CCL Admin and edit Coaching type access to Executive for the Client Admin")

 public void Login2() throws IOException
 
 {
	 
		String ccladmemail=null;
		String ccladmpwd=null;
		
		String clientadmemail2=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite02.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite02");

		XSSFRow row2=sheet1.getRow(8);
		XSSFCell cell3=row2.getCell(4);
		
		XSSFRow row3=sheet1.getRow(11);
		XSSFCell cell4=row3.getCell(4);
		
		XSSFRow row4=sheet1.getRow(12);
		XSSFCell cell5=row4.getCell(4);
		
		clientadmemail2=cell3.toString();
		
		ccladmemail=cell4.toString();
		ccladmpwd=cell5.toString();
	
	 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		driver1=new ChromeDriver();
		
		System.out.println("Browser has started");

 
//Log in as CCL Admin in another page


driver1.get("https://cclcoachingnexus-qa.ccl.org");
driver1.manage().window().maximize();

WebDriverWait wait2 = new WebDriverWait(driver1, 40);
WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

//Enter CCL Admin email address and submit

driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(ccladmemail);

WebDriverWait wait111 = new WebDriverWait(driver1, 40);
WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")));
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

WebDriverWait wait1111 = new WebDriverWait(driver1, 40);
WebElement element1111 = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));


driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys(ccladmemail);
driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys(ccladmpwd);
driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_SubmitButton\"]")).click();

WebDriverWait wait11111 = new WebDriverWait(driver1, 40);
WebElement element11111 = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idBtn_Back\"]")));

driver1.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();

//Select client Ford test
WebDriverWait wait111111 = new WebDriverWait(driver1, 40);
WebElement element111111 = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")));

driver1.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")).click();
driver1.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

WebDriverWait wait1111111 = new WebDriverWait(driver1, 40);
wait1111111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));


//Go to admin directory page and search for the client whose email address is edited

WebDriverWait wait11111111 = new WebDriverWait(driver1, 40);
WebElement element1111111 = wait11111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")));

//Assert home page is displayed

Assert.assertTrue(driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).isEnabled());

System.out.println("CCL Admin HomePage is displayed");


driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).click();

WebDriverWait wait4111111 = new WebDriverWait(driver1, 40);
WebElement element411111 = wait4111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));



//Assert Admin directory page is open

Assert.assertTrue(driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).isEnabled());

System.out.println("Admin directory page is open");

driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(clientadmemail2);


try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//Open profile page for the Admin
driver1.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();

WebDriverWait wait41111111 = new WebDriverWait(driver1, 40);
WebElement element4111111 = wait41111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]")));


String checkemail=driver.findElement(By.xpath("//*[@id=\"Email\"]")).getText();

Assert.assertEquals(clientadmemail2, checkemail);

System.out.println("Email is displayed per changes made");


TakesScreenshot ts1111=(TakesScreenshot)driver1;

File source1111=ts1111.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source1111, new File("./Screenshots/Suite02b/05aAdminProfilePage.png"));
	
System.out.println("Changes made to Email address is captured");

Assert.assertTrue(driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]")).isEnabled());

System.out.println("Admin profile page is open and Coaching type access button is editable");

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Set coaching type access to Integrated
WebElement coachingType_dropdown=driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
Select CT_dd=new Select(coachingType_dropdown);
CT_dd.selectByIndex(1);
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


TakesScreenshot ts61111=(TakesScreenshot)driver1;

File source61111=ts61111.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source61111, new File("./Screenshots/Suite02b/05bAdminProfilePage.png"));
	
System.out.println("Changes to Coaching Type access screenshot is taken");

//Set Skill team filter to none selected

driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
TakesScreenshot ts41111=(TakesScreenshot)driver1;

File source41111=ts41111.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source41111, new File("./Screenshots/Suite02b/05cChangeSkillTeamFilterSet.png"));
	
System.out.println("Change Skill Team Data Filters to none selected; screenshot is taken");

//Save profile

driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();


try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}


 }

//------------------------------------------------------------------------------------------




@Test(dependsOnMethods="Login2",description="Verify Executive Admin Home page")

public void Login3() throws IOException

{
	
	String clientadm=null;
	String password=null;		
	
	String clientadmemail3=null;
	
	File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite02.xlsx");
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheet("Suite02");

	XSSFRow row=sheet1.getRow(3);
	XSSFCell cell1=row.getCell(4);
	
	XSSFRow row1=sheet1.getRow(4);
	XSSFCell cell2=row1.getCell(4);
	
	XSSFRow row5=sheet1.getRow(15);
	XSSFCell cell6=row5.getCell(4);
	
	clientadm=cell1.toString();
	password=cell2.toString();
	
	clientadmemail3=cell6.toString();
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
	driver11=new ChromeDriver();
	
	System.out.println("Browser has started");

driver11.get("https://cclcoachingnexus-qa.ccl.org");
driver11.manage().window().maximize();

WebDriverWait wait21 = new WebDriverWait(driver11, 40);
WebElement element21 = wait21.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

//Enter Client Admin email address and password

driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadm);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(password);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

WebDriverWait wait211 = new WebDriverWait(driver11, 40);
WebElement element211 = wait211.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));


//Assert Log in complete
Assert.assertTrue(driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).isEnabled());

System.out.println("HomePage is open");

//Scroll down
JavascriptExecutor js2 = (JavascriptExecutor) driver11;
js2.executeScript("window.scrollBy(0,1000)");
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Take snapshot of home page : check learning packages available
TakesScreenshot ts2=(TakesScreenshot)driver11;

File source2=ts2.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source2, new File("./Screenshots/Suite02b/06IntAdmHomePage.png"));

System.out.println("Integrated Admin home page screenshot is taken");



//Click on Register button and verify

driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
TakesScreenshot ts21=(TakesScreenshot)driver11;

File source21=ts21.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source21, new File("./Screenshots/Suite02b/07IntegratedAdminRegisterButton.png"));

System.out.println("Integrated Admin register button screenshot is taken");


try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();


//Click on Admin name

driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Click on account settings
driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li/a/span[2]")).click();

//edit email address
//Assert email address is editable

WebDriverWait wait2111 = new WebDriverWait(driver11, 40);
WebElement element21111 = wait2111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Email\"]")));

System.out.println("Email is displayed per changes made");

Assert.assertTrue(driver11.findElement(By.xpath("//*[@id=\"Email\"]")).isEnabled());

System.out.println("Email Address field is editable");

//click on grid filters i button
driver11.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[1]/div[2]/span[2]/a/span")).click();

WebDriverWait wait21114 = new WebDriverWait(driver11, 40);
WebElement element211114 = wait21114.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[1]/button")));

TakesScreenshot ts214=(TakesScreenshot)driver11;

File source214=ts214.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source214, new File("./Screenshots/Suite02b/08aGridFilters.png"));

System.out.println("Grid Filter screenshot is taken");


driver11.findElement(By.xpath("/html/body/div[8]/div/div/div[1]/button")).click();
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


driver11.findElement(By.xpath("//*[@id=\"Email\"]")).clear();

driver11.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(clientadmemail3);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

TakesScreenshot ts211=(TakesScreenshot)driver11;

File source211=ts211.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source211, new File("./Screenshots/Suite02b/08bEmailAddChanged.png"));

System.out.println("AccountSettings page screenshot is taken, with change in email address");


//Scroll down and save

JavascriptExecutor je21 = (JavascriptExecutor)driver11;
WebElement element22111 = driver11.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je21.executeScript("arguments[0].scrollIntoView(true);", element22111);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();		
try {
Thread.sleep(7000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Log out

driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
Thread.sleep(4000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
WebDriverWait wait43 = new WebDriverWait(driver11, 40);
WebElement element43 = wait43.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/p/a")));

TakesScreenshot ts2111=(TakesScreenshot)driver11;

File source2111=ts2111.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source2111, new File("./Screenshots/Suite02b/09LogoutPage.png"));

System.out.println("Logout page screenshot is taken");


driver11.quit();


}







//-----------------------------------------------------------------------------------------------------------------------------------


@Test(dependsOnMethods="Login3",description="In CCL Admin page, verify change in email address; then change Coaching type access to Integrated")

public void Login4() throws IOException

{

	String ccladmemail=null;
	String ccladmpwd=null;
	
	String clientadmemail3=null;
	
	File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite02.xlsx");
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheet("Suite02");
	
	XSSFRow row3=sheet1.getRow(11);
	XSSFCell cell4=row3.getCell(4);
	
	XSSFRow row4=sheet1.getRow(12);
	XSSFCell cell5=row4.getCell(4);
	
	XSSFRow row5=sheet1.getRow(15);
	XSSFCell cell6=row5.getCell(4);
	
	XSSFRow row6=sheet1.getRow(19);
	XSSFCell cell7=row6.getCell(4);
	
	ccladmemail=cell4.toString();
	ccladmpwd=cell5.toString();
	
	clientadmemail3=cell6.toString();


//Back to CCL Admin page

try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
//Clear search field and enter new client email ID
driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).clear();
try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(clientadmemail3);

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//Open profile page for the Admin
driver1.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();


WebDriverWait wait411111111 = new WebDriverWait(driver1, 40);
WebElement element41111111 = wait411111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]")));

String checkemail=driver.findElement(By.xpath("//*[@id=\"Email\"]")).getText();

Assert.assertEquals(clientadmemail3, checkemail);

System.out.println("Email is displayed per changes made");

Assert.assertTrue(driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]")).isEnabled());

System.out.println("Admin profile page is open -> Verify Email address");

TakesScreenshot ts31111=(TakesScreenshot)driver1;

File source31111=ts31111.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source31111, new File("./Screenshots/Suite02b/10VerifyAdminProfilePage.png"));

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Set coaching type access to Executive
WebElement coachingType_dropdown1=driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
Select CT_dd1=new Select(coachingType_dropdown1);
CT_dd1.selectByIndex(0);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


TakesScreenshot ts311111=(TakesScreenshot)driver1;

File source311111=ts311111.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source311111, new File("./Screenshots/Suite02b/11aChangeCoachingTypeAccess.png"));
	
System.out.println("Changes to Coaching Type access screenshot is taken");



//Set country data filter to none selected
driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();
try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

TakesScreenshot ts411112=(TakesScreenshot)driver1;

File source411112=ts411112.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source411112, new File("./Screenshots/Suite02b/11bChangeCountryDataFilterSet.png"));
	
System.out.println("Change Country Data Filters to 'None Selected'; screenshot is taken");

//Save Profile
driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}



}



//---------------------------------------------------------------------------------------------------------------





@Test(dependsOnMethods="Login4",description="Login as Client Admin and verify Integrated Admin home page -> Then edit email address")

public void Login5() throws IOException

{
	String clientadm=null;
	String password=null;		

	String clientadmemail4=null;
	
	File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite02.xlsx");
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheet("Suite02");

	XSSFRow row=sheet1.getRow(3);
	XSSFCell cell1=row.getCell(4);
	
	XSSFRow row1=sheet1.getRow(4);
	XSSFCell cell2=row1.getCell(4);
	
	XSSFRow row6=sheet1.getRow(19);
	XSSFCell cell7=row6.getCell(4);
	
	clientadm=cell1.toString();
	password=cell2.toString();

	clientadmemail4=cell7.toString();

	System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
	driver111=new ChromeDriver();
	
	System.out.println("Browser has started");

driver111.get("https://cclcoachingnexus-qa.ccl.org");
driver111.manage().window().maximize();

WebDriverWait wait212 = new WebDriverWait(driver111, 40);
WebElement element212 = wait212.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

//Enter Client Admin email address and password

driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadm);
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(password);
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

WebDriverWait wait2112 = new WebDriverWait(driver111, 40);
WebElement element2112 = wait2112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));


//Assert Log in complete
Assert.assertTrue(driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).isEnabled());

System.out.println("HomePage is open");

//Scroll down
JavascriptExecutor js22 = (JavascriptExecutor) driver111;
js22.executeScript("window.scrollBy(0,1000)");
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Take snapshot of home page : check learning packages available
TakesScreenshot ts23=(TakesScreenshot)driver111;

File source23=ts23.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source23, new File("./Screenshots/Suite02b/12ExecAdmHomePage.png"));

System.out.println("Executive Admin home page screenshot is taken");



//Click on Register button and verify

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
TakesScreenshot ts213=(TakesScreenshot)driver111;

File source213=ts213.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source213, new File("./Screenshots/Suite02b/13ExecutiveAdminRegisterButton.png"));

System.out.println("Executive Admin register button screenshot is taken");


try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();


//Click on Admin name

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Click on account settings
driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li/a/span[2]")).click();

//edit email address
//Assert email address is editable

WebDriverWait wait21113 = new WebDriverWait(driver111, 40);
WebElement element211113 = wait21113.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Email\"]")));

Assert.assertTrue(driver111.findElement(By.xpath("//*[@id=\"Email\"]")).isEnabled());

System.out.println("Email Address field is editable");

driver111.findElement(By.xpath("//*[@id=\"Email\"]")).clear();

driver111.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(clientadmemail4);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

TakesScreenshot ts2113=(TakesScreenshot)driver111;

File source2113=ts2113.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source2113, new File("./Screenshots/Suite02b/14EmailAddChanged.png"));

System.out.println("AccountSettings page screenshot is taken, with change in email address -> Verify no grid filters are applied");


//Scroll down and save

JavascriptExecutor je213 = (JavascriptExecutor)driver111;
WebElement element221113 = driver111.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je213.executeScript("arguments[0].scrollIntoView(true);", element221113);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver111.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();		
try {
Thread.sleep(7000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Log out

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
Thread.sleep(4000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
WebDriverWait wait44 = new WebDriverWait(driver111, 40);
WebElement element44 = wait44.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/p/a")));

TakesScreenshot ts21113=(TakesScreenshot)driver111;

File source21113=ts21113.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source21113, new File("./Screenshots/Suite02b/15LogoutPage.png"));

System.out.println("Logout page screenshot is taken");


driver111.quit();



}




//-------------------------------------------------------------------------------------------------------------------------



@Test(dependsOnMethods="Login5",description="In CCL Admin page, verify change in email address and change coaching type access back as Both, email address to original email address")


public void Login6() throws IOException

{
	String ccladmemail=null;
	String ccladmpwd=null;

	String clientadm=null;
	String clientadmemail4=null;
	
	File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite02.xlsx");
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheet("Suite02");
	
	XSSFRow row3=sheet1.getRow(11);
	XSSFCell cell4=row3.getCell(4);
	
	XSSFRow row4=sheet1.getRow(12);
	XSSFCell cell5=row4.getCell(4);
	
	XSSFRow row6=sheet1.getRow(19);
	XSSFCell cell7=row6.getCell(4);
	
	XSSFRow row=sheet1.getRow(3);
	XSSFCell cell1=row.getCell(4);
	
	ccladmemail=cell4.toString();
	ccladmpwd=cell5.toString();

	clientadm=cell1.toString();
	
	clientadmemail4=cell7.toString();

	
//Back to CCL Admin page

//Clear search field and enter new client email ID
driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).clear();
try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(clientadmemail4);

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//Open profile page for the Admin
driver1.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();

WebDriverWait wait4111111112 = new WebDriverWait(driver1, 40);
WebElement element411111112 = wait4111111112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]")));

String checkemail=driver.findElement(By.xpath("//*[@id=\"Email\"]")).getText();

Assert.assertEquals(clientadmemail4, checkemail);

System.out.println("Email is displayed per changes made");

Assert.assertTrue(driver1.findElement(By.xpath("//*[@id=\"IsClientSuperAdmin\"]")).isEnabled());

System.out.println("Admin profile page is open -> Verify Email address; Super Admin button is clickable");

TakesScreenshot ts311112=(TakesScreenshot)driver1;

File source311112=ts311112.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source311112, new File("./Screenshots/Suite02b/16aVerifyAdminProfilePage.png"));

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Set Admin as a Global Admin

//check Super Admin check box


driver1.findElement(By.xpath("//*[@id=\"IsClientSuperAdmin\"]")).click();

try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

TakesScreenshot ts3111122=(TakesScreenshot)driver1;

File source3111122=ts3111122.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source3111122, new File("./Screenshots/Suite02b/16bSuperAdminButton.png"));

//Scroll down and save 
JavascriptExecutor je111 = (JavascriptExecutor)driver1;
WebElement element211111111 = driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je111.executeScript("arguments[0].scrollIntoView(true);", element211111111);
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();

try {
	Thread.sleep(9000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}






}







//----------------------------------------------------------------------------------------------------------------------



//Log in as the Global Admin and verify page


@Test(dependsOnMethods="Login6",description="Login as Client Admin and verify Integrated Admin home page -> Then edit email address")

public void Login7() throws IOException

{
	String clientadm=null;
	String password=null;		

	String clientadmemail4=null;
	
	File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite02.xlsx");
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheet("Suite02");

	XSSFRow row=sheet1.getRow(3);
	XSSFCell cell1=row.getCell(4);
	
	XSSFRow row1=sheet1.getRow(4);
	XSSFCell cell2=row1.getCell(4);
	
	XSSFRow row6=sheet1.getRow(19);
	XSSFCell cell7=row6.getCell(4);
	
	clientadm=cell1.toString();
	password=cell2.toString();

	clientadmemail4=cell7.toString();

	System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
	driver1111=new ChromeDriver();
	
	System.out.println("Browser has started");

driver1111.get("https://cclcoachingnexus-qa.ccl.org");
driver1111.manage().window().maximize();

WebDriverWait wait212 = new WebDriverWait(driver1111, 40);
WebElement element212 = wait212.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

//Enter Client Admin email address and password

driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadm);
driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(password);
driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

WebDriverWait wait2112 = new WebDriverWait(driver1111, 40);
WebElement element2112 = wait2112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));


//Assert Log in complete
Assert.assertTrue(driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).isEnabled());

System.out.println("HomePage is open");

//Scroll down
JavascriptExecutor js22 = (JavascriptExecutor) driver1111;
js22.executeScript("window.scrollBy(0,1000)");
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Take snapshot of home page : check learning packages available
TakesScreenshot ts23=(TakesScreenshot)driver1111;

File source23=ts23.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source23, new File("./Screenshots/Suite02b/17aGlobalAdminHomePage.png"));

System.out.println("Global Admin home page screenshot is taken");



//Click on Register button and verify

driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
TakesScreenshot ts2134=(TakesScreenshot)driver1111;

File source2134=ts2134.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source2134, new File("./Screenshots/Suite02b/17bGlobalAdminRegisterButton.png"));

System.out.println("Global Admin register button screenshot is taken");


try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();


//Go to Admin directory page

Assert.assertTrue(driver1111.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a/span")).isEnabled());

System.out.println("Admin Directory button is available");

driver1111.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a/span")).click();


WebDriverWait wait61111 = new WebDriverWait(driver1111, 40);
WebElement element611111 = wait61111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));

TakesScreenshot ts21341=(TakesScreenshot)driver1111;

File source21341=ts21341.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source21341, new File("./Screenshots/Suite02b/17cAdminDirectoryButton.png"));

System.out.println("Global Admin's Admin Directory page screenshot is taken");


driver1111.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(clientadmemail4);

try {
Thread.sleep(7000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//click on the Admin - verify admin is a Global Admin
driver1111.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();

WebDriverWait wait4111111112 = new WebDriverWait(driver1111, 40);
WebElement element411111112 = wait4111111112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]/div/button/i")));

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

TakesScreenshot ts213411=(TakesScreenshot)driver1111;

File source213411=ts213411.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source213411, new File("./Screenshots/Suite02b/17dAdminProfilePage.png"));

System.out.println("Admin Profile page screenshot is taken");

Assert.assertTrue(driver1111.findElement(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]/div/button/i")).isEnabled());

System.out.println("Global Admin can view Admin profile");


//close
driver1111.findElement(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]/div/button/i")).click();

try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Log out

driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
Thread.sleep(4000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
WebDriverWait wait44 = new WebDriverWait(driver1111, 40);
WebElement element44 = wait44.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/p/a")));

TakesScreenshot ts21113=(TakesScreenshot)driver1111;

File source21113=ts21113.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source21113, new File("./Screenshots/Suite02b/17eLogoutPage.png"));

System.out.println("Logout page screenshot is taken");


driver1111.quit();










}

//------------------------------------------------------------------------------------------------



@Test(dependsOnMethods="Login7",description="Login as Client Admin and verify Integrated Admin home page -> Then edit email address")

public void Login8() throws IOException

{
	
	String ccladmemail=null;
	String ccladmpwd=null;

	String clientadm=null;
	String clientadmemail4=null;
	
	File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite02.xlsx");
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheet("Suite02");
	
	XSSFRow row3=sheet1.getRow(11);
	XSSFCell cell4=row3.getCell(4);
	
	XSSFRow row4=sheet1.getRow(12);
	XSSFCell cell5=row4.getCell(4);
	
	XSSFRow row6=sheet1.getRow(19);
	XSSFCell cell7=row6.getCell(4);
	
	XSSFRow row=sheet1.getRow(3);
	XSSFCell cell1=row.getCell(4);
	
	ccladmemail=cell4.toString();
	ccladmpwd=cell5.toString();

	clientadm=cell1.toString();
	
	clientadmemail4=cell7.toString();

	
//Back to CCL Admin page

//Clear search field and enter new client email ID
driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).clear();
try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(clientadmemail4);

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//Open profile page for the Admin
driver1.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();

WebDriverWait wait4111111112 = new WebDriverWait(driver1, 40);
WebElement element411111112 = wait4111111112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Email\"]")));


TakesScreenshot ts311112=(TakesScreenshot)driver1;

File source311112=ts311112.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source311112, new File("./Screenshots/Suite02b/18aVerifyAdminProfilePage.png"));

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}	
	

//Edit email address to match initial email address

driver1.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

driver1.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(clientadm);

try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}



//Uncheck Super Admin check box
driver1.findElement(By.xpath("//*[@id=\"IsClientSuperAdmin\"]")).click();

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
TakesScreenshot ts3111122=(TakesScreenshot)driver1;

File source3111122=ts3111122.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source3111122, new File("./Screenshots/Suite02b/18bUncheckSuperAdmin.png"));


//Assert if Coaching type access button is editable

Assert.assertTrue(driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]")).isEnabled());

System.out.println("Super Admin box is unchecked -> Assert Coaching type access button is editable");

//Set coaching type access to Both
WebElement coachingType_dropdown11=driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
Select CT_dd11=new Select(coachingType_dropdown11);
CT_dd11.selectByIndex(2);
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Set skill team to select all
//Assert if skill team button is editable
Assert.assertTrue(driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")).isEnabled());

System.out.println("Super Admin box is unchecked -> Assert Skill team button is editable");

driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

TakesScreenshot ts31111221=(TakesScreenshot)driver1;

File source31111221=ts31111221.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source31111221, new File("./Screenshots/Suite02b/18cEditSkillTeam.png"));


//Save profile
driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();

try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Open admin profile page again
WebDriverWait wait313 = new WebDriverWait(driver1, 40);
WebElement element313 = wait313.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));

driver1.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();


//Set country to select all

WebDriverWait wait3131 = new WebDriverWait(driver1, 40);
WebElement element3131 = wait3131.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Email\"]")));

//Assert if skill team button is editable
Assert.assertTrue(driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).isEnabled());

System.out.println("Super Admin box is unchecked -> Assert Country data filter option button is editable");


driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();
try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}


TakesScreenshot ts311112211=(TakesScreenshot)driver1;

File source311112211=ts311112211.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source311112211, new File("./Screenshots/Suite02b/18dEditCountryDataFilters.png"));


//Save Profile

driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();


	
	}
	
	



	
	
}
