package Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		driver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@name=\"username\"]")
	 static WebElement name;
	
	@FindBy(xpath="//*[@name=\"password\"]")
	 static WebElement pwd;
	
	@FindBy(xpath="//*[text()=\" Login \"]")
	 static WebElement lgbtn;

	public void getName(String uname) {
		name.sendKeys(uname);
	}

	public void getPwd(String password) {
		 pwd.sendKeys(password);;
	}

	public void clickLoginBtn() {
		 lgbtn.click();;
	}
	
	public void getTitle()
	{
		System.out.println("The title of the page is : "+driver.getTitle());
	}
	
	
	
	
	
	
	

}
