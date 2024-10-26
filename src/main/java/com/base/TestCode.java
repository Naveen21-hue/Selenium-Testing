package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;


public class TestCode {
	public static WebDriver driver;
	
	public static final Logger log=Logger.getLogger(TestCode.class.getName());
	
	//select browser
	public static void select_browser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("-incognito");
			options.addArguments("--window-size=1920,1080");
			options.addArguments("disable-blink-features=AutomationControlled");
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			log.info("Chrome initialized successfully");
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			log.info("Firefox initialized successfully");
		}
		
		else if (browser.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			log.info("Internet Explorer initialized successfully");
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			log.info("Edge Browser initialized successfully");

		}
	}
		
		//  Get Environment
	
		public static void get_environment(String env) throws IOException {
			 driver.get(get_Property_Value(env));
			 log.info("Application Launched successfully");
		}
		
		//  Select Browser and initialize environment
		
		public static void initialize_environment(String browser,String env) throws IOException {
			select_browser(browser);
			get_environment(env);
		}
		
		// Read Data from properties File
		
		public static String get_Property_Value(String key) throws IOException {
			Properties prop = new Properties();
			FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\config\\config.properties");
			prop.load(fis);
			
			return prop.getProperty(key);
		}
		
		@AfterMethod
		public void teardown() {
			try {
				if (driver != null) {
					driver.quit();
					log.info("Browser quit successfully");
				}
			} catch (Exception e) {
				 log.info("Exception occurred during teardown: " + e.getMessage());
			}
		
			
		
			
	}
}

