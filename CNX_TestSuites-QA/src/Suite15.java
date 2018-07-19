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

public class Suite15 {

	public static void main(String[] args) throws IOException {
		
		String ccladmemail=null;
		String ccladmpwd=null;
		String firstname=null;
		String lastname=null;
		String partemailadd=null;
		String phone=null;
		String ponum=null;
		String assistname=null;
		String assistemail=null;
		String managername=null;
		String manageremail=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite15.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite15");

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
		
		XSSFRow row6=sheet1.getRow(16);
		XSSFCell cell7=row6.getCell(4);
		
		XSSFRow row7=sheet1.getRow(22);
		XSSFCell cell8=row7.getCell(4);
		
		XSSFRow row8=sheet1.getRow(23);
		XSSFCell cell9=row8.getCell(4);
		
		XSSFRow row9=sheet1.getRow(24);
		XSSFCell cell10=row9.getCell(4);
		
		XSSFRow row10=sheet1.getRow(25);
		XSSFCell cell11=row10.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		firstname=cell3.toString();
		lastname=cell4.toString();
		partemailadd=cell5.toString();
		phone=cell6.toString();
		ponum=cell7.toString();
		assistname=cell8.toString();
		assistemail=cell9.toString();
		managername=cell10.toString();
		manageremail=cell11.toString();
		
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
		
	//Click on +Register -> Participant
		
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[5]/a/span")).click();

WebDriverWait wait24 = new WebDriverWait(driver, 40);
WebElement element24 = wait24.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(firstname);
driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(lastname);
driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(partemailadd);
driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys(phone);

//Select CLient Admin
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebElement client_dropdown=driver.findElement(By.xpath("//*[@id=\"ClientAdminId\"]"));
Select client_dd=new Select(client_dropdown);
client_dd.selectByIndex(1);

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"PONumber\"]")).sendKeys(ponum);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"divAssgnCP\"]/div[1]/label")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
JavascriptExecutor je = (JavascriptExecutor)driver;
WebElement element22 = driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[1]/div/a/span[1]"));
je.executeScript("arguments[0].scrollIntoView(true);", element22);

WebDriverWait wait23 = new WebDriverWait(driver, 40);
WebElement element23 = wait23.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[1]/div/a/span[1]")));

//Select Region(North America), skill team (Finance), Leadership level LL2

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[1]/div/a/span[1]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[1]/div/a/ul/li[3]")).click();

driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[2]/div/a/span[1]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[2]/div/a/ul/li[4]")).click();

driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[3]/div/a/span[1]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[3]/div/a/ul/li[2]")).click();

//Select country United States
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[5]/div/a/span[2]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[5]/div/a/ul/li[3]")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Enter administrative assistant name, email address, manager name, manager email address
driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_0__ClientFieldValueText\"]")).sendKeys(assistname);
driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_1__ClientFieldValueText\"]")).sendKeys(assistemail);
driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_2__ClientFieldValueText\"]")).sendKeys(managername);
driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_3__ClientFieldValueText\"]")).sendKeys(manageremail);


try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();


WebDriverWait wait22231 = new WebDriverWait(driver, 40);
WebElement element22231 = wait22231.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"registerCoachee\"]/div/div/div[1]/button/i")));
driver.findElement(By.xpath("//*[@id=\"registerCoachee\"]/div/div/div[1]/button/i")).click();

		//Click on Participant roster

	WebDriverWait wait2231 = new WebDriverWait(driver, 40);
	WebElement element2231 = wait2231.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[2]")));
		
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]")).click();
	
//Search in participant roster page
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	WebDriverWait wait22313 = new WebDriverWait(driver, 40);
	WebElement element22313 = wait22313.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a")));
	
	   driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a")).click();
		
		WebDriverWait wait231 = new WebDriverWait(driver, 40);
		WebElement element231 = wait231.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")));

	
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys(partemailadd);
		
		//Open Participant profile page
		
		WebDriverWait wait2311 = new WebDriverWait(driver, 40);
		WebElement element2311 = wait2311.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[1]/a/div[2]")));


		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[1]/a/div[2]")).click();
		
		//wait for page to open
		WebDriverWait wait23111 = new WebDriverWait(driver, 40);
		WebElement element23111 = wait23111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//Scroll down to see remove button
		JavascriptExecutor je1 = (JavascriptExecutor)driver;
		WebElement element11111 = driver.findElement(By.xpath("//*[@id=\"RemoveRegistrationButton\"]"));
		je1.executeScript("arguments[0].scrollIntoView(true);", element11111);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Remove Participant
		driver.findElement(By.xpath("//*[@id=\"RemoveRegistrationButton\"]")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebDriverWait wait231111 = new WebDriverWait(driver, 40);
		WebElement element231111 = wait231111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form0\"]/div[2]/div/input")));
		
		driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div/input")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
