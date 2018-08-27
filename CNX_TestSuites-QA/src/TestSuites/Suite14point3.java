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
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suite14point3 {

	public static void main(String[] args) throws IOException {
		
		String icrpartemail=null;
		String password=null;
		String answer1=null;
		String answer2=null;
		String answer3=null;
		String answer4=null;
		String answer5=null;
		String answer6=null;
		String answer7=null;
		String answer8=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite14.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite14point3");

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
		
		icrpartemail=cell1.toString();
		password=cell2.toString();
		
		
		answer1=cell3.toString();
		answer2=cell4.toString();
		answer3=cell5.toString();
		answer4=cell6.toString();
		answer5=cell7.toString();
		answer6=cell8.toString();
		answer7=cell9.toString();
		answer8=cell10.toString();
		
		
		
		//Open Chrome and Participant Page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://cclcoachingnexus-qa.ccl.org");
		driver.manage().window().maximize();
		
	WebDriverWait wait = new WebDriverWait(driver, 40);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Participants email address and password
	
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(icrpartemail);
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



JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000)");

//Scroll down and click on Start survey

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

WebDriverWait wait1 = new WebDriverWait(driver, 40);
WebElement element111 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"questions_list\"]/li[1]/div/div/span[2]/input")));

try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	

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














		
		
		
		
		
		
		
		
		
		
	}

}
