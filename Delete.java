package Bytz;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Delete {
	String driverPath ="D:\\\\\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe";
	public WebDriver driver ;		
	@BeforeTest
	public void launchBrowser() {
        System.out.println("launching chrome browser"); 
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();}
public void CallThread() throws InterruptedException, IOException {
		Thread.sleep(2000);	}
	public void confirmYES() throws InterruptedException, IOException {
		//mail to Auditor -confirmation
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnConfirmBoxYes\"]")).click();	     
		CallThread();
		}
	public void mousescrolldown() throws InterruptedException, IOException {
		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		Scrool.executeScript("window.scrollBy(0,300)", "");}
	public void mousescrollUP() throws InterruptedException, IOException {
		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		Scrool.executeScript("window.scrollBy(0,-300)", "");}
	public void Login () throws InterruptedException, IOException {
		driver.manage().window().maximize();
		CallThread();
		driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("admin2");
		driver.findElement(By.id("lnkArrow")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin2");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
   		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   		CallThread();}
	public void Master() throws InterruptedException, IOException {
		driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/a")).click();
   		CallThread();
   		}	
	public void Displaypopupmessage() throws InterruptedException, IOException {
	String e=driver.findElement(By.xpath("/html/body/div[1]/div/p")).getText();
	CallThread();
	System.out.println(e);}
	public void Modeldelete() throws InterruptedException, IOException {
		driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[2]/a")).click();
   		CallThread();
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLookFor\"]")).click();
   		CallThread();
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLookFor\"]")).sendKeys("TestModel1");
		driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[1]/div[2]/div/table/tbody/tr/td[2]/span/a/span")).click();
		CallThread();
			 driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[6]/a")).click();//code to delete button
			 CallThread();
			 confirmYES(); 
			 Displaypopupmessage();}
	public void CwDelete() throws InterruptedException, IOException {
			Master();
			driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[9]/a")).click();
	   		CallThread();
			driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLookFor\"]")).click();
	   		CallThread();
			driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLookFor\"]")).sendKeys("ACREWTEST1");
			driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[1]/div[2]/div/table/tbody/tr/td[2]/span/a/span")).click();
			CallThread();
				 driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[9]/a/i")).click();//code
				 CallThread();
				 confirmYES(); 
				 Displaypopupmessage();
	 }
			 public void Acdelete() throws InterruptedException, IOException {
					Master();
					driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[3]/a")).click();
			   		CallThread();
					driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLookFor\"]")).click();
			   		CallThread();
					driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLookFor\"]")).sendKeys("VT-TEST1");
					driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[1]/div[2]/div/table/tbody/tr/td[2]/span/a/span")).click();
					CallThread();
						 driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[2]/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[14]/a/i")).click();//code
						 CallThread();
						 confirmYES(); 
						 Displaypopupmessage();
	  		}
			 @Test(priority=0)
				public void Crewdelete() throws InterruptedException, IOException {
				driver.get("https://www.bytzsoft.net/CrewRostering/");
				Login();
				System.out.println("Delete crew Testing");
				CwDelete();
				CallThread();
				driver.findElement(By.xpath("//*[@id=\"ctl00_lnkBtnLogout\"]")).click();
				CallThread();}
	@Test(priority=1)
	public void AircraftModelDel() throws InterruptedException, IOException {
	driver.get("https://www.bytzsoft.net/CrewRostering/");
	Login();
	System.out.println("Delete Aircraft and Model Testing");
	Acdelete();
	Modeldelete();
	CallThread();
	driver.findElement(By.xpath("//*[@id=\"ctl00_lnkBtnLogout\"]")).click();
	CallThread();
	}
@AfterTest
public void terminateBrowser(){
    driver.close();
}
}
	   
