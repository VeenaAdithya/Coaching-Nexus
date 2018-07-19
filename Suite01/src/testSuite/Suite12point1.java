package testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suite12point1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open Chrome and CNX QA
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://cclcoachingnexus-qa.ccl.org");
		driver.manage().window().maximize();
		
	WebDriverWait wait = new WebDriverWait(driver, 40);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter CCL Admin email address and submit
	
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys("ramakrishnanv@ccl.org");

WebDriverWait wait1 = new WebDriverWait(driver, 40);
WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")));
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

WebDriverWait wait11 = new WebDriverWait(driver, 40);
WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));

driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys("RAMAKRISHNANV@ccl.org");
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys("0shor@CCL");
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

//Go to CSR page

WebDriverWait wait111111 = new WebDriverWait(driver, 40);
WebElement element11111 = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")));

driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Click on search button and paste email address passed as CSR email address registered in previous suite

driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys("cclveenatest+CSRFTPartQA7@gmail.com");
WebDriverWait wait1111111 = new WebDriverWait(driver, 40);
WebElement element111111 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr/td[1]/div/div[2]")));

driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr/td[1]/div/div[2]")).click();

//Navigate to button 'Submit to Client Admin'
WebDriverWait wait11111111 = new WebDriverWait(driver, 40);
WebElement element1111111 = wait11111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FinanceInfoForm\"]/div[2]/div/label[1]/span[1]")));

JavascriptExecutor je111 = (JavascriptExecutor)driver;
WebElement element11111111 = driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button[1]"));
je111.executeScript("arguments[0].scrollIntoView(true);", element11111111);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	


driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button[1]")).click();

//Click on 'Yes'
WebDriverWait wait111111111 = new WebDriverWait(driver, 40);
WebElement element111111111 = wait111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ConfirmationButtons\"]/input")));
driver.findElement(By.xpath("//*[@id=\"ConfirmationButtons\"]/input")).click();
		
//Log out of CNX as a CCL Admin
WebDriverWait wait1111111111 = new WebDriverWait(driver, 40);
WebElement element1111111111 = wait1111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")));
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();


		
	}

}
