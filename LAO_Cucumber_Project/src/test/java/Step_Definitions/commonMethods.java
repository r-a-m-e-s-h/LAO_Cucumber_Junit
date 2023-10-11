package Step_Definitions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilites.ReadConfig;
import Utilites.constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import webDriver.driverManager;

/*import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;*/

/*import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;*/

public class commonMethods {

	//public static WebDriver  driver;
	
	//private static final Logger LOGGER = LogManager.getLogger(commonMethods.class);
	
	//Logger logger = LoggerFactory.getLogger(commonMethods.class);
	
	public static Logger logger = Logger.getLogger("Bdd-Cucumber practise");


	@Before
	public void beforeScenario()
	{
		
		//logger.info("Execution started");
		try {
			
			logger.info("initiating the common methods");
			ReadConfig readConfig = new ReadConfig();
			readConfig.loadProperties();
			
			PropertyConfigurator.configure("log4j.properties");
			
			logger.info("initiating the common methods");
			if(driverManager.getDriver()==null) 
			{
				logger.info("initiating the driver..... driver is NULLLLLL ");
				driverManager.launchBrowser();
				
				
			}

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}



@After
public void afterScenario()
{
	driverManager.getDriver().quit();
	logger.info("driver closed");
}





}
