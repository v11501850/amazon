package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchTabHeader {
	
	    //variable -private
	    @FindBy (xpath ="//input[@aria-label='Search Amazon.in']")
         private WebElement searchTab;
	   
	    @FindBy (xpath ="//input[@id='nav-search-submit-button']")
        private WebElement  clickonsearchTab;
    
    
     
        //Constructor- public

		public SearchTabHeader(WebDriver driver)
		{
		// To Find Element
		PageFactory.initElements(driver, this);
		}
		
		
		//Method -public
		
		public void  clickonSearchTab() {
			searchTab.sendKeys("pen");
		}
		
		public void  clickonSearchButton() {
			clickonsearchTab.click();
		}

}
