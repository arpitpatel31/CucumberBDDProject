package stepDefinations;

import org.junit.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.StartingPage;

public class LoginPageStepDefination extends TestBase{
	
	StartingPage startPage;
	LoginPage loginPage;
	HomePage homePage;
	
	@Before
	public void setUp() {
		initilazation();
		startPage = new StartingPage();
		homePage = new HomePage();
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		Assert.assertEquals(prop.getProperty("StartPageTitle"), startPage.startingPageTitle());
	    loginPage = startPage.clickOnLoginBtn();
	}
	
	@Given("verify the login page title")
	public void verify_the_login_page_title() {
		Assert.assertEquals(prop.getProperty("LoginPageTitle"), loginPage.loginPageTitle());
	}
	//Reg Exp:
	//1. \"([^\"]*)\"
	//2. \"(.*)\"

	@When("User enter wrong {string} and {string}")
	public void user_enter_wrong_and(String username, String password) {
	    loginPage.logIn(username, password);
	}

	@Then("Error message is displayed")
	public void error_message_is_displayed() {
	    Assert.assertTrue(loginPage.errorMessagePopups());
	}
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		Assert.assertEquals(prop.getProperty("StartPageTitle"), startPage.startingPageTitle());
	    loginPage = startPage.clickOnLoginBtn();
	}

	@Given("verify login title")
	public void verify_login_title() {
		Assert.assertEquals(prop.getProperty("LoginPageTitle"), loginPage.loginPageTitle());
	}

	@When("enter email and password")
	public void enter_email_and_password() {
		loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("verify that user is on homepage")
	public void verify_that_user_is_on_homepage() {
	    Assert.assertEquals(prop.getProperty("HomePageTitle"), homePage.getHomeTitle());
	}
	
	

}
