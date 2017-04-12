package produto;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import helpers.Comandos;
import helpers.ConteudoRandomico;
import helpers.DriverSelenium;
import helpers.Login;
import pageobjects.EdicaoDeTarefa;
import pageobjects.MenuVertical;
import pageobjects.ResumoDaTarefa;
import pageobjects.Tarefas;

public class AdicionarNovasTarefasAoProjetoExistente {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private DriverSelenium DriverConfig;
  private Tarefas PaginaTarefas;

  @Before
  public void setUp() throws Exception {
	  DriverConfig = new DriverSelenium();
	  driver = DriverConfig.getDriver();
  }

  @Test
  public void testAdicionarNovasTarefasAoProjetoExistente() throws Exception {
	  
	  Login SessaoSistema = new Login();
	  SessaoSistema.RealizarLoginUsuario(driver);
	  
	  MenuVertical Menu = new MenuVertical(driver);
	  Comandos.click(Menu.getTarefas());
	  
	  PaginaTarefas = new Tarefas(driver);
	  Comandos.click(PaginaTarefas.getBotaoNovaTarefa());
	  
	  EdicaoDeTarefa PaginaEdicaoTarefas = new EdicaoDeTarefa(driver); 
	  Comandos.preencher(PaginaEdicaoTarefas.getTitulo(), ConteudoRandomico.gerarTituloDeTarefa());
	  
	  Comandos.preencher(PaginaEdicaoTarefas.getDescricao(), ConteudoRandomico.gerarDescricaoDeTarefa());
	  
	  Comandos.selectByVisibleText(PaginaEdicaoTarefas.getSelectPrioridade(), "Urgent");
	  
	  Comandos.click(PaginaEdicaoTarefas.getBotaoEnviar());
	  

	  ResumoDaTarefa PaginaResumoTarefa = new ResumoDaTarefa(driver);
	  
	  PaginaResumoTarefa.setMensagemRetorno();
	  
	  Comandos.testarSeValorContem(PaginaResumoTarefa.getMensagemRetorno().getText(), "criada.");
	  
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
