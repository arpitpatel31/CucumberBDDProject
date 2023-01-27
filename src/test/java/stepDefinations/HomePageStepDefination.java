package stepDefinations;

import org.junit.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.StartingPage;

public class HomePageStepDefination extends TestBase{
	StartingPage startPage;
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		initilazation();
		
		startPage = new StartingPage();
		homePage = new HomePage();
		
		Assert.assertEquals(prop.getProperty("StartPageTitle"), startPage.startingPageTitle());
	    loginPage = startPage.clickOnLoginBtn();
	    
	    Assert.assertEquals(prop.getProperty("LoginPageTitle"), loginPage.loginPageTitle());
	    
	    loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
	    
	    Assert.assertEquals(prop.getProperty("HomePageTitle"), homePage.getHomeTitle());
	}

	@When("verify the label is correct")
	public void verify_the_label_is_correct() {
		Assert.assertTrue(homePage.verifyNameLabel());
		Assert.assertTrue(homePage.verifyAccountTypeLabel());
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}

}
