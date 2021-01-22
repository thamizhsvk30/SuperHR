package mypages;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page {

	public BasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public WebElement get_Element(By locator) {
		WebElement element = null;
		try {
			wait_For_WebElement(locator);
			element = driver.findElement(locator);
			return element;
		} catch (Exception e) {
			System.out.println("Some error occured while creating element: " + locator.toString());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void wait_For_WebElement(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			System.out.println("Unable to find the element: " + locator.toString());
		}
	}
	
	@Override
	public void wait_For_clickable_WebElement(By locator) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (Exception e) {
			System.out.println("Unable to find the element: " + locator.toString());
		}
	}
	
	public Boolean wait_For_WebElement_Appearance(By locator) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			return true;
		} catch (Exception e) {
			System.out.println("Unable to find the element: " + locator.toString());
			return false;
		}
	}

	@Override
	public String get_Page_Title() {
		return driver.getTitle();
	}

	public static void get_Page(String url) {
		driver.get(url);
	}

	///////////////////////////
	//Wait until Jquery loads//
	///////////////////////////
	public boolean waitUntilJQueryReady(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		// wait for jQuery to load
		ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				try {
					return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
				} catch (Exception e) {
					// no jQuery present
					return true;
				}
			}
		};

		// wait for Javascript to load
		ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.className("ajax_loader_container"))));
		return wait.until(jQueryLoad) && wait.until(jsLoad);
	}

	public String get_Property_Data(String obj) {
		FileInputStream propfile;
		Properties prop;
		String value = "";
		try {
			prop = new Properties();
			propfile = new FileInputStream("./src/test/java/property/data.properties");
			prop.load(propfile);
			value = prop.getProperty(obj);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void dropdown_select(WebElement element,String text) {
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(text);
	}

	@Override
	public void send_keys(By locator, String keysToSend) {
		get_Element(locator).sendKeys(keysToSend);
	}
		

	public static void closeBrowser() {
	try {
		driver.quit();
	} catch (Exception e) {
	}
	}

	public static void waitForElementVisibility(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(element));	
	}

	public static void pageWait() throws Throwable{
		Thread.sleep(3000);
	}
	
	public static void selectByValue(WebElement element, String value) {
	try {
		Select obj_select = new Select(element);
		obj_select.selectByValue(value);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
