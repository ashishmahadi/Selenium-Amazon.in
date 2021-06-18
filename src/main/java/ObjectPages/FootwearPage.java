package ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FootwearPage {

	WebDriver driver;
	
	public FootwearPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By getToSportsShoes = By.xpath("//h2[text()=\"Sports shoes\"]");
	private By getToRunningShoes = By.xpath("//h2[text()=\"Sports shoes\"]/../following-sibling::div/div/div/ol/li[1]/a");
	
	
	
	public WebElement getToSportsShoes() {
		return driver.findElement(getToSportsShoes);
	}
	
	public WebElement getToRunningShoes() {
		return driver.findElement(getToRunningShoes);
	}


	

}
