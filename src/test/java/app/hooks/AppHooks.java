package app.hooks;

import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import test.base.BaseDrivers;
import test.utilities.ConfigReader;

public class AppHooks {
	
	private BaseDrivers baseDriver;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	@Before(order = 1)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();

	}

	@Before(order =2)
	public void launchBrowser() throws MalformedURLException {
		baseDriver = new BaseDrivers();
		driver = baseDriver.initDriver();
	}

	@After(order = 0)	
	public void driverQuit() {
		System.out.println("Apphooks: 3");
		//driver.quit();
	}

}
