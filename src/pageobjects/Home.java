package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

	private WebElement linkEntrar;
	
	public Home(WebDriver driver) {
	    this.setLinkEntrar(driver.findElement(By.linkText("Entrar")));
	}

	public WebElement getLinkEntrar() {
		return linkEntrar;
	}

	public void setLinkEntrar(WebElement linkEntrar) {
		this.linkEntrar = linkEntrar;
	}
}
