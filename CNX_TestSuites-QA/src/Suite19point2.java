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

public class Suite19point2 {

	public static void main(String[] args) throws IOException {
	

		String clientadm=null;
		String password=null;
		String csrpart=null;
		
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\Suite19.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite19point2");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row2=sheet1.getRow(8);
		XSSFCell cell3=row2.getCell(4);
		
		clientadm=cell1.toString();
		password=cell2.toString();
		csrpart=cell3.toString();
		
		
		//Open Chrome and CLient Admin Page
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://cclcoachingnexus-uat.ccl.org");
				driver.manage().window().maximize();
				
			WebDriverWait wait = new WebDriverWait(driver, 40);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
			
		//Enter Client Admin email address and password
			
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadm);
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();


		//Go to CSR page

		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")));

		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}

		
		//Click on search button and search for the newly registered CSR
		
		WebDriverWait wait11 = new WebDriverWait(driver, 40);
		WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")));

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys(csrpart);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}

		
		//Click on the CSR 
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		WebDriverWait wait111 = new WebDriverWait(driver, 40);
		WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr/td[1]/div/div[2]/a")));

		driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr/td[1]/div/div[2]/a")).click();
	
		//scroll down and find deactivate button and click
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		WebElement element22 = driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button[3]"));
		je.executeScript("arguments[0].scrollIntoView(true);", element22);
		
		driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button[3]")).click();
			
		//Yes deactivate
		WebDriverWait wait1111 = new WebDriverWait(driver, 40);
		WebElement element1111 = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ConfirmationButtons\"]/input")));
		driver.findElement(By.xpath("//*[@id=\"ConfirmationButtons\"]/input")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		//Navigate to Deactivate menu option
		
		driver.findElement(By.xpath("//*[@id=\"GridControls\"]/div[3]/label")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		//Navigate to ACtive CSR's
		driver.findElement(By.xpath("//*[@id=\"GridControls\"]/div[1]/label")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		
		
	}

}
