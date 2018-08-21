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

public class Suite17b {

	public static void main(String[] args) throws IOException {

		String ccladmemail=null;
		String ccladmpwd=null;
		String clientadmemail=null;
		String clientadmpwd=null;
		
		
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\UAT\\FordTest\\Suite17.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite17");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row2=sheet1.getRow(9);
		XSSFCell cell3=row2.getCell(4);
		
		XSSFRow row3=sheet1.getRow(13);
		XSSFCell cell4=row3.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		clientadmemail=cell3.toString();
		clientadmpwd=cell4.toString();
		
		
		//Open Chrome and CNX QA
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://cclcoachingnexus-uat.ccl.org");
				driver.manage().window().maximize();
				
			WebDriverWait wait = new WebDriverWait(driver, 40);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
			
		//Enter CCL Admin email address and submit
			
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(ccladmemail);

		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")));
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

		WebDriverWait wait11 = new WebDriverWait(driver, 40);
		WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));

		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys(ccladmemail);
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys(ccladmpwd);
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
		
		//Go to Admin directory page
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Search for a client admin you want to check data filters set in CSR registration form
		WebDriverWait wait111111 = new WebDriverWait(driver, 40);
		WebElement element11111 = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(clientadmemail);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait1111111 = new WebDriverWait(driver, 40);
		WebElement element111111 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
		
		driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
		
		//Click on country data filter
		WebDriverWait wait11111111 = new WebDriverWait(driver, 40);
		WebElement element1111111 = wait11111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button/span")));
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button/span")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[2]/a/label")).click();
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[3]/a/label")).click();
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[4]/a/label")).click();
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[5]/a/label")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[6]/a/label")).click();
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[7]/a/label")).click();
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[8]/a/label")).click();
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[10]/a/label")).click();
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[11]/a/label")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[9]/a/label")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[23]/a/label")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[45]/a/label")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Save changes made to country filter
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//Log in as Client admin
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://cclcoachingnexus-uat.ccl.org");
		driver1.manage().window().maximize();
		
	WebDriverWait wait2 = new WebDriverWait(driver1, 40);
	WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Client Admin email address and password
	
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();


//Click on +Register button -> CSR

WebDriverWait wait21 = new WebDriverWait(driver1, 40);
WebElement element21 = wait21.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();

try {
Thread.sleep(3000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[1]/a/span")).click();
try {
Thread.sleep(10000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}		


//Ensure Region North America is not displayed

WebDriverWait wait211 = new WebDriverWait(driver1, 40);
WebElement element211 = wait211.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")));

driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();

//Select region Asia Pacific
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[2]/a/label")).click();

//click on country dropdown-Ensure China is not displayed
driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Select India
driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[3]/a/label")).click();



//Select Region - Europe

driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[3]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//click on country dropdown-Ensure Austria and Belgium is not displayed

driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Select United Kingdom
JavascriptExecutor je111 = (JavascriptExecutor)driver1;
WebElement element11111111 = driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[20]/a/label"));
je111.executeScript("arguments[0].scrollIntoView(true);", element11111111);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[20]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Select Region - South America

driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[5]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//click on country dropdown-Ensure Argentina, Brazil are not displayed
driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Select Venezuela
driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[3]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Close CSR registration form
driver1.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[3]/div/div/a")).click();

try {
	Thread.sleep(8000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on the 'i' button
WebDriverWait wait5221 = new WebDriverWait(driver1, 40);
WebElement element5221 = wait5221.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/span/a/span")));

driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/span/a/span")).click();
try {
Thread.sleep(8000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver1.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button")).click();
try {
Thread.sleep(4000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}







//Register -> ICR
WebDriverWait wait5521 = new WebDriverWait(driver1, 40);
WebElement element5521 = wait5521.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[2]/a/span")).click();

//Click on country dropdown
WebDriverWait wait55211 = new WebDriverWait(driver1, 40);
WebElement element55211 = wait55211.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")));

driver1.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")).click();

try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Click on the 'i' button
WebDriverWait wait52211 = new WebDriverWait(driver1, 40);
WebElement element52211 = wait52211.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/span/a/span")));

driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/span/a/span")).click();
try {
Thread.sleep(8000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver1.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button")).click();
try {
Thread.sleep(6000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}




driver1.quit();





try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}






















//Log in again as CCL Admin and reset data filters to 'select all'

//Open Client admin profile page as a CCL Admin

driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();

//Click on country data filter
WebDriverWait wait3331 = new WebDriverWait(driver, 40);
WebElement element3331 = wait3331.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")));
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();


try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



















//Log in as Client admin to check updates to skill team filter
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver111 =new ChromeDriver();
		driver111.get("https://cclcoachingnexus-uat.ccl.org");
		driver111.manage().window().maximize();
		
	WebDriverWait wait52113 = new WebDriverWait(driver111, 40);
	WebElement element52113 = wait52113.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Client Admin email address and password
	
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();


//Click on +Register button -> CSR

WebDriverWait wait52217 = new WebDriverWait(driver111, 40);
WebElement element52217 = wait52217.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();

try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[1]/a/span")).click();
		


//Ensure Region North America is displayed

WebDriverWait wait2111 = new WebDriverWait(driver111, 40);
WebElement element2111 = wait2111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")));

driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();

//Select region Asia Pacific
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[2]/a/label")).click();

//click on country dropdown-Ensure China is displayed
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Select India
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[3]/a/label")).click();



//Select Region - Europe

driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[3]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//click on country dropdown-Ensure Austria and Belgium are displayed

driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Select United Kingdom
JavascriptExecutor je1111 = (JavascriptExecutor)driver111;
WebElement element111111111 = driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[22]/a/label"));
je1111.executeScript("arguments[0].scrollIntoView(true);", element111111111);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[22]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Select Region - North America

driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[4]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//click on country dropdown
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Select country
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[3]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Close CSR registration form
driver111.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Click on the 'i' button
WebDriverWait wait52216 = new WebDriverWait(driver111, 40);
WebElement element52216 = wait52216.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/span/a/span")));

driver111.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/span/a/span")).click();
try {
Thread.sleep(8000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver111.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button")).click();
try {
Thread.sleep(6000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}















try {
	Thread.sleep(8000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}









//Register -> ICR
WebDriverWait wait55211111 = new WebDriverWait(driver111, 40);
WebElement element55211111 = wait55211111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[2]/a/span")).click();
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on Country
WebDriverWait wait552111111 = new WebDriverWait(driver111, 40);
WebElement element552111111 = wait552111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")));
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver111.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")).click();
try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


driver111.findElement(By.xpath("//*[@id=\"ICRInlineDetailForm\"]/table/tbody/tr/td[1]/a")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Click on the 'i' button
WebDriverWait wait522118 = new WebDriverWait(driver111, 40);
WebElement element522118 = wait522118.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/span/a/span")));

driver111.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/span/a/span")).click();
try {
Thread.sleep(8000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver111.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button")).click();
try {
Thread.sleep(6000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}






driver111.quit();




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
