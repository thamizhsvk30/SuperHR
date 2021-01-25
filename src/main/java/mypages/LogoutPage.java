package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage extends BasePage
{

	public LogoutPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By Logout = By.xpath("//a[@class='header-drop-item header-logout d-flex']");
	private By okbutton = By.xpath("//button[@class='btn logout-ok']");
	
	public WebElement Profile()
	{
		By Profile = By.xpath("//img[@alt='profile']");
		return get_Element(Profile);
	}
	
	public WebElement Logout()
	{
		return get_Element(Logout);
	}
	
	public WebElement okbutton()
	{
		return get_Element(okbutton);
	}
	public void logout() throws InterruptedException
	{
		try
		{
			Thread.sleep(3000);
			Profile().click();
			wait_For_WebElement(Logout);
			Logout().click();
			wait_For_WebElement(okbutton);
			okbutton().click();
		}
		catch(StaleElementReferenceException e)
		{
			Thread.sleep(3000);
			Profile().click();
			wait_For_WebElement(Logout);
			Logout().click();
			wait_For_WebElement(okbutton);
			okbutton().click();
		}
		catch (ElementClickInterceptedException e)
		{
			Thread.sleep(3000);
			Profile().click();
			wait_For_WebElement(Logout);
			Logout().click();
			wait_For_WebElement(okbutton);
			okbutton().click();
		}
		

	}

}
