package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class StartingPage extends TestBase{
	
	//PageFactory
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	WebElement signInBtn;
	
	public StartingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickOnLoginBtn() {
		signInBtn.click();
		return new LoginPage();
	}
	
	public String startingPageTitle() {
		return driver.getTitle();
	}
	

}



 