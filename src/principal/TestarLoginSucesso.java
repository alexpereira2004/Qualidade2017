package principal;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import pageobjects.Login;
import helpers.*;

public class TestarLoginSucesso {
  private WebDriver driver;
  private String baseUrl;
  private DriverSelenium DriverConfig;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  
	  DriverConfig = new DriverSelenium();
	  driver = DriverConfig.getDriver();

  }

  
  @Test
  public void testLoginSucesso() throws Exception {

    driver.get(DriverConfig.getBaseUrl() + "login");
    
    Login PaginaLogin = new Login(driver);
    
    Comandos.click(PaginaLogin.getCheckManterLogado());
    Comandos.clearAndSendKeys(PaginaLogin.getUsername(), "alexpereira2004");
    Comandos.clearAndSendKeys(PaginaLogin.getPassword(), "colorado");
    Comandos.click(PaginaLogin.getBotaoEntrar());

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
