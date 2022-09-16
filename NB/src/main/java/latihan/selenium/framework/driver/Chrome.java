package latihan.selenium.framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome implements DriverStrategy {

	public WebDriver setStrategy() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		options.setExperimentalOption("useAutomationExtension", false);
//		options.addArguments("--no-sandbox");
		
//		return new ChromeDriver(options);
		return driver;
	}
	
}
