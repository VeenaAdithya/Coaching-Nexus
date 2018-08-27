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

public class Suite20 {

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
	
		
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite20.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite20");

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
	
		//Open Chrome and CLient Admin Page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://cclcoachingnexus-qa.ccl.org");
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
	Thread.sleep(15000);
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
JavascriptExecutor je171111111 = (JavascriptExecutor)driver;
WebElement element7111111111111 = driver.findElement(By.xpath("//*[@id=\"SurveyForm\"]/div[3]/div[1]/div/input[2]"));
je171111111.executeScript("arguments[0].scrollIntoView(true);", element7111111111111);
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
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
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
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebDriverWait wait61111 = new WebDriverWait(driver, 40);
		WebElement element61111 = wait61111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FinanceInfoForm\"]/div[2]/div/label[1]/span[1]")));

		
		//Scroll down and click on DEACTIVATE button
		JavascriptExecutor je21111 = (JavascriptExecutor)driver;
		WebElement element21111111111 = driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button"));
		je21111.executeScript("arguments[0].scrollIntoView(true);", element21111111111);				
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"ActionButtons\"]/button")).click();

		//Select Yes
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"ConfirmationButtons\"]/input")).click();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}
