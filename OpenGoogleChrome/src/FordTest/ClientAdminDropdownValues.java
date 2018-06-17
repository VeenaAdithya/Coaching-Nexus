package FordTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientAdminDropdownValues {

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

		
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[5]/a/span")).click();

WebDriverWait wait11111 = new WebDriverWait(driver, 40);
wait11111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"ClientAdminId\"]")));

	driver.findElement(By.xpath("//*[@id=\"ClientAdminId\"]")).click();
	



	}

}
