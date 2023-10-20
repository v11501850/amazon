package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	    //variable -private
		@FindBy (xpath ="//a[@id='nav-link-accountList']")
	    private WebElement clickonaccountandlist;
		
		@FindBy (xpath ="//input[@id='ap_email']")
	    private WebElement clickonMobilenoOrEmailId;
		
		@FindBy (xpath ="//input[@id='continue']")
	    private WebElement clickonCountinue;
		
		
		//Constructor- public
		
		public SignInPage(WebDriver driver)
		{
		// To Find Element
		PageFactory.initElements(driver, this);
		}
		
		
		//Method -public
		
		public void  clickonAccountAndListHeader() {
			clickonaccountandlist.click();
		}
		
		public void  clickonMobilenoOrEmailId(String userName) {
			clickonMobilenoOrEmailId.sendKeys(userName);
		}
		
		public void  clickonCountinueButton() {
			clickonCountinue.click();
		}
		
}
