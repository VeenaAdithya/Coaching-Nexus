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
		
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\Suite35a.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite35a");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
	
		XSSFRow row2=sheet1.getRow(11);
		XSSFCell cell3=row2.getCell(4);
		
		
		XSSFRow row3=sheet1.getRow(16);
		XSSFCell cell4=row3.getCell(4);
		
		XSSFRow row4=sheet1.getRow(17);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(18);
		XSSFCell cell6=row5.getCell(4);
		
		
		XSSFRow row6=sheet1.getRow(29);
		XSSFCell cell7=row6.getCell(4);
		
		XSSFRow row7=sheet1.getRow(30);
		XSSFCell cell8=row7.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();

		execadmin=cell3.toString();
		
		changefirstname=cell4.toString();
		changelastname=cell5.toString();
		changeemailadd=cell6.toString();
		
		execfirstname=cell7.toString();
		execlastname=cell8.toString();
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
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement Skillteam_dropdown=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
		Select ST_dd=new Select(Skillteam_dropdown);
		ST_dd.selectByIndex(14);		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click on Program manager dropdown
		driver.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
		try {
			Thread.sleep(7000);
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
			Thread.sleep(4000);
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
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/div")).click();
		try {
			Thread.sleep(3000);
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
		
		//Edit first name, last name and email address
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(changefirstname);
		
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(changelastname);
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(changeemailadd);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//Change Admin as an Integrated Admin
		
		WebElement CoachingType_dropdown=driver.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
		Select Int_dd=new Select(CoachingType_dropdown);
		Int_dd.selectByIndex(1);		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Scroll down and save
		JavascriptExecutor je1111 = (JavascriptExecutor)driver;
		WebElement element11111111111 = driver.findElement(By.xpath("//*[@id=\"btnSaveCoacheeProfile\"]"));
		je1111.executeScript("arguments[0].scrollIntoView(true);", element11111111111);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"btnSaveCoacheeProfile\"]")).click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
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
				WebElement country_dropdown1=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]"));
				Select Cou_dd1=new Select(country_dropdown1);
				Cou_dd1.selectByIndex(17);		
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement Skillteam_dropdown1=driver.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
				Select ST_dd1=new Select(Skillteam_dropdown1);
				ST_dd1.selectByIndex(14);		
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Click on Program manager dropdown
				driver.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
				try {
					Thread.sleep(7000);
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
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath("//*[@id=\"GroupEditForm\"]/div[1]/div[2]/span/div/div")).click();
				try {
					Thread.sleep(3000);
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
				
		
				
				
		
				
				
				
				
				
				
				
				
				
				
				
				//Go to Admin Directory page
				
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
				
				//Edit first name, last name and email address
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).clear();
				
				driver.findElement(By.xpath("//*[@id=\"LastName\"]")).clear();
				
				driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(execfirstname);
				
				driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(execlastname);
				
				driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(execadmin);
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				//Change Admin as an Executive Admin
				
				WebElement CoachingType_dropdown1=driver.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
				Select Int_dd1=new Select(CoachingType_dropdown1);
				Int_dd1.selectByIndex(0);		
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Scroll down and save
				JavascriptExecutor je11111 = (JavascriptExecutor)driver;
				WebElement element711111111111 = driver.findElement(By.xpath("//*[@id=\"btnSaveCoacheeProfile\"]"));
				je11111.executeScript("arguments[0].scrollIntoView(true);", element711111111111);
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"btnSaveCoacheeProfile\"]")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
		
	}

}
