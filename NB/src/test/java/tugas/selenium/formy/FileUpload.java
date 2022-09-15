package tugas.selenium.formy;

import java.util.regex.Pattern;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUpload {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private Robot robot; 

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	robot = new Robot();
    baseUrl = "https://www.google.com/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFileUpload() throws Exception {
    driver.get("https://formy-project.herokuapp.com/fileupload");
    
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='File upload'])[1]/following::button[1]")).click();
    robot.setAutoDelay(1000);
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyPress(KeyEvent.VK_TAB);   
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.setAutoDelay(1000);
    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\ROG\\Downloads\\Nexsoft Bootcamp\\a.png");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='File upload'])[1]/following::button[1]")).click();
    Thread.sleep(1000);
    robot.keyPress(KeyEvent.VK_ENTER);			
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Choose'])[1]/following::button[1]")).click();
    Thread.sleep(1000);
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


