package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EdicaoDeTarefa {
	private WebElement SelectTipo;
	private WebElement Titulo;
	private WebElement Descricao;
	private WebElement Situacao;
	private WebElement SelectPrioridade;
	private WebElement Inicio;
	private WebElement DataPrevista;
	private WebElement TempoEstimado;
	private WebElement BotaoCriar;
	private WebElement TempoGasto;
	private WebElement Comentario;
	private WebElement BotaoEnviar;
	
	public EdicaoDeTarefa(WebDriver driver) {
		this.setSelectTipo(driver.findElement(By.id("issue_tracker_id")));
		this.setTitulo(driver.findElement(By.id("issue_subject")));
		this.setDescricao(driver.findElement(By.id("issue_description")));
		this.setSituacao(driver.findElement(By.id("issue_status_id")));
		this.setSelectPrioridade(driver.findElement(By.id("issue_priority_id")));
		this.setInicio(driver.findElement(By.id("issue_start_date")));
		this.setDataPrevista(driver.findElement(By.id("issue_due_date")));
		this.setTempoEstimado(driver.findElement(By.id("issue_estimated_hours")));
		this.setBotaoEnviar(driver.findElement(By.name("commit")));
//		this.setBotaoCriar(driver.findElement(By.id("issue_tracker_id")));
//		this.setTempoGasto(driver.findElement(By.id("issue_tracker_id")));
//		this.setComentario(driver.findElement(By.id("issue_tracker_id")));
		
	}
	
	public WebElement getSelectTipo() {
		return SelectTipo;
	}
	public WebElement getTitulo() {
		return Titulo;
	}
	public WebElement getDescricao() {
		return Descricao;
	}
	public WebElement getSituacao() {
		return Situacao;
	}
	public WebElement getSelectPrioridade() {
		return SelectPrioridade;
	}
	public WebElement getInicio() {
		return Inicio;
	}
	public WebElement getDataPrevista() {
		return DataPrevista;
	}
	public WebElement getTempoEstimado() {
		return TempoEstimado;
	}
	public WebElement getBotaoCriar() {
		return BotaoCriar;
	}
	public WebElement getTempoGasto() {
		return TempoGasto;
	}
	public WebElement getComentario() {
		return Comentario;
	}
	public WebElement getBotaoEnviar() {
		return BotaoEnviar;
	}
	public void setSelectTipo(WebElement selectTipo) {
		SelectTipo = selectTipo;
	}
	public void setTitulo(WebElement titulo) {
		Titulo = titulo;
	}
	public void setDescricao(WebElement descricao) {
		Descricao = descricao;
	}
	public void setSituacao(WebElement situacao) {
		Situacao = situacao;
	}
	public void setSelectPrioridade(WebElement selectPrioridade) {
		SelectPrioridade = selectPrioridade;
	}
	public void setInicio(WebElement inicio) {
		Inicio = inicio;
	}
	public void setDataPrevista(WebElement dataPrevista) {
		DataPrevista = dataPrevista;
	}
	public void setTempoEstimado(WebElement tempoEstimado) {
		TempoEstimado = tempoEstimado;
	}
	public void setBotaoCriar(WebElement botaoCriar) {
		BotaoCriar = botaoCriar;
	}
	public void setTempoGasto(WebElement tempoGasto) {
		TempoGasto = tempoGasto;
	}
	public void setComentario(WebElement comentario) {
		Comentario = comentario;
	}
	public void setBotaoEnviar(WebElement botaoEnviar) {
		BotaoEnviar = botaoEnviar;
	}
}
