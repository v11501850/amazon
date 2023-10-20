package amazonTestCasesPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.UtilityClass;
import pages.AddToCardTabOnHeader;
import pages.EnterPassword;
import pages.LogoutPage;
import pages.SignInPage;
import pages.YourOrders;

public class TestClassOfYourOrder {
	 private WebDriver driver;
		
		@BeforeClass
		public void launchBrowser  () {
			
			 System.setProperty("webdriver.chrome.driver","F:\\Testing class 2023\\chromedriver-win64\\chromedriver.exe");
//			 ChromeOptions options = new ChromeOptions(); 
//			 options.addArguments("--remove-allow-origins=*");
			  driver = new ChromeDriver();
			  
			  driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			}
		
		@BeforeMethod 
		
		public void openhomepage () throws InterruptedException,IOException{
			driver . get ("https://www.amazon.in/");
			SignInPage signInPage = new SignInPage (driver);
			signInPage.clickonAccountAndListHeader();
			String userName=UtilityClass.getDataFromExcelSheet("C:\\Users\\Admin\\eclipse-workspace\\AmazonMaven1\\src\\test\\resources\\DataResources\\xlcode.xlsx", "Sheet1", 1, 0);
			signInPage.clickonMobilenoOrEmailId(userName);
			signInPage.clickonCountinueButton() ;
			
			EnterPassword enterPassword = new EnterPassword (driver);
			String password=UtilityClass.getDataFromExcelSheet("C:\\Users\\Admin\\eclipse-workspace\\AmazonMaven1\\src\\test\\resources\\DataResources\\xlcode.xlsx", "Sheet1", 1, 1);
			enterPassword.clickonAccountAndListHeader(password);
			enterPassword.clickonSignIn();
		}
		@Test
		public void  toVerifyAddToCardTabOnHeader () {
			YourOrders yourOrders = new YourOrders (driver);
			yourOrders.clickonAccountandList();
			yourOrders.clickonYourOrder();
			yourOrders.clickoncancelledorder();
		}
		
		@AfterMethod 
		public void  toVerifyLogoutPage () {
			LogoutPage logoutPage = new LogoutPage (driver);
			logoutPage.clickonAllTab();
			logoutPage.clickonSignOutTab();
		}
		
		@AfterClass 
		public void  closeBrowser () {
			driver.quit();
		}
}



