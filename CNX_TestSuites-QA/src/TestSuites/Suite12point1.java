package TestSuites;
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

public class Suite12point1 {

	public static void main(String[] args) throws IOException {

		String ccladmemail=null;
		String ccladmpwd=null;
		
		String partemailadd=null;
		String partpwd=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite12.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite12point1");

		XSSFRow row=sheet1.getRow(1);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(2);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row4=sheet1.getRow(4);
		XSSFCell cell3=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(7);
		XSSFCell cell4=row5.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		
		partemailadd=cell3.toString();
		partpwd=cell4.toString();
		
		
		
		//Open Chrome and CNX QA
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();

				
		//Open Clavin
		driver.get("https://clavin-reporting-qa.ccl.org/Home/");
		driver.manage().window().maximize();
		
		WebDriverWait wait2111 = new WebDriverWait(driver, 40);
		WebElement element2111 = wait2111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"i0116\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys(ccladmemail);
		driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
		
		WebDriverWait wait21111 = new WebDriverWait(driver, 40);
		WebElement element21111 = wait21111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));

		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys(ccladmemail);

		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys(ccladmpwd);
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_SubmitButton\"]")).click();
		
		WebDriverWait wait111 = new WebDriverWait(driver, 40);
		WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idBtn_Back\"]")));

		driver.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();
			
		WebDriverWait wait222111 = new WebDriverWait(driver, 40);
		WebElement element222111 = wait222111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarsExampleDefault\"]/ul/li[1]/a")));

		driver.findElement(By.xpath("//*[@id=\"navbarsExampleDefault\"]/ul/li[1]/a")).click();


		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		WebDriverWait wait211111 = new WebDriverWait(driver, 40);
		WebElement element211111 = wait211111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div[3]/input")));

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys(partemailadd);

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebDriverWait wait2111111 = new WebDriverWait(driver, 40);
		WebElement element2111111 = wait2111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"search_task_table\"]/tbody/tr[1]/td[1]/a")));

		driver.findElement(By.xpath("//*[@id=\"search_task_table\"]/tbody/tr[1]/td[1]/a")).click();

		//Click on view full message

		WebDriverWait wait21111111 = new WebDriverWait(driver, 40);
		WebElement element21111111 = wait21111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"notification_content\"]/div/a")));

		driver.findElement(By.xpath("//*[@id=\"notification_content\"]/div/a")).click();

		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click on Sign up

		//Scroll down	
				JavascriptExecutor je11 = (JavascriptExecutor)driver;
				WebElement element111111 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr/td/a"));
				je11.executeScript("arguments[0].scrollIntoView(true);", element111111);
				
				
		WebDriverWait wait211111111 = new WebDriverWait(driver, 40);
		WebElement element211111111 = wait211111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr/td/a")));
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr/td/a")).click();
					
		//Enter password

		WebDriverWait wait2111111111 = new WebDriverWait(driver, 40);
		WebElement element2111111111 = wait2111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr/td/a")));
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr/td/a")).sendKeys(partpwd);

		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button/span")).click();
		


	}

}
