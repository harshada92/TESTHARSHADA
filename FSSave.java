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
public class FSSave {
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
//SECTOR EDIT AND CLOSE TESTING
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
CallThread();
//entry
driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/a/span")).click();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[1]/section/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnNew\"]")).click();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);}
//sch edit
public void Addfs() throws InterruptedException, IOException {
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnAdditem\"]")).click();
CallThread();
//sector edit
WebElement E1 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_cmbAircraft\"]"));
CallThread();
Select station = new Select(E1);
CallThread();
station.selectByVisibleText("VT-TEST1");
CallThread();
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_txtFrom\"]")).sendKeys("VAPO-PNQ-Pune");
CallThread();

/*driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_txtUTCFromDateTime_txtTimeOnly\"]")).click();
CallThread();


CallThread();
WebElement startTime = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_txtUTCFromDateTime_txtTimeOnly\"]"));
CallThread(); 
startTime.sendKeys("0340");
CallThread();  */

//driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_cmbFlightTypeListSortie\"]")).click();

WebElement E3 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_cmbFlightTypeListSortie\"]"));
CallThread();Thread.sleep(2000);
Select station2 = new Select(E3);
CallThread();
station2.selectByVisibleText("airconnect");
CallThread();
CallThread();CallThread();Thread.sleep(2000);
CallThread();    
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_txtTo\"]")).sendKeys("VAPO-PNQ-Pune");
CallThread();
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_txtUTCToDatetime_txtDateOnly\"]")).click();
CallThread();
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_txtUTCToDatetime_CalendarExtender1_today\"]")).click();
CallThread(); CallThread();Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_txtUTCToDatetime_txtTimeOnly\"]")).sendKeys("0440");
CallThread();
CallThread(); 
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/section/div/div[5]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[5]")).click();
CallThread(); CallThread(); 
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnAddSector\"]")).click();
Displaypopupmessage();
CallThread();
driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnCloseSector\"]")).click();
CallThread();}
@Test(priority=1)
public void FSSave1() throws InterruptedException, IOException {
System.out.println("Add FS Testing");
driver.get("https://www.bytzsoft.net/CrewRostering/Login.aspx");
Login();
Addfs();
CallThread();
driver.findElement(By.xpath("//*[@id=\"ctl00_lnkBtnLogout\"]")).click();
CallThread();}
@AfterTest
public void terminateBrowser(){
  driver.close();	   
} 
}
