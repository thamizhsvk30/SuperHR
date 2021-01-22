package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	static WebDriver driver;
	WebDriverWait wait;
	

	public Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 40);
	}
	public abstract String get_Page_Title();
	
	public abstract void send_keys(By locator, String keysToSend);
		
	public abstract WebElement get_Element(By locator);
	
	public abstract void wait_For_WebElement(By locator);
	
	public abstract void wait_For_clickable_WebElement(By locator);
	
	public abstract boolean waitUntilJQueryReady(WebDriver driver);
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
}

