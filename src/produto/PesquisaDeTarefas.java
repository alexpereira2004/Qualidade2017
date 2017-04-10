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
import pageobjects.MenuVertical;
import pageobjects.Tarefas;
import pageobjects.VisaoGeral;

public class PesquisaDeTarefas {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private DriverSelenium DriverConfig;
  
  
  private VisaoGeral PaginaVisaoGeral;
  private Login SessaoSistema;
  private Tarefas PaginaTarefas;
  private MenuVertical Menu;

  @Before
  public void setUp() throws Exception {
	  DriverConfig = new DriverSelenium();
	  driver = DriverConfig.getDriver();
  }

  @Test
  public void testPesquisaDeTarefas() throws Exception {

	  SessaoSistema = new Login();
	  SessaoSistema.RealizarLoginUsuario(driver);

	  Menu = new MenuVertical(driver);
	  Comandos.click(Menu.getTarefas());

	  PaginaTarefas = new Tarefas(driver);
	  Comandos.selectByVisibleText(PaginaTarefas.getFiltroSituacao(), "igual a");
	  Comandos.selectByValue(PaginaTarefas.getFiltroSituacaoOpcao(), "1");
	  
	  Comandos.click(PaginaTarefas.getBotaoAplicar());
	  
	  PaginaTarefas = new Tarefas(driver);
	  Comandos.testarValorIgual(PaginaTarefas.getPrimeiraLinhaResultadoPesquisa().getText(), "New");

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
