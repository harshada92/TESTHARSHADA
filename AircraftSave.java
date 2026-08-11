package Bytz;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class AircraftSave {
	String driverPath ="D:\\Selenium\\chromedriver-win64\\chromedriver.exe";
	public WebDriver driver ;		
	@BeforeTest
	public void launchBrowser() {
        System.out.println("launching chrome browser"); 
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();}
	public void CallThread() throws InterruptedException, IOException {
		Thread.sleep(1000);	}
	
	public void mousescrolldown() throws InterruptedException, IOException {
		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		Scrool.executeScript("window.scrollBy(0,300)", "");}
	public void mousescrollUP() throws InterruptedException, IOException {
		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		Scrool.executeScript("window.scrollBy(0,-300)", "");}
	public void confirmYES() throws InterruptedException, IOException {
		//mail to Auditor -confirmation
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnConfirmBoxYes\"]")).click();	     
		CallThread();
		}
	public void Displaypopupmessage() throws InterruptedException, IOException {
		String e=driver.findElement(By.xpath("/html/body/div[1]/div/p")).getText();
		CallThread();
		System.out.println(e);}
	public void Login () throws InterruptedException, IOException {
		driver.manage().window().maximize();
		CallThread();
		driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("btpladmin");
		driver.findElement(By.id("lnkArrow")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("8ytzadmin");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
   		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   		driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/a")).click();
   		CallThread();
   		driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[3]/a")).click();
   		CallThread();}
	public void addac() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnNew\"]")).click();
  		 CallThread();
  		 driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtRegNo\"]")).sendKeys("VT-TEST1");
	 CallThread();
	 driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbModelList\"]")).click();
  		CallThread();
	 WebElement modelselect = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbModelList\"]"));
  		CallThread();
	      Select For = new Select(modelselect);CallThread();
	      mousescrolldown();
	      For.selectByVisibleText("TestModel1 (Fixed Wing)");CallThread();
	      driver.findElement(By.xpath(" //*[@id=\"ctl00_ContentPlaceHolder1_txtMinFlightCrew\"]")).sendKeys("2");
	   		 CallThread();
	   		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbTimeFormat\"]")).click();
	   		CallThread();
  		WebElement TImeformat = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbTimeFormat\"]"));
  		CallThread();
	      Select For1 = new Select(TImeformat);CallThread();
	      For1.selectByVisibleText("UTC");CallThread();
	      CallThread();
	driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnSave\"]")).click();Displaypopupmessage();
		 CallThread();
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnCloseAircraft\"]")).click();
	 CallThread();
}
@Test(priority=1)
	public void AircraftSave1() throws InterruptedException, IOException {
		System.out.println("Add Aircraft Testing");
	driver.get("https://www.bytzsoft.net/CrewRostering/");
	Login();
	addac();
	CallThread();
	driver.findElement(By.xpath("//*[@id=\"ctl00_lnkBtnLogout\"]")).click();
	CallThread();}
	@AfterTest
	public void terminateBrowser(){
	    driver.close();
} 
}