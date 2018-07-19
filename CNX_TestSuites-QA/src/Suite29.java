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

public class Suite29 {

	public static void main(String[] args) throws IOException {
		
		String ccladmemail=null;
		String ccladmpwd=null;
		String financecoordemail=null;
		String financecoordpwd=null;
		
		String clientadmemail=null;
		String clientadmpwd=null;
		
		String financecoordemail2=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite29.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite29");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row2=sheet1.getRow(9);
		XSSFCell cell3=row2.getCell(4);
		
	
		XSSFRow row3=sheet1.getRow(15);
		XSSFCell cell4=row3.getCell(4);

		XSSFRow row4=sheet1.getRow(16);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(10);
		XSSFCell cell6=row5.getCell(4);
		
		XSSFRow row6=sheet1.getRow(13);
		XSSFCell cell7=row6.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		financecoordemail=cell3.toString();
		clientadmemail=cell4.toString();
		
		clientadmpwd=cell5.toString();
		financecoordpwd=cell6.toString();
		
		financecoordemail2=cell7.toString();
		
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
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Search for finance coordinator
		WebDriverWait wait111111 = new WebDriverWait(driver, 40);
		WebElement element11111 = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(financecoordemail);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait1111111 = new WebDriverWait(driver, 40);
		WebElement element111111 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
		
		driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
		
		
		
		//Update Skill team set values
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[2]/span/div/button")).click();
		
		try {
			Thread.sleep(5000);
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

	driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[2]/span/div/ul/li[2]/a/label")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[2]/span/div/ul/li[3]/a/label")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Save changes
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[2]/span/div/div")).submit();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Open Fin Coord profile page again
		
		WebDriverWait wait41111111 = new WebDriverWait(driver, 40);
		WebElement element4111111 = wait41111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
		
		driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
		
		
		
		//Update Country field set values
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/button")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/ul/li[1]/a/label")).click();
		try {
			Thread.sleep(3000);
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
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/ul/li[23]/a/label")).click();
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
		
		//Save changes
		driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/div")).submit();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Log in as Finance coordinator
		
		WebDriver driver11 =new ChromeDriver();
		driver11.get("https://cclcoachingnexus-qa.ccl.org");
		driver11.manage().window().maximize();
		
	WebDriverWait wait2113 = new WebDriverWait(driver11, 40);
	WebElement element2113 = wait2113.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
	
//Enter Finance coordinator email address and password
	
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(financecoordemail);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(financecoordpwd);
driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();



try {
Thread.sleep(10000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Click on 'i' button
WebDriverWait wait21134 = new WebDriverWait(driver11, 40);
WebElement element21134 = wait21134.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/span/a/span")));
		
driver11.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/span/a/span")).click();

try {
Thread.sleep(6000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//close 

driver11.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();

try {
Thread.sleep(4000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Edit email address
driver11.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();

try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver11.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li/a")).click();
try {
Thread.sleep(7000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Edit email address
driver11.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver11.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(financecoordemail2);

try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//CLick on save
JavascriptExecutor je11 = (JavascriptExecutor)driver11;
WebElement element1111111 = driver11.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]"));
je11.executeScript("arguments[0].scrollIntoView(true);", element1111111);
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
driver11.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();

try {
Thread.sleep(8000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

//Log out
driver11.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[1]/a")).click();
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}

driver11.quit();



		
		
		
		
		
		//Log in as Client admin to check updates to skill team filter
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				WebDriver driver111 =new ChromeDriver();
				driver111.get("https://cclcoachingnexus-qa.ccl.org");
				driver111.manage().window().maximize();
				
			WebDriverWait wait211341 = new WebDriverWait(driver111, 40);
			WebElement element211341 = wait211341.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
			
		//Enter Client Admin email address and password
			
		driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
		driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
		driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();



		try {
		Thread.sleep(10000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}


		//Click on +Register button -> CSR

		WebDriverWait wait221 = new WebDriverWait(driver111, 40);
		WebElement element221 = wait221.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

		driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();

		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[1]/a/span")).click();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click on Skill team drop down

		WebDriverWait wait2111 = new WebDriverWait(driver111, 40);
		WebElement element2111 = wait2111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")));
		driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		//Select Autonomous vehicle
		driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[3]/a/label")).click();
		
		
		//Select any region and country - ASIA PACIFIC 
		driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button/span")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[2]/a/label")).click();
		
		//Select COuntry- China
		driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[4]/a/label")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Select Finance coordinator dropdown and ensure finance coordinator is absent
		driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[2]/div[3]/span[1]/div/button")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[2]/div[3]/span[1]/div/div")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Select Region as North America
 
				driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button/span")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[5]/a/label")).click();
				
				//Select COuntry- Canada
				driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[3]/a/label")).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		
				//Select Finance coordinator dropdown and ensure finance coordinator is present
				driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[2]/div[3]/span[1]/div/button")).click();
				
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		
		//Close CSR regstration form
		driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[2]/div[3]/span[1]/div/div")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[3]/div/div/a")).click();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//Log out
		driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver111.quit();
		
		
		
		
		
		
		
		
	
		
		
		
		//Login again as CCL Admin
		//Search for the finance coordinator withh changed email add
		
		//Search for finance coordinator
				WebDriverWait wait6111111 = new WebDriverWait(driver, 40);
				WebElement element611111 = wait6111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
				
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).clear();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(financecoordemail2);
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
						
				
		
		
		
		
		
		
				WebDriverWait wait51111111 = new WebDriverWait(driver, 40);
				WebElement element5111111 = wait51111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
				
				driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
				
				//Update Skill team set values
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[2]/span/div/button/span")).click();
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[2]/span/div/ul/li[1]/a/label")).click();
				
				
				//Save changes
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[2]/span/div/div")).submit();
				
				
		
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				//Open profile page again and edit email address and country filter
				
				//Open Fin Coord profile page again
				
				WebDriverWait wait411111112 = new WebDriverWait(driver, 40);
				WebElement element41111112 = wait411111112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")));
				
				driver.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
				
				//Update email address to original address
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebDriverWait wait511111112 = new WebDriverWait(driver, 40);
				WebElement element51111112 = wait511111112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Email\"]")));
				
				
				driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(financecoordemail);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				//Update Country field set values
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/button")).click();
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/ul/li[1]/a/label")).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Save changes
				driver.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[2]/div[3]/span/div/div")).submit();
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
						
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//Log in as Client admin to check updates to skill team filter
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veenaramakrishnan\\chromedriver.exe");
				WebDriver driver1111 =new ChromeDriver();
				driver1111.get("https://cclcoachingnexus-qa.ccl.org");
				driver1111.manage().window().maximize();
				
			WebDriverWait wait21131 = new WebDriverWait(driver1111, 40);
			WebElement element21131 = wait21131.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
			
		//Enter Client Admin email address and password
			
		driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(clientadmemail);
		driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(clientadmpwd);
		driver1111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();



		try {
		Thread.sleep(10000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}


		//Click on +Register button -> CSR

		WebDriverWait wait2211 = new WebDriverWait(driver1111, 40);
		WebElement element2211 = wait2211.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));

		driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();

		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[1]/a/span")).click();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click on Skill team drop down

		WebDriverWait wait21111 = new WebDriverWait(driver1111, 40);
		WebElement element21111 = wait21111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")));
		driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/button")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		//Select Autonomous vehicle
		driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[6]/div[1]/div/span[1]/div/ul/li[3]/a/label")).click();
		
		
		//Select any region and country - ASIA PACIFIC 
		driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/button/span")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[1]/div/span[1]/div/ul/li[2]/a/label")).click();
		
		//Select COuntry- China
		driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/button")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[1]/div[5]/div[2]/div/span[1]/div/ul/li[4]/a/label")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Select Finance coordinator dropdown and ensure finance coordinator is present
		driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[2]/div[3]/span[1]/div/button")).click();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Close CSR regstration form
		driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[2]/div[3]/span[1]/div/div")).click();
		driver1111.findElement(By.xpath("//*[@id=\"DemographicsForm\"]/div[3]/div/div/a")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//Log out
		driver1111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver1111.quit();
		
		
		
		
		
		
		
		
		
		//Login as Finance coordinator and ensure changes are saved
		
		//Log in as Finance coordinator
		
				WebDriver driver11111 =new ChromeDriver();
				driver11111.get("https://cclcoachingnexus-qa.ccl.org");
				driver11111.manage().window().maximize();
				
			WebDriverWait wait211311 = new WebDriverWait(driver11111, 40);
			WebElement element211311 = wait211311.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));
			
		//Enter Finance coordinator email address and password
			
		driver11111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(financecoordemail);
		driver11111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(financecoordpwd);
		driver11111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();



		try {
		Thread.sleep(10000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		//Click on 'i' button
		WebDriverWait wait2113411 = new WebDriverWait(driver11111, 40);
		WebElement element2113411 = wait2113411.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/span/a/span")));
				
		driver11111.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/span/a/span")).click();

		try {
		Thread.sleep(6000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		//close 

		driver11111.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();

		try {
		Thread.sleep(4000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		//check email address is updated
		driver11111.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();

		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		driver11111.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li/a")).click();
		try {
		Thread.sleep(7000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		driver11111.findElement(By.xpath("//*[@id=\"btnSaveAdminProfile\"]")).click();

		try {
		Thread.sleep(8000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		//Log out
		driver11111.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[1]/a")).click();
		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		}

		driver11111.quit();

		
		

				
				
		
		
		

				
				
				
				
				
				
				
				
				
				
				
				
	}

}
