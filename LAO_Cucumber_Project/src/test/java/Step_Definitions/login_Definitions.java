package Step_Definitions;

import org.apache.log4j.Logger;

import Pages.LoginPage;
import Utilites.constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webDriver.driverManager;

public class login_Definitions    {

	public static Logger logger = Logger.getLogger("Login-Page");
	
	LoginPage lp=new LoginPage(driverManager.getDriver());

	@Given("User enters the UserName")
	public void user_enters_the_user_name() throws InterruptedException {
		
		driverManager.getDriver().get(constants.App_URL);
	
		lp.getName(constants.UserName);
		
		logger.info("User name entered");
		
	}
	@When("User enters the password")
	public void user_enters_the_password() {

		lp.getPwd(constants.PassWord);

		logger.info("password entered");
		
	}
	@When("User clicks the login btn")
	public void user_clicks_the_login_btn() {

		lp.clickLoginBtn();
		
		logger.info("login button clicked");
		
	}
	@Then("home is Displayed")
	public void home_is_displayed() {
		
		lp.getTitle();
		
		logger.info("The login page title taken");

	}
}
