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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Suite01 {

	WebDriver driver;
	

	@BeforeClass(description="Open Browser")
	public void Start()
	{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				driver=new ChromeDriver();
				
				System.out.println("Browser has started");
	
	}
	

	
	@Test(description="Login")
				
	public void Login() throws IOException
				
	{

		String ccladmemail=null;
		String ccladmpwd=null;
					
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite01.xlsx");
					
		FileInputStream fis=new FileInputStream(src);
					
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite01");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
					
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
					
		XSSFRow row2=sheet1.getRow(7);
		XSSFCell cell3=row2.getCell(4);
									
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		

		driver.get("https://cclcoachingnexus-qa.ccl.org");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).isEnabled());
		
		System.out.println("Log in page is open");
		
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

		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")).isEnabled());
		
		System.out.println("Select Client page is available");
			
		driver.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).isEnabled());
		
		System.out.println("Client is selected");
		
		WebDriverWait wait11111 = new WebDriverWait(driver, 40);
		wait11111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));
		
	}	


		
	@Test(dependsOnMethods="Login",description="Verify top navigation buttons")	
		public void VerifyRegisterButton() throws IOException
		{
		//Click on +Register -> Must display 3 values
		
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
				
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).isEnabled());
				
				System.out.println("Register button is available");
				
				TakesScreenshot ts=(TakesScreenshot)driver;
				
				File source=ts.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(source, new File("./Screenshots/Suite01/01RegisterButton.png"));
					
				System.out.println("Register button drop-down screenshot is taken");
				
				try {
					Thread.sleep(2000);
					} catch (InterruptedException e) {
					e.printStackTrace();
					}
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
				try {
					Thread.sleep(2000);
					} catch (InterruptedException e) {
					e.printStackTrace();
					}
				
				//Click on Account settings
				
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();
				
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li[1]/a/span[2]")).click();
				
				
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li[1]/a/span[2]")).isEnabled());
				
				System.out.println("Account settings button is available");
				
				WebDriverWait wait21111 = new WebDriverWait(driver, 40);
				WebElement element21111 = wait21111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));
				
				try {
					Thread.sleep(4000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}
				
				TakesScreenshot ts1=(TakesScreenshot)driver;
				
				File source1=ts1.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(source1, new File("./Screenshots/Suite01/02AccountSettingsPage.png"));
					
				System.out.println("Account settings page screenshot is taken");
				
				
				
				//Close page
				driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();

				try {
					Thread.sleep(3000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}
				
				
				//Click on Change client page
				WebDriverWait wait221111 = new WebDriverWait(driver, 40);
				WebElement element221111 = wait221111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")));
				
				
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();
				
				try {
					Thread.sleep(2000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li[3]/a")).isEnabled());
				
				System.out.println("Change Client button is available");
				
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li[3]/a")).click();
				
				
				try {
					Thread.sleep(2000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}

				//Select Nike client
				WebDriverWait wait2 = new WebDriverWait(driver, 40);
				WebElement element2= wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divChangeClient\"]/div[4]/label/span")));

				Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[4]/label/span")).isEnabled());
				
				System.out.println("Different Client is selected");
				
				driver.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[4]/label/span")).click();
				
				TakesScreenshot ts11=(TakesScreenshot)driver;
				
				File source11=ts11.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(source11, new File("./Screenshots/Suite01/03DifferentClientSelected.png"));
					
				System.out.println("Change client page screenshot is taken");
				
				driver.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

				
				WebDriverWait wait21 = new WebDriverWait(driver, 40);
				wait21.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));
				
				try {
					Thread.sleep(3000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}	
				TakesScreenshot ts111=(TakesScreenshot)driver;
				
				File source111=ts111.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(source111, new File("./Screenshots/Suite01/04NikeHomepage.png"));
					
				System.out.println("Nike home page screenshot is taken");
				
				
				//Click on Support
				
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[4]/a")).isEnabled());
				
				System.out.println("Support button is available");
				
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[4]/a")).click();
				
				WebDriverWait wait22 = new WebDriverWait(driver, 40);
				WebElement element22= wait22.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Fname\"]")));
				
				try {
					Thread.sleep(2000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}	
			
				TakesScreenshot ts1111=(TakesScreenshot)driver;
				
				File source1111=ts1111.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(source1111, new File("./Screenshots/Suite01/05NikeSupportpage.png"));
					
				System.out.println("Support page screenshot is taken");
				
				driver.findElement(By.xpath("//*[@id=\"contactUs\"]/div/div/div[1]/button/span/i")).click();
				try {
					Thread.sleep(2000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}	
		
				//Click on +Register -> Must display 2 values
				
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
				
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).isEnabled());
				
				System.out.println("Register button is available");
				
				TakesScreenshot ts11111=(TakesScreenshot)driver;
				
				File source11111=ts11111.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(source11111, new File("./Screenshots/Suite01/06RegisterButtonNike.png"));
					
				System.out.println("Register button drop-down screenshot is taken");
				
				try {
					Thread.sleep(2000);
					} catch (InterruptedException e) {
					e.printStackTrace();
					}
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
				try {
					Thread.sleep(2000);
					} catch (InterruptedException e) {
					e.printStackTrace();
					}
				
				
				//Click on Admin name

				try {
					Thread.sleep(2000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}	
				WebDriverWait wait222 = new WebDriverWait(driver, 40);
				WebElement element222= wait222.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")));
						
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();
				try {
					Thread.sleep(1000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}
				
				TakesScreenshot ts111111=(TakesScreenshot)driver;
				
				File source111111=ts111111.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(source111111, new File("./Screenshots/Suite01/07AdminNameDropdown.png"));
					
				System.out.println("Admin name button drop-down screenshot is taken");
				
						try {
							Thread.sleep(1000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}
						
						//Click on Account settings

						driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li[1]/a/span[2]")).click();
						
						Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li[1]/a/span[2]")).isEnabled());
						
						System.out.println("Account settings button is available");
						
						WebDriverWait wait2111 = new WebDriverWait(driver, 40);
						WebElement element2111 = wait2111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));
						
						try {
							Thread.sleep(2000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}
						
						TakesScreenshot ts1111111=(TakesScreenshot)driver;
						
						File source1111111=ts1111111.getScreenshotAs(OutputType.FILE);
						
						FileUtils.copyFile(source1111111, new File("./Screenshots/Suite01/08NikeAccountSettingsPage.png"));
							
						System.out.println("Account settings page screenshot is taken");
								
												
						//Close page
						driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();

						try {
							Thread.sleep(3000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}

						//Click on Change client page
						WebDriverWait wait2211112 = new WebDriverWait(driver, 40);
						WebElement element2211112 = wait2211112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")));
						
						
						driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();
						
						try {
							Thread.sleep(2000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}
						Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li[3]/a")).isEnabled());
						
						System.out.println("Change Client button is available");
						
						driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li[3]/a")).click();
						
						
						try {
							Thread.sleep(2000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}						
						
						
						//Select Ford test client
						WebDriverWait wait211 = new WebDriverWait(driver, 40);
						WebElement element21= wait211.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")));
						
						Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label/span")).isEnabled());
						
						System.out.println("FordTest Client is available");
						
						driver.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")).click();
				
						TakesScreenshot ts211=(TakesScreenshot)driver;
						
						File source211=ts211.getScreenshotAs(OutputType.FILE);
						
						FileUtils.copyFile(source211, new File("./Screenshots/Suite01/09FordTestClientSelected.png"));
							
						System.out.println("Change client page screenshot is taken");
						
						driver.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

						WebDriverWait wait21112 = new WebDriverWait(driver, 40);
						wait21112.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));
				
						TakesScreenshot ts2111=(TakesScreenshot)driver;
						
						File source2111=ts2111.getScreenshotAs(OutputType.FILE);
						
						FileUtils.copyFile(source2111, new File("./Screenshots/Suite01/10FordtestHomepage.png"));
							
						System.out.println("FordTest home page screenshot is taken");
						
						
						//Click on Support
						
						Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[4]/a")).isEnabled());
						
						System.out.println("Support button is available");
						
						driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[4]/a")).click();
						
						WebDriverWait wait221 = new WebDriverWait(driver, 40);
						WebElement element221= wait221.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Fname\"]")));


						try {
							Thread.sleep(2000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}	
						
						
						TakesScreenshot ts11111111=(TakesScreenshot)driver;
						
						File source11111111=ts11111111.getScreenshotAs(OutputType.FILE);
						
						FileUtils.copyFile(source11111111, new File("./Screenshots/Suite01/11SupportPage.png"));
							
						System.out.println("Support page screenshot is taken");
						
						
						driver.findElement(By.xpath("//*[@id=\"contactUs\"]/div/div/div[1]/button/span/i")).click();
						
						try {
							Thread.sleep(2000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}	
						
		}
	
	@AfterClass(description="Verify logout")
	
	public void Logout() throws IOException
	
	{
				//Click on Log out
						
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
				
				try {
					Thread.sleep(4000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}	
				TakesScreenshot ts11111111=(TakesScreenshot)driver;
				
				File source11111111=ts11111111.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(source11111111, new File("./Screenshots/Suite01/12LogoutPage.png"));
					
				System.out.println("Logout page screenshot is taken");
				
				
				driver.quit();
				
			
		}
	
	
	
	
	
	
	
	
}
