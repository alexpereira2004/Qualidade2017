package produto;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import helpers.Comandos;
import helpers.DriverSelenium;
import helpers.Login;
import pageobjects.MenuVertical;
import pageobjects.Tarefas;

public class PesquisaDeTarefas {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();
  private DriverSelenium DriverConfig;
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
}
