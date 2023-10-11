package Utilites;

import java.util.Properties;

public class ReadConfig {



	public  void loadProperties() 
	{

		Properties pro = new Properties();

		try
		{

			//pro.load(getClass().getResourceAsStream("/config.properties"));
			pro.load(getClass().getResourceAsStream("./config.properties"));

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}


		constants.App_URL = pro.getProperty("BaseURL");

		constants.BrowserName = pro.getProperty("browserName");

		constants.UserName = pro.getProperty("UserName");

		constants.PassWord = pro.getProperty("PassWord");



	}

}


// FileInputStream fis;

// File floc = new File("config.properties");

/*
 * public ReadConfig() { try {
 * 
 * FileInputStream fis = new FileInputStream("config.properties");
 * 
 * pro = new Properties();
 * 
 * pro.load(fis);
 * 
 * 
 * } catch(Exception e) { e.printStackTrace();
 * //System.out.println("The error is : "+e.getMessage()); }
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * public String getURL() { String url = pro.getProperty("BaseURL"); return url;
 * }
 * 
 * public String getUserName() { String name = pro.getProperty("UserName");
 * return name; } public String getPassword() { String pwd =
 * pro.getProperty("PassWord"); return pwd; } public String getBrowser() {
 * String browser = pro.getProperty("Browser"); return browser; }
 */


