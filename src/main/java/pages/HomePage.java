package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
	//PageFactory
	@FindBy(className = "user-display")
	WebElement userLabel;
	
	@FindBy(linkText = "Free account")
	WebElement trialLabel;
	
	@FindBy(className = "users icon")
	WebElement contactsLabel;
	
	@FindBy(className = "")
	WebElement dealsLabel;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getHomeTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyNameLabel() {
		return userLabel.isDisplayed();
	}
	
	public boolean verifyAccountTypeLabel() {
		return trialLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContacts() {
		contactsLabel.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDeals() {
		dealsLabel.click();
		return new DealsPage();
	}
	
	public void createNewContact() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLabel).build().perform();
		
		List<WebElement> addLabels = driver.findElements(By.xpath("//div[@class='menu-item-wrapper']//button"));
		addLabels.get(1).click();
	}
	
}
