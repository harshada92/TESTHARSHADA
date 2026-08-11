package Bytz;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CrewAllocation {
	String driverPath ="D:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe";
	public WebDriver driver ;
	
	
	@BeforeTest
	
	public void launchBrowser() {
         System.out.println("launching chrome browser"); 
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

								}
	public void CallThread() throws InterruptedException, IOException {
		Thread.sleep(2000);	}
public void Displaypopupmessage() throws InterruptedException, IOException {
String e=driver.findElement(By.xpath("/html/body/div[1]/div/p")).getText();
CallThread();
System.out.println(e);}


public void Login() throws InterruptedException, IOException {
driver.get("https://www.bytzsoft.net/CrewRostering/Login.aspx");
driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("admin2");
driver.findElement(By.id("lnkArrow")).click();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin2");
driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
driver.manage().timeouts().implicitlyWait(36000, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.manage().window().maximize();
CallThread();}
public void FindSchedule() throws InterruptedException, IOException {
//entry
driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/a/span")).click();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//find schedule
driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[2]/div/div/div[1]/div/header/div[2]/div/div[1]/h4/a")).click(); CallThread();
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbAircraft\"]")).click(); CallThread();
WebElement t=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbAircraft\"]"));CallThread();
Select date = new Select(t);CallThread();
date.selectByVisibleText("VT-TEST1");CallThread();
Thread.sleep(4000);
//edit schedule
driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[2]/div/div/div[1]/div/div[2]/div[3]/div/div/div/table/tbody/tr[2]/td[7]/a")).click(); CallThread();}
public void CrewAllocate() throws InterruptedException, IOException {
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_lnkAllocateCrew\"]")).click(); CallThread();
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnSelectCrew\"]")).click(); CallThread();
driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[12]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div[2]/div/div/table/tbody/tr[2]/td[1]/a")).click(); CallThread();

driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbOnDutyAs\"]")).click(); CallThread();
WebElement t1=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbOnDutyAs\"]"));CallThread();
Select duty = new Select(t1);CallThread();
duty.selectByVisibleText("Captain");CallThread();
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnAllocate\"]")).click(); CallThread();
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnAllocateContinue\"]")).click(); 
Displaypopupmessage();CallThread();
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnCriticalAlertOK\"]")).click(); CallThread();
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnClose\"]")).click(); CallThread();
}
public void CrewDelete() throws InterruptedException, IOException {
	//entry
	driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/a/span")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[3]/a")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	//find Allocation
	driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[2]/div/div/div[1]/div/header/div[2]/div/div[1]/h4/a")).click(); CallThread();
	driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbCrewList\"]")).click(); CallThread();
	WebElement t=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbCrewList\"]"));CallThread();
	Select CREW = new Select(t);CallThread();
	CREW.selectByVisibleText("ACREWTEST1");CallThread();
	Thread.sleep(4000);
//Clear Allocation
driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[2]/div/div/div[1]/div/div[2]/div[3]/div/div/div/table/tbody/tr[2]/td[13]/a")).click(); CallThread();
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnConfirmBoxYes\"]")).click(); CallThread();
Displaypopupmessage();CallThread();Thread.sleep(4000);
//delete schedule
driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[2]/div/div/div[1]/div/div[2]/div[3]/div/div/div/table/tbody/tr[2]/td[8]/a/i")).click(); CallThread();

driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnConfirmBoxYes\"]")).click();	     
Displaypopupmessage();
CallThread();
CallThread();

}

@Test(priority=1)
public void AllocateCrew1() throws InterruptedException, IOException {
System.out.println("Crew Allocation");

driver.get("https://www.bytzsoft.net/CrewRostering/Login.aspx");
Login();
FindSchedule();
CrewAllocate();	
CrewDelete();
driver.findElement(By.xpath("//*[@id=\"ctl00_lnkBtnLogout\"]")).click();
CallThread();
}

   @AfterTest
   public void terminateBrowser(){
       driver.close();
	   
} 
}
