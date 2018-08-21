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

public class Suite35a {

	public static void main(String[] args) throws IOException {
		
		String ccladmemail=null;
		String ccladmpwd=null;

		String execadmin=null;
		
		String changefirstname=null;
		String changelastname=null;
		String changeemailadd=null;
		
		String execfirstname=null;
		String execlastname=null;
		
		
		String execadmpwd=null;
		
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\UAT\\FordTest\\Suite35a.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite35a");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
	
		XSSFRow row2=sheet1.getRow(11);
		XSSFCell cell3=row2.getCell(4);
		
		
		XSSFRow row3=sheet1.getRow(17);
		XSSFCell cell4=row3.getCell(4);
		
		XSSFRow row4=sheet1.getRow(18);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(19);
		XSSFCell cell6=row5.getCell(4);
		
		
		XSSFRow row6=sheet1.getRow(30);
		XSSFCell cell7=row6.getCell(4);
		
		XSSFRow row7=sheet1.getRow(31);
		XSSFCell cell8=row7.getCell(4);
		
		XSSFRow row8=sheet1.getRow(16);
		XSSFCell cell9=row8.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();

		execadmin=cell3.toString();
		
		changefirstname=cell4.toString();
		changelastname=cell5.toString();
		changeemailadd=cell6.toString();
		
		execfirstname=cell7.toString();
		execlastname=cell8.toString();
		
		execadmpwd=cell9.toString();
		
		
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
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Go to ICR page
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[4]/a")).click();
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
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/div")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Close form
		driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
		try {
			Thread.sleep(5000);
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
		
		
		
		
		
		
		
		
		
		
		
		//Go to Admin Directory page
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait1111111111 = new WebDriverWait(driver, 40);
		WebElement element111111111 = wait1111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
		
		//Click on search and search for the executive admin
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(execadmin);
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//OPen Admin profile page
		driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();
		
		WebDriverWait wait11111111111 = new WebDriverWait(driver, 40);
		WebElement element1111111111 = wait11111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
		
		
		//Change Admin as an Integrated Admin
		
		WebElement CoachingType_dropdown=driver.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
		Select Int_dd=new Select(CoachingType_dropdown);
		Int_dd.selectByIndex(1);		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Scroll down and save
		JavascriptExecutor je1111 = (JavascriptExecutor)driver;
		WebElement element11111111111 = driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
		je1111.executeScript("arguments[0].scrollIntoView(true);", element11111111111);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Log in as Client Admin
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://cclcoachingnexus-uat.ccl.org");
		driver1.manage().window().maximize();
		
	WebDriverWait wait2 = new WebDriverWait(driver1, 40);
	WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Client Admin email address and password
	
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(execadmin);
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(execadmpwd);
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
		

//Go to Account settings page
WebDriverWait wait21 = new WebDriverWait(driver1, 40);
WebElement element21 = wait21.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")));
driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li/a/span[2]")).click();

WebDriverWait wait6611111111111 = new WebDriverWait(driver1, 40);
WebElement element661111111111 = wait6611111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));

		//Edit first name, last name and email address
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver1.findElement(By.xpath("//*[@id=\"FirstName\"]")).clear();
		
		driver1.findElement(By.xpath("//*[@id=\"LastName\"]")).clear();
		
		driver1.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
		
		try {
			Thread.sleep(2000);
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
		//Scroll down and save
				JavascriptExecutor je11111 = (JavascriptExecutor)driver1;
				WebElement element111111111111 = driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
				je11111.executeScript("arguments[0].scrollIntoView(true);", element111111111111);
				try {
					Thread.sleep(2000);
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

		
				//log out
				driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		driver1.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		WebDriverWait wait511111111111 = new WebDriverWait(driver, 40);
		WebElement element51111111111 = wait511111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[4]/a")));
		
		//Go to ICR page	
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[4]/a")).click();
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Click on +NewICR
				WebDriverWait wait3111111 = new WebDriverWait(driver, 40);
				WebElement element311111 = wait3111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));
				
				driver.findElement(By.xpath("//*[@id=\"NewIcrButton\"]")).click();
				
				
				WebDriverWait wait31111111 = new WebDriverWait(driver, 40);
				WebElement element3111111 = wait31111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")));
				
				
				//set country and skill team
				driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement country_dropdown1=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]"));
				Select Cou_dd1=new Select(country_dropdown1);
				Cou_dd1.selectByIndex(17);		
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement Skillteam_dropdown1=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
				Select ST_dd1=new Select(Skillteam_dropdown1);
				ST_dd1.selectByIndex(14);		
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Click on Program manager dropdown
				driver.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
				try {
					Thread.sleep(5000);
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
				
				WebElement ICRStage_dropdown1=driver.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
				Select Stage_dd1=new Select(ICRStage_dropdown1);
				Stage_dd1.selectByIndex(2);		
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Click on check box
				WebDriverWait wait211111111 = new WebDriverWait(driver, 40);
				WebElement element21111111 = wait211111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")));
				
				driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//click group edit button
				driver.findElement(By.xpath("//*[@id=\"GridControls\"]/button[1]")).click();
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Opens group edit form
				WebDriverWait wait1111111112 = new WebDriverWait(driver, 40);
				WebElement element111111112 = wait1111111112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")));
				
				driver.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")).click();
				try {
					Thread.sleep(5000);
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
				WebDriverWait wait82111111111 = new WebDriverWait(driver, 40);
				WebElement element8211111111 = wait82111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")));
				
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
				
				WebElement ICRStage_dropdown111=driver.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
				Select Stage_dd111=new Select(ICRStage_dropdown111);
				Stage_dd111.selectByIndex(0);		
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Click on check box
				WebDriverWait wait11111111911 = new WebDriverWait(driver, 40);
				WebElement element1111111911 = wait11111111911.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")));
				
				driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Click on Group edit form
				WebDriverWait wait6111111111911 = new WebDriverWait(driver, 40);
				WebElement element611111111911 = wait6111111111911.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GridControls\"]/button[1]")));
				
				driver.findElement(By.xpath("//*[@id=\"GridControls\"]/button[1]")).click();
				
				
				//Opens group edit form
				WebDriverWait wait111111111911 = new WebDriverWait(driver, 40);
				WebElement element11111111911 = wait111111111911.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")));
				
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
				WebDriverWait wait8111111111911 = new WebDriverWait(driver, 40);
				WebElement element811111111911 = wait8111111111911.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")));
				
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
				
		
				
				
				
				
				
				
				
				
				//Go to Admin directory and set security filters to only Autonomous vehicles and Australia for the Integrated Admin
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				WebDriverWait wait61111111111 = new WebDriverWait(driver, 40);
				WebElement element6111111111 = wait61111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
				
				//Click on search and search for the Integrated Admin
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(changeemailadd);
				
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//OPen Admin profile page
				driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();
				
				WebDriverWait wait611111111111 = new WebDriverWait(driver, 40);
				WebElement element61111111111 = wait611111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
				
				
				//Set skill team to have only Autonomous vehicles
				
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[2]/a/label")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//OPen Admin profile page again
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//OPen Admin profile page
				driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();
				
				WebDriverWait wait6111111111111 = new WebDriverWait(driver, 40);
				WebElement element611111111111 = wait6111111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
				
				//Set country security filter to only Australia
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[3]/a/label")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
				WebDriverWait wait3511111111111 = new WebDriverWait(driver, 40);
				WebElement element351111111111 = wait3511111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[4]/a")));
				
				//Go to ICR page	
						driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[4]/a")).click();
						try {
							Thread.sleep(6000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						//Click on +NewICR
						WebDriverWait wait31111113 = new WebDriverWait(driver, 40);
						WebElement element3111113 = wait31111113.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));
						
						driver.findElement(By.xpath("//*[@id=\"NewIcrButton\"]")).click();
						
						
						WebDriverWait wait311111113 = new WebDriverWait(driver, 40);
						WebElement element31111113 = wait311111113.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")));
						
						
						//set country and skill team
						
						driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]"));
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						WebElement country_dropdown11=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]"));
						Select Cou_dd11=new Select(country_dropdown11);
						Cou_dd11.selectByIndex(17);		
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						WebElement Skillteam_dropdown11=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
						Select ST_dd11=new Select(Skillteam_dropdown11);
						ST_dd11.selectByIndex(14);		
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						
						//Click on Program manager dropdown
						driver.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
		//set country and skill team - Autonomous Vehicles and Australia
						
						driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]"));
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						WebElement country_dropdown111=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]"));
						Select Cou_dd111=new Select(country_dropdown111);
						Cou_dd111.selectByIndex(2);		
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						WebElement Skillteam_dropdown111=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
						Select ST_dd111=new Select(Skillteam_dropdown111);
						ST_dd111.selectByIndex(1);		
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						
						//Click on Program manager dropdown
						driver.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
						try {
							Thread.sleep(3000);
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
						
						WebElement ICRStage_dropdown1111=driver.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
						Select Stage_dd1111=new Select(ICRStage_dropdown1111);
						Stage_dd1111.selectByIndex(2);		
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//Click on check box
						WebDriverWait wait111111111111 = new WebDriverWait(driver, 40);
						WebElement element1111111111111 = wait111111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")));
						
						driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")).click();
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//Click on Group edit form
						WebDriverWait wait61111111111111 = new WebDriverWait(driver, 40);
						WebElement element6111111111111 = wait61111111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GridControls\"]/button[1]")));
						
						driver.findElement(By.xpath("//*[@id=\"GridControls\"]/button[1]")).click();
						
						
						//Opens group edit form
						WebDriverWait wait1111111111111 = new WebDriverWait(driver, 40);
						WebElement element11111111111111 = wait1111111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")));
						
						driver.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")).click();
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						driver.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/div")).click();
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						//Close form
						driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
						try {
							Thread.sleep(5000);
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
						WebDriverWait wait81111111111 = new WebDriverWait(driver, 40);
						WebElement element8111111111 = wait81111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")));
						
						driver.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")).click();
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						driver.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/div")).click();
						
						//Select country and skill team to values Australia and Autonomous
						
						driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div[1]/div/span[1]/div/button")).click();
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div[1]/div/span[1]/div/ul/li[3]/a/label")).click();
						
						driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div[2]/div/span[1]/div/button/span")).click();
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/div[2]/div/span[1]/div/ul/li[2]/a/label")).click();
						
						//Check program managers available
						
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
						
						WebElement ICRStage_dropdown11111=driver.findElement(By.xpath("//*[@id=\"IcrFilterDropdown\"]"));
						Select Stage_dd11111=new Select(ICRStage_dropdown11111);
						Stage_dd11111.selectByIndex(0);		
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//Click on check box
						WebDriverWait wait111111119111 = new WebDriverWait(driver, 40);
						WebElement element11111119111 = wait111111119111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")));
						
						driver.findElement(By.xpath("//*[@id=\"candidateTable\"]/thead/tr/th[1]/div[1]/input")).click();
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//Click on Group edit form
						WebDriverWait wait61111111119111 = new WebDriverWait(driver, 40);
						WebElement element6111111119111 = wait61111111119111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GridControls\"]/button[1]")));
						
						driver.findElement(By.xpath("//*[@id=\"GridControls\"]/button[1]")).click();
						
						
						//Opens group edit form
						WebDriverWait wait1111111119111 = new WebDriverWait(driver, 40);
						WebElement element111111119111 = wait1111111119111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/button")));
						
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
						WebDriverWait wait81111111119111 = new WebDriverWait(driver, 40);
						WebElement element8111111119111 = wait81111111119111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form0\"]/div[3]/div[4]/span[1]/div/button/span")));
						
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
						
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//Go to Admin Directory page
				
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				WebDriverWait wait661111111111 = new WebDriverWait(driver, 40);
				WebElement element66111111111 = wait661111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
				
				//Click on search and search for the Integrated Admin
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(changeemailadd);
				
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//OPen Admin profile page
				driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();
				
				WebDriverWait wait66611111111111 = new WebDriverWait(driver, 40);
				WebElement element6661111111111 = wait66611111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
				
				//Edit first name, last name and email address
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).clear();
				
				driver.findElement(By.xpath("//*[@id=\"LastName\"]")).clear();
				
				driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(execfirstname);
				
				driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(execlastname);
				
				driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(execadmin);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				//Change Admin as an Executive Admin
				
				WebElement CoachingType_dropdown1=driver.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
				Select Int_dd1=new Select(CoachingType_dropdown1);
				Int_dd1.selectByIndex(0);		
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
//Set skill team to have only Autonomous vehicles
				
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//OPen Admin profile page again
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//OPen Admin profile page
				driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();
				
				WebDriverWait wait611111111111111 = new WebDriverWait(driver, 40);
				WebElement element61111111111111 = wait611111111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
				
				//Set country security filter to only Australia
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();
				try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
				
				
				
		
	}

}
