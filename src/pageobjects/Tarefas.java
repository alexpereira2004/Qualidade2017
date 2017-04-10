package pageobjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tarefas {
	private WebElement FiltroSituacao;
	private WebElement FiltroSituacaoOpcao;
	private WebElement BotaoAplicar;
	private WebElement ListagemResultadoPesquisa;
	private WebElement BotaoNovaTarefa;
	private WebElement PrimeiraLinhaResultadoPesquisa;
	


	private WebElement BotaoEditar;
	private WebElement TempoGasto;
	
	public Tarefas(WebDriver driver) {
		this.setFiltroSituacao(driver.findElement(By.id("operators_status_id")));
		this.setFiltroSituacaoOpcao(driver.findElement(By.id("values_status_id_1")));		
		this.setBotaoAplicar(driver.findElement(By.linkText("Aplicar")));
		this.setBotaoNovaTarefa(driver.findElement(By.xpath("(//a[contains(text(),'Nova tarefa')])[2]")));
		this.setPrimeiraLinhaResultadoPesquisa(driver.findElement(By.xpath("//div/table/tbody/tr/td[4]")));

	}

	public WebElement getPrimeiraLinhaResultadoPesquisa() {
		return PrimeiraLinhaResultadoPesquisa;
	}

	public void setPrimeiraLinhaResultadoPesquisa(WebElement primeiraLinhaResultadoPesquisa) {
		PrimeiraLinhaResultadoPesquisa = primeiraLinhaResultadoPesquisa;
	}
	
	public WebElement getBotaoEditar() {
		return BotaoEditar;
	}
	
	public void setBotaoEditar(WebElement botaoEditar) {
		BotaoEditar = botaoEditar;
	}
	
	public WebElement getTempoGasto() {
		return TempoGasto;
	}
	
	public void setTempoGasto(WebElement tempoGasto) {
		TempoGasto = tempoGasto;
	}

	public WebElement getFiltroSituacaoOpcao() {
		return FiltroSituacaoOpcao;
	}

	public void setFiltroSituacaoOpcao(WebElement filtroSituacaoOpcao) {
		FiltroSituacaoOpcao = filtroSituacaoOpcao;
	}

	public WebElement getFiltroSituacao() {
		return FiltroSituacao;
	}

	public void setFiltroSituacao(WebElement filtroSituacao) {
		FiltroSituacao = filtroSituacao;
	}

	public WebElement getBotaoAplicar() {
		return BotaoAplicar;
	}

	public void setBotaoAplicar(WebElement botaoAplicar) {
		BotaoAplicar = botaoAplicar;
	}

	public WebElement getListagemResultadoPesquisa() {
		return ListagemResultadoPesquisa;
	}

	public void setListagemResultadoPesquisa(WebElement listagemResultadoPesquisa) {
		ListagemResultadoPesquisa = listagemResultadoPesquisa;
	}

	public WebElement getBotaoNovaTarefa() {
		return BotaoNovaTarefa;
	}

	public void setBotaoNovaTarefa(WebElement botaoNovaTarefa) {
		BotaoNovaTarefa = botaoNovaTarefa;
	}
	
}
