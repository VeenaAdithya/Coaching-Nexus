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

public class Suite23 {

	public static void main(String[] args) throws IOException {
	
		
		String partemail=null;
		String password=null;
		String newpartemail=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\Suite23.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite23");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
	
		XSSFRow row2=sheet1.getRow(8);
		XSSFCell cell3=row2.getCell(4);
		
		partemail=cell1.toString();
		password=cell2.toString();
		newpartemail=cell3.toString();
		
		
		//Open Chrome and Participant page
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://cclcoachingnexus-qa.ccl.org");
				driver.manage().window().maximize();
				
			WebDriverWait wait = new WebDriverWait(driver, 40);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
			
		//Enter Participant email address and password
			
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(partemail);
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();
		
		WebDriverWait wait31 = new WebDriverWait(driver, 40);
		WebElement element31 = wait31.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Email\"]")));
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(newpartemail);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Scroll down and save
				JavascriptExecutor je = (JavascriptExecutor)driver;
				WebElement element22 = driver.findElement(By.xpath("//*[@id=\"btnSaveProfileInfo\"]"));
				je.executeScript("arguments[0].scrollIntoView(true);", element22);
				
				driver.findElement(By.xpath("//*[@id=\"btnSaveProfileInfo\"]")).click();
				try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//Scroll up
				JavascriptExecutor je1 = (JavascriptExecutor)driver;
				WebElement element221 = driver.findElement(By.xpath("//*[@id=\"divProfileInfo\"]/h1"));
				je1.executeScript("arguments[0].scrollIntoView(true);", element221);
				
				
		//Open Account settings page of participant
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement element3 = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a")));
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li/a/span[2]")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Check email address displayed in Support page
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")));
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"contactUs\"]/div/div/div[1]/div/button/span/i")).click();
		
		//Log out as participant
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebDriverWait wait11 = new WebDriverWait(driver, 40);
		WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a/span[2]")));
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a/span[2]")).click();
		
		//Log in again as the participant
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/p/a")).click();
		
		WebDriverWait wait111 = new WebDriverWait(driver, 40);
		WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
		
	//Enter Participant email address and password
		
	driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(partemail);
	driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();
		
	//Note email address displayed in profile page
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	//Open Account settings page of participant
			WebDriverWait wait311 = new WebDriverWait(driver, 40);
			WebElement element311 = wait311.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a")));
			driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a")).click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li/a/span[2]")).click();
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//Check email address displayed in Support page
			WebDriverWait wait1111 = new WebDriverWait(driver, 40);
			WebElement element1111 = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")));
			driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")).click();
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"contactUs\"]/div/div/div[1]/div/button/span/i")).click();
			
	
			
			
			
	
			
			
			
			
			
			
			
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
			
			//change email address back to original email address
			
			WebDriverWait wait431 = new WebDriverWait(driver, 40);
			WebElement element431 = wait431.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Email\"]")));
			driver.findElement(By.xpath("//*[@id=\"Email\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(partemail);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//Scroll down and save
					JavascriptExecutor je11 = (JavascriptExecutor)driver;
					WebElement element2211 = driver.findElement(By.xpath("//*[@id=\"btnSaveProfileInfo\"]"));
					je11.executeScript("arguments[0].scrollIntoView(true);", element2211);
					
					driver.findElement(By.xpath("//*[@id=\"btnSaveProfileInfo\"]")).click();
					try {
						Thread.sleep(7000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//Scroll up
					JavascriptExecutor je31 = (JavascriptExecutor)driver;
					WebElement element3221 = driver.findElement(By.xpath("//*[@id=\"divProfileInfo\"]/h1"));
					je31.executeScript("arguments[0].scrollIntoView(true);", element3221);
					
					
			//Open Account settings page of participant
			WebDriverWait wait33 = new WebDriverWait(driver, 40);
			WebElement element33 = wait33.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a")));
			driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a")).click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li/a/span[2]")).click();
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//Check email address displayed in Support page
			WebDriverWait wait41 = new WebDriverWait(driver, 40);
			WebElement element41 = wait41.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")));
			driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")).click();
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"contactUs\"]/div/div/div[1]/div/button/span/i")).click();
			
			//Log out as participant
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			WebDriverWait wait511 = new WebDriverWait(driver, 40);
			WebElement element511 = wait511.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a/span[2]")));
			driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a/span[2]")).click();
			
			//Log in again as the participant
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/p/a")).click();
			
			WebDriverWait wait6111 = new WebDriverWait(driver, 40);
			WebElement element6111 = wait6111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
			
		//Enter Participant email address and password
			
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(partemail);
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();
			
		//Note email address displayed in profile page
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Open Account settings page of participant
				WebDriverWait wait6311 = new WebDriverWait(driver, 40);
				WebElement element6311 = wait6311.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a")));
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li/a/span[2]")).click();
				try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//Check email address displayed in Support page
				WebDriverWait wait61111 = new WebDriverWait(driver, 40);
				WebElement element61111 = wait61111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")));
				driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")).click();
				try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"contactUs\"]/div/div/div[1]/div/button/span/i")).click();
		
				
				
				
				
				
	
		

	}

}
