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

public class Suite32 {

	public static void main(String[] args) throws IOException {
		
		String ccladmemail=null;
		String ccladmpwd=null;
		
		String intadmin=null;
		String clientadmpwd=null;
		
		
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
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite32.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite32");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row112=sheet1.getRow(9);
		XSSFCell cell21=row112.getCell(4);
		
		
		XSSFRow row111=sheet1.getRow(11);
		XSSFCell cell211=row111.getCell(4);
		
		
		XSSFRow row2=sheet1.getRow(17);
		XSSFCell cell3=row2.getCell(4);
		
		XSSFRow row3=sheet1.getRow(18);
		XSSFCell cell4=row3.getCell(4);
		
		XSSFRow row4=sheet1.getRow(19);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(20);
		XSSFCell cell6=row5.getCell(4);
		
		XSSFRow row6=sheet1.getRow(21);
		XSSFCell cell7=row6.getCell(4);
		
		XSSFRow row7=sheet1.getRow(22);
		XSSFCell cell8=row7.getCell(4);
		
		XSSFRow row8=sheet1.getRow(24);
		XSSFCell cell9=row8.getCell(4);
		
		XSSFRow row9=sheet1.getRow(25);
		XSSFCell cell10=row9.getCell(4);

		XSSFRow row11=sheet1.getRow(33);
		XSSFCell cell12=row11.getCell(4);
		
		XSSFRow row12=sheet1.getRow(25);
		XSSFCell cell13=row12.getCell(4);
		
		XSSFRow row13=sheet1.getRow(26);
		XSSFCell cell14=row13.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		
		intadmin=cell21.toString();
		clientadmpwd=cell211.toString();
		
				
		firstname=cell3.toString();
		lastname=cell4.toString();
		partemailadd=cell5.toString();

		
		progpackage=cell6.toString();
		country=cell7.toString();
		skillteam=cell8.toString();

		ponum=cell9.toString();
		
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
		
		
		
		//Go to Admin directory page
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).click();
		
		//Search for the Integrated Admin
		
		WebDriverWait wait211 = new WebDriverWait(driver, 40);
		WebElement element211 = wait211.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(intadmin);
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Set skill team to none selected
		WebDriverWait wait2112 = new WebDriverWait(driver, 40);
		WebElement element2112 = wait2112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[2]/span/div/button/span")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[2]/span/div/ul/li[1]/a/label")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[2]/span/div/div")).submit();

		try {
			Thread.sleep(10000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		WebDriverWait wait511111 = new WebDriverWait(driver, 40);
		wait511111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]")));
		
		//Open Admin profile page again
		
		WebDriverWait wait2113 = new WebDriverWait(driver, 40);
		WebElement element2113 = wait2113.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
	
		
		driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait21121 = new WebDriverWait(driver, 40);
		WebElement element21121 = wait21121.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));
		
		
		//Set country filters to have only North Americas
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/button")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/ul/li[1]/a/label")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/ul/li[7]/a/label")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor je1 = (JavascriptExecutor)driver;
		WebElement element11111 = driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/ul/li[23]/a/label"));
		je1.executeScript("arguments[0].scrollIntoView(true);", element11111);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/ul/li[23]/a/label")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JavascriptExecutor je11 = (JavascriptExecutor)driver;
		WebElement element111111 = driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/ul/li[45]/a/label"));
		je11.executeScript("arguments[0].scrollIntoView(true);", element111111);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/ul/li[45]/a/label")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/div")).submit();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		//Log in as Client Admin
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://cclcoachingnexus-qa.ccl.org");
		driver1.manage().window().maximize();
		
	WebDriverWait wait4 = new WebDriverWait(driver1, 40);
	WebElement element4 = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Client Admin email address and password
	
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(intadmin);
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
driver1.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

WebDriverWait wait24 = new WebDriverWait(driver1, 40);
WebElement element24 = wait24.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")));

//Click on Integrated Coaching request in left panel
		
driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a")).click();

//Click on i button
WebDriverWait wait241 = new WebDriverWait(driver1, 40);
WebElement element241 = wait241.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GridControls\"]/span/a/span")));
driver1.findElement(By.xpath("//*[@id=\"GridControls\"]/span/a/span")).click();

try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//close
driver1.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Click on +New ICR
WebDriverWait wait2411 = new WebDriverWait(driver1, 40);
WebElement element2411 = wait2411.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));

driver1.findElement(By.xpath("//*[@id=\"NewIcrButton\"]")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver1.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(firstname);
driver1.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(lastname);
driver1.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(partemailadd);

//Select Program package
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"CoachingPackageId\"]")).sendKeys(progpackage);

//Select country

driver1.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]")).sendKeys(country);

		
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Select Skill team

driver1.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]")).sendKeys(skillteam);

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//enter PO number
driver1.findElement(By.xpath("//*[@id=\"PONumber\"]")).sendKeys(ponum);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Select Dates
//Invite date
driver1.findElement(By.xpath("//*[@id=\"InvitationDateTime\"]")).clear();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver1.findElement(By.xpath("//*[@id=\"InvitationDateTime\"]")).sendKeys(invitedate);


try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Expiry date
driver1.findElement(By.xpath("//*[@id=\"InvitationExpiresDateTime\"]")).clear();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver1.findElement(By.xpath("//*[@id=\"InvitationExpiresDateTime\"]")).sendKeys(expdate);


try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//select client admin
driver1.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver1.findElement(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")).sendKeys(intadmin);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



//Save registration
driver1.findElement(By.xpath("//*[@id=\"ICRInlineDetailForm\"]/table/tbody/tr/td[13]/button")).click();

try {
	Thread.sleep(15000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}




//Log out

WebDriverWait wait24111 = new WebDriverWait(driver1, 40);
WebElement element24111 = wait24111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div/div[2]/ul/li[1]/a")));

driver1.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[1]/a")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



driver1.close();
















//In CCL Admin page

driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Set skill team to none selected
WebDriverWait wait21122 = new WebDriverWait(driver, 40);
WebElement element21122 = wait21122.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[2]/span/div/button/span")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[2]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[2]/span/div/div")).submit();

try {
	Thread.sleep(12000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

WebDriverWait wait5111111 = new WebDriverWait(driver, 40);
wait5111111.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"adminProfile\"]/div/div/div[1]")));

//Open Admin profile page again

WebDriverWait wait21131 = new WebDriverWait(driver, 40);
WebElement element21131 = wait21131.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));


driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebDriverWait wait211211 = new WebDriverWait(driver, 40);
WebElement element211211 = wait211211.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName\"]")));


//Set country filters to select all
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/button")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/ul/li[1]/a/label")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/div")).submit();

try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}





	}

}
