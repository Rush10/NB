package tugas.selenium.demoqa.elements;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TextBox {
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
  public void testTextBox() throws Exception {
    driver.get("https://demoqa.com/text-box");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("userName-label")).click();
    driver.findElement(By.id("userEmail-label")).click();
    driver.findElement(By.id("currentAddress-label")).click();
    driver.findElement(By.id("permanentAddress-label")).click();
    driver.findElement(By.id("userName")).click();
    driver.findElement(By.id("userName")).clear();
    driver.findElement(By.id("userName")).sendKeys("Nama");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("userEmail")).click();
    driver.findElement(By.id("userEmail")).clear();
    driver.findElement(By.id("userEmail")).sendKeys("email");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("userEmail")).click();
    driver.findElement(By.id("userEmail")).clear();
    driver.findElement(By.id("userEmail")).sendKeys("email@co");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("userEmail")).click();
    driver.findElement(By.id("userEmail")).clear();
    driver.findElement(By.id("userEmail")).sendKeys("email@co.id");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("currentAddress")).click();
    driver.findElement(By.id("currentAddress")).clear();
    driver.findElement(By.id("currentAddress")).sendKeys("Jl.sari");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("permanentAddress")).click();
    driver.findElement(By.id("permanentAddress")).clear();
    driver.findElement(By.id("permanentAddress")).sendKeys("Jl.Jkt");
    driver.findElement(By.id("submit")).click();
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

