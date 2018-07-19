import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suite11 {

	public static void main(String[] args) throws IOException {

		String ccladmemail=null;
		String ccladmpwd=null;
		String firstname=null;
		String lastname=null;
		String clientadmemail=null;
		String phone=null;
		String assistname=null;
		String assistemail=null;
		String managername=null;
		String manageremail=null;
		String clientadmpwd=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\Suite11.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite11");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row2=sheet1.getRow(11);
		XSSFCell cell3=row2.getCell(4);
		
		XSSFRow row3=sheet1.getRow(12);
		XSSFCell cell4=row3.getCell(4);
		
		XSSFRow row4=sheet1.getRow(13);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(14);
		XSSFCell cell6=row5.getCell(4);
		
		XSSFRow row6=sheet1.getRow(22);
		XSSFCell cell7=row6.getCell(4);
		
		XSSFRow row7=sheet1.getRow(23);
		XSSFCell cell8=row7.getCell(4);
		
		XSSFRow row8=sheet1.getRow(24);
		XSSFCell cell9=row8.getCell(4);
		
		XSSFRow row9=sheet1.getRow(25);
		XSSFCell cell10=row9.getCell(4);
		
		XSSFRow row10=sheet1.getRow(32);
		XSSFCell cell11=row10.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		firstname=cell3.toString();
		lastname=cell4.toString();
		clientadmemail=cell5.toString();
		phone=cell6.toString();
		assistname=cell7.toString();
		assistemail=cell8.toString();
		managername=cell9.toString();
		manageremail=cell10.toString();
		clientadmpwd=cell11.toString();
		
		
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
		
	//Click on +Register -> Admin
		
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[1]/a/span")).click();

WebDriverWait wait24 = new WebDriverWait(driver, 40);
WebElement element24 = wait24.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Enter field values in registration form - first name, last name, email address

driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(firstname);
driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(lastname);
driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(clientadmemail);

//Set data filters for the Client Admin (Select all)
//Skill team
driver.findElement(By.xpath("//*[@id=\"divRegisterAdmin\"]/div[2]/div[2]/span/div/button")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"divRegisterAdmin\"]/div[2]/div[2]/span/div/ul/li[1]/a/label")).click();
driver.findElement(By.xpath("//*[@id=\"divRegisterAdmin\"]/div[2]/div[2]/span/div/div")).click();

//Select campus - Greensboro
driver.findElement(By.xpath("//*[@id=\"divRegisterAdmin\"]/div[3]/div/div/a/span[2]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"divRegisterAdmin\"]/div[3]/div/div/a/ul/li[3]")).click();

//Enter phone number
driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys(phone);

//Select Region - Europe; Skill team
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[1]/div/a/span[2]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[1]/div/a/ul/li[2]")).click();
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[2]/div/a/span[2]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[2]/div/a/ul/li[22]")).click();

//Select leadership level
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[3]/div/a/span[2]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[3]/div/a/ul/li[3]")).click();

//Select Country
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[5]/div/a/span[2]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[5]/div/a/ul/li[22]")).click();

//Data filters: Country
driver.findElement(By.xpath("//*[@id=\"divRegisterAdmin\"]/div[2]/div[3]/span/div/button")).click();
driver.findElement(By.xpath("//*[@id=\"divRegisterAdmin\"]/div[2]/div[3]/span/div/ul/li[1]/a/label")).click();
driver.findElement(By.xpath("//*[@id=\"divRegisterAdmin\"]/div[2]/div[3]/span/div/div")).submit();


//Assistant email add and name
driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_0__ClientFieldValueText\"]")).sendKeys(assistname);
driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_1__ClientFieldValueText\"]")).sendKeys(assistemail);


//Manager name and email

driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_2__ClientFieldValueText\"]")).sendKeys(managername);
driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_3__ClientFieldValueText\"]")).sendKeys(manageremail);


//Save registration
driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//close registration email
WebDriverWait wait2111 = new WebDriverWait(driver, 40);
WebElement element2111 = wait2111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"registerAdmin\"]/div/div/div[1]/button/i")));

driver.findElement(By.xpath("//*[@id=\"registerAdmin\"]/div/div/div[1]/button/i")).submit();


	}

}
