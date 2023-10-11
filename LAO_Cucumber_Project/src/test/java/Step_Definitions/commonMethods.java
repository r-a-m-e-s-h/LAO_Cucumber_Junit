package Step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utilites.ReadConfig;
import Utilites.constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;*/

public class commonMethods {

	public static WebDriver  driver;
	
	//private static final Logger LOGGER = LogManager.getLogger(commonMethods.class);
	
	Logger logger = LoggerFactory.getLogger(commonMethods.class);


	@Before
	public void beforeScenario()
	{
		
		logger.info("Execution started");
		try {
			
			logger.info("initiating the common methods");
			ReadConfig readConfig = new ReadConfig();
			readConfig.loadProperties();
			logger.info("initiating the common methods");
			if(driver==null) 
			{
				logger.info("initiating the driver..... driver is NULLLLLL ");
				launchBrowser();
				
				
			}

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


	public void launchBrowser() {
		// TODO Auto-generated method stub

		switch (constants.BrowserName) {
		case "chrome":

			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			logger.info("launch chrome browser");
			break;

		case "edge":

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			break;


		default:
			WebDriverManager.operadriver().setup();
			driver= new ChromeDriver();
			break;
		}

	}

@After
public void afterScenario()
{
	driver.quit();
}





}
