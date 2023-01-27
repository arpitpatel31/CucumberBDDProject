package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ContactsPage extends TestBase{
	
	//pageFactory
	@FindBy(xpath="//span[contains(text(),'Create New Contact']")
	WebElement newContactLabel;
	
	@FindBy(name="first_name")
	WebElement firstname;
	
	@FindBy(name="last_name")
	WebElement lastname;
	
	@FindBy(name="position")
	WebElement position;
	
	@FindBy(name="department")
	WebElement department;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveBtn;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyNewContactLabel() {
		return newContactLabel.isDisplayed();
	}
	
	public void addNewContact(String ftname, String ltname, String pos, String dept) {
		firstname.sendKeys(ftname);
		lastname.sendKeys(ltname);
		position.sendKeys(pos);
		department.sendKeys(dept);
		
		saveBtn.click();
		
	}
	
	

}
