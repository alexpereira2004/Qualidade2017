package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VisaoGeral extends PageObjectBase {

	private WebElement TabelaResumoTask;
	private WebElement TabelaResumoFeature;
	private WebElement TabelaResumoBug;
	private WebElement TabelaResumoSupport;

	public VisaoGeral(WebDriver driver) {
		
	}

	public WebElement getTabelaResumoTask() {
		return TabelaResumoTask;
	}

	public void setTabelaResumoTask(WebElement tabelaResumoTask) {
		TabelaResumoTask = tabelaResumoTask;
	}

	public WebElement getTabelaResumoFeature() {
		return TabelaResumoFeature;
	}

	public void setTabelaResumoFeature(WebElement tabelaResumoFeature) {
		TabelaResumoFeature = tabelaResumoFeature;
	}

	public WebElement getTabelaResumoBug() {
		return TabelaResumoBug;
	}

	public void setTabelaResumoBug(WebElement tabelaResumoBug) {
		TabelaResumoBug = tabelaResumoBug;
	}

	public WebElement getTabelaResumoSupport() {
		return TabelaResumoSupport;
	}

	public void setTabelaResumoSupport(WebElement tabelaResumoSupport) {
		TabelaResumoSupport = tabelaResumoSupport;
	}
}
