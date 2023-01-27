package stepDefinations;

import org.junit.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.StartingPage;

public class ContactsPageStepDefination extends TestBase{
	StartingPage startPage;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	@Before
	public void setUp() {
		initilazation();
		
		startPage = new StartingPage();
		homePage = new HomePage();
		contactsPage = new ContactsPage();
		
		Assert.assertEquals(prop.getProperty("StartPageTitle"), startPage.startingPageTitle());
	    loginPage = startPage.clickOnLoginBtn();
	    
	    Assert.assertEquals(prop.getProperty("LoginPageTitle"), loginPage.loginPageTitle());
	    
	    loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
		Assert.assertEquals(prop.getProperty("HomePageTitle"), homePage.getHomeTitle());
	}

	@Given("verify the userlabel and triallabel")
	public void verify_the_userlabel_and_triallabel() {
		Assert.assertTrue(homePage.verifyNameLabel());
		Assert.assertTrue(homePage.verifyAccountTypeLabel());
	}

	@When("User mouse hover to contacts")
	public void user_mouse_hover_to_contacts() {
		homePage.createNewContact();
	}

	@When("verify new contacts page is open")
	public void verify_new_contacts_page_is_open() {
	   Assert.assertTrue(contactsPage.verifyNewContactLabel());
	}

	@Then("user add new contact {string}, {string}, {string} and {string}")
	public void user_add_new_contact_and(String firstname, String lastname, String position, String department) {
	   contactsPage.addNewContact(firstname, lastname, position, department); 
	}

}
