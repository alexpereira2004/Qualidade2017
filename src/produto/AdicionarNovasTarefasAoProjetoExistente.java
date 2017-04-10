package produto;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdicionarNovasTarefasAoProjetoExistente {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.firefox.marionette","D:\\Java\\geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "http://www.hostedredmine.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAdicionarNovasTarefasAoProjetoExistente() throws Exception {
    driver.get(baseUrl + "/");
    new Select(driver.findElement(By.id("project_quick_jump_box"))).selectByVisibleText("Qualidade de Software 2017");
    driver.findElement(By.linkText("Tarefas")).click();
    driver.findElement(By.linkText("649895")).click();
    driver.findElement(By.linkText("Editar")).click();
    driver.findElement(By.id("issue_subject")).clear();
    driver.findElement(By.id("issue_subject")).sendKeys("Nome Editado");
    driver.findElement(By.cssSelector("#issue-form > input[name=\"commit\"]")).click();
    assertEquals("Alterado com sucesso.", driver.findElement(By.id("flash_notice")).getText());
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
