package Step_Definitions;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilites.ReadConfig;
import io.cucumber.java.After;

import io.cucumber.java.Before;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	/*
	public static WebDriver driver;
	
	public static Logger logger = Logger.getLogger("BDD Project");
	
	  ReadConfig config = new ReadConfig();
	  
	  public String BaseUrl = config.getURL(); 
	  public String userName = config.getUserName();
	  public String passWord = config.getPassword();
	 
	
	
	@Before
	public void SetUp()
	{
		PropertyConfigurator.configure("log4j.properties");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get(BaseUrl);
		logger.info("URL Opened");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	*/
	
	
	/*
	 * @After public void tearDown() { driver.quit(); }
	 */

}
