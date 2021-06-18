package amazonAutomation.Automation;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectPages.CartPage;
import ObjectPages.FashionPage;
import ObjectPages.FootwearPage;
import ObjectPages.LandingPage;
import ObjectPages.LastShoePage;
import ObjectPages.RunningShoesPage;
import junit.framework.Assert;

public class AddRunningShoes extends Base {

	private WebDriver driver;

	@BeforeTest
	public void getBaseDriver() throws IOException {
		driver = getDriver();
	}

	@Test
	public void AddItem() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LandingPage lp = new LandingPage(driver);
		lp.getFashionLink().click();
		FashionPage fp = new FashionPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", fp.getToMensSection());
		fp.getToFootwear().click();
		FootwearPage fw = new FootwearPage(driver);
		js.executeScript("arguments[0].scrollIntoView(true);", fw.getToSportsShoes());
		fw.getToRunningShoes().click();
		RunningShoesPage rs = new RunningShoesPage(driver);
		Actions ac = new Actions(driver);
		ac.moveToElement(rs.getToSortFilter()).click().build().perform();
		ac.moveToElement(rs.sortHighToLow()).click().build().perform();
		js.executeScript("arguments[0].scrollIntoView(true);", rs.lastrowFirstObject());
		rs.lastrowFirstObject().click();
		String parentWindowValue = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindowValue)) {
				driver.switchTo().window(windowHandle);
				LastShoePage ls = new LastShoePage(driver);
				ls.getAddtocartbtn().click();
				CartPage cs = new CartPage(driver);
				cs.viewCart().click();
			}
		}
	}

	@AfterTest
	public void closeWindow() {
		driver.quit();
	}
}