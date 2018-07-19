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

public class Suite24 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

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
		
		
		String alternatefirstname=null;
		String alternatelastname=null;
		String alternateemail=null;
		String alternatecountry=null;
		String alternateclientadm=null;
		String notes=null;
		
		String icrpartpwd=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\Suite24.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite24");

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
		
		
		XSSFRow row14=sheet1.getRow(24);
		XSSFCell cell15=row14.getCell(4);
		
		XSSFRow row15=sheet1.getRow(25);
		XSSFCell cell16=row15.getCell(4);
		
		XSSFRow row16=sheet1.getRow(26);
		XSSFCell cell17=row16.getCell(4);
				
		XSSFRow row17=sheet1.getRow(28);
		XSSFCell cell18=row17.getCell(4);
		
		XSSFRow row18=sheet1.getRow(30);
		XSSFCell cell19=row18.getCell(4);
		
		XSSFRow row19=sheet1.getRow(31);
		XSSFCell cell20=row19.getCell(4);
		
		
		XSSFRow row20=sheet1.getRow(33);
		XSSFCell cell21=row20.getCell(4);
		
		alternatefirstname=cell15.toString();
		alternatelastname=cell16.toString();
		alternateemail=cell17.toString();
		alternatecountry=cell18.toString();
		alternateclientadm=cell19.toString();
		notes=cell20.toString();
		
		icrpartpwd=cell21.toString();
		
		
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
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}













//Register an ICR
//Click on +New ICR
WebDriverWait wait24 = new WebDriverWait(driver, 40);
WebElement element24 = wait24.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));

driver.findElement(By.xpath("//*[@id=\"NewIcrButton\"]")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(firstname);
driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(lastname);
driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(partemailadd);

//Select Program package
try {
	Thread.sleep(4000);
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
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}//Select Skill team

driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]")).sendKeys(skillteam);
//WebElement skillteam_dropdown=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
//Select skill_dd=new Select(skillteam_dropdown);
//skill_dd.selectByIndex(14);	
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//enter PO number
driver.findElement(By.xpath("//*[@id=\"PONumber\"]")).sendKeys(ponum);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//select client admin
driver.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).sendKeys(clientadm);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Select Dates
//driver.findElement(By.xpath("//*[@id=\"InvitationDateTime\"]")).clear();
//driver.findElement(By.xpath("//*[@id=\"InvitationExpiresDateTime\"]")).clear();
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

//driver.findElement(By.xpath("//*[@id=\"InvitationDateTime\"]")).sendKeys(invitedate);

//driver.findElement(By.xpath("//*[@id=\"InvitationExpiresDateTime\"]")).sendKeys(expdate);


//Save registration
driver.findElement(By.xpath("//*[@id=\"ICRInlineDetailForm\"]/table/tbody/tr/td[13]/button")).click();





try {
	Thread.sleep(15000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}










//Filter for invitation sent

WebDriverWait wait2111 = new WebDriverWait(driver, 40);
WebElement element2111 = wait2111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"IcrFilterDropdown\"]")));
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Select Invited ICR

WebElement stage_dropdown=driver.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
Select stage_dd=new Select(stage_dropdown);
stage_dd.selectByIndex(2);

//Click on edit button for an ICR Participant
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebDriverWait wait21111 = new WebDriverWait(driver, 40);
WebElement element21111 = wait21111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")));

driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")).click();

//wait for elements to be clickable in the edit page

WebDriverWait wait211111 = new WebDriverWait(driver, 40);
WebElement element211111 = wait211111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstNameDetail\"]")));

try {
	Thread.sleep(8000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"FirstNameDetail\"]")).clear();


driver.findElement(By.xpath("//*[@id=\"LastNameDetail\"]")).clear();

driver.findElement(By.xpath("//*[@id=\"EmailDetail\"]")).clear();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"FirstNameDetail\"]")).sendKeys(alternatefirstname);

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"LastNameDetail\"]")).sendKeys(alternatelastname);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"EmailDetail\"]")).sendKeys(alternateemail);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}







//select program package global leadership summit
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebDriverWait wait6211111 = new WebDriverWait(driver, 40);
WebElement element6211111 = wait6211111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form0\"]/div[1]/div[2]/div/label[3]/span[1]")));


driver.findElement(By.xpath("//*[@id=\"form0\"]/div[1]/div[2]/div/label[3]/span[1]")).click();

//Add notes

driver.findElement(By.xpath("//*[@id=\"NotesDetail\"]")).sendKeys(notes);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Change client admin
driver.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")).click();
JavascriptExecutor je111111 = (JavascriptExecutor)driver;
WebElement element1111111111 = driver.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/ul/li[20]/a/label"));
je111111.executeScript("arguments[0].scrollIntoView(true);", element1111111111);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/ul/li[20]/a/label")).click();





//Click on Skill team option
WebDriverWait wait61 = new WebDriverWait(driver, 40);
WebElement element61 = wait61.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form0\"]/div[2]/div[2]/div/span[1]/div/button")));

driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div[2]/div/span[1]/div/button")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

JavascriptExecutor je11111 = (JavascriptExecutor)driver;
WebElement element111111111 = driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div[2]/div/span[1]/div/ul/li[23]/a/label"));
je11111.executeScript("arguments[0].scrollIntoView(true);", element111111111);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div[2]/div/span[1]/div/ul/li[23]/a/label")).click();




//click on country option

driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div[1]/div/span[1]/div/button")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

JavascriptExecutor je1111 = (JavascriptExecutor)driver;
WebElement element11111111 = driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div[1]/div/span[1]/div/ul/li[44]/a/label"));
je1111.executeScript("arguments[0].scrollIntoView(true);", element11111111);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div[1]/div/span[1]/div/ul/li[44]/a/label")).click();


try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div[1]/div/span[1]/div/div")).submit();



//click on save

driver.findElement(By.xpath("//*[@id=\"form0\"]/div[5]/div/input")).click();


//Re open the ICR

//Click on edit button for an ICR Participant
try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebDriverWait wait221111 = new WebDriverWait(driver, 40);
WebElement element221111 = wait221111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")));
driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")).click();

try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("/html/body/div[7]/div/div/div[1]/button")).click();











//Go to Clavin and complete sign up

WebDriver driver1 =new ChromeDriver();	

//Open Clavin

driver1.get("https://clavin-reporting-qa.ccl.org/Home/");

driver1.manage().window().maximize();

WebDriverWait wait52111 = new WebDriverWait(driver1, 40);
WebElement element52111 = wait52111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"i0116\"]")));

driver1.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys(ccladmemail);
driver1.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();

WebDriverWait wait521111 = new WebDriverWait(driver1, 40);
WebElement element521111 = wait521111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));

driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys(ccladmemail);

driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys(ccladmpwd);
driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_SubmitButton\"]")).click();

WebDriverWait wait5111 = new WebDriverWait(driver1, 40);
WebElement element5111 = wait5111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idBtn_Back\"]")));

driver1.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();
	
WebDriverWait wait222111 = new WebDriverWait(driver1, 40);
WebElement element222111 = wait222111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarsExampleDefault\"]/ul/li[1]/a")));

driver1.findElement(By.xpath("//*[@id=\"navbarsExampleDefault\"]/ul/li[1]/a")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebDriverWait wait5211111 = new WebDriverWait(driver1, 40);
WebElement element5211111 = wait5211111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div[3]/input")));

driver1.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys(partemailadd);

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebDriverWait wait5221111 = new WebDriverWait(driver1, 40);
WebElement element5221111 = wait5221111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"search_task_table\"]/tbody/tr[1]/td[1]/a")));

driver1.findElement(By.xpath("//*[@id=\"search_task_table\"]/tbody/tr[1]/td[1]/a")).click();

//Click on view full message
WebDriverWait wait2111111 = new WebDriverWait(driver1, 40);
WebElement element2111111 = wait2111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"notification_content\"]/div/a")));
driver1.findElement(By.xpath("//*[@id=\"notification_content\"]/div/a")).click();

try {
	Thread.sleep(8000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Click on Sign up
WebDriverWait wait2211111 = new WebDriverWait(driver1, 40);
WebElement element2211111 = wait2211111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr/td/a/span/font")));
driver1.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr/td/a/span/font")).click();

//Enter password
WebDriverWait wait211111111 = new WebDriverWait(driver1, 40);
WebElement element211111111 = wait211111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr/td/a")));
driver1.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr/td/a")).sendKeys(icrpartpwd);
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button/span")).click();


	}

}
