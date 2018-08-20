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

public class Suite12 {

	public static void main(String[] args) throws IOException {
		
		String clientadm=null;
		String password=null;
		String firstname=null;
		String lastname=null;
		String emailadd=null;
		String title=null;
		String manageremail=null;
		String managername=null;
		String div=null;
		String acct=null;
		String dept=null;
		String xyz=null;
		String date=null;
		
		String financecoord=null;
		
		String ccladmemail=null;
		String ccladmpwd=null;
		String csrapprovalcandidate=null;
		
		
		String fincoordpwd=null;
		
		String ponum=null;
		
		String region=null;
		
		
		String phonenum=null;
		String assistantname=null;
		String assistantemail=null;
		
		
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\Suite12.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite12");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row2=sheet1.getRow(9);
		XSSFCell cell3=row2.getCell(4);
		
		XSSFRow row3=sheet1.getRow(10);
		XSSFCell cell4=row3.getCell(4);
		
		XSSFRow row4=sheet1.getRow(11);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(12);
		XSSFCell cell6=row5.getCell(4);
		
		XSSFRow row6=sheet1.getRow(17);
		XSSFCell cell7=row6.getCell(4);
		
		XSSFRow row7=sheet1.getRow(18);
		XSSFCell cell8=row7.getCell(4);
		
		
		XSSFRow row8=sheet1.getRow(28);
		XSSFCell cell9=row8.getCell(4);
		
		XSSFRow row9=sheet1.getRow(29);
		XSSFCell cell10=row9.getCell(4);
		
		XSSFRow row10=sheet1.getRow(30);
		XSSFCell cell11=row10.getCell(4);
		
		XSSFRow row11=sheet1.getRow(31);
		XSSFCell cell12=row11.getCell(4);
		
		XSSFRow row12=sheet1.getRow(26);
		XSSFCell cell13=row12.getCell(4);
		
		XSSFRow row13=sheet1.getRow(36);
		XSSFCell cell14=row13.getCell(4);
		
		XSSFRow row14=sheet1.getRow(37);
		XSSFCell cell15=row14.getCell(4);
		
		XSSFRow row15=sheet1.getRow(11);
		XSSFCell cell16=row15.getCell(4);
		
		XSSFRow row16=sheet1.getRow(19);
		XSSFCell cell17=row16.getCell(4);
		
		
		XSSFRow row17=sheet1.getRow(13);
		XSSFCell cell18=row17.getCell(4);
		
		XSSFRow row18=sheet1.getRow(51);
		XSSFCell cell19=row18.getCell(4);
		
		XSSFRow row19=sheet1.getRow(56);
		XSSFCell cell20=row19.getCell(4);
		
		XSSFRow row20=sheet1.getRow(63);
		XSSFCell cell21=row20.getCell(4);
		
		XSSFRow row21=sheet1.getRow(64);
		XSSFCell cell22=row21.getCell(4);
		
		XSSFRow row22=sheet1.getRow(65);
		XSSFCell cell23=row22.getCell(4);
		
		
		phonenum=cell21.toString();
		assistantname=cell22.toString();
		assistantemail=cell23.toString();
		
		
		financecoord=cell17.toString();
		region=cell18.toString();
		fincoordpwd=cell19.toString();
		ponum=cell20.toString();
		
				
		
		clientadm=cell1.toString();
		password=cell2.toString();
		firstname=cell3.toString();
		lastname=cell4.toString();
		emailadd=cell5.toString();
		title=cell6.toString();
		manageremail=cell7.toString();
		managername=cell8.toString();
		div=cell9.toString();
		acct=cell10.toString();
		dept=cell11.toString();
		xyz=cell12.toString();
		date=cell13.toString();
		ccladmemail=cell14.toString();
		ccladmpwd=cell15.toString();
		csrapprovalcandidate=cell16.toString();
		
		//Open Chrome and CLient Admin Page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://cclcoachingnexus-uat.ccl.org");
		driver.manage().window().maximize();
		
	WebDriverWait wait = new WebDriverWait(driver, 40);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Client Admin email address and password
	
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadm);
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(password);
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();


//Go to CSR page

WebDriverWait wait1 = new WebDriverWait(driver, 40);
WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")));

driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
		e.printStackTrace();
}

//Click on +New CSR
WebDriverWait wait11 = new WebDriverWait(driver, 40);
WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GridControls\"]/a")));
driver.findElement(By.xpath("//*[@id=\"GridControls\"]/a")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	e.printStackTrace();
}

//Enter Field values
//1- CSR first name, last name, Email address, Title 

WebDriverWait wait111 = new WebDriverWait(driver, 40);
WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));
driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).click();

driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(firstname);
driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(lastname);
driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(emailadd);
driver.findElement(By.xpath("//*[@id=\"Title\"]")).sendKeys(title);


//Select language

WebDriverWait wait1111 = new WebDriverWait(driver, 40);
WebElement element1111 = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[4]/div[2]/span[1]/div/button")));
driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[4]/div[2]/span[1]/div/button")).click();

//Select English language
JavascriptExecutor je1 = (JavascriptExecutor)driver;
WebElement element11111 = driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[4]/div[2]/span[1]/div/ul/li[66]/a/label"));
je1.executeScript("arguments[0].scrollIntoView(true);", element11111);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[4]/div[2]/span[1]/div/ul/li[66]/a/label")).click();

//Scroll down
JavascriptExecutor je11 = (JavascriptExecutor)driver;
WebElement element111111 = driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[3]/div/div/input[1]"));
je11.executeScript("arguments[0].scrollIntoView(true);", element111111);

//Select Region Europe
WebDriverWait wait11111 = new WebDriverWait(driver, 40);
WebElement element1111111 = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")));
driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[3]/a/label")).click();

//Select Country field
driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
//Scroll down country values and select United Kingdom
JavascriptExecutor je111 = (JavascriptExecutor)driver;
WebElement element11111111 = driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[23]/a/label"));
je111.executeScript("arguments[0].scrollIntoView(true);", element11111111);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[23]/a/label")).click();
		

//Select Skill team (Sustainability, Env. and Safety Eng)

driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
JavascriptExecutor je1111 = (JavascriptExecutor)driver;
WebElement element111111111 = driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[24]/a/label"));
je1111.executeScript("arguments[0].scrollIntoView(true);", element111111111);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[24]/a/label")).click();

//Select Leadership Level

driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[2]/div/span[1]/div/button")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
JavascriptExecutor je11111 = (JavascriptExecutor)driver;
WebElement element1111111111 = driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[24]/a/label"));
je11111.executeScript("arguments[0].scrollIntoView(true);", element1111111111);
driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[2]/div/span[1]/div/ul/li[4]/a/label")).click();

//Manager Email address and name

driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_36\"]")).sendKeys(manageremail);
driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_35\"]")).sendKeys(managername);

//Select Finance Coordinator

driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[2]/div[3]/span[1]/div/button")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
JavascriptExecutor je111111 = (JavascriptExecutor)driver;
WebElement element11111111111 = driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[2]/div[3]/span[1]/div/ul/li[2]/a/label"));
je111111.executeScript("arguments[0].scrollIntoView(true);", element11111111111);
driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[2]/div[3]/span[1]/div/ul/li[2]/a/label")).click();

//Click on Next
driver.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[3]/div/div/input[1]")).click();
try {
	Thread.sleep(18000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Coaching needs tab
WebDriverWait wait111111 = new WebDriverWait(driver, 40);
WebElement element22 = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SurveyForm\"]/div[2]/div[1]/div[3]/label[1]/span")));
driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[2]/div[1]/div[3]/label[1]/span")).click();
driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[2]/div[1]/div[4]/label[2]/span")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[2]/div[1]/div[5]/label[9]/span")).click();
driver.findElement(By.xpath("//*[@id=\"Survey_Sections_0__Questions_3__ResponseValue\"]")).sendKeys("sample");
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"Survey_Sections_0__Questions_4__ResponseValue\"]")).sendKeys("sample");
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"Survey_Sections_0__Questions_5__ResponseValue\"]")).sendKeys("sample");
JavascriptExecutor je1111111 = (JavascriptExecutor)driver;
WebElement element111111111111 = driver.findElement(By.xpath("//*[@id=\"Survey_Sections_0__Questions_7__ResponseValue\"]"));
je1111111.executeScript("arguments[0].scrollIntoView(true);", element111111111111);
driver.findElement(By.xpath("//*[@id=\"Survey_Sections_0__Questions_7__ResponseValue\"]")).sendKeys("sample");


try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"Survey_Sections_0__Questions_8__ResponseValue\"]")).sendKeys("sample");
driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[2]/div[2]/div[3]/div[1]/label/span")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



JavascriptExecutor je171111111 = (JavascriptExecutor)driver;
WebElement element7111111111111 = driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[3]/div[1]/div/input[2]"));
je171111111.executeScript("arguments[0].scrollIntoView(true);", element7111111111111);


driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[2]/div[2]/div[4]/div[3]/label/span")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[2]/div[2]/div[5]/div[1]/label/span")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[2]/div[2]/div[6]/div[2]/label/span")).click();

driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[3]/div[1]/div/input[2]")).click();

WebDriverWait wait1111111 = new WebDriverWait(driver, 40);
WebElement element221 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SurveyForm\"]/div[4]/div[1]/div/input[2]")));

JavascriptExecutor je11111111 = (JavascriptExecutor)driver;
WebElement element1111111111111 = driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[4]/div[1]/div/input[2]"));
je11111111.executeScript("arguments[0].scrollIntoView(true);", element1111111111111);
driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[4]/div[1]/div/input[2]")).click();




//Coaching and financial package tab

WebDriverWait wait2111113 = new WebDriverWait(driver, 40);
wait2111113.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"SurveyForm\"]/div[4]/div[1]/div/input[2]")));


try {
	Thread.sleep(40000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Scroll down
WebDriverWait wait61111111 = new WebDriverWait(driver, 40);
WebElement element6221 = wait61111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"PreferredStartDate\"]")));

JavascriptExecutor je111111111 = (JavascriptExecutor)driver;
WebElement element11111111111111 = driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button"));
je111111111.executeScript("arguments[0].scrollIntoView(true);", element11111111111111);

//Send values to fields Div, Acct., Dept., 

driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_38\"]")).sendKeys(div);
driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_39\"]")).sendKeys(acct);
driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_40\"]")).sendKeys(dept);
driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_41\"]")).sendKeys(xyz);

try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Scroll up and select date
JavascriptExecutor je1111111111 = (JavascriptExecutor)driver;
WebElement element111111111111111 = driver.findElement(By.xpath("//*[@id=\"PreferredStartDate\"]"));
je1111111111.executeScript("arguments[0].scrollIntoView(true);", element111111111111111);

driver.findElement(By.xpath("//*[@id=\"PreferredStartDate\"]")).click();
//Date arrow key
driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[2]/th[3]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Select Date
driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody/tr[4]/td[4]")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Coaching options
driver.findElement(By.xpath("//*[@id=\"FinanceInfoForm\"]/div[2]/div/label[3]")).click();

try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Scroll down and Save

JavascriptExecutor je11111111111 = (JavascriptExecutor)driver;
WebElement element1111111111111111 = driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/input[2]"));
je11111111111.executeScript("arguments[0].scrollIntoView(true);", element1111111111111111);

driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/input[2]")).click();


try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebDriverWait wait111111111 = new WebDriverWait(driver, 40);
WebElement element22111 = wait111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ActionButtons\"]/button[1]")));

driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button[1]")).click();


try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebDriverWait wait1111111111 = new WebDriverWait(driver, 40);
WebElement element221111 = wait1111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ConfirmationButtons\"]/input")));
		
		driver.findElement(By.xpath("//*[@id=\"ConfirmationButtons\"]/input")).click();
		

		//Close
		
		
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebDriverWait wait11111111111 = new WebDriverWait(driver, 40);
WebElement element2211111 = wait11111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ActionButtons\"]/a")));
		
		driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/a")).click();		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		
		//Log in as CCL Admin with another handler and approve CSR
		
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://cclcoachingnexus-uat.ccl.org");
		driver1.manage().window().maximize();
		
	WebDriverWait wait2 = new WebDriverWait(driver1, 40);
	WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter CCL Admin email address and submit
	
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(ccladmemail);

WebDriverWait wait21 = new WebDriverWait(driver1, 40);
WebElement element21 = wait21.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")));
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

WebDriverWait wait211 = new WebDriverWait(driver1, 40);
WebElement element211 = wait211.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));

driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys(ccladmemail);
driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys(ccladmpwd);
driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_SubmitButton\"]")).click();

WebDriverWait wait2111 = new WebDriverWait(driver1, 40);
WebElement element2111 = wait2111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idBtn_Back\"]")));

driver1.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();

//Select client Ford test
WebDriverWait wait21111 = new WebDriverWait(driver1, 40);
WebElement element21111 = wait21111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")));

driver1.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")).click();
driver1.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

WebDriverWait wait211111 = new WebDriverWait(driver1, 40);
wait211111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));

//Go to CSR page

WebDriverWait wait2111111 = new WebDriverWait(driver1, 40);
WebElement element211111 = wait2111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")));

driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Click on search button and paste email address passed as CSR email address registered in previous suite

driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys(csrapprovalcandidate);

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebDriverWait wait21111111 = new WebDriverWait(driver1, 40);
WebElement element2111111 = wait21111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr/td[1]/div/div[2]")));

driver1.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr/td[1]/div/div[2]")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	Thread.sleep(9000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Go to Change Log page to check updates

WebDriverWait wait721111111 = new WebDriverWait(driver1, 40);
WebElement element72111111 = wait721111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"globalModalContent\"]/div/ul/li[4]/a")));
driver1.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div/ul/li[4]/a")).click();
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Go back to Coaching and financial package tab
driver1.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div/ul/li[3]/a")).click();



//Navigate to button 'Submit to Client Admin'
try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

JavascriptExecutor je2111 = (JavascriptExecutor)driver1;
WebElement element211111111 = driver1.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button[1]"));
je2111.executeScript("arguments[0].scrollIntoView(true);", element211111111);
	
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button[1]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on 'Yes'
WebDriverWait wait2111111111 = new WebDriverWait(driver1, 40);
WebElement element2111111111 = wait2111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ConfirmationButtons\"]/input")));
driver1.findElement(By.xpath("//*[@id=\"ConfirmationButtons\"]/input")).click();
try {
	Thread.sleep(9000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
		driver1.quit();
		
	
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		//Back to Client admin page
		//Find the CSR and submit to finance
		
		//Click on search button and search for the newly registered CSR
		
				WebDriverWait wait611 = new WebDriverWait(driver, 40);
				WebElement element611 = wait611.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")));

				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys(emailadd);
				try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Click on the CSR 
				
				WebDriverWait wait6111 = new WebDriverWait(driver, 40);
				WebElement element6111 = wait6111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr/td[1]/div/div[2]/a")));

				driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr/td[1]/div/div[2]/a")).click();
				
				//Check Change Log tab
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				WebDriverWait wait61116 = new WebDriverWait(driver, 40);
				WebElement element61116 = wait61116.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"globalModalContent\"]/div/ul/li[4]/a")));
				driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div/ul/li[4]/a")).click();
				try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Go to Coaching package and financial tab
				driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div/ul/li[3]/a")).click();
				
				
				//Scroll down and click on Submit to finance
				
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				
				JavascriptExecutor je6111 = (JavascriptExecutor)driver;
				WebElement element611111111 = driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button[1]"));
				je6111.executeScript("arguments[0].scrollIntoView(true);", element611111111);
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	


				driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button[1]")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"ConfirmationButtons\"]/input")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//Login as the finance coordinator and enter PO num and click on ready for registration
				WebDriver driver11 =new ChromeDriver();
				driver11.get("https://cclcoachingnexus-uat.ccl.org");
				driver11.manage().window().maximize();
				
			WebDriverWait wait6 = new WebDriverWait(driver11, 40);
			WebElement element6 = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
			
		//Enter Finance Coordinator email address and password for set finance coordinator during registration in suite 12
			
		driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(financecoord);
		driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(fincoordpwd);
		driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

		//Click on search button and paste email address passed as CSR email address
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	


		WebDriverWait wait81111111 = new WebDriverWait(driver11, 40);
		WebElement element8111111 = wait81111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")));
		driver11.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys(emailadd);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebDriverWait wait611111111 = new WebDriverWait(driver11, 40);
		WebElement element61111111 = wait611111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr/td[1]/div/div[2]")));

		driver11.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr/td[1]/div/div[2]")).click();
				

		
		//Wait for CSR registration page to open
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		
		WebDriverWait wait6111111111 = new WebDriverWait(driver11, 40);
		WebElement element711111111 = wait6111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[3]/form/div[2]/div/label[1]")));

		//Scroll down, Click on PO num, and pass data
		JavascriptExecutor je7111 = (JavascriptExecutor)driver11;
		WebElement element9111111111 = driver11.findElement(By.xpath("//*[@id=\"PONumber\"]"));
		je7111.executeScript("arguments[0].scrollIntoView(true);", element9111111111);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		driver11.findElement(By.xpath("//*[@id=\"PONumber\"]")).sendKeys(ponum);


		//Click on Ready for Registration
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		driver11.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button[2]")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		driver11.findElement(By.xpath("//*[@id=\"ConfirmationButtons\"]/input")).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver11.quit();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Log in as client admin
		//Register the CSR participant
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click on the CSR 
		
		WebDriverWait wait61111 = new WebDriverWait(driver, 40);
		WebElement element61111 = wait61111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr/td[1]/div/div[2]/a")));

		driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr/td[1]/div/div[2]/a")).click();
		
		//Check Change Log tab
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebDriverWait wait611161 = new WebDriverWait(driver, 40);
		WebElement element611161 = wait611161.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"globalModalContent\"]/div/ul/li[4]/a")));
		driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div/ul/li[4]/a")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Go to Coaching package and financial tab
		driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div/ul/li[3]/a")).click();
		
		
		//Scroll down and click on REGISTER
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		JavascriptExecutor je61111 = (JavascriptExecutor)driver;
		WebElement element6111111111 = driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button[1]"));
		je61111.executeScript("arguments[0].scrollIntoView(true);", element6111111111);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	


		driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"ConfirmationButtons\"]/input")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Go to Participant Roster page and select CSR REGISTERED participant
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a/span")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Search for registered CSR
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[3]/input")).sendKeys(emailadd);
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
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Scroll down and enter assistant details
		JavascriptExecutor je611111 = (JavascriptExecutor)driver;
		WebElement element61111111111 = driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_0__ClientFieldValueText\"]"));
		je611111.executeScript("arguments[0].scrollIntoView(true);", element61111111111);

		driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_0__ClientFieldValueText\"]")).sendKeys(assistantname);

		driver.findElement(By.xpath("//*[@id=\"CNXUserClientFieldTextData_1__ClientFieldValueText\"]")).sendKeys(assistantemail);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
			//Click on save
		driver.findElement(By.xpath("//*[@id=\"btnSaveCoacheeProfile\"]")).click();
				
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		//Test 'Remove' button for this CSR participant
		//Click on the participant
		WebDriverWait wait61116111 = new WebDriverWait(driver, 40);
		WebElement element61116111 = wait61116111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[1]/a/div[2]")));
		driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[1]/a/div[2]")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//wait for profile page to open
		WebDriverWait wait611161111 = new WebDriverWait(driver, 40);
		WebElement element611161111 = wait611161111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));
		
		//Scroll down and click on Remove
		JavascriptExecutor je = (JavascriptExecutor)driver;
		WebElement element7 = driver.findElement(By.xpath("//*[@id=\"RemoveRegistrationButton\"]"));
		je.executeScript("arguments[0].scrollIntoView(true);", element7);

		driver.findElement(By.xpath("//*[@id=\"RemoveRegistrationButton\"]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click on Remove Participant
		driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div/input")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
			
		
		
	}

}
