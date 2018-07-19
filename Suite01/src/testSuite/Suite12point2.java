package testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suite12point2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open Chrome and Finance Coordinator Page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://cclcoachingnexus-qa.ccl.org");
		driver.manage().window().maximize();
		
	WebDriverWait wait = new WebDriverWait(driver, 40);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Finance Coordinator email address and password for set finance coordinator during registration in suite 12
	
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys("cclveenatest+ccladminfordtestfinancecoordinatorabqa1@gmail.com");
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys("CNXT3$t3r");
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

//Click on search button and paste email address passed as CSR email address registered in previous suite


WebDriverWait wait1111111 = new WebDriverWait(driver, 40);
WebElement element111111 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")));
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys("cclveenatest+CSRFTPartQA7@gmail.com");


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

driver.findElement(By.xpath("//*[@id=\"PONumber\"]")).sendKeys("872323");


//Click on Ready for Registration




		
	}

}
