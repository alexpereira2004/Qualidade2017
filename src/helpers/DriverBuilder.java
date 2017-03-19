package helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverBuilder {
	private WebDriver driver;
	private String baseUrl;
	
	public DriverBuilder() {
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\alu201630648\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
	    baseUrl = "http://www.hostedredmine.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl);
//	    return driver;
	}
	
	public WebDriver GetDriver() {
		return driver;
	}
}
