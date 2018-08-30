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
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Suite02a {

	WebDriver driver;
	WebDriver driver1;
	WebDriver driver11;
	WebDriver driver111;

	@BeforeClass(description="Open Browser")
	public void Start()
	{


		Reporter.log("----------------------||-This test is to verify change in Coaching type access made by CCL Admin");
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				driver=new ChromeDriver();
				
				Reporter.log("----------------------||-Browser has started");
	
	}
	
	
	
	@Test(description="Login as Client Admin with coaching type access set as Both and edit email address")
	
	public void Login1() throws IOException
	{
		
		Reporter.log("----------------------||-First we will login as a Client Admin set up with Coaching type access as 'Both' and edit email address of the Admin in Account settings page");
		
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

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Assert Log in complete
Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).isEnabled());

Reporter.log("----------------------||-HomePage is open");

//Screenshot of home page1

Reporter.log("----------------------||-Screen shot of HomePage");

File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

File screenshotName = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\01.png\\"+driver.getTitle()+".png");

FileUtils.copyFile(scrFile, screenshotName);


Reporter.log("<br><img src='"+screenshotName+"' height='475' width='900'/><br>");

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}




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

Reporter.log("----------------------||-Screen shot of Coaching packages available in Home page");

File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

File screenshotName1 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\02.png\\"+driver.getTitle()+".png");

FileUtils.copyFile(scrFile1, screenshotName1);


Reporter.log("<br><img src='"+screenshotName1+"' height='475' width='900'/><br>");

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}




//Click on Register button and verify

driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

Reporter.log("----------------------||-Screen shot of Register button available in Home page");

File scrFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

File screenshotName11 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\03.png\\"+driver.getTitle()+".png");

FileUtils.copyFile(scrFile11, screenshotName11);


Reporter.log("<br><img src='"+screenshotName11+"' height='475' width='900'/><br>");



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
	Thread.sleep(1000);
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

Reporter.log("----------------------||-AccountSettings page screenshot is taken, BEFORE change in email address");

File scrFile111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

File screenshotName111 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\04.png\\"+driver.getTitle()+".png");

FileUtils.copyFile(scrFile111, screenshotName111);

Reporter.log("<br><img src='"+screenshotName111+"' height='475' width='900'/><br>");
	
Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"Email\"]")).isEnabled());

Reporter.log("----------------------||-Email Address field is editable");

driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();

driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(clientadmemail2);
try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

Reporter.log("----------------------||-AccountSettings page screenshot is taken, with change in email address");

File scrFile1111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

File screenshotName1111 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\05.png\\"+driver.getTitle()+".png");

FileUtils.copyFile(scrFile1111, screenshotName1111);

Reporter.log("<br><img src='"+screenshotName1111+"' height='475' width='900'/><br>");
	



//Scroll down and save

JavascriptExecutor je1 = (JavascriptExecutor)driver;
WebElement element2111 = driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je1.executeScript("arguments[0].scrollIntoView(true);", element2111);

Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).isEnabled());

Reporter.log("----------------------||-Save button is available to click");


try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();		
try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
WebDriverWait wait11111 = new WebDriverWait(driver, 40);
wait11111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")));


//Log out

driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}


WebDriverWait wait4 = new WebDriverWait(driver, 40);
WebElement element4 = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/p/a")));


Reporter.log("----------------------||-Logout page screenshot is taken");

File scrFile11111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

File screenshotName11111 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\06.png\\"+driver.getTitle()+".png");

FileUtils.copyFile(scrFile11111, screenshotName11111);

Reporter.log("<br><img src='"+screenshotName11111+"' height='475' width='900'/><br>");
	



driver.quit();
	


	}


//----------------------------------------------------------------------------------------------------------------------------




 @Test(dependsOnMethods="Login1",description="Log in as CCL Admin and edit Coaching type access to Integrated for the Client Admin")

 public void Login2() throws IOException
 
 {

	 Reporter.log("---------------------||Login as CCL Admin, search for the Admin whose email address is changed and edit its coaching type access to Integrated");
	 
	 
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
		
		Reporter.log("----------------------||-Browser has started");

 
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

Reporter.log("----------------------||-CCL Admin HomePage is displayed");


driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).click();

WebDriverWait wait4111111 = new WebDriverWait(driver1, 40);
WebElement element411111 = wait4111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));



//Assert Admin directory page is open

Assert.assertTrue(driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).isEnabled());

Reporter.log("----------------------||-Admin directory page is open");

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


Assert.assertTrue(driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]")).isEnabled());

Reporter.log("----------------------||-Admin profile page is open and Coaching type access button is editable");

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

Reporter.log("----------------------||-Admin profile page image is taken before changes are made to coaching type access; Verify email address change");

File scrFile11111 = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);

File screenshotName211111 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\07\\"+driver1.getTitle()+".png");

FileUtils.copyFile(scrFile11111, screenshotName211111);

Reporter.log("<br><img src='"+screenshotName211111+"' height='475' width='900'/><br>");


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


Reporter.log("----------------------||-Changes to Coaching Type access screenshot is taken");

File scrFile111111 = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);

File screenshotName3111111 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\08\\"+driver1.getTitle()+".png");

FileUtils.copyFile(scrFile111111, screenshotName3111111);

Reporter.log("<br><img src='"+screenshotName3111111+"' height='475' width='900'/><br>");
	




//Scroll down and save 
JavascriptExecutor je11 = (JavascriptExecutor)driver1;
WebElement element21111111 = driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je11.executeScript("arguments[0].scrollIntoView(true);", element21111111);
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}


 }

//------------------------------------------------------------------------------------------




@Test(dependsOnMethods="Login2",description="Verify Integrated Admin Home page")

public void Login3() throws IOException

{
	
	Reporter.log("----------||Log in as the Client Admin that is now set as Integrated Admin and verify home page");
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
	
	Reporter.log("----------------------||-Browser has started");

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
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Assert Log in complete
Assert.assertTrue(driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).isEnabled());

Reporter.log("----------------------||-HomePage is open");

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


Reporter.log("----------------------||-Home page screenshot is taken");

File scrFile111111 = ((TakesScreenshot)driver11).getScreenshotAs(OutputType.FILE);

File screenshotName4111111 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\09\\"+driver11.getTitle()+".png");

FileUtils.copyFile(scrFile111111, screenshotName4111111);

Reporter.log("<br><img src='"+screenshotName4111111+"' height='475' width='900'/><br>");



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
Reporter.log("----------------------||-Coaching packages available in Home page screenshot is taken");

File scrFile51111111 = ((TakesScreenshot)driver11).getScreenshotAs(OutputType.FILE);

File screenshotName51111111 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\10\\"+driver11.getTitle()+".png");

FileUtils.copyFile(scrFile51111111, screenshotName51111111);

Reporter.log("<br><img src='"+screenshotName51111111+"' height='475' width='900'/><br>");




//Click on Register button and verify

driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

Reporter.log("----------------------||-Integrated Admin register button screenshot is taken");

File scrFile11111111 = ((TakesScreenshot)driver11).getScreenshotAs(OutputType.FILE);

File screenshotName611111111 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\11\\"+driver11.getTitle()+".png");

FileUtils.copyFile(scrFile11111111, screenshotName611111111);

Reporter.log("<br><img src='"+screenshotName611111111+"' height='475' width='900'/><br>");

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
Thread.sleep(1000);
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

Assert.assertTrue(driver11.findElement(By.xpath("//*[@id=\"Email\"]")).isEnabled());

Reporter.log("----------------------||-Email Address field is editable");

driver11.findElement(By.xpath("//*[@id=\"Email\"]")).clear();

driver11.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(clientadmemail3);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

Reporter.log("----------------------||-AccountSettings page screenshot is taken, with change in email address");

File scrFile111111111 = ((TakesScreenshot)driver11).getScreenshotAs(OutputType.FILE);

File screenshotName7111111111 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\12\\"+driver11.getTitle()+".png");

FileUtils.copyFile(scrFile111111111, screenshotName7111111111);

Reporter.log("<br><img src='"+screenshotName7111111111+"' height='475' width='900'/><br>");




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
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


WebDriverWait wait11111 = new WebDriverWait(driver11, 40);
wait11111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")));

//Log out

driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
WebDriverWait wait43 = new WebDriverWait(driver11, 40);
WebElement element43 = wait43.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/p/a")));


File scrFile1111111111 = ((TakesScreenshot)driver11).getScreenshotAs(OutputType.FILE);

File screenshotName81111111111 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\12a\\"+driver11.getTitle()+".png");

FileUtils.copyFile(scrFile1111111111, screenshotName81111111111);

Reporter.log("<br><img src='"+screenshotName81111111111+"' height='475' width='900'/><br>");


driver11.quit();


}







//-----------------------------------------------------------------------------------------------------------------------------------


@Test(dependsOnMethods="Login3",description="In CCL Admin page, verify change in email address; then change Coaching type access to Executive")

public void Login4() throws IOException

{
	String clientadmemail3=null;
	
	File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite02.xlsx");
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheet("Suite02");

	XSSFRow row5=sheet1.getRow(15);
	XSSFCell cell6=row5.getCell(4);
	
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

Assert.assertTrue(driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]")).isEnabled());



Reporter.log("----------------------||-Admin profile page image is taken before changes are made to coaching type access; Verify email address change");

File scrFile11111 = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);

File screenshotName111112 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\13\\"+driver1.getTitle()+".png");

FileUtils.copyFile(scrFile11111, screenshotName111112);

Reporter.log("<br><img src='"+screenshotName111112+"' height='475' width='900'/><br>");

try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Set coaching type access to Executive
WebElement coachingType_dropdown1=driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
Select CT_dd1=new Select(coachingType_dropdown1);
CT_dd1.selectByIndex(0);
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

Reporter.log("----------------------||-Changes to Coaching Type access screenshot is taken");

File scrFile111111 = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);

File screenshotName1111113 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\14\\"+driver1.getTitle()+".png");

FileUtils.copyFile(scrFile111111, screenshotName1111113);

Reporter.log("<br><img src='"+screenshotName1111113+"' height='475' width='900'/><br>");

try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Scroll down and save 
JavascriptExecutor je311 = (JavascriptExecutor)driver1;
WebElement element321111111 = driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je311.executeScript("arguments[0].scrollIntoView(true);", element321111111);
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}



}



//---------------------------------------------------------------------------------------------------------------





@Test(dependsOnMethods="Login4",description="Login as Client Admin and verify Executive Admin home page -> Then edit email address")

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
	
	Reporter.log("----------------------||-Browser has started");

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

//Screenshot of home page1

Reporter.log("----------------------||-Screen shot of HomePage");

File scrFile = ((TakesScreenshot)driver111).getScreenshotAs(OutputType.FILE);

File screenshotName4 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\15\\"+driver111.getTitle()+".png");

FileUtils.copyFile(scrFile, screenshotName4);


Reporter.log("<br><img src='"+screenshotName4+"' height='475' width='900'/><br>");





//Scroll down
JavascriptExecutor js = (JavascriptExecutor) driver111;
js.executeScript("window.scrollBy(0,1000)");
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Take snapshot of home page : check learning packages available

Reporter.log("----------------------||-Screen shot of Coaching packages available in Home page");

File scrFile1 = ((TakesScreenshot)driver111).getScreenshotAs(OutputType.FILE);

File screenshotName15 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\16\\"+driver111.getTitle()+".png");

FileUtils.copyFile(scrFile1, screenshotName15);


Reporter.log("<br><img src='"+screenshotName15+"' height='475' width='900'/><br>");





//Click on Register button and verify

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

Reporter.log("----------------------||-Screen shot of Register button available in Home page");

File scrFile11 = ((TakesScreenshot)driver111).getScreenshotAs(OutputType.FILE);

File screenshotName116 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\17\\"+driver111.getTitle()+".png");

FileUtils.copyFile(scrFile11, screenshotName116);


Reporter.log("<br><img src='"+screenshotName116+"' height='475' width='900'/><br>");

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

Reporter.log("----------------------||-Email Address field is editable");

driver111.findElement(By.xpath("//*[@id=\"Email\"]")).clear();

driver111.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(clientadmemail4);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

Reporter.log("----------------------||-AccountSettings page screenshot is taken, with change in email address");

File scrFile111 = ((TakesScreenshot)driver111).getScreenshotAs(OutputType.FILE);

File screenshotName1117 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\18\\"+driver111.getTitle()+".png");

FileUtils.copyFile(scrFile111, screenshotName1117);

Reporter.log("<br><img src='"+screenshotName1117+"' height='475' width='900'/><br>");




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
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

WebDriverWait wait11111 = new WebDriverWait(driver111, 40);
wait11111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")));

//Log out

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
WebDriverWait wait44 = new WebDriverWait(driver111, 40);
WebElement element44 = wait44.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/p/a")));

Reporter.log("----------------------||-Logout page screenshot is taken");

File scrFile1111 = ((TakesScreenshot)driver111).getScreenshotAs(OutputType.FILE);

File screenshotName1111 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\19\\"+driver111.getTitle()+".png");

FileUtils.copyFile(scrFile1111, screenshotName1111);

Reporter.log("<br><img src='"+screenshotName1111+"' height='475' width='900'/><br>");




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

Assert.assertTrue(driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]")).isEnabled());

Reporter.log("----------------------||-Admin profile page image is taken before changes are made to coaching type access; Verify email address change");

File scrFile11111 = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);

File screenshotName111118 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\20\\"+driver1.getTitle()+".png");

FileUtils.copyFile(scrFile11111, screenshotName111118);

Reporter.log("<br><img src='"+screenshotName111118+"' height='475' width='900'/><br>");

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


Reporter.log("----------------------||-Changes to Coaching Type access screenshot is taken");

File scrFile111111 = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);

File screenshotName1111119 = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\Suite02a\\21\\"+driver1.getTitle()+".png");

FileUtils.copyFile(scrFile111111, screenshotName1111119);

Reporter.log("<br><img src='"+screenshotName1111119+"' height='475' width='900'/><br>");

try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Scroll down and save 
JavascriptExecutor je3111 = (JavascriptExecutor)driver1;
WebElement element3211111111 = driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je3111.executeScript("arguments[0].scrollIntoView(true);", element3211111111);
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();

try {
	Thread.sleep(5000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}


//Logout


WebDriverWait wait21111111 = new WebDriverWait(driver1, 40);
wait21111111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[2]")));

driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();


	
	}
	
	
	
	
}
