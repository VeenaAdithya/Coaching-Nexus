package testSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class Suite01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Open Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://cclcoachingnexus-qa.ccl.org");
		driver.manage().window().maximize();
		
	WebDriverWait wait = new WebDriverWait(driver, 40);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
	//Open CNX Login page
//driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).click();

driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys("RAMAKRISHNANV@ccl.org");

	WebDriverWait wait1 = new WebDriverWait(driver, 40);
	WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")));

	driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();
	
	//Send user name and pwd to login as CCL Admin
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys("RAMAKRISHNANV@ccl.org");
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys("0shor@CCL");
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_SubmitButton\"]")).click();



//Message popup "Stay Signed in?"

	WebDriverWait wait11 = new WebDriverWait(driver, 40);
	WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idBtn_Back\"]")));
	
	driver.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();

	//Login to home page and select client
	WebDriverWait wait111 = new WebDriverWait(driver, 40);
	WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")));
	
driver.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")).click();
driver.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

//Select client page has to close
	WebDriverWait wait1111 = new WebDriverWait(driver, 40);
	wait1111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));

	//Select Participant Roster page
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

	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[6]/a")).click();
		
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
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr[3]/td[2]/div/div[2]/a[2]/i")).click();
	
	
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
	
	//Close History page
	driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
	
	//Scroll to top of the page
	
	JavascriptExecutor je211 = (JavascriptExecutor)driver;
	WebElement element2411 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input"));
	je211.executeScript("arguments[0].scrollIntoView(true);", element2411);	
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Open Notes
	
	driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr[3]/td[2]/div/div[2]/a[3]/span")).click();
	
	JavascriptExecutor je212 = (JavascriptExecutor)driver;
	WebElement element212 = driver.findElement(By.xpath("//*[@id=\"newNoteTextArea\"]"));
	je212.executeScript("arguments[0].scrollIntoView(true);", element212);	
	
	driver.findElement(By.xpath("//*[@id=\"newNoteTextArea\"]")).sendKeys("Sample1");
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	driver.findElement(By.xpath("//*[@id=\"notesSubmitBtn\"]")).click();
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
	
//Note increment in message count	
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Open Notes
	
		driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr[3]/td[2]/div/div[2]/a[3]/span")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	//click remove	
	driver.findElement(By.xpath("//*[@id=\"notesList\"]/div[2]/h4/a/i")).click();
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	//Click confirm
	driver.findElement(By.xpath("//*[@id=\"notesList\"]/div[2]/h4/button[2]")).click();

	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	//Click Close

	driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
	
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	//Scroll down the page and select page 12
	
	JavascriptExecutor je2111 = (JavascriptExecutor)driver;
	WebElement element24111 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[8]/a"));
	je2111.executeScript("arguments[0].scrollIntoView(true);", element24111);	
		
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[8]/a")).click();
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	

	JavascriptExecutor je21111 = (JavascriptExecutor)driver;
	WebElement element241111 = driver.findElement(By.xpath("//*[@id=\"StageFilterDropdown\"]"));
	je21111.executeScript("arguments[0].scrollIntoView(true);", element241111);	
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//select drop down Invited stage
	WebElement stage_dropdown=driver.findElement(By.xpath("//*[@id=\"StageFilterDropdown\"]"));
	Select stage_dd=new Select(stage_dropdown);
	stage_dd.selectByIndex(2);
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	//scroll down and observe footer
	JavascriptExecutor je211111 = (JavascriptExecutor)driver;
	WebElement element2411111 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[2]/a"));
	je211111.executeScript("arguments[0].scrollIntoView(true);", element2411111);	
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	//Go to third page
	
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[4]/a")).click();
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//scroll up and select a participant
	
	JavascriptExecutor je2111111 = (JavascriptExecutor)driver;
	WebElement element24111111 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input"));
	je2111111.executeScript("arguments[0].scrollIntoView(true);", element24111111);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
