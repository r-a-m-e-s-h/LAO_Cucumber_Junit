package Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class login_Definitions    {



	@Given("User enters the UserName")
	public void user_enters_the_user_name() {


		System.out.println("hello");
	}
	@When("User enters the password")
	public void user_enters_the_password() {


		System.out.println("hello");
	}
	@When("User clicks the login btn")
	public void user_clicks_the_login_btn() {


		System.out.println("hello");
	}
	@Then("home is Displayed")
	public void home_is_displayed() {
		
		System.out.println("hello");

	}
}
