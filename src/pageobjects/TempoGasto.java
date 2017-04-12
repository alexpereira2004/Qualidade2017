package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TempoGasto {
	private WebElement Horas;
	private WebElement Data;
	private WebElement Comentario;
	private WebElement BotaoCriar;
	
	
	public TempoGasto(WebDriver driver) {
		this.setHoras(driver.findElement(By.id("time_entry_hours")));
		this.setComentario(driver.findElement(By.id("time_entry_comments")));
		this.setBotaoCriar(driver.findElement(By.name("commit")));
	}
	
	public WebElement getHoras() {
		return Horas;
	}
	public WebElement getData() {
		return Data;
	}
	public WebElement getComentario() {
		return Comentario;
	}
	public WebElement getBotaoCriar() {
		return BotaoCriar;
	}
	public void setHoras(WebElement horas) {
		Horas = horas;
	}
	public void setData(WebElement data) {
		Data = data;
	}
	public void setComentario(WebElement comentario) {
		Comentario = comentario;
	}
	public void setBotaoCriar(WebElement botaoCriar) {
		BotaoCriar = botaoCriar;
	}
}
