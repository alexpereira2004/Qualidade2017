package helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSelenium {
	private WebDriver driver;
	private String baseUrl;
	
	public DriverSelenium() {
		if (driver == null) {
			System.setProperty("webdriver.firefox.marionette","C:\\Users\\alu201630648\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
			baseUrl = "http://www.hostedredmine.com/";
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(baseUrl);
		}
//	    return driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public String getBaseUrl () {
		return baseUrl;
	}
}
