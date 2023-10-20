package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterPassword {
	        //variable -private
	        @FindBy (xpath ="//input[@id='ap_password']")
            private WebElement enterPassword;
	
	        @FindBy (xpath ="//input[@id='signInSubmit']")
            private WebElement SignIn;
	
	       
	        
	        //Constructor- public
	
			public EnterPassword(WebDriver driver)
			{
			// To Find Element
			PageFactory.initElements(driver, this);
			}
			
			
			//Method -public
			
			public void  clickonAccountAndListHeader(String password) {
				enterPassword.sendKeys(password);
			}
			
			public void  clickonSignIn() {
				SignIn.click();
			}

}
