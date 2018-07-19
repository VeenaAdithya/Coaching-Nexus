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

public class Suite05 {

	public static void main(String[] args) throws IOException {
	
		String ccladmemail=null;
		String ccladmpwd=null;
		String note=null;
		
		File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\Suite05.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Suite05");

		XSSFRow row=sheet1.getRow(3);
		XSSFCell cell1=row.getCell(4);
		
		XSSFRow row1=sheet1.getRow(4);
		XSSFCell cell2=row1.getCell(4);
		
		XSSFRow row2=sheet1.getRow(7);
		XSSFCell cell3=row2.getCell(4);
		
		
		ccladmemail=cell1.toString();
		ccladmpwd=cell2.toString();
		note=cell3.toString();
		
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
		
		//Go to participant roster page
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a/span")).click();
		
//Display (Alphabetical display)
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		//Scroll down	
		JavascriptExecutor je11 = (JavascriptExecutor)driver;
		WebElement element111111 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[4]/a"));
		je11.executeScript("arguments[0].scrollIntoView(true);", element111111);
		
//Observe footer details
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		
//Go to page 3
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[4]/a")).click();

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//scroll up
JavascriptExecutor je111 = (JavascriptExecutor)driver;
WebElement element1111111 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
je111.executeScript("arguments[0].scrollIntoView(true);", element1111111);
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("scroll(400, 0)");
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//filter to display Initiate Coaching
WebElement stage_dropdown=driver.findElement(By.xpath("//*[@id=\"StageFilterDropdown\"]"));
Select stage_dd=new Select(stage_dropdown);
stage_dd.selectByIndex(2);		
		

try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Scroll down	
		JavascriptExecutor je1111 = (JavascriptExecutor)driver;
		WebElement element11111111 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[4]/a"));
		je1111.executeScript("arguments[0].scrollIntoView(true);", element11111111);

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Go to page 3
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[4]/a")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//scroll up
		JavascriptExecutor je11111 = (JavascriptExecutor)driver;
		WebElement element111111111 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
		je11111.executeScript("arguments[0].scrollIntoView(true);", element111111111);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("scroll(400, 0)");
		//Enter Note
		driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[3]/span")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"newNoteTextArea\"]")).sendKeys("Test12345");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Submit notes entered
		driver.findElement(By.xpath("//*[@id=\"notesSubmitBtn\"]")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//Close notes box
		driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Delete added note
			driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[3]/span/i")).click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.xpath("//*[@id=\"notesList\"]/div[2]/h4/a/i")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"notesList\"]/div[2]/h4/button[2]")).click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Check History button
			//Check Stage history
			driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[2]/i")).click();
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div[2]/div[1]/div[2]/div[4]/div[2]/ul/li[3]/a")).click();
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div[2]/div[1]/div[2]/div[4]/div[2]/ul/li[2]/a")).click();
			//Check Email history
			JavascriptExecutor je22 = (JavascriptExecutor)driver;
			WebElement element22 = driver.findElement(By.xpath("//*[@id=\"tblCoacheesEmailNotification\"]/tbody/tr/td"));
			je22.executeScript("arguments[0].scrollIntoView(true);", element22);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//Close history page
			JavascriptExecutor je221 = (JavascriptExecutor)driver;
			WebElement element221 = driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span"));
			je221.executeScript("arguments[0].scrollIntoView(true);", element221);
			
			driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();

//Filter to display stage ENGAGE AND GROW

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("scroll(400, 0)");
		WebElement stage_dropdown1=driver.findElement(By.xpath("//*[@id=\"StageFilterDropdown\"]"));
		Select stage_dd1=new Select(stage_dropdown1);
		stage_dd1.selectByIndex(4);		

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Scroll down to check footer details
				JavascriptExecutor je2 = (JavascriptExecutor)driver;
				WebElement element2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[4]/a"));
				je2.executeScript("arguments[0].scrollIntoView(true);", element2);
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			//Go to 2nd page
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[3]/a")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		//Scroll up
				JavascriptExecutor je21 = (JavascriptExecutor)driver;
				WebElement element21 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
				je21.executeScript("arguments[0].scrollIntoView(true);", element21);
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Enter Note
				driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[3]/span")).click();

				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath("//*[@id=\"newNoteTextArea\"]")).sendKeys("Test12345");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Submit notes entered
				driver.findElement(By.xpath("//*[@id=\"notesSubmitBtn\"]")).click();
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				//Close notes box
				driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Delete added note
					driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[3]/span/i")).click();
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					driver.findElement(By.xpath("//*[@id=\"notesList\"]/div[2]/h4/a/i")).click();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					driver.findElement(By.xpath("//*[@id=\"notesList\"]/div[2]/h4/button[2]")).click();
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//Check History button
					//Check Stage history
					driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[2]/i")).click();
					try {
						Thread.sleep(6000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div[2]/div[1]/div[2]/div[4]/div[2]/ul/li[3]/a")).click();
					try {
						Thread.sleep(6000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div[2]/div[1]/div[2]/div[4]/div[2]/ul/li[2]/a")).click();
					//Check Email history
					JavascriptExecutor je225 = (JavascriptExecutor)driver;
					WebElement element225 = driver.findElement(By.xpath("//*[@id=\"tblCoacheesEmailNotification\"]/tbody/tr/td"));
					je225.executeScript("arguments[0].scrollIntoView(true);", element225);
					try {
						Thread.sleep(6000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//Close history page
					JavascriptExecutor je2215 = (JavascriptExecutor)driver;
					WebElement element2215 = driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span"));
					je2215.executeScript("arguments[0].scrollIntoView(true);", element2215);
					try {
						Thread.sleep(6000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
					
				
//Filter to display INVITED STAGE participants
					JavascriptExecutor jse11 = (JavascriptExecutor)driver;
					jse11.executeScript("scroll(400, 0)");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				WebElement stage_dropdown11=driver.findElement(By.xpath("//*[@id=\"StageFilterDropdown\"]"));
				Select stage_dd11=new Select(stage_dropdown11);
				stage_dd11.selectByIndex(1);		
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Scroll down to check footer details
						JavascriptExecutor je211 = (JavascriptExecutor)driver;
						WebElement element211 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[4]/a"));
						je211.executeScript("arguments[0].scrollIntoView(true);", element211);
						
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					//Go to 2nd page
						driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[3]/a")).click();
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
				//Scroll up
						JavascriptExecutor je2112 = (JavascriptExecutor)driver;
						WebElement element2112 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
						je2112.executeScript("arguments[0].scrollIntoView(true);", element2112);
						
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						//Enter Note
						driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[3]/span")).click();

						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						driver.findElement(By.xpath("//*[@id=\"newNoteTextArea\"]")).sendKeys("Test12345");
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//Submit notes entered
						driver.findElement(By.xpath("//*[@id=\"notesSubmitBtn\"]")).click();
						try {
							Thread.sleep(6000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
						//Close notes box
						driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
						
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//Delete added note
							driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[3]/span/i")).click();
							try {
								Thread.sleep(4000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							driver.findElement(By.xpath("//*[@id=\"notesList\"]/div[2]/h4/a/i")).click();
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							driver.findElement(By.xpath("//*[@id=\"notesList\"]/div[2]/h4/button[2]")).click();
							try {
								Thread.sleep(4000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
							try {
								Thread.sleep(4000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							//Check History button
							//Check Stage history
							driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[2]/i")).click();
							try {
								Thread.sleep(6000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div[2]/div[1]/div[2]/div[4]/div[2]/ul/li[3]/a")).click();
							try {
								Thread.sleep(6000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div[2]/div[1]/div[2]/div[4]/div[2]/ul/li[2]/a")).click();
							//Check Email history
							JavascriptExecutor je224 = (JavascriptExecutor)driver;
							WebElement element224 = driver.findElement(By.xpath("//*[@id=\"tblCoacheesEmailNotification\"]/tbody/tr/td"));
							je224.executeScript("arguments[0].scrollIntoView(true);", element224);
							try {
								Thread.sleep(6000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							//Close history page
							JavascriptExecutor je2214 = (JavascriptExecutor)driver;
							WebElement element2214 = driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span"));
							je2214.executeScript("arguments[0].scrollIntoView(true);", element2214);
							try {
								Thread.sleep(6000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
							
				
//Filter to display stage EVALUATE YOUR EXPERIENCE
							
							
							JavascriptExecutor jse111 = (JavascriptExecutor)driver;
							jse111.executeScript("scroll(400, 0)");
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						WebElement stage_dropdown111=driver.findElement(By.xpath("//*[@id=\"StageFilterDropdown\"]"));
						Select stage_dd111=new Select(stage_dropdown111);
						stage_dd111.selectByIndex(5);		
						
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						//Scroll down to check footer details
								JavascriptExecutor je2111 = (JavascriptExecutor)driver;
								WebElement element2111 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[4]/a"));
								je2111.executeScript("arguments[0].scrollIntoView(true);", element2111);
								
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
							//Go to 2nd page
								driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[3]/a")).click();
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
						//Scroll up
								JavascriptExecutor je21111 = (JavascriptExecutor)driver;
								WebElement element21111 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
								je21111.executeScript("arguments[0].scrollIntoView(true);", element21111);
								
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

								//Enter Note
								driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[3]/span")).click();

								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								driver.findElement(By.xpath("//*[@id=\"newNoteTextArea\"]")).sendKeys("Test12345");
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								//Submit notes entered
								driver.findElement(By.xpath("//*[@id=\"notesSubmitBtn\"]")).click();
								try {
									Thread.sleep(6000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}	
								//Close notes box
								driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
								
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								//Delete added note
									driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[3]/span/i")).click();
									try {
										Thread.sleep(4000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									
									driver.findElement(By.xpath("//*[@id=\"notesList\"]/div[2]/h4/a/i")).click();
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									driver.findElement(By.xpath("//*[@id=\"notesList\"]/div[2]/h4/button[2]")).click();
									try {
										Thread.sleep(4000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
									try {
										Thread.sleep(4000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									//Check History button
									//Check Stage history
									driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[2]/i")).click();
									try {
										Thread.sleep(6000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div[2]/div[1]/div[2]/div[4]/div[2]/ul/li[3]/a")).click();
									try {
										Thread.sleep(6000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div[2]/div[1]/div[2]/div[4]/div[2]/ul/li[2]/a")).click();
									//Check Email history
									JavascriptExecutor je321 = (JavascriptExecutor)driver;
									WebElement element321 = driver.findElement(By.xpath("//*[@id=\"tblCoacheesEmailNotification\"]/tbody/tr/td"));
									je321.executeScript("arguments[0].scrollIntoView(true);", element321);
									try {
										Thread.sleep(6000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									//Close history page
									JavascriptExecutor je33221 = (JavascriptExecutor)driver;
									WebElement element33221 = driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span"));
									je33221.executeScript("arguments[0].scrollIntoView(true);", element33221);
									try {
										Thread.sleep(6000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
									
									//Filter to display stage COACHING ASSIGNMENT

									try {
										Thread.sleep(4000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									
									WebElement stage_dropdown1111=driver.findElement(By.xpath("//*[@id=\"StageFilterDropdown\"]"));
									Select stage_dd1111=new Select(stage_dropdown1111);
									stage_dd1111.selectByIndex(3);		
									
									try {
										Thread.sleep(4000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									
									//Scroll down to check footer details
											JavascriptExecutor je222 = (JavascriptExecutor)driver;
											WebElement element222 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[4]/a"));
											je222.executeScript("arguments[0].scrollIntoView(true);", element222);
											
											try {
												Thread.sleep(4000);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											
										//Go to 2nd page
											driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[4]/div[2]/ul/li[3]/a")).click();
											try {
												Thread.sleep(4000);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											
									//Scroll up
											JavascriptExecutor je2221 = (JavascriptExecutor)driver;
											WebElement element2221 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
											je2221.executeScript("arguments[0].scrollIntoView(true);", element2221);
											
											try {
												Thread.sleep(4000);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}

											//Enter Note
											driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[3]/span")).click();

											try {
												Thread.sleep(4000);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											
											driver.findElement(By.xpath("//*[@id=\"newNoteTextArea\"]")).sendKeys("Test12345");
											try {
												Thread.sleep(4000);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											//Submit notes entered
											driver.findElement(By.xpath("//*[@id=\"notesSubmitBtn\"]")).click();
											try {
												Thread.sleep(6000);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}	
											//Close notes box
											driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
											
											try {
												Thread.sleep(4000);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											//Delete added note
												driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[3]/span/i")).click();
												try {
													Thread.sleep(4000);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												
												driver.findElement(By.xpath("//*[@id=\"notesList\"]/div[2]/h4/a/i")).click();
												try {
													Thread.sleep(2000);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												driver.findElement(By.xpath("//*[@id=\"notesList\"]/div[2]/h4/button[2]")).click();
												try {
													Thread.sleep(4000);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
												try {
													Thread.sleep(4000);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												//Check History button
												//Check Stage history
												driver.findElement(By.xpath("//*[@id=\"coacheeRoster\"]/tbody/tr/td[2]/div/div[2]/a[2]/i")).click();
												try {
													Thread.sleep(6000);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div[2]/div[1]/div[2]/div[4]/div[2]/ul/li[3]/a")).click();
												try {
													Thread.sleep(6000);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												driver.findElement(By.xpath("//*[@id=\"globalModalContent\"]/div[2]/div[1]/div[2]/div[4]/div[2]/ul/li[2]/a")).click();
												//Check Email history
												JavascriptExecutor je3321 = (JavascriptExecutor)driver;
												WebElement element3321 = driver.findElement(By.xpath("//*[@id=\"tblCoacheesEmailNotification\"]/tbody/tr/td"));
												je3321.executeScript("arguments[0].scrollIntoView(true);", element3321);
												try {
													Thread.sleep(6000);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												//Close history page
												JavascriptExecutor je333221 = (JavascriptExecutor)driver;
												WebElement element333221 = driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span"));
												je333221.executeScript("arguments[0].scrollIntoView(true);", element333221);
												
												
												driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button/span")).click();
												
							
												
									
									
									
									
									
									
									
									
									
									
									
									
									
									
									
									
									
									
								
								
								
								
								
								
								}						
								
								
	}


