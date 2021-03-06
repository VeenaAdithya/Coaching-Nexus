import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suite18c {

	public static void main(String[] args) throws IOException {
	
		
		String ccladmemail=null;
		String ccladmpwd=null;
		String clientadmemail=null;
		String clientadmpwd=null;
		
		
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\UAT\\FordTest\\Suite18.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite18");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row2=sheet1.getRow(9);
		XSSFCell cell3=row2.getCell(4);
		
		XSSFRow row3=sheet1.getRow(13);
		XSSFCell cell4=row3.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		clientadmemail=cell3.toString();
		clientadmpwd=cell4.toString();
		
		
		//Open Chrome and CNX QA
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://cclcoachingnexus-uat.ccl.org");
				driver.manage().window().maximize();
				
			WebDriverWait wait = new WebDriverWait(driver, 40);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
			
		//Enter CCL Admin email address and submit
			
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(ccladmemail);

		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")));
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

		WebDriverWait wait11 = new WebDriverWait(driver, 40);
		WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));

		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys(ccladmemail);
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys(ccladmpwd);
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_SubmitButton\"]")).click();

		WebDriverWait wait111 = new WebDriverWait(driver, 40);
		WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idBtn_Back\"]")));

		driver.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();

		//Select client Ford test
		WebDriverWait wait1111 = new WebDriverWait(driver, 40);
		WebElement element1111 = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")));

		driver.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

		WebDriverWait wait11111 = new WebDriverWait(driver, 40);
		wait11111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));
		
		//Go to Admin directory page
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Search for a client admin you want to check data filters set in CSR registration form
		WebDriverWait wait111111 = new WebDriverWait(driver, 40);
		WebElement element11111 = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(clientadmemail);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait1111111 = new WebDriverWait(driver, 40);
		WebElement element111111 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
		
		driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
		
		
//Click on Skill team data filter
WebDriverWait wait331 = new WebDriverWait(driver, 40);
WebElement element331 = wait331.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")));
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")).click();

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Unselect all and select only Finance

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[5]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();
try {
	Thread.sleep(15000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



WebDriverWait wait511111 = new WebDriverWait(driver, 40);
wait511111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]")));



//OPen the admin profile again

WebDriverWait wait21111111 = new WebDriverWait(driver, 40);
WebElement element2111111 = wait21111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));

driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button/span")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
JavascriptExecutor je1 = (JavascriptExecutor)driver;
WebElement element211111 = driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[44]/a/label"));
je1.executeScript("arguments[0].scrollIntoView(true);", element211111);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[44]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();
try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}





























//Log in as Client admin to check updates to skill team filter
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver11 =new ChromeDriver();
		driver11.get("https://cclcoachingnexus-uat.ccl.org");
		driver11.manage().window().maximize();
		
	WebDriverWait wait2113 = new WebDriverWait(driver11, 40);
	WebElement element2113 = wait2113.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Client Admin email address and password
	
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();



try {
Thread.sleep(10000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Click on +Register button -> CSR

WebDriverWait wait221 = new WebDriverWait(driver11, 40);
WebElement element221 = wait221.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[1]/a/span")).click();
try {
	Thread.sleep(9000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on Skill team drop down and select finance

WebDriverWait wait2111 = new WebDriverWait(driver11, 40);
WebElement element2111 = wait2111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")));
driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[2]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Click on Region drop down and select Europe

driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[2]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on country drop down and select UK

driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button/span")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[2]/a/label")).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Close registration form
driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[3]/div/div/a")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Click on the 'i' button

driver11.findElement(By.xpath("//*[@id=\"GridControls\"]/span/a/span")).click();

try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver11.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11.quit();














//Back to page where we are logged in as CCL Admin

WebDriverWait wait31111111 = new WebDriverWait(driver, 40);
WebElement element3111111 = wait31111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));

driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Set coaching type access to 'Both'
WebDriverWait wait311111111 = new WebDriverWait(driver, 40);
WebElement element31111111 = wait311111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement coachingType_dropdown=driver.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
Select CT_dd=new Select(coachingType_dropdown);
CT_dd.selectByIndex(2);	
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Scroll down and click on save
JavascriptExecutor je11 = (JavascriptExecutor)driver;
WebElement element21111111 = driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je11.executeScript("arguments[0].scrollIntoView(true);", element21111111);
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();

try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}














//Log in as Client admin to check updates to Coaching type access
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver111 =new ChromeDriver();
		driver111.get("https://cclcoachingnexus-uat.ccl.org");
		driver111.manage().window().maximize();
		
	WebDriverWait wait21131 = new WebDriverWait(driver111, 40);
	WebElement element21131 = wait21131.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Client Admin email address and password
	
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();



try {
Thread.sleep(10000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Click on +Register button -> CSR

WebDriverWait wait2211 = new WebDriverWait(driver111, 40);
WebElement element2211 = wait2211.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[1]/a/span")).click();
try {
	Thread.sleep(9000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on Skill team drop down and select finance

WebDriverWait wait21111 = new WebDriverWait(driver111, 40);
WebElement element21111 = wait21111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")));
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[2]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Click on Region drop down and select Europe

driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[2]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on country drop down and select UK

driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button/span")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[2]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Close registration form
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[3]/div/div/a")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Click on the 'i' button

driver111.findElement(By.xpath("//*[@id=\"GridControls\"]/span/a/span")).click();

try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver111.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver111.quit();












//Log in as CCL Admin to set skill team and country data filters to Select all
WebDriverWait wait3111111111 = new WebDriverWait(driver, 40);
WebElement element311111111 = wait3111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));

driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Click on Skill team data filter
WebDriverWait wait3311 = new WebDriverWait(driver, 40);
WebElement element3311 = wait3311.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")));
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")).click();

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Select all filter set for skill team

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebDriverWait wait5111111 = new WebDriverWait(driver, 40);
wait5111111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]")));

driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();

try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//OPen the admin profile again

WebDriverWait wait211111111 = new WebDriverWait(driver, 40);
WebElement element211111111 = wait211111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")));

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();
try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
















//Log in as CLient Admin and ensure changes to data filters are set
System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
WebDriver driver1111 =new ChromeDriver();
driver1111.get("https://cclcoachingnexus-uat.ccl.org");
driver1111.manage().window().maximize();

WebDriverWait wait211311 = new WebDriverWait(driver1111, 40);
WebElement element211311 = wait211311.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

//Enter Client Admin email address and password

driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();



try {
Thread.sleep(10000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Click on +Register button -> CSR

WebDriverWait wait22111 = new WebDriverWait(driver1111, 40);
WebElement element22111 = wait22111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[1]/a/span")).click();
try {
Thread.sleep(9000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
//Click on Skill team drop down and select finance

WebDriverWait wait211111 = new WebDriverWait(driver1111, 40);
WebElement element2111111111 = wait211111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")));
driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")).click();
try {
Thread.sleep(6000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[6]/a/label")).click();
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


//Click on Region drop down and select North America

driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[5]/a/label")).click();
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
//Click on country drop down and select Canada

driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button/span")).click();
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[3]/a/label")).click();
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


//Close registration form
driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[3]/div/div/a")).click();
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


//Click on the 'i' button

driver1111.findElement(By.xpath("//*[@id=\"GridControls\"]/span/a/span")).click();

try {
Thread.sleep(6000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

driver1111.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1111.quit();













//Log in as CCL Admin and set Coaching type access back as 'Executive'
//Back to page where we are logged in as CCL Admin

WebDriverWait wait31111111111 = new WebDriverWait(driver, 40);
WebElement element3111111111 = wait31111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));

driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Set coaching type access to 'Executive'
WebDriverWait wait311111111111 = new WebDriverWait(driver, 40);
WebElement element31111111111 = wait311111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement coachingType_dropdown1=driver.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
Select CT_dd1=new Select(coachingType_dropdown1);
CT_dd1.selectByIndex(0);	
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Scroll down and click on save
JavascriptExecutor je111 = (JavascriptExecutor)driver;
WebElement element21111111111 = driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je111.executeScript("arguments[0].scrollIntoView(true);", element21111111111);
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();

try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

















//Log in as Client admin to check updates to Coaching type access
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver11111 =new ChromeDriver();
		driver11111.get("https://cclcoachingnexus-uat.ccl.org");
		driver11111.manage().window().maximize();
		
	WebDriverWait wait2113111 = new WebDriverWait(driver11111, 40);
	WebElement element2113111 = wait2113111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Client Admin email address and password
	
driver11111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
driver11111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
driver11111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();



try {
Thread.sleep(10000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Click on +Register button -> CSR

WebDriverWait wait221111 = new WebDriverWait(driver11111, 40);
WebElement element221111 = wait221111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

driver11111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver11111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[1]/a/span")).click();
try {
	Thread.sleep(9000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on Skill team drop down and select finance

WebDriverWait wait2111111 = new WebDriverWait(driver11111, 40);
WebElement element211111111111 = wait2111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")));
driver11111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Scroll down and select 'Sustainable Energy'


JavascriptExecutor je71 = (JavascriptExecutor)driver1111;
WebElement element711111 = driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[24]/a/label"));
je71.executeScript("arguments[0].scrollIntoView(true);", element11111);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[24]/a/label")).click();

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Click on Region drop down and select Europe

driver11111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[3]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on country drop down and select UK

driver11111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button/span")).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

JavascriptExecutor je711 = (JavascriptExecutor)driver1111;
WebElement element7111111 = driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[24]/a/label"));
je711.executeScript("arguments[0].scrollIntoView(true);", element11111);

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


driver11111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[24]/a/label")).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Close registration form
driver11111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[3]/div/div/a")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Click on the 'i' button

driver11111.findElement(By.xpath("//*[@id=\"GridControls\"]/span/a/span")).click();

try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver11111.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver11111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11111.quit();













	}
}









