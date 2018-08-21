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

public class Suite11bpoint1 {

	public static void main(String[] args) throws IOException {
	
		String clientadmemail=null;
		String clientadmpwd=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\UAT\\FordTest\\Suite11b.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite11b");
		
		XSSFRow row4=sheet1.getRow(13);
		XSSFCell cell5=row4.getCell(4);
	
		XSSFRow row10=sheet1.getRow(32);
		XSSFCell cell11=row10.getCell(4);
		
		clientadmemail=cell5.toString();
		clientadmpwd=cell11.toString();
			
		//Open Chrome and CNX QA
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://cclcoachingnexus-uat.ccl.org");
				driver.manage().window().maximize();
				
			WebDriverWait wait = new WebDriverWait(driver, 40);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

		//Log in as the client admin
			//Enter Client Admin email address and password
			
			driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
			driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
			driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();
	
	//Verify home page
			
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			
			
			//Click on +Register
			
			driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			//close
			driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
			
			//Go to Participant roster
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a")).click();
			
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			
			//scroll down and go to third page
			JavascriptExecutor je1 = (JavascriptExecutor)driver;
			WebElement element11111 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[4]/a"));
			je1.executeScript("arguments[0].scrollIntoView(true);", element11111);
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[4]/a")).click();
			
			//Scroll up and filter for 'Invited' participants
			
			JavascriptExecutor jse11 = (JavascriptExecutor)driver;
			jse11.executeScript("scroll(400, 0)");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement stage_dropdown11=driver.findElement(By.xpath("//*[@id=\"StageFilterDropdown\"]"));
		Select stage_dd11=new Select(stage_dropdown11);
		stage_dd11.selectByIndex(1);		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Scroll down to check count of invited participants
				JavascriptExecutor je211 = (JavascriptExecutor)driver;
				WebElement element211 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[2]/a"));
				je211.executeScript("arguments[0].scrollIntoView(true);", element211);
				
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			
			//scroll up
				JavascriptExecutor jse111 = (JavascriptExecutor)driver;
				jse111.executeScript("scroll(400, 0)");
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
				
				
				
				
				
				
				
				//Go to ICR page
				
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")).click();
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Verify +New ICR button
				WebDriverWait wait2 = new WebDriverWait(driver, 40);
				WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));
				
				driver.findElement(By.xpath("//*[@id=\"NewIcrButton\"]")).click();
				
				
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath("//*[@id=\"ICRInlineDetailForm\"]/table/tbody/tr/td[1]/a")).click();
				
				
				//Filter for 'Invitation sent' ICR registrations
				
				WebElement IntStage_dropdown=driver.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
				Select stage_dd=new Select(IntStage_dropdown);
				stage_dd.selectByIndex(2);	
				
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
			//Go to home page
				
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a/span")).click();
				
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			//Log out
				driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
				
				
				
			
			
			
			
			
			
		
		
		
		
		
		
		
		
	}

}
