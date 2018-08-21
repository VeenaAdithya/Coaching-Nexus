import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suite14 {

	public static void main(String[] args) throws IOException {
		
		String ccladmemail=null;
		String ccladmpwd=null;
		String firstname=null;
		String lastname=null;
		String partemailadd=null;
		String phone=null;
		String ponum=null;
		String progpackage=null;
		String country=null;
		String skillteam=null;
		String clientadm=null;
		String partpwd=null;
		String invitedate=null;
		String expdate=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\UAT\\FordTest\\Suite14.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite14");

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
		
		XSSFRow row6=sheet1.getRow(18);
		XSSFCell cell7=row6.getCell(4);
		
		XSSFRow row7=sheet1.getRow(14);
		XSSFCell cell8=row7.getCell(4);
		
		XSSFRow row8=sheet1.getRow(15);
		XSSFCell cell9=row8.getCell(4);
		
		XSSFRow row9=sheet1.getRow(16);
		XSSFCell cell10=row9.getCell(4);
		
		XSSFRow row10=sheet1.getRow(17);
		XSSFCell cell11=row10.getCell(4);
		
		XSSFRow row11=sheet1.getRow(25);
		XSSFCell cell12=row11.getCell(4);
		
		XSSFRow row12=sheet1.getRow(19);
		XSSFCell cell13=row12.getCell(4);
		
		XSSFRow row13=sheet1.getRow(20);
		XSSFCell cell14=row13.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		firstname=cell3.toString();
		lastname=cell4.toString();
		partemailadd=cell5.toString();
		phone=cell6.toString();
		ponum=cell7.toString();
		progpackage=cell8.toString();
		country=cell9.toString();
		skillteam=cell10.toString();
		clientadm=cell11.toString();
		partpwd=cell12.toString();
		invitedate=cell13.toString();
		expdate=cell14.toString();
		
		
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
		
	//Click on Integrated Coaching request in left panel
		
driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[4]/a/span")).click();

//Click on +New ICR
WebDriverWait wait24 = new WebDriverWait(driver, 40);
WebElement element24 = wait24.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));

driver.findElement(By.xpath("//*[@id=\"NewIcrButton\"]")).click();

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(firstname);
driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(lastname);
driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(partemailadd);

//Select Program package
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"CoachingPackageId\"]")).sendKeys(progpackage);
//WebElement programpackage_dropdown=driver.findElement(By.xpath("//*[@id=\"CoachingPackageId\"]"));
//Select progpackage_dd=new Select(programpackage_dropdown);
//progpackage_dd.selectByIndex(2);

//Select country
driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")).sendKeys(country);
//WebElement country_dropdown=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]"));
//Select count_dd=new Select(country_dropdown);
//count_dd.selectByIndex(30);		
		
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}//Select Skill team

driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]")).sendKeys(skillteam);
//WebElement skillteam_dropdown=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
//Select skill_dd=new Select(skillteam_dropdown);
//skill_dd.selectByIndex(14);	
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//enter PO number
driver.findElement(By.xpath("//*[@id=\"PONumber\"]")).sendKeys(ponum);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//select client admin
driver.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).sendKeys(clientadm);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Select Dates
//Invite date
driver.findElement(By.xpath("//*[@id=\"InvitationDateTime\"]")).clear();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"InvitationDateTime\"]")).sendKeys(invitedate);


try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Expiry date
driver.findElement(By.xpath("//*[@id=\"InvitationExpiresDateTime\"]")).clear();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"InvitationExpiresDateTime\"]")).sendKeys(expdate);


try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Save registration
driver.findElement(By.xpath("//*[@id=\"ICRInlineDetailForm\"]/table/tbody/tr/td[13]/button")).click();



//Go to Participant roster page and make edits to complete participant profile





	}

}
