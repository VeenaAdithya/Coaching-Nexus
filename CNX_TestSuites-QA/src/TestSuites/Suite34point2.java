package TestSuites;
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

public class Suite34point2 {

	public static void main(String[] args) throws IOException {
		
		String partemail=null;
		String password=null;
		String answer1=null;
		String answer2=null;
		String answer3=null;
		String answer4=null;
		String answer5=null;
		String answer6=null;
		String answer7=null;
		String answer8=null;
		
		
		String ccladmemail=null;
		String ccladmpwd=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite34.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite34point2");

		XSSFRow row=sheet1.getRow(4);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(7);
		XSSFCell cell2=row1.getCell(4);
		
		
		
		XSSFRow row2=sheet1.getRow(9);
		XSSFCell cell3=row2.getCell(4);
		
		XSSFRow row3=sheet1.getRow(10);
		XSSFCell cell4=row3.getCell(4);
		
		XSSFRow row4=sheet1.getRow(11);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(12);
		XSSFCell cell6=row5.getCell(4);
		
		XSSFRow row6=sheet1.getRow(13);
		XSSFCell cell7=row6.getCell(4);
		
		XSSFRow row7=sheet1.getRow(14);
		XSSFCell cell8=row7.getCell(4);
		
		XSSFRow row8=sheet1.getRow(15);
		XSSFCell cell9=row8.getCell(4);
		
		XSSFRow row9=sheet1.getRow(16);
		XSSFCell cell10=row9.getCell(4);
		
		XSSFRow row10=sheet1.getRow(17);
		XSSFCell cell11=row10.getCell(4);
		
		XSSFRow row11=sheet1.getRow(18);
		XSSFCell cell12=row11.getCell(4);
		
		partemail=cell1.toString();
		password=cell2.toString();
		
		
		answer1=cell3.toString();
		answer2=cell4.toString();
		answer3=cell5.toString();
		answer4=cell6.toString();
		answer5=cell7.toString();
		answer6=cell8.toString();
		answer7=cell9.toString();
		answer8=cell10.toString();
		
		ccladmemail=cell11.toString();
		ccladmpwd=cell12.toString();
		
		
		//Open Chrome and Participant Page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://cclcoachingnexus-qa.ccl.org");
		driver.manage().window().maximize();
		
	WebDriverWait wait = new WebDriverWait(driver, 40);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Participants email address and password
	
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(partemail);
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(password);
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

		
	
try {
	Thread.sleep(8000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
WebDriverWait wait2 = new WebDriverWait(driver, 40);
WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));




//Scroll down and click on SAVE
JavascriptExecutor je = (JavascriptExecutor)driver;
WebElement element1 = driver.findElement(By.xpath("//*[@id=\"btnSaveProfileInfo\"]"));
je.executeScript("arguments[0].scrollIntoView(true);", element1);
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"btnSaveProfileInfo\"]")).click();

try {
	Thread.sleep(8000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Scroll down and click on Start survey
JavascriptExecutor je1 = (JavascriptExecutor)driver;
WebElement element11 = driver.findElement(By.xpath("//*[@id=\"StartSurveyLink\"]"));
je1.executeScript("arguments[0].scrollIntoView(true);", element11);
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
driver.findElement(By.xpath("//*[@id=\"StartSurveyLink\"]")).click();


try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	

//Answer questions

driver.findElement(By.xpath("//*[@id=\"questions_list\"]/li[1]/div/div/span[2]/input")).sendKeys(answer1);

driver.findElement(By.xpath("//*[@id=\"questions_list\"]/li[2]/div/div/span[2]/input")).sendKeys(answer2);


driver.findElement(By.xpath("//*[@id=\"questions_list\"]/li[3]/div/div/span[2]/input")).sendKeys(answer3);


driver.findElement(By.xpath("//*[@id=\"questions_list\"]/li[4]/div/div/span[2]/textarea")).sendKeys(answer4);



//Scroll down


try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	

JavascriptExecutor je21 = (JavascriptExecutor)driver;
WebElement element211 = driver.findElement(By.xpath("//*[@id=\"questions_list\"]/li[5]/div/div/span[2]/textarea"));
je21.executeScript("arguments[0].scrollIntoView(true);", element211);


driver.findElement(By.xpath("//*[@id=\"questions_list\"]/li[5]/div/div/span[2]/textarea")).sendKeys(answer5);

driver.findElement(By.xpath("//*[@id=\"questions_list\"]/li[6]/div/div/span[2]/textarea")).sendKeys(answer6);

driver.findElement(By.xpath("//*[@id=\"questions_list\"]/li[7]/div/div/span[2]/textarea")).sendKeys(answer7);

driver.findElement(By.xpath("//*[@id=\"questions_list\"]/li[8]/div/div/span[2]/textarea")).sendKeys(answer8);



try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	

//Click on Submit

driver.findElement(By.xpath("//*[@id=\"btn_submit\"]")).click();

try {
	Thread.sleep(20000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	


driver.quit();






//Log in as CCL Admin and go to participant roster page
WebDriver driver1 =new ChromeDriver();
driver1.get("https://cclcoachingnexus-qa.ccl.org");
driver1.manage().window().maximize();

WebDriverWait wait3 = new WebDriverWait(driver1, 40);
WebElement element3 = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

//Enter CCL Admin email address and submit

driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(ccladmemail);

WebDriverWait wait31 = new WebDriverWait(driver1, 40);
WebElement element31 = wait31.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")));
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

WebDriverWait wait11 = new WebDriverWait(driver1, 40);
WebElement element311 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));


driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys(ccladmemail);
driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys(ccladmpwd);
driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_SubmitButton\"]")).click();

WebDriverWait wait111 = new WebDriverWait(driver1, 40);
WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idBtn_Back\"]")));

driver1.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();

//Select client Ford test
WebDriverWait wait1111 = new WebDriverWait(driver1, 40);
WebElement element1111 = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")));

driver1.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")).click();
driver1.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

WebDriverWait wait11111 = new WebDriverWait(driver1, 40);
wait11111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));


try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



//Go to participant roster page

driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a/span")).click();


try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Select stage 'Coach Assignment'

WebElement stage_dropdown1111=driver1.findElement(By.xpath("//*[@id=\"StageFilterDropdown\"]"));
Select stage_dd1111=new Select(stage_dropdown1111);
stage_dd1111.selectByIndex(3);		

try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



//Click on search button

WebDriverWait wait111111 = new WebDriverWait(driver1, 40);
WebElement element11111 = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")));

driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys(partemail);

try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
driver1.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr[1]/td[2]/div/div[1]/a/div[2]/strong")).click();
try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Open Participant profile page

WebDriverWait wait1111111 = new WebDriverWait(driver1, 40);
WebElement element111111 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	//Scroll down and click on deactivate
JavascriptExecutor je222 = (JavascriptExecutor)driver1;
WebElement element222 = driver1.findElement(By.xpath("//*[@id=\"DeactivateRegistrationButton\"]"));
je222.executeScript("arguments[0].scrollIntoView(true);", element222);

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver1.findElement(By.xpath("//*[@id=\"DeactivateRegistrationButton\"]")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver1.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div/input")).click();
		
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
		
		
		
	}

}