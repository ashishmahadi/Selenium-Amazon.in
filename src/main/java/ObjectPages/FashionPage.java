package ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FashionPage {

	WebDriver driver;
	
	public FashionPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By getToMensSection = By.xpath("//h2[text()=\"Men's collections\"]");
	private By getToFootwear = By.xpath("//h2[text()=\"Men's collections\"]/../following-sibling::div/div/div/ol/li[2]/a");
	
	
	
	public WebElement getToMensSection() {
		return driver.findElement(getToMensSection);
	}
	
	public WebElement getToFootwear() {
		return driver.findElement(getToFootwear);
	}


	

}
