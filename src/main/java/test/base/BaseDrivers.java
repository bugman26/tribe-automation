package test.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import test.utilities.*;

public class BaseDrivers {
	
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	String browser;
	
	public WebDriver initDriver() throws MalformedURLException {
		
		browser = ConfigReader.getProp().getProperty("test.browser").toLowerCase();
		
		System.out.println("Browser used: " + browser);
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		} else if (browser.equalsIgnoreCase("safari")) {
			tlDriver.set(new SafariDriver());
			getDriver().manage().window().maximize();
		} else {
			System.out.println("Please input correct browser in config file: " + browser);
		}
		
		
		
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return getDriver();
		
	}
	
	
	
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
	
	
	


}
