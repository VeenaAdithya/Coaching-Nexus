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

public class Suite07 {

	public static void main(String[] args) throws IOException {
		String ccladmemail=null;
		String ccladmpwd=null;
		String note=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite07.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite07");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row2=sheet1.getRow(7);
		XSSFCell cell3=row2.getCell(4);
		
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		note=cell3.toString();
		
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
		
		
		
		//Go to ICR Page
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[4]/a")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//Select drop down value - Registered
		WebElement stage_dropdown=driver.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
		Select stage_dd=new Select(stage_dropdown);
		stage_dd.selectByIndex(3);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Scroll down and go to third page
		JavascriptExecutor je1111 = (JavascriptExecutor)driver;
		WebElement element11111111 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[2]/ul/li[4]/a"));
		je1111.executeScript("arguments[0].scrollIntoView(true);", element11111111);

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Go to page 3
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[2]/ul/li[4]/a")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//scroll down
		JavascriptExecutor jse1111 = (JavascriptExecutor)driver;
		jse1111.executeScript("scroll(0, 300);");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//scroll up
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("scroll(400, 0)");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click on first participants edit button
		driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//CLose box
		driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
		
		
		
		
		
		
		
		
		
		
		
		//Filter for stage Invitation sent
		
		WebElement stage_dropdown1=driver.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
		Select stage_dd1=new Select(stage_dropdown1);
		stage_dd1.selectByIndex(2);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Scroll down and go to third page
		JavascriptExecutor je11111 = (JavascriptExecutor)driver;
		WebElement element111111111 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[2]/ul/li[4]/a"));
		je11111.executeScript("arguments[0].scrollIntoView(true);", element111111111);

		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//scroll up
		JavascriptExecutor jse11 = (JavascriptExecutor)driver;
		jse11.executeScript("scroll(400, 0)");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click on first participants edit button
		driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//CLose box
		driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		//Select stage Expired
		
		WebElement stage_dropdown11=driver.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
		Select stage_dd11=new Select(stage_dropdown11);
		stage_dd11.selectByIndex(4);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Scroll down and go to third page
		JavascriptExecutor je111111 = (JavascriptExecutor)driver;
		WebElement element1111111111 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[2]/ul/li[5]/a"));
		je111111.executeScript("arguments[0].scrollIntoView(true);", element1111111111);

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Go to page 4
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[2]/ul/li[5]/a")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//scroll up
		JavascriptExecutor jse111 = (JavascriptExecutor)driver;
		jse111.executeScript("scroll(400, 0)");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click on first participants edit button
		driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//CLose box
		driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();

		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		//Select stage Account Setup started
		
		WebElement stage_dropdown111=driver.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
		Select stage_dd111=new Select(stage_dropdown111);
		stage_dd111.selectByIndex(1);
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click on first participants edit button
		driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//CLose box
		driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Registration form
		
		driver.findElement(By.xpath("//*[@id=\"NewIcrButton\"]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Country field
		driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")).click();
	
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Skill team field
		driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Program packages field
		driver.findElement(By.xpath("//*[@id=\"CoachingPackageId\"]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//close form
		driver.findElement(By.xpath("//*[@id=\"ICRInlineDetailForm\"]/table/tbody/tr/td[1]/a")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
