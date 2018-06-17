package Nike;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddParticipant {

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
	
driver.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[4]/label")).click();
driver.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

	WebDriverWait wait1111 = new WebDriverWait(driver, 40);
	wait1111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));

		
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[3]/a/span")).click();

	WebDriverWait wait11111 = new WebDriverWait(driver, 40);
	WebElement element1111 = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));

driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("FordTestPart1");
driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("PartCCLRegister");
driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("cclveenatest+FordTestPart1@gmail.com");
driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys("173687268287");
//driver.findElement(By.xpath("//*[@id=\"ClientAdminId\"]")).click();

WebElement client_dropdown=driver.findElement(By.xpath("//*[@id=\"ClientAdminId\"]"));
Select client_dd=new Select(client_dropdown);
client_dd.selectByIndex(13);

driver.findElement(By.xpath("//*[@id=\"PONumber\"]")).sendKeys("1736872682");
driver.findElement(By.xpath("//*[@id=\"divAssgnCP\"]/div[1]/label")).click();

JavascriptExecutor je = (JavascriptExecutor)driver;
WebElement element22 = driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[1]/div/a/span[1]"));
je.executeScript("arguments[0].scrollIntoView(true);", element22);

WebDriverWait wait23 = new WebDriverWait(driver, 40);
WebElement element23 = wait23.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[1]/div/a/span[1]")));

driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[1]/div/a/span[1]")).click();
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[1]/div/a/ul/li[3]")).click();

driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[2]/div/a/span[1]")).click();
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[2]/div/a/ul/li[4]")).click();

driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[3]/div/a/span[1]")).click();
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[3]/div/a/ul/li[2]")).click();

//WebDriverWait wait24 = new WebDriverWait(driver, 40);
//WebElement element24 = wait24.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"regAdmclientDataFields\\\"]/div[5]/div/a/span[1]")));
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[5]/div/a/span[1]")).click();
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[5]/div/a/ul/li[3]")).click();

//driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();




		
	}

}
