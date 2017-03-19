package helpers;

import org.openqa.selenium.WebElement;

public class Comandos {

	public static void clearAndSendKeys(WebElement element, String text) {
		  element.clear();
		  element.sendKeys(text);
	  }
	
	public static void click (WebElement elemento) {
		elemento.click();
	}
	

}
