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

public class Suite25apoint1 {

	public static void main(String[] args) throws IOException {
		
		String ccladmemail=null;
		String ccladmpwd=null;
		
		String partemailadd=null;
		String phonenum=null;
		String assistantname=null;
		String assistantemail=null;
		String managername=null;
		String manageremail=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite25.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite25");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row2=sheet1.getRow(13);
		XSSFCell cell3=row2.getCell(4);
		
		XSSFRow row3=sheet1.getRow(29);
		XSSFCell cell4=row3.getCell(4);
		
		XSSFRow row4=sheet1.getRow(30);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(31);
		XSSFCell cell6=row5.getCell(4);
		
		XSSFRow row6=sheet1.getRow(32);
		XSSFCell cell7=row6.getCell(4);
		
		XSSFRow row7=sheet1.getRow(33);
		XSSFCell cell8=row7.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
	
		partemailadd=cell3.toString();
		
		phonenum=cell4.toString();
		assistantname=cell5.toString();
		assistantemail=cell6.toString();
		managername=cell7.toString();
		manageremail=cell8.toString();
		
		
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
		
		
		//Click on Integrated Coaching request in left panel
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[4]/a/span")).click();

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//Filter for stage Account set up started

		WebDriverWait wait21111 = new WebDriverWait(driver, 40);
		WebElement element21111 = wait21111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"IcrFilterDropdown\"]")));
		
		WebElement ICRStage_dropdown11=driver.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
		Select Stage_dd11=new Select(ICRStage_dropdown11);
		Stage_dd11.selectByIndex(1);		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//Search for the accepted invite
		
		WebDriverWait wait211111 = new WebDriverWait(driver, 40);
		WebElement element211111 = wait211111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div[3]/input")));

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div[3]/input")).sendKeys(partemailadd);

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//click on the participant edit form
		driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Close
		driver.findElement(By.xpath("//*[@id=\"form0\"]/div[5]/div/a")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		






//Go to Participant Roster page and make edits to complete participant profile

driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a/span")).click();
try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Search for registered ICR

driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys(partemailadd);
try {
	Thread.sleep(9000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebDriverWait wait6111611 = new WebDriverWait(driver, 40);
WebElement element6111611 = wait6111611.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[1]/a/div[2]")));
driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[1]/a/div[2]")).click();
try {
	Thread.sleep(8000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//enter phone number

driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys(phonenum);

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



//scroll down
JavascriptExecutor je1111 = (JavascriptExecutor)driver;
WebElement element111111111111 = driver.findElement(By.xpath("//*[@id=\"btnSaveCoacheeProfile\"]"));
je1111.executeScript("arguments[0].scrollIntoView(true);", element111111111111);

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Select Leadership level -LL3
driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[3]/div/a/span[1]")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"regAdmclientDataFields\"]/div[3]/div/a/ul/li[3]")).click();

//enter administrative assistant name and email
driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_0__ClientFieldValueText\"]")).sendKeys(assistantname);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_1__ClientFieldValueText\"]")).sendKeys(assistantemail);

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//enter manager name and email

driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_2__ClientFieldValueText\"]")).sendKeys(managername);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_3__ClientFieldValueText\"]")).sendKeys(manageremail);


try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Save
driver.findElement(By.xpath("//*[@id=\"btnSaveCoacheeProfile\"]")).click();















	}

}
