package webDriver;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilites.constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driverManager {

	public static Logger logger = Logger.getLogger("Bdd-Cucumber practise");
	
	private static WebDriver driver = null;

	public static void launchBrowser()
	{
		// TODO Auto-generated method stub
		try
		{
			switch (constants.BrowserName)
			{
			case "chrome":

				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				logger.info(" chrome browser launched");
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
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static WebDriver getDriver() {
		return driver;
	}
}


