package amazonAutomation.Automation;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver getDriver() throws IOException {
		
		String chromeDriverLocation = System.getProperty("user.dir")+"/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
