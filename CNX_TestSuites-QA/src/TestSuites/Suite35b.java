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

public class Suite35b {

	public static void main(String[] args) throws IOException {
		
		String clientadmemail=null;
		String clientadmpwd=null;

		String execadmin=null;
		
		String changefirstname=null;
		String changelastname=null;
		String changeemailadd=null;
		
		String execfirstname=null;
		String execlastname=null;
		
		String ccladmemail=null;
		String ccladmpwd=null;
		
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite35b.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite35b");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
	
		XSSFRow row2=sheet1.getRow(9);
		XSSFCell cell3=row2.getCell(4);
		
		
		XSSFRow row3=sheet1.getRow(18);
		XSSFCell cell4=row3.getCell(4);
		
		XSSFRow row4=sheet1.getRow(19);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(20);
		XSSFCell cell6=row5.getCell(4);
		
		
		XSSFRow row6=sheet1.getRow(49);
		XSSFCell cell7=row6.getCell(4);
		
		XSSFRow row7=sheet1.getRow(50);
		XSSFCell cell8=row7.getCell(4);
		
		XSSFRow row8=sheet1.getRow(14);
		XSSFCell cell9=row8.getCell(4);
		
		XSSFRow row9=sheet1.getRow(15);
		XSSFCell cell10=row9.getCell(4);
		
		clientadmemail=cell1.toString();
		clientadmpwd=cell2.toString();

		ccladmemail=cell9.toString();
		ccladmpwd=cell10.toString();
		
		execadmin=cell3.toString();
		
		changefirstname=cell4.toString();
		changelastname=cell5.toString();
		changeemailadd=cell6.toString();
		
		execfirstname=cell7.toString();
		execlastname=cell8.toString();
		
		
		//Open Chrome and CNX QA
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://cclcoachingnexus-qa.ccl.org");
		driver.manage().window().maximize();
		
	WebDriverWait wait = new WebDriverWait(driver, 40);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Client Admin email address and password
	
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();






		//Go to ICR page
WebDriverWait wait71111111 = new WebDriverWait(driver, 40);
WebElement element7111111 = wait71111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")));

		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click on +NewICR
		WebDriverWait wait111111 = new WebDriverWait(driver, 40);
		WebElement element11111 = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"NewIcrButton\"]")).click();
		
		
		WebDriverWait wait1111111 = new WebDriverWait(driver, 40);
		WebElement element111111 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")));
		
		
		//set country and skill team
		WebElement country_dropdown=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]"));
		Select Cou_dd=new Select(country_dropdown);
		Cou_dd.selectByIndex(17);		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement Skillteam_dropdown=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
		Select ST_dd=new Select(Skillteam_dropdown);
		ST_dd.selectByIndex(14);		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click on Program manager dropdown
		driver.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//close form
		driver.findElement(By.xpath("//*[@id=\"ICRInlineDetailForm\"]/table/tbody/tr/td[1]/a")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Filter for Invitation sent stage and click on group edit
		
		WebElement ICRStage_dropdown=driver.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
		Select Stage_dd=new Select(ICRStage_dropdown);
		Stage_dd.selectByIndex(2);		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click on check box
		WebDriverWait wait11111111 = new WebDriverWait(driver, 40);
		WebElement element1111111 = wait11111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")));
		
		driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click on Group edit form
		WebDriverWait wait6111111111 = new WebDriverWait(driver, 40);
		WebElement element611111111 = wait6111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GridControls\"]/button[1]")));
		
		driver.findElement(By.xpath("//*[@id=\"GridControls\"]/button[1]")).click();
		
		
		//Opens group edit form
		WebDriverWait wait111111111 = new WebDriverWait(driver, 40);
		WebElement element11111111 = wait111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")));
		
		driver.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/div")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Close form
		driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Click on Edit button for an ICR
		
		driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")).click();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click on drop down for program managers
		WebDriverWait wait8111111111 = new WebDriverWait(driver, 40);
		WebElement element811111111 = wait8111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")));
		
		driver.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/div")).click();
		
		//close edit form
		driver.findElement(By.xpath("//*[@id=\"form0\"]/div[5]/div/a")).click();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//Filter for To be Invited stage
		
		WebElement ICRStage_dropdown11=driver.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
		Select Stage_dd11=new Select(ICRStage_dropdown11);
		Stage_dd11.selectByIndex(0);		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click on check box
		WebDriverWait wait1111111191 = new WebDriverWait(driver, 40);
		WebElement element111111191 = wait1111111191.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")));
		
		driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click on Group edit form
		WebDriverWait wait611111111191 = new WebDriverWait(driver, 40);
		WebElement element61111111191 = wait611111111191.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GridControls\"]/button[1]")));
		
		driver.findElement(By.xpath("//*[@id=\"GridControls\"]/button[1]")).click();
		
		
		//Opens group edit form
		WebDriverWait wait11111111191 = new WebDriverWait(driver, 40);
		WebElement element1111111191 = wait11111111191.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")));
		
		driver.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/div")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Close form
		driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Click on Edit button for an ICR
		
		driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")).click();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click on drop down for program managers
		WebDriverWait wait811111111191 = new WebDriverWait(driver, 40);
		WebElement element81111111191 = wait811111111191.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")));
		
		driver.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/div")).click();
		
		//close edit form
		driver.findElement(By.xpath("//*[@id=\"form0\"]/div[5]/div/a")).click();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//logout as Client Admin
		driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Log in as CCL Admin
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://cclcoachingnexus-qa.ccl.org");
		driver1.manage().window().maximize();
		
	WebDriverWait wait1 = new WebDriverWait(driver1, 40);
	WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter CCL Admin email address and submit
	
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(ccladmemail);

WebDriverWait wait11 = new WebDriverWait(driver1, 40);
WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")));
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

WebDriverWait wait111 = new WebDriverWait(driver1, 40);
WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));


driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys(ccladmemail);
driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys(ccladmpwd);
driver1.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_SubmitButton\"]")).click();

WebDriverWait wait1111 = new WebDriverWait(driver1, 40);
WebElement element1111 = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idBtn_Back\"]")));

driver1.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();

//Select client Ford test
WebDriverWait wait11111 = new WebDriverWait(driver1, 40);
WebElement element111111111 = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")));

driver1.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")).click();
driver1.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

WebDriverWait wait1111111111 = new WebDriverWait(driver1, 40);
wait1111111111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));

		
		
		
		
		//Go to Admin Directory page
		
		driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait11111111111 = new WebDriverWait(driver1, 40);
		WebElement element1111111111 = wait11111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
		
		//Click on search and search for the executive admin
		driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(execadmin);
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//OPen Admin profile page
		driver1.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();
		
		WebDriverWait wait111111111111 = new WebDriverWait(driver1, 40);
		WebElement element11111111111 = wait111111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
		
		//Edit first name, last name and email address
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver1.findElement(By.xpath("//*[@id=\"FirstName\"]")).clear();
		
		driver1.findElement(By.xpath("//*[@id=\"LastName\"]")).clear();
		
		driver1.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver1.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(changefirstname);
		
		driver1.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(changelastname);
		
		driver1.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(changeemailadd);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//Change Admin as an Integrated Admin
		
		WebElement CoachingType_dropdown=driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
		Select Int_dd=new Select(CoachingType_dropdown);
		Int_dd.selectByIndex(1);		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Scroll down and save
		JavascriptExecutor je1111 = (JavascriptExecutor)driver1;
		WebElement element111111111111 = driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
		je1111.executeScript("arguments[0].scrollIntoView(true);", element111111111111);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		//logout as CCL Admin
		driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver1.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		//Log in again as Client Admin and ensure Executive admin edited to Integrated Admin is available in the drop down
	
		WebDriver driver11 =new ChromeDriver();
		driver11.get("https://cclcoachingnexus-qa.ccl.org");
		driver11.manage().window().maximize();
		
	WebDriverWait wait2 = new WebDriverWait(driver11, 40);
	WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Client Admin email address and password
	
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();


		//Go to ICR page
WebDriverWait wait271111111 = new WebDriverWait(driver11, 40);
WebElement element27111111 = wait271111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")));

		driver11.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click on +NewICR
		WebDriverWait wait2111111 = new WebDriverWait(driver11, 40);
		WebElement element211111 = wait2111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));
		
	
	
		
		//Click on +NewICR
				WebDriverWait wait81111111 = new WebDriverWait(driver11, 40);
				WebElement element811111 = wait81111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));
				
				driver11.findElement(By.xpath("//*[@id=\"NewIcrButton\"]")).click();
				
				
				WebDriverWait wait811111111 = new WebDriverWait(driver11, 40);
				WebElement element8111111 = wait811111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")));
				
				
				//set country and skill team
				WebElement country_dropdown1=driver11.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]"));
				Select Cou_dd1=new Select(country_dropdown1);
				Cou_dd1.selectByIndex(17);		
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement Skillteam_dropdown1=driver11.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
				Select ST_dd1=new Select(Skillteam_dropdown1);
				ST_dd1.selectByIndex(14);		
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Click on Program manager dropdown
				driver11.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				//close form
				driver11.findElement(By.xpath("//*[@id=\"ICRInlineDetailForm\"]/table/tbody/tr/td[1]/a")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Filter for Invitation sent stage and click on group edit
				
				WebElement ICRStage_dropdown111=driver11.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
				Select Stage_dd111=new Select(ICRStage_dropdown111);
				Stage_dd111.selectByIndex(2);		
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Click on check box
				WebDriverWait wait911111111 = new WebDriverWait(driver11, 40);
				WebElement element91111111 = wait911111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")));
				
				driver11.findElement(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")).click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Click on Group edit form
				WebDriverWait wait9111111111 = new WebDriverWait(driver11, 40);
				WebElement element911111111 = wait9111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GridControls\"]/button[1]")));
				
				driver11.findElement(By.xpath("//*[@id=\"GridControls\"]/button[1]")).click();
				
				
				//Opens group edit form
				WebDriverWait wait91111111111 = new WebDriverWait(driver11, 40);
				WebElement element9111111111 = wait91111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")));
				
				driver11.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver11.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/div")).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Close form
				driver11.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				//Click on Edit button for an ICR
				
				driver11.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")).click();
				
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Click on drop down for program managers
				WebDriverWait wait81111111111 = new WebDriverWait(driver11, 40);
				WebElement element8111111111 = wait81111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")));
				
				driver11.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver11.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/div")).click();
				
				//close edit form
				driver11.findElement(By.xpath("//*[@id=\"form0\"]/div[5]/div/a")).click();
				
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
				//Filter for To be Invited stage
				
				WebElement ICRStage_dropdown211=driver11.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
				Select Stage_dd211=new Select(ICRStage_dropdown211);
				Stage_dd211.selectByIndex(0);		
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Click on check box
				WebDriverWait wait21111111191 = new WebDriverWait(driver11, 40);
				WebElement element2111111191 = wait21111111191.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")));
				
				driver11.findElement(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Click on Group edit form
				WebDriverWait wait6111111111911 = new WebDriverWait(driver11, 40);
				WebElement element611111111911 = wait6111111111911.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GridControls\"]/button[1]")));
				
				driver11.findElement(By.xpath("//*[@id=\"GridControls\"]/button[1]")).click();
				
				
				//Opens group edit form
				WebDriverWait wait111111111912 = new WebDriverWait(driver11, 40);
				WebElement element11111111912 = wait111111111912.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")));
				
				driver11.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver11.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/div")).click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Close form
				driver11.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				//Click on Edit button for an ICR
				
				driver11.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")).click();
				
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Click on drop down for program managers
				WebDriverWait wait8111111111912 = new WebDriverWait(driver11, 40);
				WebElement element811111111912 = wait8111111111912.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")));
				
				driver11.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver11.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/div")).click();
				
				//close edit form
				driver11.findElement(By.xpath("//*[@id=\"form0\"]/div[5]/div/a")).click();
				
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
						
				
				
	
				
				
		//Log out
				driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		driver11.quit();
		
		
		
		
		
		
		
		

	
		
		
		
		
		
		
		//Log in as CCL Admin and make changes to security filters for the two client Admin's
		
		WebDriver driver111 =new ChromeDriver();
		driver111.get("https://cclcoachingnexus-qa.ccl.org");
		driver111.manage().window().maximize();
		
	WebDriverWait wait91 = new WebDriverWait(driver111, 40);
	WebElement element91 = wait91.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter CCL Admin email address and submit
	
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(ccladmemail);

WebDriverWait wait911 = new WebDriverWait(driver111, 40);
WebElement element911 = wait911.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")));
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

WebDriverWait wait9111 = new WebDriverWait(driver111, 40);
WebElement element9111 = wait9111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));


driver111.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys(ccladmemail);
driver111.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys(ccladmpwd);
driver111.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_SubmitButton\"]")).click();

WebDriverWait wait91111 = new WebDriverWait(driver111, 40);
WebElement element91111 = wait91111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idBtn_Back\"]")));

driver111.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();

//Select client Ford test
WebDriverWait wait911111 = new WebDriverWait(driver111, 40);
WebElement element91111111111 = wait911111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")));

driver111.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")).click();
driver111.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

WebDriverWait wait381111111111 = new WebDriverWait(driver111, 40);
wait381111111111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));

		
		
		
		
		//Go to Admin Directory page
		
		driver111.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait811111111111 = new WebDriverWait(driver111, 40);
		WebElement element81111111111 = wait811111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
		
		//Click on search and search for the Executive admin changed to Integrated Admin
		driver111.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(changeemailadd);
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//OPen Admin profile page
		driver111.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
		
		WebDriverWait wait8111111111111 = new WebDriverWait(driver111, 40);
		WebElement element811111111111 = wait8111111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
		
		//Edit SECURITY FILTERS TO HAVE ONLY 'aUTONOMOUS vEHICLES' and 'Australia'
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//Edit skill team to only select Autonomous vehicles
		driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[2]/a/label")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait511111 = new WebDriverWait(driver111, 40);
		wait511111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]")));
		
		//OPen Admin profile page
				
		WebDriverWait wait81111111111118 = new WebDriverWait(driver111, 40);
		WebElement element8111111111118 = wait81111111111118.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
		
		driver111.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
				
				WebDriverWait wait811111111111181 = new WebDriverWait(driver111, 40);
				WebElement element81111111111181 = wait811111111111181.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
				
				//Edit SECURITY FILTERS TO HAVE ONLY 'aUSTRALIA'
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		//Edit country to only select Australia
				driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[3]/a/label")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		
		
				WebDriverWait wait5211111 = new WebDriverWait(driver111, 40);
				wait5211111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]")));

		
		
		
		//Make changes to Integrated client admin security filters
				WebDriverWait wait8111111111117 = new WebDriverWait(driver111, 40);
				WebElement element811111111117 = wait8111111111117.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
				
				//Click on search and search for the Executive admin changed to Integrated Admin
				driver111.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).clear();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver111.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(clientadmemail);
				
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//OPen Admin profile page
				driver111.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
				
				WebDriverWait wait81111111111117 = new WebDriverWait(driver111, 40);
				WebElement element8111111111117 = wait81111111111117.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
				
				//Edit SECURITY FILTERS TO  not have 'aUTONOMOUS vEHICLES' and 'Australia'
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		//Edit skill team to only select Autonomous vehicles
				driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[2]/a/label")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				WebDriverWait wait5111111 = new WebDriverWait(driver111, 40);
				wait5111111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]")));
				
				//OPen Admin profile page
						
				WebDriverWait wait811111111111187 = new WebDriverWait(driver111, 40);
				WebElement element81111111111187 = wait811111111111187.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
				
				driver111.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
						
						WebDriverWait wait8111111111111871 = new WebDriverWait(driver111, 40);
						WebElement element811111111111871 = wait8111111111111871.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
						
						//Edit SECURITY FILTERS TO HAVE ONLY 'aUSTRALIA'
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				//Edit country to only select Australia
						driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[3]/a/label")).click();
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();
						try {
							Thread.sleep(8000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
				
						}
						
						
						
						
						
						
						
						
						
						
						

						
						//Log in as Client Admin and check if security filters are applied
						
						//Log in again as Client Admin and ensure Executive admin edited to Integrated Admin is available in the drop down
						
						WebDriver driver1111 =new ChromeDriver();
						driver1111.get("https://cclcoachingnexus-qa.ccl.org");
						driver1111.manage().window().maximize();
						
					WebDriverWait wait21 = new WebDriverWait(driver1111, 40);
					WebElement element21 = wait21.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
					
				//Enter Client Admin email address and password
					
				driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
				driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
				driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();


						//Go to ICR page
				WebDriverWait wait2711111111 = new WebDriverWait(driver1111, 40);
				WebElement element271111111 = wait2711111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")));

						driver1111.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")).click();
						try {
							Thread.sleep(6000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//Click on +NewICR
						WebDriverWait wait21111111 = new WebDriverWait(driver1111, 40);
						WebElement element2111111 = wait21111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));
						
					
					
						
						//Click on +NewICR
								WebDriverWait wait28111111111 = new WebDriverWait(driver1111, 40);
								WebElement element281111111 = wait28111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));
								
								driver1111.findElement(By.xpath("//*[@id=\"NewIcrButton\"]")).click();
								
								
								WebDriverWait wait381111111111111 = new WebDriverWait(driver1111, 40);
								WebElement element3811111111 = wait381111111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")));
								
								
								//set country and skill team
								driver1111.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")).click();
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								WebElement country_dropdown11=driver1111.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]"));
								Select Cou_dd11=new Select(country_dropdown11);
								Cou_dd11.selectByIndex(17);		
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								driver1111.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]")).click();
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								WebElement Skillteam_dropdown11=driver1111.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
								Select ST_dd11=new Select(Skillteam_dropdown11);
								ST_dd11.selectByIndex(14);		
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								//Click on Program manager dropdown
								driver1111.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								
								
								//set country and skill team -
								WebElement country_dropdown211=driver1111.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]"));
								Select Cou_dd211=new Select(country_dropdown211);
								Cou_dd211.selectByIndex(3);		
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								WebElement Skillteam_dropdown311=driver1111.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
								Select ST_dd311=new Select(Skillteam_dropdown311);
								ST_dd311.selectByIndex(2);		
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								//Click on Program manager dropdown
								driver1111.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								//close form
								driver1111.findElement(By.xpath("//*[@id=\"ICRInlineDetailForm\"]/table/tbody/tr/td[1]/a")).click();
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								

								//click on filtered results 'i' button
								
								driver1111.findElement(By.xpath("//*[@id=\"GridControls\"]/span/a/span")).click();
								try {
									Thread.sleep(5000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								//close 
								driver1111.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
								
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								//Filter for Invitation sent stage and click on group edit
								
								WebElement ICRStage_dropdown311=driver1111.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
								Select Stage_dd311=new Select(ICRStage_dropdown311);
								Stage_dd311.selectByIndex(2);		
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								//Click on check box
								WebDriverWait wait911111111111 = new WebDriverWait(driver1111, 40);
								WebElement element911111111111 = wait911111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")));
								
								driver1111.findElement(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")).click();
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								//Click on Group edit form
								WebDriverWait wait9111111111111 = new WebDriverWait(driver1111, 40);
								WebElement element9111111111111 = wait9111111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GridControls\"]/button[1]")));
								
								driver1111.findElement(By.xpath("//*[@id=\"GridControls\"]/button[1]")).click();
								
								
								//Opens group edit form
								WebDriverWait wait91111111111111 = new WebDriverWait(driver1111, 40);
								WebElement element91111111111111 = wait91111111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")));
								
								driver1111.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")).click();
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								driver1111.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/div")).click();
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								//Close form
								driver1111.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
								try {
									Thread.sleep(8000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								//Click on Edit button for an ICR
								
								driver1111.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")).click();
								
								try {
									Thread.sleep(8000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								//Click on drop down for program managers
								WebDriverWait wait81111111119122 = new WebDriverWait(driver1111, 40);
								WebElement element8111111119122 = wait81111111119122.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")));
								
								driver1111.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")).click();
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								driver1111.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/div")).click();
								
								//close edit form
								driver1111.findElement(By.xpath("//*[@id=\"form0\"]/div[5]/div/a")).click();
								
								
								try {
									Thread.sleep(5000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								

								//Filter for To be Invited stage
								
								WebElement ICRStage_dropdown3211=driver1111.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
								Select Stage_dd3211=new Select(ICRStage_dropdown3211);
								Stage_dd3211.selectByIndex(0);		
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								//Click on check box
								WebDriverWait wait211111111912 = new WebDriverWait(driver1111, 40);
								WebElement element21111111912 = wait211111111912.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")));
								
								driver1111.findElement(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")).click();
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								//Click on Group edit form
								WebDriverWait wait61111111119112 = new WebDriverWait(driver1111, 40);
								WebElement element6111111119112 = wait61111111119112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GridControls\"]/button[1]")));
								
								driver1111.findElement(By.xpath("//*[@id=\"GridControls\"]/button[1]")).click();
								
								
								//Opens group edit form
								WebDriverWait wait1111111119121 = new WebDriverWait(driver1111, 40);
								WebElement element111111119121 = wait1111111119121.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")));
								
								driver1111.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")).click();
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								driver1111.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/div")).click();
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								//Close form
								driver1111.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
								try {
									Thread.sleep(8000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								
								//Click on Edit button for an ICR
								
								driver1111.findElement(By.xpath("//*[@id=\"candidateTable\"]/tbody/tr[1]/td[2]/a/i")).click();
								
								try {
									Thread.sleep(8000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								//Click on drop down for program managers
								WebDriverWait wait811111111191221 = new WebDriverWait(driver1111, 40);
								WebElement element81111111191221 = wait811111111191221.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")));
								
								driver1111.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")).click();
								try {
									Thread.sleep(3000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								driver1111.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/div")).click();
								
								//close edit form
								driver1111.findElement(By.xpath("//*[@id=\"form0\"]/div[5]/div/a")).click();
								
								
								try {
									Thread.sleep(5000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
					
								
								
								
								
								
								
								
								
								
								
								
								
						//Log out
								driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
								try {
									Thread.sleep(6000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						
						driver1111.quit();
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						//In CCL Admin page reset data filters for both Admins
				
						//Click on search and search for the Executive admin changed to Integrated Admin
						driver111.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).clear();
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						driver111.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(changeemailadd);
						
						try {
							Thread.sleep(8000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						//OPen Admin profile page
						
					
						driver111.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();
						
						WebDriverWait wait611111111111 = new WebDriverWait(driver111, 40);
						WebElement element61111111111 = wait611111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
						
						//Edit first name, last name and email address
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						driver111.findElement(By.xpath("//*[@id=\"FirstName\"]")).clear();
						
						driver111.findElement(By.xpath("//*[@id=\"LastName\"]")).clear();
						
						driver111.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						driver111.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(execfirstname);
						
						driver111.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(execlastname);
						
						driver111.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(execadmin);
						
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						
						//Change Admin as an Executive Admin
						
						WebElement CoachingType_dropdown1=driver111.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
						Select Int_dd1=new Select(CoachingType_dropdown1);
						Int_dd1.selectByIndex(0);		
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						//edit security filters to select all
						//Edit Skill team data filter to select all
						//Edit skill team to only select Autonomous vehicles
						driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button")).click();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();
						try {
							Thread.sleep(6000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						WebDriverWait wait51111111 = new WebDriverWait(driver111, 40);
						wait51111111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]")));
										
						//OPen profile page again and save country filters
						WebDriverWait wait81111111111118711 = new WebDriverWait(driver111, 40);
						WebElement element8111111111118711 = wait81111111111118711.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
						
						driver111.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
								
								WebDriverWait wait811111111111187111 = new WebDriverWait(driver111, 40);
								WebElement element81111111111187111 = wait811111111111187111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
								
						//Edit country to only select Australia
						driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
		
						driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
				
				
				
						WebDriverWait wait52111111 = new WebDriverWait(driver111, 40);
						wait52111111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]")));

						
					//Reset security filters for Integrated Admin as well
						//Make changes to Integrated client admin security filters
						WebDriverWait wait81111111111171 = new WebDriverWait(driver111, 40);
						WebElement element8111111111171 = wait81111111111171.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
						
						//Click on search and search for the Executive admin changed to Integrated Admin
						driver111.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).clear();
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						driver111.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(clientadmemail);
						
						try {
							Thread.sleep(8000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						//OPen Admin profile page
						driver111.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
						
						WebDriverWait wait811111111111171 = new WebDriverWait(driver111, 40);
						WebElement element81111111111171 = wait811111111111171.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
						
						//Edit SECURITY FILTERS TO HAVE select all
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				//Edit skill team to select all
						driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button")).click();
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				
						WebDriverWait wait511111111 = new WebDriverWait(driver111, 40);
						wait511111111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]")));
						
						//OPen Admin profile page
								
						WebDriverWait wait8111111111111871111 = new WebDriverWait(driver111, 40);
						WebElement element811111111111871111 = wait8111111111111871111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
						
						driver111.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
								
								WebDriverWait wait81111111111118711111 = new WebDriverWait(driver111, 40);
								WebElement element8111111111118711111 = wait81111111111118711111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
								
								//Edit SECURITY FILTERS TO HAVE select all
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						//Edit country to select all
								driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								
								driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								driver111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();
								try {
									Thread.sleep(8000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
						
								}
								
	
								
								
								
								
						
						
						
						
								
	}

}
