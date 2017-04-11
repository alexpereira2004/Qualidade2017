package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.junit.*;
import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;

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
	public static void testarSeValorContem(String Referencia, String Contem) {
		assertThat(Referencia, CoreMatchers.containsString(Contem));	
	}
	
	public static void preencher(WebElement elemento, String texto) {
		elemento.sendKeys(texto);
	}
	

}
