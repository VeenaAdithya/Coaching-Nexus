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

public class Suite12point3 {

	public static void main(String[] args) throws IOException {
		
		String fincoordemail=null;
		String fincoordpwd=null;
		String csrpartemail=null;
		String ponum=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\Suite12.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite12point3");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row2=sheet1.getRow(7);
		XSSFCell cell3=row2.getCell(4);
		
		XSSFRow row3=sheet1.getRow(9);
		XSSFCell cell4=row3.getCell(4);
		
		fincoordemail=cell1.toString();
		fincoordpwd=cell2.toString();
		csrpartemail=cell3.toString();
		ponum=cell4.toString();
		
		//Open Chrome and Finance Coordinator Page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://cclcoachingnexus-qa.ccl.org");
		driver.manage().window().maximize();
		
	WebDriverWait wait = new WebDriverWait(driver, 40);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Finance Coordinator email address and password for set finance coordinator during registration in suite 12
	
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(fincoordemail);
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(fincoordpwd);
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

//Click on search button and paste email address passed as CSR email address registered in previous suite


WebDriverWait wait1111111 = new WebDriverWait(driver, 40);
WebElement element111111 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")));
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys(csrpartemail);


WebDriverWait wait11111111 = new WebDriverWait(driver, 40);
WebElement element1111111 = wait11111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr/td[1]/div/div[2]")));

driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr/td[1]/div/div[2]")).click();
		

//Wait for CSR registration page to open
WebDriverWait wait111111111 = new WebDriverWait(driver, 40);
WebElement element11111111 = wait111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[3]/form/div[2]/div/label[1]")));

//Scroll down, Click on PO num, and pass data
JavascriptExecutor je111 = (JavascriptExecutor)driver;
WebElement element111111111 = driver.findElement(By.xpath("//*[@id=\"PONumber\"]"));
je111.executeScript("arguments[0].scrollIntoView(true);", element111111111);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	

driver.findElement(By.xpath("//*[@id=\"PONumber\"]")).sendKeys(ponum);


//Click on Ready for Registration






	}

}
