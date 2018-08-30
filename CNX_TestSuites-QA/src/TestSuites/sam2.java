package TestSuites;

import java.io.File;
import java.io.FileInputStream;
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
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class sam2 {

	WebDriver driver;
	WebDriver driver1;
	WebDriver driver11;
	WebDriver driver111;

	@BeforeClass(description="Open Browser")
	public void Start()
	{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				driver=new ChromeDriver();
				
				Reporter.log("----------------------||-Browser has started");
	
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

Reporter.log("----------------------||-HomePage is open");

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

File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

File screenshotName = new File ("C:\\Users\\veenaramakrishnan\\TestSuites\\Screenshots\\"+driver.getTitle()+".png");

FileUtils.copyFile(scrFile, screenshotName);


Reporter.log("<br><img src='"+screenshotName+"' height='475' width='900'/><br>");




Reporter.log("----------------------||-Home page screenshot is taken");

	}

}
