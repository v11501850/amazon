package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	//variable -private
		 @FindBy (xpath ="//a[@id='nav-hamburger-menu']")
	     private WebElement clickonAll;
		 @FindBy (xpath ="(//a[text()='Sign Out'])[1]")
	     private WebElement clickonSignOut;
		
		 private JavascriptExecutor js;
		 public LogoutPage(WebDriver driver)
			{
			// To Find Element
			PageFactory.initElements(driver, this);
			js = (JavascriptExecutor)driver;
			}
		 
		 public void  clickonAllTab() {
			 clickonAll.click();
			} 
		 public void  clickonSignOutTab() {
			 js.executeScript("arguments[0].scrollIntoView(true)",clickonSignOut);
			 clickonSignOut.click();
			} 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
