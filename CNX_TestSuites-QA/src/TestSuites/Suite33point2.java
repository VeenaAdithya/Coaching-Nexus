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

public class Suite33point2 {

	public static void main(String[] args) throws IOException {

		String ccladmemail=null;
		String ccladmpwd=null;
		
		String GlobalAdmin1=null;
		String GlobalAdmin1pwd=null;
		
		String changeemailaddadm=null;
		String changeemailaddadm2=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\QA\\FordTest\\Suite33.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite33point2");

		XSSFRow row=sheet1.getRow(1);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(2);
		XSSFCell cell2=row1.getCell(4);

		
		XSSFRow row2=sheet1.getRow(6);
		XSSFCell cell3=row2.getCell(4);
		
		XSSFRow row3=sheet1.getRow(14);
		XSSFCell cell4=row3.getCell(4);
		
		XSSFRow row4=sheet1.getRow(17);
		XSSFCell cell5=row4.getCell(4);
		
		XSSFRow row5=sheet1.getRow(30);
		XSSFCell cell6=row5.getCell(4);
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		
		GlobalAdmin1=cell3.toString();
		GlobalAdmin1pwd=cell4.toString();
		
		changeemailaddadm=cell5.toString();
		changeemailaddadm2=cell6.toString();
		
		
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

		driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(GlobalAdmin1);

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
		
		//Uncheck Super Admin check box
		driver1.findElement(By.xpath("//*[@id=\"IsClientSuperAdmin\"]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
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

		//Set skill team data filters to select all	
		driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/button/span")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/ul/li[1]/a/label")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[2]/span/div/div")).submit();

		try {
			Thread.sleep(9000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		
				
		//open admin profile page again
		
		driver1.findElement(By.xpath("//*[@id=\"tblAdminDir\"]/tbody/tr/td[1]/a")).click();
		
		WebDriverWait wait33312 = new WebDriverWait(driver1, 40);
		WebElement element33312 = wait33312.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")));
		
		//Set country data filters to select all
		driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/button")).click();
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/ul/li[1]/a/label")).click();
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		driver1.findElement(By.xpath("//*[@id=\"divAdminProfile\"]/div[4]/div[3]/span/div/div")).submit();

		try {
			Thread.sleep(9000);
			} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			}

		
		
		
		
		
		//Open Participant registration form
		//Click on +Register -> Participant
		WebDriverWait wait41111112 = new WebDriverWait(driver1, 40);
		WebElement element4111112 = wait41111112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));
		driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[5]/a")).click();

		WebDriverWait wait24 = new WebDriverWait(driver1, 40);
		WebElement element24 = wait24.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver1.findElement(By.xpath("//*[@id=\"ClientAdminId\"]")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
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
				
		
				
				
				
				
				
				
				
				
				
//----------------------------------------------------------------------------------------------------------------------------
				
				//Log in as the Client Admin
				WebDriver driver11 =new ChromeDriver();
				driver11.get("https://cclcoachingnexus-qa.ccl.org");
				driver11.manage().window().maximize();

				WebDriverWait wait111111111 = new WebDriverWait(driver11, 40);
				WebElement element11111111 = wait111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

				//Enter Client Admin email address and password

				driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(GlobalAdmin1);
				driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(GlobalAdmin1pwd);
				driver11.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

				try {
					Thread.sleep(7000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}

				//Scroll down - VERIFY COACHING PACKAGES AND LEFT NAV WINDOW

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
				Thread.sleep(2000);
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


				//click on grid filters i button
				driver11.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[1]/div[2]/span[2]/a/span")).click();

				try {
				Thread.sleep(5000);
				} catch (InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
				}

				driver11.findElement(By.xpath("/html/body/div[8]/div/div/div[1]/button")).click();
				try {
				Thread.sleep(2000);
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
				WebDriverWait wait222 = new WebDriverWait(driver11, 40);
				WebElement element222 = wait222.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")));
				driver11.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();

				try {
					Thread.sleep(4000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}

				driver11.quit();

				

		
		
		//---------------------------------------------------------------------------------------------------
		
		
		
		
		
		
		
//In CCL Admin page
				
				//go to admin directory page
				
				WebDriverWait wait611111111 = new WebDriverWait(driver1, 40);
				WebElement element61111111 = wait611111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")));

				driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).click();
				try {
					Thread.sleep(7000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}
				WebDriverWait wait6111111111 = new WebDriverWait(driver1, 40);
				WebElement element611111111 = wait6111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));
				driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(changeemailaddadm);

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
				

				//Set coaching type access to Executive
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
					Thread.sleep(9000);
					} catch (InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					}

		
		
		
		
				
				//Open Participant registration form
				//Click on +Register -> Participant
				WebDriverWait wait411111121 = new WebDriverWait(driver1, 40);
				WebElement element41111121 = wait411111121.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")));
				driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/a")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver1.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[2]/ul/li[5]/a")).click();

				WebDriverWait wait241 = new WebDriverWait(driver1, 40);
				WebElement element241 = wait241.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FirstName\"]")));

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				driver1.findElement(By.xpath("//*[@id=\"ClientAdminId\"]")).click();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
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
						WebDriverWait wait31111111 = new WebDriverWait(driver1, 40);
						WebElement element3111111 = wait31111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NewIcrButton\"]")));
						
						driver1.findElement(By.xpath("//*[@id=\"NewIcrButton\"]")).click();
						
						
						WebDriverWait wait311111111 = new WebDriverWait(driver1, 40);
						WebElement element31111111 = wait311111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ICRAdminCNXUserId_inline\"]")));
						
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
						WebElement country_dropdown1=driver1.findElement(By.xpath("//*[@id=\"ClientFieldValues_37_inline\"]"));
						Select Cou_dd1=new Select(country_dropdown1);
						Cou_dd1.selectByIndex(17);		
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						WebElement Skillteam_dropdown1=driver1.findElement(By.xpath("//*[@id=\"ClientFieldValues_31_inline\"]"));
						Select ST_dd1=new Select(Skillteam_dropdown1);
						ST_dd1.selectByIndex(14);		
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
		
		
		
		
		
		
		
		//----------------------------------------------------------------------------------------------
						
						
						
						
						
						
						WebDriver driver111 =new ChromeDriver();
						driver111.get("https://cclcoachingnexus-qa.ccl.org");
						driver111.manage().window().maximize();

						WebDriverWait wait1111111111 = new WebDriverWait(driver111, 40);
						WebElement element111111111 = wait1111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")));

						//Enter Client Admin email address and password

						driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[1]/div/input")).sendKeys(GlobalAdmin1);
						driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/input")).sendKeys(GlobalAdmin1pwd);
						driver111.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();

						try {
							Thread.sleep(7000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}

						//Scroll down - VERIFY COACHING PACKAGES AND LEFT NAV WINDOW

						JavascriptExecutor js1 = (JavascriptExecutor) driver111;
						js1.executeScript("window.scrollBy(0,1000)");
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

						driver111.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(changeemailaddadm2);
						try {
						Thread.sleep(2000);
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
						WebDriverWait wait2221 = new WebDriverWait(driver111, 40);
						WebElement element2221 = wait2221.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")));
						driver111.findElement(By.xpath("//*[@id=\"NavbarMain\"]/ul/li[1]/a/span[2]")).click();

						try {
							Thread.sleep(4000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}

						driver111.quit();

						
						
						
		
		
						
						
						
						
						
						
						
//-----------------------------------------------------------------------------
						//Go to admin directory page and search for the Global Admin

						WebDriverWait wait71111111 = new WebDriverWait(driver1, 40);
						WebElement element7111111 = wait71111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")));

						driver1.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).click();
						try {
							Thread.sleep(2000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}
						WebDriverWait wait74111111 = new WebDriverWait(driver1, 40);
						WebElement element7411111 = wait74111111.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")));

						driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys(changeemailaddadm2);

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
						
						//check Super Admin check box
						driver1.findElement(By.xpath("//*[@id=\"IsClientSuperAdmin\"]")).click();
						
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						//change email address to original email address
						driver1.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						driver1.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(GlobalAdmin1);
						try {
							Thread.sleep(1000);
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
							Thread.sleep(9000);
							} catch (InterruptedException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
							}

						
						
						
						
						
						
						
		
		
	}

}
