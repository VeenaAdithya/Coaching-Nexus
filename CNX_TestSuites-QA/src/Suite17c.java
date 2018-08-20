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

public class Suite17c {

	public static void main(String[] args) throws IOException {
	
		
		String ccladmemail=null;
		String ccladmpwd=null;
		String clientadmemail=null;
		String clientadmpwd=null;
		
		
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite17.xlsx");
		
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
				driver.get("https://cclcoachingnexus-qa.ccl.org");
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
		
		
//Click on Skill team data filter
WebDriverWait wait331 = new WebDriverWait(driver, 40);
WebElement element331 = wait331.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")));
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")).click();

try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Unselect all and select only Finance

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[5]/a/label")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();
try {
	Thread.sleep(15000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



WebDriverWait wait511111 = new WebDriverWait(driver, 40);
wait511111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]")));



//OPen the admin profile again

WebDriverWait wait21111111 = new WebDriverWait(driver, 40);
WebElement element2111111 = wait21111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));

driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button/span")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
JavascriptExecutor je1 = (JavascriptExecutor)driver;
WebElement element211111 = driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[44]/a/label"));
je1.executeScript("arguments[0].scrollIntoView(true);", element211111);
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[44]/a/label")).click();
try {
	Thread.sleep(3000);
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
		WebDriver driver11 =new ChromeDriver();
		driver11.get("https://cclcoachingnexus-qa.ccl.org");
		driver11.manage().window().maximize();
		
	WebDriverWait wait2113 = new WebDriverWait(driver11, 40);
	WebElement element2113 = wait2113.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Client Admin email address and password
	
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();



try {
Thread.sleep(10000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Click on +Register button -> CSR

WebDriverWait wait221 = new WebDriverWait(driver11, 40);
WebElement element221 = wait221.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[1]/a/span")).click();
try {
	Thread.sleep(9000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on Skill team drop down and select finance

WebDriverWait wait2111 = new WebDriverWait(driver11, 40);
WebElement element2111 = wait2111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")));
driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[2]/a/label")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Click on Region drop down and select Europe

driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[2]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on country drop down and select UK

driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button/span")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[2]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Close registration form
driver11.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[3]/div/div/a")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Click on the 'i' button

driver11.findElement(By.xpath("//*[@id=\"GridControls\"]/span/a/span")).click();

try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver11.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}




//Register -> ICR
WebDriverWait wait552111 = new WebDriverWait(driver11, 40);
WebElement element552111 = wait552111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[2]/a/span")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on Skill team
WebDriverWait wait5521111 = new WebDriverWait(driver11, 40);
WebElement element5521111 = wait5521111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]")));

driver11.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]")).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Click on country dropdown
WebDriverWait wait55211 = new WebDriverWait(driver11, 40);
WebElement element55211 = wait55211.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")));

driver11.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")).click();

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Click on the 'i' button
WebDriverWait wait52211 = new WebDriverWait(driver11, 40);
WebElement element52211 = wait52211.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/span/a/span")));

driver11.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/span/a/span")).click();
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver11.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button")).click();
try {
Thread.sleep(6000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}



driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



driver11.quit();















//Back to page where we are logged in as CCL Admin

WebDriverWait wait31111111 = new WebDriverWait(driver, 40);
WebElement element3111111 = wait31111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));

driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Click on Skill team data filter
WebDriverWait wait3331 = new WebDriverWait(driver, 40);
WebElement element3331 = wait3331.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")));
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")).click();

try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();


try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();

//Click on country data filter
WebDriverWait wait33312 = new WebDriverWait(driver, 40);
WebElement element33312 = wait33312.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")));
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();

try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(1000);
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

























//Log in as Client admin to check updates
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver111 =new ChromeDriver();
		driver111.get("https://cclcoachingnexus-qa.ccl.org");
		driver111.manage().window().maximize();
		
	WebDriverWait wait21131 = new WebDriverWait(driver111, 40);
	WebElement element21131 = wait21131.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Client Admin email address and password
	
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();



try {
Thread.sleep(10000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Click on +Register button -> CSR

WebDriverWait wait2211 = new WebDriverWait(driver111, 40);
WebElement element2211 = wait2211.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();

try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[1]/a/span")).click();
try {
	Thread.sleep(9000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on Skill team drop down and select finance

WebDriverWait wait21111 = new WebDriverWait(driver111, 40);
WebElement element21111 = wait21111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")));
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")).click();

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[5]/a/label")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Click on Region drop down and select AsiaPacific

driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[2]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on country drop down and select Australia

driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button/span")).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[3]/a/label")).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Close registration form
driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[3]/div/div/a")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Click on the 'i' button

driver111.findElement(By.xpath("//*[@id=\"GridControls\"]/span/a/span")).click();

try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver111.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}





//Register -> ICR
WebDriverWait wait5521116 = new WebDriverWait(driver111, 40);
WebElement element5521116 = wait5521116.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[2]/a/span")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on Skill team
WebDriverWait wait55211116 = new WebDriverWait(driver111, 40);
WebElement element55211116 = wait55211116.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]")));

driver111.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]")).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Click on country dropdown
WebDriverWait wait552116 = new WebDriverWait(driver111, 40);
WebElement element552116 = wait552116.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")));

driver111.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")).click();

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Click on the 'i' button
WebDriverWait wait522116 = new WebDriverWait(driver111, 40);
WebElement element522116 = wait522116.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/span/a/span")));

driver111.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/span/a/span")).click();
try {
Thread.sleep(4000);
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








driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}




















driver111.quit();















































	}
}









