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

public class Suite04b {

	public static void main(String[] args) throws IOException {
		
		
		String ccladmemail=null;
		String ccladmpwd=null;
		
		String ExecAdmin=null;
		String ExecAdminpwd=null;
		
		String changeemailaddadm=null;
	
		String execpart=null;
		String intpart=null;
		
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite04.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite04b");

		XSSFRow row=sheet1.getRow(1);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(2);
		XSSFCell cell2=row1.getCell(4);

		
		XSSFRow row2=sheet1.getRow(6);
		XSSFCell cell3=row2.getCell(4);
		
		XSSFRow row3=sheet1.getRow(9);
		XSSFCell cell4=row3.getCell(4);
		
		XSSFRow row4=sheet1.getRow(11);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(17);
		XSSFCell cell6=row5.getCell(4);
		
		XSSFRow row6=sheet1.getRow(18);
		XSSFCell cell7=row6.getCell(4);
		
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		
		ExecAdmin=cell3.toString();
		ExecAdminpwd=cell4.toString();
		
		changeemailaddadm=cell5.toString();
	 	
		execpart=cell6.toString();
		intpart=cell7.toString();
		
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

		try {
			Thread.sleep(7000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		//Go to admin directory page and search for the Global Admin

		WebDriverWait wait111111 = new WebDriverWait(driver1, 40);
		WebElement element11111 = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")));

		driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).click();
		try {
			Thread.sleep(2000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}
		WebDriverWait wait4111111 = new WebDriverWait(driver1, 40);
		WebElement element411111 = wait4111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));

		driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(ExecAdmin);

		try {
			Thread.sleep(7000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		//Open profile page for the Admin
		driver1.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();

		try {
			Thread.sleep(7000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		//Set coaching type access to Integrated
		WebElement coachingType_dropdown=driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
		Select CT_dd=new Select(coachingType_dropdown);
		CT_dd.selectByIndex(1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//Scroll down and save 
		JavascriptExecutor je111 = (JavascriptExecutor)driver1;
		WebElement element211111111 = driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
		je111.executeScript("arguments[0].scrollIntoView(true);", element211111111);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();

		try {
			Thread.sleep(7000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		

		
		
		
		//----------------------------------------------------------------------
		
		//Log in as Client Admin and edit email address
		
		WebDriver driver11 =new ChromeDriver();
		driver11.get("https://cclcoachingnexus-qa.ccl.org");
		driver11.manage().window().maximize();
		
	WebDriverWait wait = new WebDriverWait(driver11, 40);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Client Admin email address and password
	
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(ExecAdmin);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(ExecAdminpwd);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//Scroll down
JavascriptExecutor js = (JavascriptExecutor) driver11;
js.executeScript("window.scrollBy(0,1000)");
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Click on Register button and verify

driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();


//Click on Admin name
driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();

try {
	Thread.sleep(3000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//Click on account settings
driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li/a/span[2]")).click();

try {
	Thread.sleep(9000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//edit email address
driver11.findElement(By.xpath("//*[@id=\"Email\"]")).clear();

driver11.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(changeemailaddadm);
try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}


//Scroll down and save

JavascriptExecutor je1 = (JavascriptExecutor)driver11;
WebElement element2111 = driver11.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je1.executeScript("arguments[0].scrollIntoView(true);", element2111);
try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
driver11.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();		
try {
	Thread.sleep(9000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}


//Log out
WebDriverWait wait22 = new WebDriverWait(driver11, 40);
WebElement element22 = wait22.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")));
driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
	Thread.sleep(4000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
driver11.quit();

		
		
		

//----------------------------------------------------------------------------------------------------

//In CCL Admin page, Open Participnat Registration form 

driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[5]/a/span")).click();
try {
	Thread.sleep(4000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//Click on Client Admin drop down - TEST ADMIN must not be available

WebDriverWait wait23 = new WebDriverWait(driver1, 40);
WebElement element23 = wait23.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ClientAdminId\"]")));

driver1.findElement(By.xpath("//*[@id=\"ClientAdminId\"]")).click();
try {
	Thread.sleep(6000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
driver1.findElement(By.xpath("//*[@id=\"ClientAdminId\"]")).click();


//Close registration form
		driver1.findElement(By.xpath("//*[@id=\"registerCoachee\"]/div/div/div[1]/button/i")).click();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


//Go to ICR page

driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[4]/a")).click();
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Click on +NewICR
WebDriverWait wait1111111 = new WebDriverWait(driver1, 40);
WebElement element111111 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));

driver1.findElement(By.xpath("//*[@id=\"NewIcrButton\"]")).click();


WebDriverWait wait11111111 = new WebDriverWait(driver1, 40);
WebElement element1111111 = wait11111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")));

//Click on Program manager dropdown
driver1.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();

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
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Click on Program manager dropdown
driver1.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//close form
driver1.findElement(By.xpath("//*[@id=\"ICRInlineDetailForm\"]/table/tbody/tr/td[1]/a")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



//Go to Participant Roster page
driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a/span")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//search for an active executive participant

WebDriverWait wait111111112 = new WebDriverWait(driver1, 40);
WebElement element11111112 = wait111111112.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));

driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(execpart);
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebDriverWait wait1111111121 = new WebDriverWait(driver1, 40);
WebElement element111111121 = wait1111111121.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));

driver1.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr[1]/td[2]/div/div[1]/a/div[2]")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr[1]/td[2]/div/div[1]/a/div[2]")).click();

driver1.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();




//Search for an active Integrated Participant

WebDriverWait wait11111111211 = new WebDriverWait(driver1, 40);
WebElement element1111111211 = wait11111111211.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));

driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(intpart);
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebDriverWait wait11111111212 = new WebDriverWait(driver1, 40);
WebElement element1111111212 = wait11111111212.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));

driver1.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr[1]/td[2]/div/div[1]/a/div[2]")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr[1]/td[2]/div/div[1]/a/div[2]")).click();

driver1.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();










		
	}

}
