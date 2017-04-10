package pageobjects;

import org.openqa.selenium.WebDriver;

public abstract class PageObjectBase {
	protected WebDriver driver;
	protected String baseUrl;
	
	public WebDriver getDriver() {
		return driver;
	}

}
