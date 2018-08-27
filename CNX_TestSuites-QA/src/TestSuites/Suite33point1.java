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

public class Suite33point1 {

	public static void main(String[] args) throws IOException {
		
		
		String financecoord=null;
		String fincoordpassword=null;
		
		String changeemailadd=null;
		String changecontact=null;
		
		String GlobalAdm=null;
		String Globaladmpwd=null;

		String ccladmemail=null;
		String ccladmpwd=null;
		
		String execadmin=null;
		String execadmpwd=null;
		String changeemailaddadm=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite33.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite33point1");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row2=sheet1.getRow(7);
		XSSFCell cell3=row2.getCell(4);
		
		XSSFRow row3=sheet1.getRow(8);
		XSSFCell cell4=row3.getCell(4);
		
		XSSFRow row4=sheet1.getRow(11);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(12);
		XSSFCell cell6=row5.getCell(4);
		
		XSSFRow row6=sheet1.getRow(19);
		XSSFCell cell7=row6.getCell(4);
		
		XSSFRow row7=sheet1.getRow(20);
		XSSFCell cell8=row7.getCell(4);
		
		XSSFRow row8=sheet1.getRow(26);
		XSSFCell cell9=row8.getCell(4);
		
		XSSFRow row9=sheet1.getRow(30);
		XSSFCell cell10=row9.getCell(4);
		
		XSSFRow row10=sheet1.getRow(32);
		XSSFCell cell11=row10.getCell(4);
		
		financecoord=cell1.toString();
		fincoordpassword=cell2.toString();

		changeemailadd=cell3.toString();
		changecontact=cell4.toString();
		
		GlobalAdm=cell5.toString();
		Globaladmpwd=cell6.toString();
		
		ccladmemail=cell7.toString();
		ccladmpwd=cell8.toString();
		
		execadmin=cell9.toString();
		execadmpwd=cell10.toString();
		
		changeemailaddadm=cell11.toString();
		
		//Open Chrome and Finance Coordinator Page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://cclcoachingnexus-qa.ccl.org");
		driver.manage().window().maximize();
		
	WebDriverWait wait = new WebDriverWait(driver, 40);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Finance Coordinator email address and password
	
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(financecoord);
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(fincoordpassword);
driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();


//Make changes to Account settings and ensure changes are saved
WebDriverWait wait1 = new WebDriverWait(driver, 40);
WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li/a")).click();
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Edit email address and contact number

WebDriverWait wait11 = new WebDriverWait(driver, 40);
WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Email\"]")));

driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();

driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(changeemailadd);
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
		
//Change contact number
driver.findElement(By.xpath("//*[@id=\"Phone\"]")).clear();

driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys(changecontact);
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//save
JavascriptExecutor je = (JavascriptExecutor)driver;
WebElement element111 = driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je.executeScript("arguments[0].scrollIntoView(true);", element111);				
driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();
try {
Thread.sleep(9000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Log out

driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a")).click();

try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver.quit();
































//Log in as the Global Admin


WebDriver driver1 =new ChromeDriver();
driver1.get("https://cclcoachingnexus-qa.ccl.org");
driver1.manage().window().maximize();

WebDriverWait wait111 = new WebDriverWait(driver1, 40);
WebElement element1111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

//Enter Global Admin email address and password

driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(GlobalAdm);
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(Globaladmpwd);
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//Scroll down - VERIFY COACHING PACKAGES AND LEFT NAV WINDOW

JavascriptExecutor js = (JavascriptExecutor) driver1;
js.executeScript("window.scrollBy(0,1000)");
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Click on Register button and verify

driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();


//Go to Admin directory page

driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a/span")).click();


WebDriverWait wait1111 = new WebDriverWait(driver1, 40);
WebElement element11111 = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));

driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(changeemailadd);

try {
Thread.sleep(7000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//click on the finance coordinator - verify change in phone number and email address
driver1.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();


//Click to view entire list of security filters
WebDriverWait wait311111 = new WebDriverWait(driver1, 40);
WebElement element3111111 = wait311111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[2]/a")));
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[2]/a")).click();
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[3]/a")).click();

try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//close
driver1.findElement(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]/div/button/i")).click();

try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

WebDriverWait wait11111 = new WebDriverWait(driver1, 40);
WebElement element111111 = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a")));

driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a")).click();

try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver1.quit();





















//Log in as ccl admin
WebDriver driver11 =new ChromeDriver();
driver11.get("https://cclcoachingnexus-qa.ccl.org");
driver11.manage().window().maximize();

WebDriverWait wait2 = new WebDriverWait(driver11, 40);
WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

//Enter CCL Admin email address and submit

driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(ccladmemail);

WebDriverWait wait21 = new WebDriverWait(driver11, 40);
WebElement element21 = wait21.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")));
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

WebDriverWait wait211 = new WebDriverWait(driver11, 40);
WebElement element211 = wait211.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")));


driver11.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UsernameTextBox\"]")).sendKeys(ccladmemail);
driver11.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_PasswordTextBox\"]")).sendKeys(ccladmpwd);
driver11.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_SubmitButton\"]")).click();

WebDriverWait wait2111 = new WebDriverWait(driver11, 40);
WebElement element2111 = wait2111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idBtn_Back\"]")));

driver11.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();

//Select client Ford test
WebDriverWait wait21111 = new WebDriverWait(driver11, 40);
WebElement element21111 = wait21111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")));

driver11.findElement(By.xpath("//*[@id=\"divChangeClient\"]/div[3]/label")).click();
driver11.findElement(By.xpath("//*[@id=\"btnChangeClient\"]")).click();

WebDriverWait wait211111 = new WebDriverWait(driver11, 40);
wait211111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"changeClient\"]/div/div/div[1]")));

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//Go to admin directory page and search for the client whose email address is edited

WebDriverWait wait2111111 = new WebDriverWait(driver11, 40);
WebElement element211111 = wait2111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")));

driver11.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).click();
try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
WebDriverWait wait4111111 = new WebDriverWait(driver11, 40);
WebElement element411111 = wait4111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));

driver11.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(execadmin);

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//Open profile page for the Admin
driver11.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
//Set coaching type access to Integrated
WebElement coachingType_dropdown=driver11.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
Select CT_dd=new Select(coachingType_dropdown);
CT_dd.selectByIndex(1);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Set Skill team filter to none selected

driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();

try {
	Thread.sleep(9000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

driver11.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();

//Click on country data filter
WebDriverWait wait33312 = new WebDriverWait(driver11, 40);
WebElement element33312 = wait33312.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")));
driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();

try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[7]/a/label")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[23]/a/label")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[45]/a/label")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}








try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();


try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Search for the finance coordinator and edit data filters

//Search for finance coordinator
		WebDriverWait wait111111 = new WebDriverWait(driver11, 40);
		WebElement element1111111 = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
		
		driver11.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).clear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver11.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(changeemailadd);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait1111111 = new WebDriverWait(driver11, 40);
		WebElement element11111111 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
		
		driver11.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
		
		
		
		//Update Skill team set values
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[2]/span/div/button")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[2]/span/div/ul/li[1]/a/label")).click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[2]/span/div/ul/li[2]/a/label")).click();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[2]/span/div/ul/li[3]/a/label")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Save changes
		driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[2]/span/div/div")).submit();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Open Fin Coord profile page again
		
		WebDriverWait wait41111111 = new WebDriverWait(driver11, 40);
		WebElement element4111111 = wait41111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
		
		driver11.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
		
		
		
		//Update Country field set values
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[3]/span/div/button")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[3]/span/div/ul/li[1]/a/label")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[3]/span/div/ul/li[7]/a/label")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[3]/span/div/ul/li[23]/a/label")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[3]/span/div/ul/li[45]/a/label")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Save changes
		driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[3]/span/div/div")).submit();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	










		
		
		
		
		
		
		//Log in as Executive admin and edit email address
		
		WebDriver driver111 =new ChromeDriver();
		driver111.get("https://cclcoachingnexus-qa.ccl.org");
		driver111.manage().window().maximize();

		WebDriverWait wait3 = new WebDriverWait(driver111, 40);
		WebElement element3 = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

		//Enter Client Admin email address and password

		driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(execadmin);
		driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(execadmpwd);
		driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

		try {
		Thread.sleep(7000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}
		//Scroll down
		JavascriptExecutor js1 = (JavascriptExecutor) driver111;
		js1.executeScript("window.scrollBy(0,1000)");

		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		//Click on Register button and verify

		driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}
		driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();


		//Click on Admin name
		driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();

		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		//Click on account settings
		driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li/a/span[2]")).click();

		try {
		Thread.sleep(9000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}


		//click on grid filters i button
		driver111.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[1]/div[2]/span[2]/a/span")).click();

		try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		driver111.findElement(By.xpath("/html/body/div[8]/div/div/div[1]/button")).click();
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		//edit email address
		driver111.findElement(By.xpath("//*[@id=\"Email\"]")).clear();

		driver111.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(changeemailaddadm);
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}


		//Scroll down and save

		JavascriptExecutor je13 = (JavascriptExecutor)driver111;
		WebElement element21113 = driver111.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
		je13.executeScript("arguments[0].scrollIntoView(true);", element21113);
		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}
		driver111.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();		
		try {
		Thread.sleep(7000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}


		//Log out
		WebDriverWait wait222 = new WebDriverWait(driver111, 40);
		WebElement element222 = wait222.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")));
		driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();

		try {
			Thread.sleep(4000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		driver111.quit();

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Log in as Global Admin and verify all changes to Admin's profile pages
		
		WebDriver driver1111 =new ChromeDriver();
		driver1111.get("https://cclcoachingnexus-qa.ccl.org");
		driver1111.manage().window().maximize();

		WebDriverWait wait4111 = new WebDriverWait(driver1111, 40);
		WebElement element41111 = wait4111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

		//Enter Global Admin email address and password

		driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(GlobalAdm);
		driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(Globaladmpwd);
		driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

		try {
			Thread.sleep(7000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		//Scroll down - VERIFY COACHING PACKAGES AND LEFT NAV WINDOW

		JavascriptExecutor js2 = (JavascriptExecutor) driver1111;
		js2.executeScript("window.scrollBy(0,1000)");
		try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}


		//Click on Register button and verify

		driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}
		driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();


		//Go to Admin directory page

		driver1111.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a/span")).click();


		WebDriverWait wait41111 = new WebDriverWait(driver1111, 40);
		WebElement element4111114 = wait41111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));

		driver1111.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(changeemailadd);

		try {
		Thread.sleep(7000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		//click on the finance coordinator - verify change in phone number and email address
		driver1111.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();


		//Click to view entire list of security filters
		WebDriverWait wait3111114 = new WebDriverWait(driver1111, 40);
		WebElement element31111114 = wait3111114.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[3]/a")));
		try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}
		driver1111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[3]/a")).click();
		try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		//close
		driver1111.findElement(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]/div/button/i")).click();

		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		//Open Exec admin changed to Integrated Admin page
		
		WebDriverWait wait411111 = new WebDriverWait(driver1111, 40);
		WebElement element41111141 = wait411111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));

		driver1111.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).clear();
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}
		driver1111.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(changeemailaddadm);

		try {
		Thread.sleep(7000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		//click on the Admin name- verify change in email add and security filters
		driver1111.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();


		//Click to view entire list of security filters
		WebDriverWait wait31111141 = new WebDriverWait(driver1111, 40);
		WebElement element311111141 = wait31111141.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/a")));
		try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}
		driver1111.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/a")).click();
		try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}



		//close
		driver1111.findElement(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]/div/button/i")).click();

		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

	
		
		WebDriverWait wait411111111 = new WebDriverWait(driver1111, 40);
		WebElement element41111111 = wait411111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a")));

		driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a")).click();

		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		driver1111.quit();

		
		



		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//In CCL Admin page; reset all values edited for the Admin and Finance coordinator
		driver11.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).clear();
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}
		driver11.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(changeemailaddadm);

		try {
			Thread.sleep(7000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		//Open profile page for the Admin
		driver11.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr[1]/td[1]/a")).click();

		try {
			Thread.sleep(7000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}
		//Set coaching type access to Executive
		WebElement coachingType_dropdown1=driver11.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
		Select CT_dd1=new Select(coachingType_dropdown1);
		CT_dd1.selectByIndex(0);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Set Skill team filter to select all

		driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();

		try {
			Thread.sleep(9000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		driver11.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();

		//Edit email address to original email address
		WebDriverWait wait333122 = new WebDriverWait(driver11, 40);
		WebElement element333122 = wait333122.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Email\"]")));

		driver11.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver11.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(execadmin);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Click on country data filter
		driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();

		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//Search for the finance coordinator and edit data filters

		//Search for finance coordinator
				WebDriverWait wait5111111 = new WebDriverWait(driver11, 40);
				WebElement element51111111 = wait5111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
				
				driver11.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).clear();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver11.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(changeemailadd);
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				WebDriverWait wait51111111 = new WebDriverWait(driver11, 40);
				WebElement element511111111 = wait51111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
				
				driver11.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
				
				
				
				//Update Skill team set values
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
						
				driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[2]/span/div/button")).click();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[2]/span/div/ul/li[1]/a/label")).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

				//Save changes
				driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[2]/span/div/div")).submit();
				try {
					Thread.sleep(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				//Open Fin Coord profile page again
				
				WebDriverWait wait411111115 = new WebDriverWait(driver11, 40);
				WebElement element41111115 = wait411111115.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
				
				driver11.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
				
				
				//Edit email address to origial address
				WebDriverWait wait3331224 = new WebDriverWait(driver11, 40);
				WebElement element3331224 = wait3331224.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Email\"]")));

				driver11.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver11.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(financecoord);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				//Update Country field set values
				
				driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[3]/span/div/button")).click();
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[3]/span/div/ul/li[1]/a/label")).click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Save changes
				driver11.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[3]/div[3]/span/div/div")).submit();
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
