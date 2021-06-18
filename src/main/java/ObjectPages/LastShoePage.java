package ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LastShoePage {

	WebDriver driver;
	
	public LastShoePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By Addtocartbtn = By.xpath("//input[@id='add-to-cart-button']");
	
	
	
	public WebElement getAddtocartbtn() {
		return driver.findElement(Addtocartbtn);
	}


	

}
