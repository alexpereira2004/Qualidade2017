package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	private WebDriver driver;
	private WebElement BotaoEntrar;
	private String baseUrl;
	
	private WebElement username;
	private WebElement password;
	private WebElement login;
	private WebElement checkManterLogado;

	public Login(WebDriver driver) {
 
	    
	    this.username    = driver.findElement(By.id("username"));
	    this.password    = driver.findElement(By.id("password"));
	    this.BotaoEntrar 	   = driver.findElement(By.name("login"));
	    this.checkManterLogado = driver.findElement(By.name("autologin"));
	}

	public WebElement getCheckManterLogado() {
		return checkManterLogado;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBotaoEntrar() {
		return BotaoEntrar;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}


}
