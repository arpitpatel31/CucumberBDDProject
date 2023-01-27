package stepDefinations;

import org.junit.Assert;

import base.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.StartingPage;

public class StartPageStepDefination extends TestBase{
	
	StartingPage startPage;
	LoginPage loginPage;
	
	@Given("user is on starting page")
	public void user_is_on_starting_page() {
		initilazation();
		startPage = new StartingPage();
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		Assert.assertEquals(prop.getProperty("StartPageTitle"), startPage.startingPageTitle());
	    loginPage = startPage.clickOnLoginBtn();
	}

	@Then("login page should open")
	public void login_page_should_open() {
		Assert.assertEquals(prop.getProperty("LoginPageTitle"), loginPage.loginPageTitle());
	    driver.close();
	}

}
