package Bytz;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoadTestinClass {
	String driverPath ="D:\\Selenium\\chromedriver-win64\\chromedriver.exe";
	public WebDriver driver ;		
	@BeforeTest
	public void launchBrowser() {
        System.out.println("launching chrome browser"); 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();}
	public void CallThread() throws InterruptedException, IOException {
		Thread.sleep(3000);	}
	public void comp() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//*[@id=\"ctl00_lnkLoggedInUser\"]")).click();
		CallThread();
		driver.findElement(By.xpath("//*[@id=\"ctl00_lnkProfile\"]")).click();
		CallThread();}
	
 void Login () throws InterruptedException, IOException {
		driver.manage().window().maximize();
		CallThread();
		
		
		driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("btpladmin");
		driver.findElement(By.id("lnkArrow")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("8ytzadmin");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
   		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   		
  

    	driver.findElement(By.xpath("//*[@id=\"ctl00_lnkBtnLogout\"]")).click();
    	Thread.sleep(3000);}
	
	 //2/BTP
	@Test(priority=1)
		public void BTP() throws InterruptedException, IOException {
		driver.get("https://www.bytzsoft.net//CrewRostering");
		Login();
	    System.out.println("***BTP login/logout successfully***");
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    CallThread();}
  

	//3.DMO
		@Test(priority=2)
		public void DMO() throws InterruptedException, IOException {
	 		driver.get("https://www.bytzsoft.net/CrewRosteringDMO/Login.aspx");
	 		Login();
	        System.out.println("***DMO login/logout successfully***");
	      	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      	CallThread();
	      	}
			//1.APP
	@Test(priority=3)
		public void APP() throws InterruptedException, IOException {
		driver.get("https://www.bytzsoft.net/CrewRosteringAPP/Login.aspx");
		Login();	
		System.out.println("***OPERATOR TEST login/Logout successfully***");
		CallThread();
		}  
	//USA   
	@Test(priority=4)
		public void USA() throws InterruptedException, IOException {
		driver.get("https://bytzsoft.net/CrewRosteringUSA/login.aspx");
		Login();
		System.out.println("***USA login/Logout successfully***");
		CallThread();
	}
	//SVN  
	@Test(priority=5)
		public void SVN() throws InterruptedException, IOException {
		driver.get("https://bytzsoft.net/CrewRosteringSVN/login.aspx");
		Login();
		System.out.println("***SVN login/Logout successfully***");
		CallThread();
	}
	//SYN  
	@Test(priority=6)
		public void SYN() throws InterruptedException, IOException {
		driver.get("https://bytzsoft.net/CrewRosteringSYN/login.aspx");
	    Login();
	    System.out.println("***SYN login/Logout successfully***");
	    CallThread();
	 }
	//2/ASH
		@Test(priority=7)
		public void ASH1() throws InterruptedException, IOException {	
		driver.get("https://www.bytzsoft.net/CrewRosteringASH/Login.aspx");
		Login();
	    System.out.println("***Ashley Aviation Ltd login/logout successfully***");
	    CallThread();}
	 
	//3.BHU
		@Test(priority=8)
		public void BHU2() throws InterruptedException, IOException {
		driver.get("https://www.bytzsoft.net/CrewRosteringBHU/Login.aspx");
		Login();
		System.out.println("***BHUSHAN AVAIATION login/logout successfully***");
		CallThread();
	 }
		//4.ABR
		@Test(priority=9)
			public void ABR3() throws InterruptedException, IOException {
			driver.get("https://www.bytzsoft.net/CrewRosteringABR/Login.aspx");
			Login();
			System.out.println("***AADITY BIRLA login/logout successfully***");
			CallThread();
	     
		}
	//5.ABD
		@Test(priority=10)
		public void ABD4() throws InterruptedException, IOException {
		driver.get("https://www.bytzsoft.net/CrewRosteringABD/Login.aspx");
	    Login();
	    System.out.println("***Aberdair Aviation Ltd login/logout successfully***");
	    CallThread();
		}
		
	//8.DHL     
	   @Test(priority=11)
		public void DHL5() throws InterruptedException, IOException {
		driver.get("https://www.bytzsoft.net/CrewRosteringDHL/Login.aspx");
		Login();
		System.out.println("***Dhillon(Contact managment) Aviation Pvt. Ltd login/Logout successfully***");
		CallThread();
	   }
	//9.OXF
	   @Test(priority=12)
			public void OXF6() throws InterruptedException, IOException {
		   	driver.get("https://www.bytzsoft.net/CrewRosteringOXF/Login.aspx");
			Login();
			System.out.println("***Oxford Enterprises Pvt Ltd login/Logout successfully***");
			CallThread();
	   }
	 //11.FBW
	   @Test(priority=13)
			public void FBW7() throws InterruptedException, IOException {
		   	driver.get("https:/www.bytzsoft.net/CrewRosteringFBW/login.aspx");
			Login();
			System.out.println("***FLIBYWIRE login/Logout successfully***");
			CallThread();
	      
	   }
	  //12.FOR
	   @Test(priority=14)
			public void FOR8() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringFOR/login.aspx");
		   	Login();
		   	System.out.println("***FORCE MOTORS login/Logout successfully***");
		   	CallThread();
	   }
	 //13 FUT
	   @Test(priority=15)
		public void FUT9() throws InterruptedException, IOException {
		driver.get("https://bytzsoft.net/CrewRosteringFUT/login.aspx");
		Login();
		System.out.println("***FUTURA AVIATION login/Logout successfully***");
		CallThread();
	   }
	 //14.GLD
	   @Test(priority=16)
		public void GLD10() throws InterruptedException, IOException {
		driver.get("https://bytzsoft.net/CrewRosteringGLD/login.aspx");
		Login();
		System.out.println("***Golden Crane Aviation Pvt. Ltd login/Logout successfully***");
	    CallThread();
	   }
	 //15 RTT
	  @Test(priority=17)
		public void RTT11() throws InterruptedException, IOException {
		driver.get("https://bytzsoft.net/CrewRosteringRTT/Login.aspx");
		Login();
		System.out.println("***Reliance Transport & Travels Pvt. Ltd. login/Logout successfully***");
	    CallThread();
	   }
	 //16.MYT
	   @Test(priority=18)
			public void MYT12() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringMYT/login.aspx");
		   	Login();
		   	System.out.println("***Mytri Aviation Private Limited login/Logout successfully***");
		   	CallThread();
	   }
	 //17LMW
	   @Test(priority=19)
			public void LMW13() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringLMW/login.aspx");
		   	Login();
		   	System.out.println("****LAKSHMI MACHINE WORKS LIMITED login/Logout successfully");
		   	CallThread();
	 }
	 //19 PNW
	   @Test(priority=20)
			public void PNW14() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringPNW/login.aspx");
		   	Login();
		   	System.out.println("***Poonawalla Aviation Pvt Ltd  login/Logout successfully***");
		   	CallThread();

	   }
	 //20.SOB
	   @Test(priority=21)
	   		public void SOB15() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringSOB/login.aspx");
		   	Login();
		   	System.out.println("***Sobha Puravankara Aviation (P) Ltd. login/Logout successfully***");
		   	CallThread();

	   }
	 //21.VEN
	   @Test(priority=22)
			public void VEN16() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringVEN/login.aspx");
		   	Login();
		   	System.out.println("***Ventura Airconnect login/Logout successfully***");
		   	CallThread();
	}
	//22.VSC
	   @Test(priority=23)
		public void VSC17() throws InterruptedException, IOException {
		driver.get("https://bytzsoft.net/CrewRosteringVSC/login.aspx");
		Login();
		System.out.println("***M/s VSR CORPORATION login/Logout successfully***");
		CallThread();
	   }
	 
	 //23.VSR
	   @Test(priority=24)
			public void VSR18() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringVSR/login.aspx");
		   	Login();
		   	System.out.println("***VSR VENTURES PVT LTD login/Logout successfully***");
		   	CallThread();

	   }

	 //25.TSL
	   @Test(priority=25)
			public void TSL19() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringTSL/login.aspx");
		   	Login();
		   	System.out.println("***TATA Steel Limited login/Logout successfully***");
		   	CallThread();
	  }
	//26.TPW
	   @Test(priority=26)
			public void TPW20() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringTPW/Login.aspx");
		   	Login();
		   	System.out.println("***The Tata Power Company Ltd. login/Logout successfully***");
		   	CallThread();
	 }
	//28.TAJ
	   @Test(priority=27)
			public void TAJ21() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringTAJ/Login.aspx");
		   	Login();
		   	System.out.println("***TAJ Air Limited login/Logout successfully***");
		   	CallThread();
	   }
	//29.IDC
	   @Test(priority=28)
			public void IDC22() throws InterruptedException, IOException {
		   driver.get("https://bytzsoft.net/CrewRosteringIDC/Login.aspx");
		   Login();
		   System.out.println("***Islands Development Company Limited login/Logout successfully***");
		   CallThread();
	}
	//30.LNT
	   @Test(priority=29)
			public void LNT23() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringLNT/login.aspx");
		   	Thread.sleep(2000);
		   	Login();
		   	System.out.println("***L&T AViation Services Pvt. Ltd. login/Logout successfully***");
		   	CallThread();
	}
	//31.LGR
	   	@Test(priority=30)
	   		public void LGR24() throws InterruptedException, IOException {
	 		driver.get("https://bytzsoft.net/CrewRosteringLGR/login.aspx");
	 		Login();
	 		System.out.println("***Ligare Aviation Engineering Private Limited login/Logout successfully***");
	 		CallThread();
	  }
	//18 PAB
	  @Test(priority=31)
			public void PAB25() throws InterruptedException, IOException {
		  	driver.get("https://bytzsoft.net/CrewRosteringPAB/login.aspx");
		  	Login();
		  	System.out.println("***PAB AirWing login/Logout successfully***");
		  	CallThread();}
	 //33.TPS
	   @Test(priority=32)
			public void TPS26() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringTPS/login.aspx");
		   	Login();
		   	System.out.println("***EFPL Support Pvt. Ltd.login/Logout successfully***");
		   	CallThread();
	 }
	 //34.SKY
	   @Test(priority=33)
			public void SKY27() throws InterruptedException, IOException {
	 		driver.get("https://bytzsoft.net/CrewRosteringSKY/login.aspx");
	 		Login();
	 		System.out.println("***Skyblue Aero Pvt Ltd login/Logout successfully***");
	 		CallThread();
	}
	//35.EFL
	 @Test(priority=34)
			public void EFL28() throws InterruptedException, IOException {
	 		driver.get("https://bytzsoft.net/CrewRosteringEFL/login.aspx");
	 		Login();
	 		System.out.println("**eFlight Services login/Logout successfully**");
	 		CallThread();
	}
	 //38.TXI
	  @Test(priority=35)
			public void TXI29() throws InterruptedException, IOException {
	 		driver.get("https://bytzsoft.net/CrewRosteringTXI/login.aspx");
	 		Login();
	 		System.out.println("***Aviation Connectivity & Infrastructure Developers login/Logout successfully***");
	 		CallThread();
	 		}
	 //39.NRM
	   @Test(priority=36)
			public void NRM30() throws InterruptedException, IOException {
	 		driver.get("https://bytzsoft.net/CrewRosteringNRM/login.aspx");
	 		Login();
	 		System.out.println("***Nirma logged in success  **");
			CallThread();
	 }
	   @Test(priority=37)
	   		public void BHA31() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringBHA/login.aspx");
		   	Login();
			System.out.println("***BHA login/Logout successfully***");
			CallThread();
	 }
	 //40.NEX
	   @Test(priority=38)
			public void NEX32() throws InterruptedException, IOException {
	 		driver.get("https://bytzsoft.net/CrewRosteringNEX/login.aspx");
	 		Login();
	 		System.out.println("***Nexus Flight Operations India Pvt Ltd login/Logout successfully***");
	 		CallThread();
	 }
	 //SHN
	   @Test(priority=39)
	   		public void SHN33() throws InterruptedException, IOException {
	   		driver.get("https://bytzsoft.net/CrewRosteringSHN/login.aspx");
	   		Login();
	   		System.out.println("***Shivan Aaditya Air Services Pvt. Ltd. login/Logout successfully***.");
	   		CallThread();
	   		}
	//EIH  
	   @Test(priority=40)
	 		public void EIH34() throws InterruptedException, IOException {
	  		driver.get("https://bytzsoft.net/CrewRosteringEIH/login.aspx");
	  		Login();
	  		System.out.println("***EIH login/Logout successfully***");
	  		CallThread();
	 }
	//SAR 
	   @Test(priority=41)
			public void SAR35() throws InterruptedException, IOException {
	 		driver.get("https://bytzsoft.net/CrewRosteringSAR/login.aspx");
	 		Login();
	 		System.out.println("***SARTHI login/Logout successfully**");
	 		CallThread();
	}
	 //MWA	
	   @Test(priority=42)
			public void MWA36() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringMWA/login.aspx");
		   	Login();
		   	System.out.println("***MWA login/Logout successfully***");
	 		CallThread();
	   }
	 //RTT
	   @Test(priority=43)
	 		public void RTT37() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringMWA/login.aspx");
		   	Login();
		   	System.out.println("***Reliance Transport & Travels Pvt. Ltd. login/Logout successfully***");
	  		CallThread();
	    }
	   //7AR  
	   @Test(priority=44)
			public void AR738() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRostering7AR/login.aspx");
			Login();
			System.out.println("7AR login/Logout successfully");
			CallThread();
	  }
	@Test(priority=45)
		public void CAI39() throws InterruptedException, IOException {
		driver.get("https://bytzsoft.net/CrewRosteringCAI/login.aspx");
	    Login();
		System.out.println("***CAREWELL AVIATION INDIA PVT LTD login/Logout successfully***");
		CallThread();
	  }
	   @Test(priority=46)
	  		public void BLU40() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringBLU/login.aspx");
		   	Login();
		   	System.out.println("***Blue Ray Aviation Pvt. Ltd. login/Logout successfully***");
		   	CallThread();
	    }
	   @Test(priority=47)
	 		public void PVA41() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringPVA/login.aspx");
		   	Login();
			System.out.println("***Propvista Aviation Pvt Ltd login/Logout successfully***");
			CallThread();
			}
	   @Test(priority=48)
			public void RAJ42() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringRAJ/login.aspx");
		   	Login();
		   	System.out.println("***Rajas Aerosports And Adventures Pvt Ltd login/Logout successfully***");
		   	CallThread();
		   	}
	   @Test(priority=49)
			public void SBS43() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringSBS/login.aspx");
		   	Login();
		   	System.out.println("***M/S Fly SBS Aviation Pvt Ltd	 login/Logout successfully***");
		   	CallThread();}
	   @Test(priority=50)
			public void CRL44() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringCRL/login.aspx");
		   	Login();
		   	System.out.println("***Corella Air Aviation Pvt Ltd login/Logout successfully***");
		   	CallThread();
	   }
	   @Test(priority=51)
			public void VSC45() throws InterruptedException, IOException {
		   	driver.get("https://bytzsoft.net/CrewRosteringVSC/login.aspx");
		   	Login();
		   	System.out.println("***M/s VSR CORPORATION login/Logout successfully***");
		   	CallThread();
	}
	 @Test(priority=52)
	  		public void SHR46() throws InterruptedException, IOException {
		 	driver.get("https://bytzsoft.net/CrewRosteringSHR/login.aspx");
		 	Login();
		 	System.out.println("***SHRDHA login/Logout successfully***");
		 	CallThread();
	 }
	@Test(priority=53)
	 		public void FRE47() throws InterruptedException, IOException {
			driver.get("https://bytzsoft.net/CrewRosteringFRE/login.aspx");
			Login();
			System.out.println("***FREEDOM charter login/Logout successfully***");
			CallThread(); 
	  }
	@Test(priority=54)
			public void FRM48() throws InterruptedException, IOException {
			driver.get("https://bytzsoft.net/CrewRosteringFRM/login.aspx");
			Login();
			System.out.println("***Forum1 login/Logout successfully***");
			CallThread();
	}
	@Test(priority=55)
			public void ACC49() throws InterruptedException, IOException {
			driver.get("https://bytzsoft.net/CrewRosteringACC/login.aspx");
			Login();
			System.out.println("***ACC login/Logout successfully***");
			CallThread();
	 }
	@Test(priority=56)
	public void TA2() throws InterruptedException, IOException {
	driver.get("https://bytzsoft.net/CrewRosteringTA2/login.aspx");
	Login();
	System.out.println("***TAJ AIR login/Logout successfully***");
	CallThread();
	}
	@Test(priority=57)
	public void KAL() throws InterruptedException, IOException {
	driver.get("https://bytzsoft.net/CrewRosteringKAL/login.aspx");
	Login();
	System.out.println("***KALYANEE login/Logout successfully***");
	CallThread();
	}
	@Test(priority=58)
	public void IAD() throws InterruptedException, IOException {
	driver.get("https://bytzsoft.net/CrewRosteringIAD/login.aspx");
	Login();
	System.out.println("**Ishwarbhai ArajanBhai Dholkia login/Logout successfully***");
	CallThread();
	}

	@Test(priority=59)
	public void SAP() throws InterruptedException, IOException {
	driver.get("https://bytzsoft.net/CrewRosteringSAP/login.aspx");
	Login();
	System.out.println("**SAPPHIRE login/Logout successfully***");
	CallThread();
	}
	 @AfterTest
		public void terminateBrowser(){
	 	driver.close();} 
}		

		
