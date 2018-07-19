package testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suite12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open Chrome and CLient Admin Page
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://cclcoachingnexus-qa.ccl.org");
				driver.manage().window().maximize();
				
			WebDriverWait wait = new WebDriverWait(driver, 40);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
			
		//Enter Client Admin email address and password
			
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys("cclveenatest+clientadminqa1@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys("CNXT3$t3r");
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();
		
		
		//Go to CSR page
		
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")));
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Click on +New CSR
		WebDriverWait wait11 = new WebDriverWait(driver, 40);
		WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GridControls\"]/a")));
		driver.findElement(By.xpath("//*[@id=\"GridControls\"]/a")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Enter Field values
		//1- CSR first name, last name, Email address, Title 
		
		WebDriverWait wait111 = new WebDriverWait(driver, 40);
		WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("CSRFTPartQA7");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("CSRFTPartQA7");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("cclveenatest+CSRFTPartQA7@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Title\"]")).sendKeys("Manager");
	
		
		//Select language
		
		WebDriverWait wait1111 = new WebDriverWait(driver, 40);
		WebElement element1111 = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[4]/div[2]/span[1]/div/button")));
		driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[4]/div[2]/span[1]/div/button")).click();
		
		//Select English language
		JavascriptExecutor je1 = (JavascriptExecutor)driver;
		WebElement element11111 = driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[4]/div[2]/span[1]/div/ul/li[66]/a/label"));
		je1.executeScript("arguments[0].scrollIntoView(true);", element11111);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[4]/div[2]/span[1]/div/ul/li[66]/a/label")).click();
		
		//Scroll down
		JavascriptExecutor je11 = (JavascriptExecutor)driver;
		WebElement element111111 = driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[3]/div/div/input[1]"));
		je11.executeScript("arguments[0].scrollIntoView(true);", element111111);

		//Select Region Europe
		
		WebDriverWait wait11111 = new WebDriverWait(driver, 40);
		WebElement element1111111 = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")));
		driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[3]/a/label")).click();
		
		//Select Country field
		driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//Scroll down country values and select United Kingdom
		JavascriptExecutor je111 = (JavascriptExecutor)driver;
		WebElement element11111111 = driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[23]/a/label"));
		je111.executeScript("arguments[0].scrollIntoView(true);", element11111111);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[23]/a/label")).click();
				
		
		//Select Skill team (Sustainability, Env. and Safety Eng)
		
		driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor je1111 = (JavascriptExecutor)driver;
		WebElement element111111111 = driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[24]/a/label"));
		je1111.executeScript("arguments[0].scrollIntoView(true);", element111111111);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[24]/a/label")).click();
		
		//Select Leadership Level
		
		driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[2]/div/span[1]/div/button")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor je11111 = (JavascriptExecutor)driver;
		WebElement element1111111111 = driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[24]/a/label"));
		je11111.executeScript("arguments[0].scrollIntoView(true);", element1111111111);
		driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[2]/div/span[1]/div/ul/li[4]/a/label")).click();
		
		//Manager Email address and name
		
		driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_36\"]")).sendKeys("manager@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_35\"]")).sendKeys("Manager");
		
		//Select Finance Coordinator
		
		driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[2]/div[3]/span[1]/div/button")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor je111111 = (JavascriptExecutor)driver;
		WebElement element11111111111 = driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[2]/div[3]/span[1]/div/button"));
		je111111.executeScript("arguments[0].scrollIntoView(true);", element11111111111);
		driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[2]/div[3]/span[1]/div/ul/li[7]/a/label")).click();
		
		//Click on Next
		driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[3]/div/div/input[1]")).click();
		
		//Coaching needs tab
		WebDriverWait wait111111 = new WebDriverWait(driver, 40);
		WebElement element22 = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SurveyForm\"]/div[2]/div[1]/div[3]/label[1]/span")));
		driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[2]/div[1]/div[3]/label[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[2]/div[1]/div[4]/label[2]/span")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor je1111111 = (JavascriptExecutor)driver;
		WebElement element111111111111 = driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[3]/div[1]/div/input[1]"));
		je1111111.executeScript("arguments[0].scrollIntoView(true);", element111111111111);
		driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[3]/div[1]/div/input[1]")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait1111111 = new WebDriverWait(driver, 40);
		WebElement element221 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"SurveyForm\\\"]/div[4]/div[1]/div/input[2]")));
		driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[4]/div[1]/div/input[2]")).click();
		
		//Coaching and financial package tab
		//select date 		
		
		WebDriverWait wait11111111 = new WebDriverWait(driver, 40);
		WebElement element2211 = wait11111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FinanceInfoForm\"]/div[1]/div/div/label")));
		driver.findElement(By.xpath("//*[@id=\"FinanceInfoForm\"]/div[1]/div/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"FinanceInfoForm\"]/div[1]/div/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"FinanceInfoForm\"]/div[1]/div/div/label")).click();
		
		//Coaching options
		driver.findElement(By.xpath("//*[@id=\"FinanceInfoForm\"]/div[2]/div/label[2]/span[1]")).click();
		
		//Scroll down
		JavascriptExecutor je11111111 = (JavascriptExecutor)driver;
		WebElement element1111111111111 = driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/input[2]"));
		je11111111.executeScript("arguments[0].scrollIntoView(true);", element1111111111111);
		
		//Send values to fields Div, Acct., Dept., 
		
	driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_38\"]")).sendKeys("23");
	driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_39\"]")).sendKeys("876897");
	driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_40\"]")).sendKeys("8979");
	driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_41\"]")).sendKeys("3564");
	
	//Save
	
	driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/input[2]")).click();
	
	WebDriverWait wait111111111 = new WebDriverWait(driver, 40);
	WebElement element22111 = wait111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ActionButtons\"]/button[1]")));
	
	driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button[1]")).click();
	

		
		
		
		
		
		
		
	}

}
