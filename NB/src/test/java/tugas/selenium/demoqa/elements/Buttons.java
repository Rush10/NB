package tugas.selenium.demoqa.elements;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Buttons {
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
  public void testButtons() throws Exception {
	  
	Thread.sleep(3000);
    driver.get("https://demoqa.com/buttons");
    driver.findElement(By.id("UfPIN")).click();
    driver.findElement(By.id("rightClickBtn")).click();
    driver.findElement(By.id("doubleClickBtn")).click();
    driver.findElement(By.id("UfPIN")).click();
    driver.findElement(By.id("UfPIN")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=UfPIN | ]]
    driver.findElement(By.id("rightClickBtn")).click();
    driver.findElement(By.id("rightClickBtn")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=rightClickBtn | ]]
    driver.findElement(By.id("doubleClickBtn")).click();
    driver.findElement(By.id("doubleClickBtn")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=doubleClickBtn | ]]
    driver.findElement(By.id("doubleClickBtn")).click();
    driver.findElement(By.id("rightClickBtn")).click();
    driver.findElement(By.id("UfPIN")).click();
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

