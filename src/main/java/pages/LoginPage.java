package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement logInBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Something went wrong...')]")
	WebElement errorMessage;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String loginPageTitle() {
		return driver.getTitle();
	}
	
	public void logIn(String un, String pwd) {
		email.sendKeys(un);
		password.sendKeys(pwd);
		
		logInBtn.click();
	}
	
	public boolean errorMessagePopups() {
		return errorMessage.isDisplayed();
	}

}
