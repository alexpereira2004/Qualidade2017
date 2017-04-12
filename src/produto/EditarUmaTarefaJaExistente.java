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
import helpers.DriverSelenium;
import helpers.Login;
import pageobjects.EdicaoDeTarefa;
import pageobjects.MenuVertical;
import pageobjects.ResumoDaTarefa;
import pageobjects.Tarefas;

public class EditarUmaTarefaJaExistente {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  DriverSelenium DriverConfig = new DriverSelenium();
	  driver = DriverConfig.getDriver();
  }

  @Test
  public void testEditarUmaTarefaJaExistente() throws Exception {
    
	  Login SessaoSistema = new Login();
	  SessaoSistema.RealizarLoginUsuario(driver);
	  
	  MenuVertical Menu = new MenuVertical(driver);
	  Comandos.click(Menu.getTarefas());
	  
	  Tarefas PaginaTarefas = new Tarefas(driver);
	  Comandos.click(PaginaTarefas.getLinkPrimeiraTarefaDaListagem());
	  
	  ResumoDaTarefa PaginaResumoDaTarefa = new ResumoDaTarefa(driver);
	  Comandos.click(PaginaResumoDaTarefa.getBotaoEditar());
	  
	  EdicaoDeTarefa PaginaEdicaoDeTarefas = new EdicaoDeTarefa(driver);
	  Comandos.preencher(PaginaEdicaoDeTarefas.getTitulo(), "Nome Passa a ser Editado");
	  
	  PaginaEdicaoDeTarefas.setBotaoEnviar();
	  Comandos.click(PaginaEdicaoDeTarefas.getBotaoEnviar());
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
