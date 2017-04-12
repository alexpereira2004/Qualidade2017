package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResumoDaTarefa {

	private WebElement BotaoEditar;
	private WebElement TempoGasto;
	private WebElement MensagemRetorno;
	private WebElement BotaoTempoDeTrabalho;
	private WebDriver driver;
	
	public ResumoDaTarefa(WebDriver driver) {
		this.driver = driver;
//		this.setMensagemRetorno(driver.findElement(By.id("flash_notice")));
//		this.setBotaoTempoDeTrabalho(driver.findElement(By.xpath("//a[contains(text(),'Tempo de trabalho')]")));
		this.setBotaoEditar(driver.findElement(By.linkText("Editar")));
		this.setBotaoTempoDeTrabalho(driver.findElement(By.linkText("Tempo de trabalho")));
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
	public void setMensagemRetorno() {
		MensagemRetorno = driver.findElement(By.id("flash_notice"));
	}

	public WebElement getBotaoTempoDeTrabalho() {
		return BotaoTempoDeTrabalho;
	}

	public void setBotaoTempoDeTrabalho(WebElement botaoTempoDeTrabalho) {
		BotaoTempoDeTrabalho = botaoTempoDeTrabalho;
	}
}
