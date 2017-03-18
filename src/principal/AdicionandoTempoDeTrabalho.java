package principal;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdicionandoTempoDeTrabalho {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.firefox.marionette","C:\\Users\\alu201630648\\Downloads\\geckodriver.exe");
	driver = new FirefoxDriver();
    baseUrl = "http://www.hostedredmine.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAdicionandoTempoDeTrabalho() throws Exception {
    driver.get(baseUrl + "/projects/qualidade-de-software-2017/issues/gantt");
    
    driver.findElement(By.linkText("Entrar")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("alexpereira2004");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("colorado");
    driver.findElement(By.name("login")).click();
    
    new Select(driver.findElement(By.id("project_quick_jump_box"))).selectByVisibleText("Qualidade de Software 2017");
    driver.findElement(By.linkText("Task")).click();
    driver.findElement(By.linkText("644333")).click();    
    
//    driver.findElement(By.linkText("Task #644333")).click();
    driver.findElement(By.linkText("Tempo de trabalho")).click();
    driver.findElement(By.id("time_entry_hours")).clear();
    driver.findElement(By.id("time_entry_hours")).sendKeys("1");
    driver.findElement(By.id("time_entry_comments")).clear();
    driver.findElement(By.id("time_entry_comments")).sendKeys("Adicionando tempo gasto na tarefa");
    driver.findElement(By.name("commit")).click();
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
