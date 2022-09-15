package tugas.selenium.demoqa.elements;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTables {
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
  public void testWebTables() throws Exception {
    driver.get("https://demoqa.com/webtables");
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div/div/div/div/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div/div/div/div/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div/div/div/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div/div/div/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div/div/div/div[3]/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div/div/div/div[3]/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div/div/div/div[4]/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div/div/div/div[4]/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div/div/div/div[5]/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div/div/div/div[5]/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div/div/div/div[6]/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div/div/div/div[6]/div")).click();
    driver.findElement(By.id("searchBox")).click();
    driver.findElement(By.id("searchBox")).clear();
    driver.findElement(By.id("searchBox")).sendKeys("Kierra");
    driver.findElement(By.cssSelector("#edit-record-3 > svg > path")).click();
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("Kierrai");
    driver.findElement(By.id("lastName")).click();
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("Gentryi");
    driver.findElement(By.id("userEmail")).click();
    driver.findElement(By.id("userEmail")).clear();
    driver.findElement(By.id("userEmail")).sendKeys("kierrai@example.com");
    driver.findElement(By.id("age")).click();
    driver.findElement(By.id("age")).clear();
    driver.findElement(By.id("age")).sendKeys("30");
    driver.findElement(By.id("salary")).click();
    driver.findElement(By.id("salary")).clear();
    driver.findElement(By.id("salary")).sendKeys("20000");
    driver.findElement(By.id("department")).click();
    driver.findElement(By.id("department")).clear();
    driver.findElement(By.id("department")).sendKeys("Legali");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("searchBox")).click();
    driver.findElement(By.id("searchBox")).clear();
    driver.findElement(By.id("searchBox")).sendKeys("");
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/div")).click();
    driver.findElement(By.cssSelector("#delete-record-2 > svg > path")).click();
    driver.findElement(By.id("addNewRecordButton")).click();
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("Nama");
    driver.findElement(By.id("lastName")).click();
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("Nama");
    driver.findElement(By.id("userEmail")).click();
    driver.findElement(By.id("userEmail")).clear();
    driver.findElement(By.id("userEmail")).sendKeys("nama@nama.co");
    driver.findElement(By.id("age")).click();
    driver.findElement(By.id("age")).clear();
    driver.findElement(By.id("age")).sendKeys("34");
    driver.findElement(By.id("salary")).click();
    driver.findElement(By.id("salary")).clear();
    driver.findElement(By.id("salary")).sendKeys("2700");
    driver.findElement(By.id("department")).click();
    driver.findElement(By.id("department")).clear();
    driver.findElement(By.id("department")).sendKeys("Web");
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

