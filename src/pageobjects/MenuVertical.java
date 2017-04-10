package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuVertical {
	private WebElement VisaoGeral;
	private WebElement Atividade;
	private WebElement Tarefas;
	private WebElement Gantt;
	private WebElement Noticias;
	private WebElement Documentos;
	private WebElement Wiki;
	private WebElement Arquivos;
	private WebElement Configuracoes;

	public MenuVertical(WebDriver driver) {
		this.setVisaoGeral(driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[2]/a")));
		this.setAtividade(driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[3]/a")));
		this.setTarefas(driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[4]/a")));
		this.setGantt(driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[5]/a")));
		this.setNoticias(driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[6]/a")));
		this.setDocumentos(driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[7]/a")));
		this.setWiki(driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[8]/a")));
		this.setArquivos(driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[9]/a")));
		this.setConfiguracoes(driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[10]/a")));
	}

	public WebElement getVisaoGeral() {
		return VisaoGeral;
	}

	public void setVisaoGeral(WebElement visaoGeral) {
		VisaoGeral = visaoGeral;
	}

	public WebElement getAtividade() {
		return Atividade;
	}

	public void setAtividade(WebElement atividade) {
		Atividade = atividade;
	}

	public WebElement getTarefas() {
		return Tarefas;
	}

	public void setTarefas(WebElement tarefas) {
		Tarefas = tarefas;
	}

	public WebElement getGantt() {
		return Gantt;
	}

	public void setGantt(WebElement gantt) {
		Gantt = gantt;
	}

	public WebElement getNoticias() {
		return Noticias;
	}

	public void setNoticias(WebElement noticias) {
		Noticias = noticias;
	}

	public WebElement getDocumentos() {
		return Documentos;
	}

	public void setDocumentos(WebElement documentos) {
		Documentos = documentos;
	}

	public WebElement getWiki() {
		return Wiki;
	}

	public void setWiki(WebElement wiki) {
		Wiki = wiki;
	}

	public WebElement getArquivos() {
		return Arquivos;
	}

	public void setArquivos(WebElement arquivos) {
		Arquivos = arquivos;
	}

	public WebElement getConfiguracoes() {
		return Configuracoes;
	}

	public void setConfiguracoes(WebElement configuracoes) {
		Configuracoes = configuracoes;
	}

	
	

}
