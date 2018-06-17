package Test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\veenaramakrishnan\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://cclcoachingnexus-qa.ccl.org/FordTest/Account/Login");
		driver.manage().window().maximize();
		
		WebElement id = driver.findElement(By.name("username"));
        WebElement pass = driver.findElement(By.name("password"));
        WebElement button = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/form/div/div/button"));         

        id.sendKeys("tuser991@yahoo.co.in");
        pass.sendKeys("abc123");
        button.submit();
		
	}

}
