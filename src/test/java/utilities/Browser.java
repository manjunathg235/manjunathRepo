package utilities;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Browser {
	
	private WebDriver driver;

		public WebDriver setup(String browser) {
			switch(browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--start-maximized");
				driver=new ChromeDriver(co);
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
			case "safari":
				assertTrue(false, "=> "+browser+"? Implementation is not available...");
				break;
			default:
				assertTrue(false, "=> "+browser+"? Invalid Browser value provided OR Implementation is not available...");
				break;
			}
			return driver;
			
//			if (browser.equalsIgnoreCase("chrome")) {
//				
//				WebDriverManager.chromedriver().setup();
//				ChromeOptions co=new ChromeOptions();
//				co.addArguments("--start-maximized");
//				driver=new ChromeDriver(co);
//				return driver;
//
//			} else if (browser.equalsIgnoreCase("FireFox")) {
//				
//				WebDriverManager.firefoxdriver().setup();
//				driver = new FirefoxDriver();
//				driver.manage().window().maximize();
//				return driver;
//			
//			} else if (browser.equalsIgnoreCase("IE")) {
//				WebDriverManager.iedriver().setup();
//				driver = new InternetExplorerDriver();
//				driver.manage().window().maximize();
//			}
//			return driver;
		}
}
