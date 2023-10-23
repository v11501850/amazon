package amazonTestCasesPack;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.UtilityClass;
import pages.AddToCardTabOnHeader;
import pages.AddtoCardProduct;
import pages.EnterPassword;
import pages.LogoutPage;
import pages.SearchTabHeader;
import pages.SignInPage;

public class TestClassComman {
	       
	       private WebDriver driver;
	       private SignInPage signInPage;
	       private EnterPassword enterPassword;
	       private SearchTabHeader searchTabHeader;
	       private AddtoCardProduct addtoCardProduct;
	       private AddToCardTabOnHeader addToCardTabOnHeader;
	       private LogoutPage logoutPage;
	     
	       
	       @Parameters("browser")
	       
	       @BeforeTest
	      
	        public void launchBrowser  (String browserName ) {
	        	 if (browserName.equals("Chrome"))
	        	 {
				
				 System.setProperty("webdriver.chrome.driver","F:\\Testing class 2023\\chromedriver-win64\\chromedriver.exe");
//				 ChromeOptions options = new ChromeOptions(); 
//				 options.addArguments("--remove-allow-origins=*");
				  driver = new ChromeDriver();
	        	 }
	        	 if (browserName.equals("Firefox"))
	        	 {
				
				 System.setProperty("webdriver.firefox.driver","F:\\Testing class 2023\\geckodriver-v0.33.0-win64.zip");
				  driver = new FirefoxDriver();
	        	 }

	        	 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	        }
			@BeforeClass
			public void creatingPOMObject() throws InterruptedException{
				 signInPage = new SignInPage (driver);
				  enterPassword = new EnterPassword (driver);
				  searchTabHeader = new SearchTabHeader  (driver);
				  addtoCardProduct = new AddtoCardProduct (driver);
				  addToCardTabOnHeader = new AddToCardTabOnHeader (driver);
				   logoutPage = new LogoutPage (driver);
			}
			
			@BeforeMethod 
			
			public void openhomepage () throws InterruptedException,IOException{
				driver . get ("https://www.amazon.in/");
				
				signInPage.clickonAccountAndListHeader();
				String userName=UtilityClass.getDataFromExcelSheet("C:\\Users\\Admin\\eclipse-workspace\\AmazonMaven1\\src\\test\\resources\\DataResources\\xlcode.xlsx", "Sheet1", 1, 0);
				signInPage.clickonMobilenoOrEmailId(userName);
				System.out.println(userName);
				signInPage.clickonCountinueButton() ;
				
				String password=UtilityClass.getDataFromExcelSheet("C:\\Users\\Admin\\eclipse-workspace\\AmazonMaven1\\src\\test\\resources\\DataResources\\xlcode.xlsx", "Sheet1", 1, 1);
				enterPassword.clickonAccountAndListHeader(password);
				enterPassword.clickonSignIn();
			}
			
			@Test
			public void toVerifySearchTabOnHeader () {
				
				searchTabHeader.clickonSearchTab();
				searchTabHeader.clickonSearchButton();
			}
			
			@Test
			public void toVerifyAddtoCardProductonHomePage () {
				
//				WebDriverWait wait = new WebDriverWait(driver, 10);
//				WebElement scrollintoifram = wait.u
			
				//addtoCardProduct.scrollintoifram();
				addtoCardProduct.clickonpen();
				Set <String> s = driver.getWindowHandles();
				ArrayList ar = new ArrayList(s);
				System.out.println(ar.get(0));
				System.out.println(ar.get(1));
				driver.switchTo().window((String)ar.get(1));
				addtoCardProduct.addtocardpen();
				
			}
			
			@Test
			public void  toVerifyAddToCardTabOnHeader () {
				
				String handles = driver.getWindowHandle() ;
			    driver.switchTo().window(handles);
				addToCardTabOnHeader.clickonaddtocardtab();
				addToCardTabOnHeader.clickonproccedtobuy();
				driver.navigate().back();
				
			}
			
			@AfterMethod 
			public void  toVerifyLogoutPage () {
				
				logoutPage.clickonAllTab();
				logoutPage.clickonSignOutTab();
			}
			
			@AfterClass
			public void clearObject() {
				 signInPage= null;
			     enterPassword= null;
			     searchTabHeader=null;
			     addtoCardProduct=null;
			     addToCardTabOnHeader=null;
			     logoutPage=null;
				
			}
			
			@AfterTest
			public void  closeBrowser () {
				driver.quit();
			}
}
