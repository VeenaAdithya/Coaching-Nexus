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
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suite01 {

	public static void main(String[] args) throws IOException {
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
		
	
		


		
		
		
		
		//Click on +Register -> Must display 3 values
		
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
				
				try {
					Thread.sleep(7000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
			

				//Click on Account settings
	
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();
				
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li[1]/a/span[2]")).click();
				
				WebDriverWait wait21111 = new WebDriverWait(driver, 40);
				WebElement element21111 = wait21111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));
				
				try {
					Thread.sleep(7000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}
				
				//Close page
				driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();

				try {
					Thread.sleep(7000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}
				//Click on Change client page
				WebDriverWait wait221111 = new WebDriverWait(driver, 40);
				WebElement element221111 = wait221111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")));
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();
				try {
					Thread.sleep(4000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}
				
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li[3]/a")).click();
				try {
					Thread.sleep(4000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}

				
				
				
				
				//Select Nike client
				WebDriverWait wait2 = new WebDriverWait(driver, 40);
				WebElement element2= wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divChangeClient\"]/div[4]/label/span")));

				driver.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[4]/label/span")).click();
				driver.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

				WebDriverWait wait21 = new WebDriverWait(driver, 40);
				wait21.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));

				
				
				
				
				
				
				try {
					Thread.sleep(6000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//Click on Support
				
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[4]/a")).click();
				WebDriverWait wait22 = new WebDriverWait(driver, 40);
				WebElement element22= wait22.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Fname\"]")));
				
				try {
					Thread.sleep(6000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}	
			
				
				driver.findElement(By.xpath("//*[@id=\"contactUs\"]/div/div/div[1]/button/span/i")).click();
				
				
				//Click on Admin name

				try {
					Thread.sleep(6000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}	
				WebDriverWait wait222 = new WebDriverWait(driver, 40);
				WebElement element222= wait222.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")));
						
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();
						try {
							Thread.sleep(7000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}
						
						//Click on Account settings
						
						driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li[1]/a/span[2]")).click();
						
						WebDriverWait wait211112 = new WebDriverWait(driver, 40);
						WebElement element211112 = wait211112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));
									
						
						try {
							Thread.sleep(7000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}
						
						//Close page
						driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();

						try {
							Thread.sleep(6000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}	
						//Click on Change client page
						WebDriverWait wait211111 = new WebDriverWait(driver, 40);
						WebElement element211111 = wait211111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")));
						driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();
						try {
							Thread.sleep(4000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}
						driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li[3]/a")).click();
						try {
							Thread.sleep(4000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}

						
						
						
						
						//Select Ford test client
						WebDriverWait wait211 = new WebDriverWait(driver, 40);
						WebElement element21= wait211.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")));

						driver.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")).click();
						driver.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

						WebDriverWait wait2111 = new WebDriverWait(driver, 40);
						wait2111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));
				
				
						
						//Click on Data Maintanance
						//driver.findElement(By.xpath("//*[@id=\"dataMaintenance\"]/a/span[2]")).click();
						
						
						//Click on Support
						
						driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[4]/a")).click();
						WebDriverWait wait221 = new WebDriverWait(driver, 40);
						WebElement element221= wait221.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Fname\"]")));

						
						try {
							Thread.sleep(6000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}	
						
						driver.findElement(By.xpath("//*[@id=\"contactUs\"]/div/div/div[1]/button/span/i")).click();
						
						try {
							Thread.sleep(6000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}	
						
					
				//Click on Log out
						
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
				
				try {
					Thread.sleep(6000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}	
				
				
				
				
				

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
