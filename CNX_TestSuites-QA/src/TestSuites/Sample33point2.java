package TestSuites;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample33point2 {

	WebDriver driver1;
	
	
@Test

public void login() throws IOException

{

		String ccladmemail=null;
		String ccladmpwd=null;
		
		String GlobalAdmin1=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite33.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite33point2");

		XSSFRow row=sheet1.getRow(1);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(2);
		XSSFCell cell2=row1.getCell(4);

		XSSFRow row2=sheet1.getRow(6);
		XSSFCell cell3=row2.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		
		GlobalAdmin1=cell3.toString();	
		
		//Open Chrome and CCL Admin Page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://cclcoachingnexus-qa.ccl.org");
		driver1.manage().window().maximize();

		WebDriverWait wait2 = new WebDriverWait(driver1, 40);
		WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

		//Enter CCL Admin email address and submit

		driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(ccladmemail);

		WebDriverWait wait1 = new WebDriverWait(driver1, 40);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")));
		driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

		WebDriverWait wait11 = new WebDriverWait(driver1, 40);
		WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));


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

		//Go to admin directory page and search for the Global Admin

		WebDriverWait wait111111 = new WebDriverWait(driver1, 40);
		WebElement element11111 = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")));

		driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).click();
		
		WebDriverWait wait4111111 = new WebDriverWait(driver1, 40);
		WebElement element411111 = wait4111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));

		driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(GlobalAdmin1);

		try {
			Thread.sleep(7000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		//Open profile page for the Admin
		driver1.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();

		//Uncheck Super Admin check box
		WebDriverWait wait41111111 = new WebDriverWait(driver1, 40);
		WebElement element4111111 = wait41111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"IsClientSuperAdmin\"]")));
		TakesScreenshot ts1=(TakesScreenshot)driver1;
		
		File source1=ts1.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source1, new File("./Screenshots/Suite33point2/00AdminProfilepage.png"));
			
		System.out.println("Admin profile page screenshot is taken");

		driver1.findElement(By.xpath("//*[@id=\"IsClientSuperAdmin\"]")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TakesScreenshot ts=(TakesScreenshot)driver1;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./Screenshots/Suite33point2/01AdminProfilepage.png"));
			
		System.out.println("Admin profile page screenshot is taken");

		//Set coaching type access to Integrated
		WebElement coachingType_dropdown=driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
		Select CT_dd=new Select(coachingType_dropdown);
		CT_dd.selectByIndex(1);
		
		//Set skill team data filters to select all	
		driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")).click();
	
		driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TakesScreenshot ts12=(TakesScreenshot)driver1;
		
		File source12=ts12.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source12, new File("./Screenshots/Suite33point2/02AdminProfilepage.png"));
			
		System.out.println("Admin profile page screenshot is taken");

		driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();

		WebDriverWait wait1111111 = new WebDriverWait(driver1, 40);
		wait1111111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfileLabel\"]")));
				
		//open admin profile page again

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver1.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
		
		WebDriverWait wait33312 = new WebDriverWait(driver1, 40);
		WebElement element33312 = wait33312.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")));
		
		//Set country data filters to select all
		driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();

		driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();


		TakesScreenshot ts11=(TakesScreenshot)driver1;
		
		File source11=ts11.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source11, new File("./Screenshots/Suite33point2/03AdminProfilepage.png"));
			
		System.out.println("Admin profile page screenshot is taken");

		driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();

		
		WebDriverWait wait11111111 = new WebDriverWait(driver1, 40);
		wait11111111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfileLabel\"]")));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//Open Participant registration form
		//Click on +Register -> Participant
		WebDriverWait wait41111112 = new WebDriverWait(driver1, 40);
		WebElement element4111112 = wait41111112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));
		driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
	
		driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[5]/a")).click();

		WebDriverWait wait24 = new WebDriverWait(driver1, 40);
		WebElement element24 = wait24.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver1.findElement(By.xpath("//*[@id=\"ClientAdminId\"]")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TakesScreenshot ts111=(TakesScreenshot)driver1;
		
		File source111=ts111.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source111, new File("./Screenshots/Suite33point2/04AdminDropdown.png"));
			
		System.out.println("Admin dropdown in Participant registration form screenshot is taken");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver1.findElement(By.xpath("//*[@id=\"ClientAdminId\"]")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement client_dropdown=driver1.findElement(By.xpath("//*[@id=\"ClientAdminId\"]"));
		Select client_dd=new Select(client_dropdown);

		List<WebElement> list=client_dd.getOptions();

		for(int i=0;i<2;i++)
		{
			System.out.println("Second Admin in the list is" +list.get(2).getText());
			
			
			Assert.assertNotEquals(GlobalAdmin1, list.get(2).getText());
			System.out.println("Super Admin set as Integrated Admin is not present in participant registration form for client admin dropdown");
			
		}
		
		//Close registration form
		driver1.findElement(By.xpath("//*[@id=\"registerCoachee\"]/div/div/div[1]/button/i")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Go to ICR page
		WebDriverWait wait111111111 = new WebDriverWait(driver1, 40);
		WebElement element111111 = wait111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[4]")));
		driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[4]")).click();

		//Click on +NewICR
		WebDriverWait wait2111111111 = new WebDriverWait(driver1, 40);
		WebElement element2111111 = wait2111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));
		
		driver1.findElement(By.xpath("//*[@id=\"NewIcrButton\"]")).click();
		
		WebDriverWait wait1111111111 = new WebDriverWait(driver1, 40);
		WebElement element1111111 = wait1111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Click on Program manager dropdown
		
		driver1.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TakesScreenshot ts1111=(TakesScreenshot)driver1;
		
		File source1111=ts1111.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source1111, new File("./Screenshots/Suite33point2/05aAdminDropdown.png"));
			
		System.out.println("Admin dropdown in ICR registration form screenshot is taken");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver1.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
		
		
		WebElement client1_dropdown=driver1.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]"));
				
		Select client1_dd=new Select(client1_dropdown);
		
		List<WebElement> list1=client1_dd.getOptions();

		for(int i=0;i<2;i++)
		{
			
			System.out.println("Second Admin in the list is" +list1.get(2).getText());
			
			Assert.assertNotEquals(GlobalAdmin1, list1.get(2).getText());
			System.out.println("Super Admin set as Integrated Admin is not present in ICR registration form for client admin dropdown as skill team and country values are not set");
			
		}
		
		//set country and skill team
		WebElement country_dropdown=driver1.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]"));
		Select Cou_dd=new Select(country_dropdown);
		Cou_dd.selectByIndex(17);		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement Skillteam_dropdown=driver1.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
		Select ST_dd=new Select(Skillteam_dropdown);
		ST_dd.selectByIndex(14);		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		driver1.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TakesScreenshot ts11111=(TakesScreenshot)driver1;
		
		File source11111=ts11111.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source11111, new File("./Screenshots/Suite33point2/05bAdminDropdown.png"));
			
		System.out.println("Admin dropdown in ICR registration form screenshot is taken");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver1.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
		
		
		WebElement client1_dropdown1=driver1.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]"));
		Select client1_dd1=new Select(client1_dropdown1);

		List<WebElement> list11=client1_dd1.getOptions();

		for(int i=0;i<2;i++)
		{
			System.out.println("Second Admin in the list is" +list11.get(2).getText());
			
			Assert.assertEquals(GlobalAdmin1, list11.get(2).getText());
			System.out.println("Super Admin set as Integrated Admin is present in ICR registration form for client admin dropdown as skill team and country values are set");
			
		}
		
		
		//close form
		driver1.findElement(By.xpath("//*[@id=\"ICRInlineDetailForm\"]/table/tbody/tr/td[1]/a")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
}

}
