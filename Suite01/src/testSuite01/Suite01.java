package testSuite01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suite01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://cclcoachingnexus-qa.ccl.org");
		driver.manage().window().maximize();
		
	WebDriverWait wait = new WebDriverWait(driver, 40);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginForm\"]/div/div/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/button/div[2]")));
	
driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/button/div[2]")).click();

driver.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("RAMAKRISHNANV@ccl.org");
driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();

	WebDriverWait wait1 = new WebDriverWait(driver, 40);
	WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));

driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys("RAMAKRISHNANV@ccl.org");
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys("0shor@CCL");
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_SubmitButton\"]")).click();

	WebDriverWait wait11 = new WebDriverWait(driver, 40);
	WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idBtn_Back\"]")));
	
driver.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();

	WebDriverWait wait111 = new WebDriverWait(driver, 40);
	WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")));
	
driver.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")).click();
driver.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

	WebDriverWait wait1111 = new WebDriverWait(driver, 40);
	wait1111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));

	driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a")).click();
	
	//Check Alphabetized view, wait
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Scroll down Participant Roster page
	JavascriptExecutor je = (JavascriptExecutor)driver;
	WebElement element22 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]"));
	je.executeScript("arguments[0].scrollIntoView(true);", element22);

	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Wait to get to next page - check footer display
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[6]/a")).click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Scroll up
	JavascriptExecutor je1 = (JavascriptExecutor)driver;
	WebElement element23 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input"));
	je1.executeScript("arguments[0].scrollIntoView(true);", element23);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr[3]/td[2]/div/div[2]/a[2]/i")).click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Scroll down, check footer
	JavascriptExecutor je2 = (JavascriptExecutor)driver;
	WebElement element24 = driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div[3]/div[1]/div[2]/div[4]/div[1]/span[1]"));
	je2.executeScript("arguments[0].scrollIntoView(true);", element24);
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Scroll up
	JavascriptExecutor je21 = (JavascriptExecutor)driver;
	WebElement element241 = driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div[2]/div[1]/div[2]/div[4]/div[2]/ul/li[3]/a"));
	je21.executeScript("arguments[0].scrollIntoView(true);", element241);	
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div[2]/div[1]/div[2]/div[4]/div[2]/ul/li[3]/a")).click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
	
	
	
	}

}
