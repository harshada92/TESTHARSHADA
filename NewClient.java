package Bytz;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewClient {
	String driverPath ="D:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe";
	public static WebDriver driver ;
	static int count =0;
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
        System.out.println("launching chrome browser"); 
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);}
	public void CallThread() throws InterruptedException, IOException {
		Thread.sleep(4000);
			}
	

	
	public void URL() throws InterruptedException, IOException {
		driver.get("https://www.bytzsoft.net/CrewRostering/Login.aspx");
		CallThread();
		driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("btpladmin");
		driver.findElement(By.id("lnkArrow")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("8ytzadmin");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		//capture client name
   	WebElement e = driver.findElement(By.xpath("//*[@id=\"ctl00_lblCompanyName\"]"));
    	System.out.println(e.getText()+"");
    	Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);
		//Mazimize current window
		driver.manage().window().maximize();
		CallThread();
		}


		
		
	@Test(priority=1)
	public void Masters() throws InterruptedException, IOException {
		URL();	
		driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/a")).click();
		
		
		
		Thread.sleep(4000);
		String[] arrData = {"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[1]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[2]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[3]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[4]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[5]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[6]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[7]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[8]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[9]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[10]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[11]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[12]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[13]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[14]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[15]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[16]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[17]/a",};
		/*{"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[18]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[19]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[20]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[21]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[10]/a"};*/
				for(int i=0; i< arrData.length; i++){
					driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/a/span")).click();
						WebElement e = driver.findElement(By.xpath(arrData[i]));
	    	System.out.println(e.getText() + "***************************Master******" );
	    	driver.findElement(By.xpath(arrData[i])).click();
	    	CallThread();
	    	
	    	

	    	Thread.sleep(2000);
	}
				System.out.println("*****************All Masters are fine with zero run time error*******************");
				//LogOut System
				driver.findElement(By.xpath("/html/body/form/div[3]/div/header/div/div/div[3]/div/ul/li[4]/a/i")).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					}
	@Test(priority=2)
	public void Entry() throws InterruptedException, IOException {
		URL();	
		
		Thread.sleep(4000);
		String[] arrData = {"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[1]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[2]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[3]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[4]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[5]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[6]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[7]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[8]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[9]/a",};
						/*	{	"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[10]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[11]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[12]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[13]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[14]/a",};*/
				for(int i=0; i< arrData.length; i++){
					driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/a")).click();
					CallThread();
			//Eclick();
			WebElement e = driver.findElement(By.xpath(arrData[i]));
	    	System.out.println(e.getText() + "***************************Entry******" );
	    	driver.findElement(By.xpath(arrData[i])).click();
	    	Thread.sleep(2000);
	}
				System.out.println("*****************All Entry Module are fine with zero run time error*******************");
				//LogOut System
				driver.findElement(By.xpath("/html/body/form/div[3]/div/header/div/div/div[3]/div/ul/li[4]/a/i")).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					}
	
	    	



	@Test(priority=3)
	public void Report() throws InterruptedException, IOException {
		URL();		
		Thread.sleep(2000);
		
		String[] arrData = {"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[1]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[2]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[3]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[4]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[5]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[6]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[7]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[8]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[9]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[10]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[11]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[12]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[13]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[14]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[15]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[16]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[17]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[18]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[19]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[20]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[21]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[22]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[23]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[24]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[25]/a",};
							/*"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[26]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[27]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[28]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[29]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[30]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[31]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/ul/li[32]/a",};?*/
				for(int i=0; i< arrData.length; i++){
					driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[3]/a")).click();
					CallThread();
					//Rclick();
		WebElement e = driver.findElement(By.xpath(arrData[i]));
	    	System.out.println(e.getText() + "***************************Report*****" );
	    	driver.findElement(By.xpath(arrData[i])).click();
	    	Thread.sleep(2000);
	}
				System.out.println("*****************All Reports are fine with zero run time error*******************");
				//LogOut System
				driver.findElement(By.xpath("/html/body/form/div[3]/div/header/div/div/div[3]/div/ul/li[4]/a/i")).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					}
	@Test(priority=4)
	public void UTILITY() throws InterruptedException, IOException {
		URL();	
		
		Thread.sleep(4000);
		String[] arrData = {"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[4]/ul/li[1]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[4]/ul/li[2]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[4]/ul/li[3]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[4]/ul/li[4]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[4]/ul/li[5]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[4]/ul/li[6]/a",};
				for(int i=0; i< arrData.length; i++){
					driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[4]/a")).click();
					CallThread();

		WebElement e = driver.findElement(By.xpath(arrData[i]));
	    	System.out.println(e.getText() + "***************************Report*****" );
	    	driver.findElement(By.xpath(arrData[i])).click();
	    	Thread.sleep(2000);
	}
				System.out.println("*****************All Utilities are fine with zero run time error*******************");
				//LogOut System
				driver.findElement(By.xpath("/html/body/form/div[3]/div/header/div/div/div[3]/div/ul/li[4]/a/i")).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);}


	@Test(priority=5)
	public void Tools() throws InterruptedException, IOException {
		URL();		
	
		Thread.sleep(4000);
		String[] arrData = {"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[5]/ul/li[1]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[5]/ul/li[2]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[5]/ul/li[3]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[5]/ul/li[4]/a",
							"/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[5]/ul/li[5]/a",};
				driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[5]/a")).click();
				CallThread();
				for(int i=0; i< arrData.length; i++){
					driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[5]/a")).click();
					CallThread();
				
		WebElement e = driver.findElement(By.xpath(arrData[i]));
	    	System.out.println(e.getText() + "***************************Tools*****" );
	    	driver.findElement(By.xpath(arrData[i])).click();
	    	Thread.sleep(2000);
	}
				System.out.println("*****************All tools are fine with zero run time error*******************");
				//LogOut System
				driver.findElement(By.xpath("/html/body/form/div[3]/div/header/div/div/div[3]/div/ul/li[4]/a/i")).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);}
	@Test(priority=6)
	public void DASHBOARD() throws InterruptedException, IOException {
		URL();		
		Thread.sleep(4000);
		String[] arrData = {"//*[@id=\"ctl00_lnkRosterStatus\"]",
							"//*[@id=\"ctl00_lnkRosterStatusDaywise\"]",
							"//*[@id=\"ctl00_lnkAircraftStatus\"]",
							"//*[@id=\"ctl00_lnkCrewTrainingDocument\"]",
							"//*[@id=\"ctl00_lnkUtilizationReport\"]","//*[@id=\"ctl00_lnkCertificateApproval\"]","//*[@id=\"ctl00_lnkLiveAircraftDashboard\"]"};
				for(int i=0; i< arrData.length; i++){
		
			WebElement e = driver.findElement(By.xpath(arrData[i]));
	    	System.out.println(e.getText() + "***************************Dashboard******" );
	    	driver.findElement(By.xpath(arrData[i])).click();
	    	Thread.sleep(2000);
	}
				System.out.println("*****************All Entry Module are fine with zero run time error*******************");
				//LogOut System
				driver.findElement(By.xpath("/html/body/form/div[3]/div/header/div/div/div[3]/div/ul/li[4]/a/i")).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					}
	


		
	
	
@AfterTest
public void terminateBrowser(){
    driver.close();
	   
} 
}	
  
