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
public class CrewSave {
	String driverPath ="D:\\Selenium\\chromedriver-win64\\chromedriver.exe";
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
   		driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/a")).click();
   		CallThread();
   		driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[1]/ul/li[9]/a")).click();
   		CallThread();}
	public void Displaypopupmessage() throws InterruptedException, IOException {
		String e=driver.findElement(By.xpath("/html/body/div[1]/div/p")).getText();
		CallThread();
		System.out.println(e);}
public void crew () throws InterruptedException, IOException {
   	driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnAdd\"]")).click();
   	   		 CallThread();
   	   		 driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtName\"]")).sendKeys("ACREWTEST1");//crew name
			 CallThread();
			 driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtCode\"]")).sendKeys("ACTR1");//code
	   		 CallThread();
	   		 WebElement t8=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbNationality\"]"));
	   		 CallThread();
	   	     Select status = new Select(t8);
	   	     CallThread();
	   	     status.selectByVisibleText("India");//nationality
	   	     CallThread();
	   	     WebElement t2=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbCityList\"]"));
	 		 CallThread();
	 	     Select status1 = new Select(t2);
	 	     CallThread();
	 	     status1.selectByVisibleText("Mumbai");   //Base City
	 	     CallThread();
	 	     WebElement t1=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbDesignationList\"]"));
	 	     CallThread();
	 	     Select status2 = new Select(t1);
	 	     CallThread();
	 	     status2.selectByVisibleText("Pilot"); //Designation
	 	     CallThread();
	 	     CallThread();
	 	     WebElement t3=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbOnDutyAs\"]"));
	 	     CallThread();
		     Select status3 = new Select(t3);
		     CallThread();
		     status3.selectByVisibleText("PIC");//on duty as
		     CallThread();
		     driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtMobileNo\"]")).sendKeys("9309879975");//mobile
		     CallThread();
		     driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_CmbCountryCodeList\"]")).click();
		  	 Thread.sleep(2000);
			 WebElement t=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_CmbCountryCodeList\"]"));
			 Thread.sleep(2000);
			 Select code = new Select(t);
			 Thread.sleep(1000);
			 code.selectByValue("91");CallThread();//Country code
			 driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtEmail\"]")).sendKeys("harshada@bytzsoft.com");//mail id
		     CallThread();
		     driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtPassport\"]")).sendKeys("Passport123");//passport
			 CallThread();
			 driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtDateOfBirth\"]")).sendKeys("21-09-1992");//birth date
			 CallThread();
			 mousescrolldown();CallThread();
		     WebElement radio1= driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/fieldset[1]/div/div/div[15]/div/div[1]/div/label[1]"));
		     radio1.click();
		     CallThread();
		     //model
		     driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbModelList\"]")).click();//model
		     CallThread();
		     WebElement t5 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cmbModelList\"]"));
			 CallThread();CallThread();
		     Select status5 = new Select(t5);
		     CallThread();mousescrolldown();CallThread();
		     status5.selectByVisibleText("TestModel1 (Fixed Wing)"); CallThread();CallThread();
		     driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnAddModel\"]")).click();
			 CallThread();
		     mousescrollUP();
		     mousescrollUP();CallThread();
		     CallThread();driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnSave\"]")).click();
		     Displaypopupmessage();
		     CallThread();
  }
@Test(priority=1)
public void CrewSave1() throws InterruptedException, IOException {
	System.out.println("Add crew Testing");
driver.get("https://www.bytzsoft.net/CrewRostering/Login.aspx");
Login();
crew();
CallThread();
driver.findElement(By.xpath("//*[@id=\"ctl00_lnkBtnLogout\"]")).click();
CallThread();}
@AfterTest
public void terminateBrowser(){
    driver.close();
} 
}