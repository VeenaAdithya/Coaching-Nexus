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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Suite33 {

	
	WebDriver driver;
	WebDriver driver1;
	

	@BeforeClass(description="Open Browser")
	public void Start()
	{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				driver=new ChromeDriver();
				
				System.out.println("Browser has started");
	
	}
	
	@Test(description="Log in as CCL Admin and Register Global Admin")
	
	public void Login() throws IOException
				
	{

		String ccladmemail=null;
		String ccladmpwd=null;

		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite33.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite33");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		
		
		//Open Chrome and CNX QA
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://cclcoachingnexus-qa.ccl.org");
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
	
		
		//Assert Login is complete
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).isEnabled());
		
		System.out.println("Log in to CNX as CCL Admin is complete");
		
	}

		@Test(dependsOnMethods="Login",description="Open Registration form for Client Admin and enter all values")
		
		public void RegisterClientAdmin() throws IOException
		{
	//Click on +Register -> Admin
		
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[1]/a/span")).click();

WebDriverWait wait24 = new WebDriverWait(driver, 40);
WebElement element24 = wait24.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));

Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).isEnabled());

System.out.println("Registration for is open");

//Take snapshot of Admin registration form

TakesScreenshot ts=(TakesScreenshot)driver;

File source=ts.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source, new File("./Screenshots/Suite33/01RegisterationForm.png"));
	
System.out.println("Admin Registeration form screenshot is taken");

		}
		
		@Test(dependsOnMethods="RegisterClientAdmin",description="Fill out Registration form")
		
	public void FillRegistrationForm() throws IOException
	
	{
			String firstname=null;
			String lastname=null;
			String clientadmemail=null;
			String phone=null;
			String assistname=null;
			String assistemail=null;
			String managername=null;
			String manageremail=null;
			
			File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite33.xlsx");
			
			FileInputStream fis=new FileInputStream(src);
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.getSheet("Suite33");

			XSSFRow row2=sheet1.getRow(11);
			XSSFCell cell3=row2.getCell(4);
			
			XSSFRow row3=sheet1.getRow(12);
			XSSFCell cell4=row3.getCell(4);
			
			XSSFRow row4=sheet1.getRow(13);
			XSSFCell cell5=row4.getCell(4);
			
			XSSFRow row5=sheet1.getRow(14);
			XSSFCell cell6=row5.getCell(4);
			
			XSSFRow row6=sheet1.getRow(22);
			XSSFCell cell7=row6.getCell(4);
			
			XSSFRow row7=sheet1.getRow(23);
			XSSFCell cell8=row7.getCell(4);
			
			XSSFRow row8=sheet1.getRow(24);
			XSSFCell cell9=row8.getCell(4);
			
			XSSFRow row9=sheet1.getRow(25);
			XSSFCell cell10=row9.getCell(4);
			
			firstname=cell3.toString();
			lastname=cell4.toString();
			clientadmemail=cell5.toString();
			phone=cell6.toString();
			assistname=cell7.toString();
			assistemail=cell8.toString();
			managername=cell9.toString();
			manageremail=cell10.toString();
			
	
			//Enter field values in registration form - first name, last name, email address

			driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(firstname);
			driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(lastname);
			driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(clientadmemail);


			//select check box for super Admin

			Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"IsClientSuperAdmin\"]")).isEnabled());
			
			System.out.println("Super Client check box is available");
			
			driver.findElement(By.xpath("//*[@id=\"IsClientSuperAdmin\"]")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File source=ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./Screenshots/Suite33/02RegisterButton.png"));
				
			System.out.println("Screenshot is taken to verify if Coaching type access is defaulted to 'Both' and data filters are defaulted to 'none selected'");
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"IsClientSuperAdmin\"]")).isEnabled());
			
			System.out.println("Super Client check box is available for unchecking");
			
			
			//Select campus - Greensboro
			driver.findElement(By.xpath("//*[@id=\"divRegisterAdmin\"]/div[5]/div/div/a/span[1]")).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			TakesScreenshot ts1=(TakesScreenshot)driver;
			
			File source1=ts1.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source1, new File("./Screenshots/Suite33/03CampusDropdown.png"));
				
			System.out.println("Screenshot is taken to verify if all values are available for Campus");
			
			driver.findElement(By.xpath("//*[@id=\"divRegisterAdmin\"]/div[5]/div/div/a/ul/li[3]")).click();

			//Enter phone number
			driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys(phone);

			//Select Region - Europe; Skill team
			driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[1]/div/a/span[2]")).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			TakesScreenshot ts11=(TakesScreenshot)driver;
			
			File source11=ts11.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source11, new File("./Screenshots/Suite33/04RegionDropdown.png"));
				
			System.out.println("Screenshot is taken to verify if all values are available for Region");
			
			driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[1]/div/a/ul/li[2]")).click();
			
			//Select Skill team
			driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[2]/div/a/span[2]")).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Scroll down
			JavascriptExecutor je = (JavascriptExecutor)driver;
			WebElement element111 = driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[2]/div/a/ul/li[22]"));
			je.executeScript("arguments[0].scrollIntoView(true);", element111);
			
			TakesScreenshot ts111=(TakesScreenshot)driver;
			
			File source111=ts111.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source111, new File("./Screenshots/Suite33/05SkillTeamDropdown.png"));
				
			System.out.println("Screenshot is taken to verify if all values are available for SkillTeam");
			
			
			driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[2]/div/a/ul/li[22]")).click();

			//Select leadership level
			driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[3]/div/a/span[2]")).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			TakesScreenshot ts1111=(TakesScreenshot)driver;
			
			File source1111=ts1111.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source1111, new File("./Screenshots/Suite33/06LeadershipLevelDropdown.png"));
				
			System.out.println("Screenshot is taken to verify if all values are available for LeadershipLevel");
			
			driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[3]/div/a/ul/li[3]")).click();

			//Select Country
			driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[5]/div/a/span[2]")).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Scroll down
			JavascriptExecutor je1 = (JavascriptExecutor)driver;
			WebElement element1111 = driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[5]/div/a/ul/li[22]"));
			je1.executeScript("arguments[0].scrollIntoView(true);", element1111);
			
			TakesScreenshot ts11111=(TakesScreenshot)driver;
			
			File source11111=ts11111.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source11111, new File("./Screenshots/Suite33/07CountryDropdown.png"));
				
			System.out.println("Screenshot is taken to verify if all values are available for Country");
			
			driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[5]/div/a/ul/li[22]")).click();

			//Assistant email add and name
			driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_0__ClientFieldValueText\"]")).sendKeys(assistname);
			driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_1__ClientFieldValueText\"]")).sendKeys(assistemail);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//Manager name and email

			driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_2__ClientFieldValueText\"]")).sendKeys(managername);
			driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_3__ClientFieldValueText\"]")).sendKeys(manageremail);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			//Save registration
			driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			TakesScreenshot ts111111=(TakesScreenshot)driver;
			
			File source111111=ts111111.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source111111, new File("./Screenshots/Suite33/08RegistrationComplete.png"));
				
			System.out.println("Screenshot is taken to verify if Registration is complete");

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			//close registration email
			WebDriverWait wait2111 = new WebDriverWait(driver, 40);
			WebElement element2111 = wait2111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"registerAdmin\"]/div/div/div[1]/button/i")));
			
			driver.findElement(By.xpath("//*[@id=\"registerAdmin\"]/div/div/div[1]/button/i")).click();

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		
		
		@Test(dependsOnMethods="FillRegistrationForm",description="Test to check if REsend Invite button works for the registered Global Admin")
		
		public void ResendInvite() throws IOException
		
		{
			
			String clientadmemail=null;			
			File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite33.xlsx");
			
			FileInputStream fis=new FileInputStream(src);
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.getSheet("Suite33");

			XSSFRow row4=sheet1.getRow(13);
			XSSFCell cell5=row4.getCell(4);
			
			clientadmemail=cell5.toString();

			//Go to Admin directory page
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a/span")).click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//Search for the Admin
			WebDriverWait wait21111 = new WebDriverWait(driver, 40);
			WebElement element21111 = wait21111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));

			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(clientadmemail);

			//Open the Admin profile page and verify all elements
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebDriverWait wait211111 = new WebDriverWait(driver, 40);
			WebElement element211111 = wait211111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")));

			driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Click on Resend Invite

			WebDriverWait wait2111111 = new WebDriverWait(driver, 40);
			WebElement element2111111 = wait2111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));

			//Verify and Assert if Global Admin is successfully registered
			
			String checkemail=driver.findElement(By.xpath("//*[@id=\"Email\"]")).getText();
			
			
			Assert.assertEquals(clientadmemail, checkemail);
			
			System.out.println("Global Admin is successfully registered");
			
			//Scroll down
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"lnkResentInvite\"]")).isEnabled());
			
			System.out.println("Resend Invite button is enabled");
			
			TakesScreenshot ts2111=(TakesScreenshot)driver;
			
			File source2111=ts2111.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source2111, new File("./Screenshots/Suite33/09ResendInviteButton.png"));
				
			System.out.println("Resend Invite button in the Admin profile page screenshot is taken");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.xpath("//*[@id=\"lnkResentInvite\"]")).click();

			
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			TakesScreenshot ts21111=(TakesScreenshot)driver;
			
			File source21111=ts21111.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source21111, new File("./Screenshots/Suite33/10ResendConfirmation.png"));
				
			System.out.println("Resend confirmation message screenshot is taken");
			
			//Click on close message box
			driver.findElement(By.xpath("//*[@id=\"bootstrap-alert-box-modal\"]/div/div/div[3]/a")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Click on cancel
			driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[10]/div/div[2]/button[1]")).click();

			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			
		}

		
		
		
		@Test(dependsOnMethods="ResendInvite",description="Signup in Clavin")
		
		public void RegisterAdminClavin() throws IOException
		
		{
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		driver1 =new ChromeDriver();
		
		
		String ccladmemail=null;
		String ccladmpwd=null;
		
		String clientadmemail=null;
		
		String clientadmpwd=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite33.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite33");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row4=sheet1.getRow(13);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row10=sheet1.getRow(32);
		XSSFCell cell11=row10.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		
		clientadmemail=cell5.toString();
	
		clientadmpwd=cell11.toString();
		
		//Open Clavin
		driver1.get("https://clavin-reporting-qa.ccl.org/Home/");
		driver1.manage().window().maximize();

		WebDriverWait wait211112 = new WebDriverWait(driver1, 40);
		WebElement element211112 = wait211112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"i0116\"]")));

		driver1.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys(ccladmemail);
		driver1.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();

		WebDriverWait wait2111112 = new WebDriverWait(driver1, 40);
		WebElement element2111112 = wait2111112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));

		driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys(ccladmemail);

		driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys(ccladmpwd);
		driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_SubmitButton\"]")).click();

		WebDriverWait wait1111112 = new WebDriverWait(driver1, 40);
		WebElement element111112 = wait1111112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idBtn_Back\"]")));

		driver1.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();
			
		WebDriverWait wait2221112 = new WebDriverWait(driver1, 40);
		WebElement element2221112 = wait2221112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarsExampleDefault\"]/ul/li[1]/a")));

		driver1.findElement(By.xpath("//*[@id=\"navbarsExampleDefault\"]/ul/li[1]/a")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebDriverWait wait21111112 = new WebDriverWait(driver1, 40);
		WebElement element21111112 = wait21111112.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div[3]/input")));

		driver1.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys(clientadmemail);

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebDriverWait wait2211112 = new WebDriverWait(driver1, 40);
		WebElement element2211112 = wait2211112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"search_task_table\"]/tbody/tr[1]/td[1]/a")));

		TakesScreenshot ts2111=(TakesScreenshot)driver;
		
		File source2111=ts2111.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source2111, new File("./Screenshots/Suite33/10AdminSignupMessages.png"));
			
		System.out.println("FordTest home page screenshot is taken");
		
		driver1.findElement(By.xpath("//*[@id=\"search_task_table\"]/tbody/tr[1]/td[1]/a")).click();

		//Click on view full message
		WebDriverWait wait21111111 = new WebDriverWait(driver1, 40);
		WebElement element21111111 = wait21111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"notification_content\"]/div/a")));
		driver1.findElement(By.xpath("//*[@id=\"notification_content\"]/div/a")).click();

		//Click on Sign up
		WebDriverWait wait2211111 = new WebDriverWait(driver1, 40);
		WebElement element2211111 = wait2211111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr/td/a/span/font")));
		driver1.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr/td/a/span/font")).click();

		//Enter password
		WebDriverWait wait211111111 = new WebDriverWait(driver1, 40);
		WebElement element211111111 = wait211111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr/td/a")));
		driver1.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr/td/a")).sendKeys(clientadmpwd);
		driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button/span")).click();
		
		
		
			
		
			
	}
	
	
	
	

}
	

