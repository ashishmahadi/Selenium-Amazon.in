package ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By cartbtn = By.xpath("//a[@id=\"hlb-view-cart-announce\"]");
	
	
	public WebElement viewCart() {
		return driver.findElement(cartbtn);
	}


	

}
