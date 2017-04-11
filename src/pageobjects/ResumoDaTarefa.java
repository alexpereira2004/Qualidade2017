package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResumoDaTarefa {

	private WebElement BotaoEditar;
	private WebElement TempoGasto;
	private WebElement MensagemRetorno;
	
	public ResumoDaTarefa(WebDriver driver) {
		this.setMensagemRetorno(driver.findElement(By.id("flash_notice")));
	}

	public WebElement getBotaoEditar() {
		return BotaoEditar;
	}
	public WebElement getTempoGasto() {
		return TempoGasto;
	}
	public WebElement getMensagemRetorno() {
		return MensagemRetorno;
	}
	public void setBotaoEditar(WebElement botaoEditar) {
		BotaoEditar = botaoEditar;
	}
	public void setTempoGasto(WebElement tempoGasto) {
		TempoGasto = tempoGasto;
	}
	public void setMensagemRetorno(WebElement mensagemRetorno) {
		MensagemRetorno = mensagemRetorno;
	}
}
