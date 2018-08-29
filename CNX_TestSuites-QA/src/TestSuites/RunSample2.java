package TestSuites;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

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
import org.testng.Assert;
import org.testng.annotations.Test;

public class RunSample2 {

	@Test
	
	public void mockup() throws IOException
	
	{
		
		String ccladmemail=null;
		String ccladmpwd=null;
		String firstname=null;
		String lastname=null;
		String partemailadd=null;
		String phone=null;
		String clientadm1=null;
		String clientadm2=null;

		
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite13.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite13");

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
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		firstname=cell3.toString();
		lastname=cell4.toString();
		partemailadd=cell5.toString();
		phone=cell6.toString();
		clientadm1=cell7.toString();
		clientadm2=cell8.toString();
		
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
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[5]/a/span")).click();

WebDriverWait wait24 = new WebDriverWait(driver, 40);
WebElement element24 = wait24.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));

driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(firstname);
driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(lastname);
driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(partemailadd);
driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys(phone);

//Select CLient Admin
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebElement client_dropdown=driver.findElement(By.xpath("//*[@id=\"ClientAdminId\"]"));
Select client_dd=new Select(client_dropdown);

List<WebElement> list=client_dd.getOptions();

for(int i=1;i<1;i++)
{
	
	Assert.assertEquals(clientadm1, list.get(1).getText());
	System.out.println("test is passed");
	
	
}





	}

}
