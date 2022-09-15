package tugas.selenium.demoqa.elements;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
  }

  @Test
  public void testCheckBox() throws Exception {
    driver.get("https://demoqa.com/checkbox");
  	
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-expand-all > path")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Book Store API'])[1]/following::*[name()='svg'][1]")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-collapse-all > path")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-collapse-all > path")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Book Store API'])[1]/following::*[name()='svg'][4]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Book Store API'])[1]/following::*[name()='svg'][4]")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-expand-close > path")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Home'])[1]/following::*[name()='svg'][2]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Desktop'])[1]/following::*[name()='svg'][2]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Documents'])[1]/following::*[name()='svg'][2]")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("li.rct-node.rct-node-parent.rct-node-collapsed > span.rct-text > label > span.rct-checkbox > svg.rct-icon.rct-icon-check > path")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-check > path")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-check > path")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Home'])[1]/following::*[name()='svg'][1]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Desktop'])[1]/following::*[name()='svg'][1]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes'])[1]/following::*[name()='svg'][1]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Desktop'])[1]/following::*[name()='svg'][1]")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-check > path")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-expand-close > path")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Documents'])[1]/following::*[name()='svg'][2]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='WorkSpace'])[1]/following::*[name()='svg'][2]")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("li.rct-node.rct-node-parent.rct-node-collapsed > span.rct-text > label > span.rct-checkbox > svg.rct-icon.rct-icon-check > path")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-check > path")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Documents'])[1]/following::*[name()='svg'][1]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='WorkSpace'])[1]/following::*[name()='svg'][1]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='React'])[1]/following::*[name()='svg'][1]")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("li.rct-node.rct-node-parent.rct-node-expanded > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li.rct-node.rct-node-leaf > span.rct-text > label > span.rct-checkbox > svg.rct-icon.rct-icon-uncheck > path")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='WorkSpace'])[1]/following::*[name()='svg'][1]")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-check > path")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-check > path")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-expand-close > path")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Office'])[1]/following::*[name()='svg'][1]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Public'])[1]/following::*[name()='svg'][1]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Private'])[1]/following::*[name()='svg'][1]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Classified'])[1]/following::*[name()='svg'][1]")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("li.rct-node.rct-node-leaf > span.rct-text > label > span.rct-checkbox > svg.rct-icon.rct-icon-check > path")).click();
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-check > path")).click();
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-check > path")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Classified'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Downloads'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.cssSelector("li.rct-node.rct-node-leaf > span.rct-text > label > span.rct-checkbox > svg.rct-icon.rct-icon-check > path")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Word File.doc'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::*[name()='svg'][2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Veu'])[1]/following::*[name()='svg'][2]")).click();
    driver.findElement(By.cssSelector("li.rct-node.rct-node-parent.rct-node-expanded > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li.rct-node.rct-node-parent.rct-node-expanded > span.rct-text > label > span.rct-checkbox > svg.rct-icon.rct-icon-uncheck > path")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Home'])[1]/following::*[name()='svg'][2]")).click();
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-check > path")).click();
    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-expand-open > path")).click();
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

