package principal;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestaPesquisaCarro {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.poacarros.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAPesquisaCarro() throws Exception {
    driver.get(baseUrl + "/revendas?gclid=CI_DrpzN3tICFcgIkQod790JbQ");
    new Select(driver.findElement(By.name("type"))).selectByVisibleText("Carro/camioneta");
    new Select(driver.findElement(By.name("make"))).selectByVisibleText("Chevrolet (1599)");
    new Select(driver.findElement(By.name("model"))).selectByVisibleText("Agile (51)");
    new Select(driver.findElement(By.id("year1"))).selectByVisibleText("2011");
    new Select(driver.findElement(By.id("year2"))).selectByVisibleText("2015");
    driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
    driver.findElement(By.linkText("3")).click();
    driver.findElement(By.linkText("Selenium IDE Plugins")).click();
    driver.findElement(By.linkText("Download")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Download')])[3]")).click();
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
