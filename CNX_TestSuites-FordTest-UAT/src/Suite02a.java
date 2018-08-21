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

public class Suite02a {

	public static void main(String[] args) throws IOException {
	
		String clientadm=null;
		String password=null;		
		
		String clientadmemail2=null;

		String ccladmemail=null;
		String ccladmpwd=null;
		
		String clientadmemail3=null;
		String clientadmemail4=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\UAT\\FordTest\\Suite02.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite02");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row2=sheet1.getRow(8);
		XSSFCell cell3=row2.getCell(4);
		
		XSSFRow row3=sheet1.getRow(11);
		XSSFCell cell4=row3.getCell(4);
		
		XSSFRow row4=sheet1.getRow(12);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(15);
		XSSFCell cell6=row5.getCell(4);
		
		XSSFRow row6=sheet1.getRow(19);
		XSSFCell cell7=row6.getCell(4);
		
		clientadm=cell1.toString();
		password=cell2.toString();
		
		clientadmemail2=cell3.toString();
		
		ccladmemail=cell4.toString();
		ccladmpwd=cell5.toString();
		
		clientadmemail3=cell6.toString();
		clientadmemail4=cell7.toString();
		
		
		
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

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//Scroll down
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000)");
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Click on Register button and verify

driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();


//Click on Admin name
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();

try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//Click on account settings
driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li/a/span[2]")).click();

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

//edit email address
driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();

driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(clientadmemail2);
try {
	Thread.sleep(3000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}


//Scroll down and save

JavascriptExecutor je1 = (JavascriptExecutor)driver;
WebElement element2111 = driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je1.executeScript("arguments[0].scrollIntoView(true);", element2111);
try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
driver.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();		
try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}


//Log out

driver.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
driver.quit();









//Log in as CCL Admin in another page

WebDriver driver1 =new ChromeDriver();
driver1.get("https://cclcoachingnexus-uat.ccl.org");
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

//Go to admin directory page and search for the client whose email address is edited

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

driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(clientadmemail2);

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
JavascriptExecutor je11 = (JavascriptExecutor)driver1;
WebElement element21111111 = driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je11.executeScript("arguments[0].scrollIntoView(true);", element21111111);
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

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}










//Log in again as client admin
WebDriver driver11 =new ChromeDriver();
driver11.get("https://cclcoachingnexus-uat.ccl.org");
driver11.manage().window().maximize();

WebDriverWait wait3 = new WebDriverWait(driver11, 40);
WebElement element3 = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

//Enter Client Admin email address and password

driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadm);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(password);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

try {
Thread.sleep(7000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
//Scroll down
JavascriptExecutor js1 = (JavascriptExecutor) driver11;
js1.executeScript("window.scrollBy(0,1000)");

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
Thread.sleep(2000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Click on account settings
driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li/a/span[2]")).click();

try {
Thread.sleep(7000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//edit email address
driver11.findElement(By.xpath("//*[@id=\"Email\"]")).clear();

driver11.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(clientadmemail3);
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Scroll down and save

JavascriptExecutor je13 = (JavascriptExecutor)driver11;
WebElement element21113 = driver11.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je13.executeScript("arguments[0].scrollIntoView(true);", element21113);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();		
try {
Thread.sleep(7000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Log out
driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();

try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

driver11.quit();








//Back to CCL Admin page

//Clear search field and enter new client email ID
driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).clear();
try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(clientadmemail3);

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
//Set coaching tyoe access to Executive
WebElement coachingType_dropdown1=driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
Select CT_dd1=new Select(coachingType_dropdown1);
CT_dd1.selectByIndex(0);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Scroll down and save 
JavascriptExecutor je311 = (JavascriptExecutor)driver1;
WebElement element321111111 = driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je311.executeScript("arguments[0].scrollIntoView(true);", element321111111);
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











//Log in again as Client Admin
//Log in again as client admin
WebDriver driver111 =new ChromeDriver();
driver111.get("https://cclcoachingnexus-uat.ccl.org");
driver111.manage().window().maximize();

WebDriverWait wait31 = new WebDriverWait(driver111, 40);
WebElement element31 = wait31.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

//Enter Client Admin email address and password

driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadm);
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(password);
driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

try {
Thread.sleep(7000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
//Scroll down
JavascriptExecutor js11 = (JavascriptExecutor) driver111;
js11.executeScript("window.scrollBy(0,1000)");

try {
Thread.sleep(5000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Click on Register button and verify

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();


//Click on Admin name
driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/a")).click();

try {
Thread.sleep(7000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Click on account settings
driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[3]/ul/li/a/span[2]")).click();

try {
Thread.sleep(7000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//edit email address
driver111.findElement(By.xpath("//*[@id=\"Email\"]")).clear();

driver111.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(clientadmemail4);
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}


//Scroll down and save

JavascriptExecutor je131 = (JavascriptExecutor)driver111;
WebElement element211131 = driver111.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je131.executeScript("arguments[0].scrollIntoView(true);", element211131);
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

driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
try {
	Thread.sleep(7000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

driver111.quit();


























//Back to CCL Admin page

//Clear search field and enter new client email ID
driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).clear();
try {
	Thread.sleep(5000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}
driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(clientadmemail4);

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


//Edit email address to match initial email address

driver1.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
try {
	Thread.sleep(4000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}

driver1.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(clientadm);

try {
	Thread.sleep(4000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}




//Set coaching tyoe access to Both
WebElement coachingType_dropdown11=driver1.findElement(By.xpath("//*[@id=\"CoachingTypeIdAccess\"]"));
Select CT_dd11=new Select(coachingType_dropdown11);
CT_dd11.selectByIndex(2);
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Scroll down and save 
JavascriptExecutor je3111 = (JavascriptExecutor)driver1;
WebElement element3211111111 = driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je3111.executeScript("arguments[0].scrollIntoView(true);", element3211111111);
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver1.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();

try {
	Thread.sleep(9000);
	} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
	}




//Logout

driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();

	}

}
