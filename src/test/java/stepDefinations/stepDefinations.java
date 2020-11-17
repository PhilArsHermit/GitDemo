package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import resources.base;

public class stepDefinations extends base {
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver =initializeDriver();
	  
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		driver.get(arg1);
	  
	}

	@Given("^Click on Login link in home page to land on Sign in page$")
	public void click_on_Login_link_in_home_page_to_land_on_Sign_in_page() throws Throwable {
		LandingPage l=new LandingPage(driver);
		if(l.getPopUpSize()>0)
		{
			l.getPopUp().click();
		}
		LoginPage lp=l.getLogin();
	  
	}

	

	@Then("^Verified that user is successfully logged in$")
	public void verified_that_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		portalHomePage p=new portalHomePage(driver);
		Assert.assertTrue(p.getSearchBox().isDisplayed());
	    
	}
	
	 @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		 LoginPage lp=new LoginPage(driver);
			lp.getEmail().sendKeys(username);
			lp.getPassword().sendKeys(password);
			lp.getLogin().click();
	    }
	 @And("^close browsers$")
	    public void close_browsers() throws Throwable {
	       driver.quit();
	    }
	
	

}
