package ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RunningShoesPage {

	WebDriver driver;
	
	public RunningShoesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By getToSortFilter = By.xpath("//span[text()=\"New and Bestselling\"]");
	private By sortHighToLow = By.linkText("Price: High to Low");
	private By searchResultsCount = By.xpath("//div[@data-component-type='s-search-result']");
	
	
	public WebElement getToSortFilter() {
		return driver.findElement(getToSortFilter);
	}
	
	public WebElement sortHighToLow() {
		return driver.findElement(sortHighToLow);
	}
	
	public WebElement lastrowFirstObject() {
		int searchResultsValue =  driver.findElements(searchResultsCount).size();
		int lastrowFirstObjectCount = searchResultsValue-3;
		return driver.findElement(By.xpath("//div[@data-component-type='s-search-result']["+lastrowFirstObjectCount+"]"));
	}
	
	


	

}
