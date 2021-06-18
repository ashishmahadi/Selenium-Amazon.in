package ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By getFashionLink = By.linkText("Fashion");
	
	
	public WebElement getFashionLink() {
		return driver.findElement(getFashionLink);
	}



	

}
