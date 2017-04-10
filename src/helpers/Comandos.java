package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.junit.*;
import static org.junit.Assert.*;

public class Comandos {

	public static void clearAndSendKeys(WebElement element, String text) {
		  element.clear();
		  element.sendKeys(text);
	  }
	
	public static void click (WebElement elemento) {
		elemento.click();
	}
	
	public static void selectByVisibleText(WebElement elemento, String texto) {
		new Select(elemento).selectByVisibleText(texto);
	}
	
	public static void selectByValue(WebElement elemento, String opcao) {
		new Select(elemento).selectByValue(opcao);
	}
	
	public static void testarValorIgual(String valor1, String valor2) {
		assertEquals(valor1, valor2);		
	}
	

}
