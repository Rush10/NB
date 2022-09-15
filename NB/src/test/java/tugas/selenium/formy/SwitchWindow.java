package tugas.selenium.formy;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchWindow {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSwitchWindow() throws Exception {
    driver.get("https://formy-project.herokuapp.com/switch-window");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[1]/following::h1[1]")).click();
    Thread.sleep(500);
    driver.findElement(By.id("alert-button")).click();
    Thread.sleep(1000);
    assertEquals(closeAlertAndGetItsText(), "This is a test alert!");
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Switch Window'])[2]/following::div[2]")).click();
    Thread.sleep(500);
    driver.findElement(By.id("new-tab-button")).click();
    Thread.sleep(1000);
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
//    driver.close();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Switch Window'])[2]/following::form[1]")).click();
  }

  @AfterClass(alwaysRun = true)
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
