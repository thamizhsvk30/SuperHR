package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordPage extends BasePage
{

	public PasswordPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By newpassword = By.xpath("//input[@placeholder='New password']");
	private By confirmpassword = By.xpath("//input[@placeholder='Confirm password']");
	private By submit = By.xpath("//button[@type='submit']");
	
	public WebElement get_newpassword() 
	{
		return get_Element(newpassword);
	}
	
	public WebElement get_confirmpassword() 
	{
		return get_Element(confirmpassword);
	}
	
	public WebElement get_submit() 
	{
		return get_Element(submit);
	}

	public void newpassword(String newpassword) 
	{
		get_newpassword().sendKeys(newpassword);
		//LoginPage.return getInstance(EmpPage.class);
	}
	
	public void confirmpassword(String confirmpassword) 
	{
		get_confirmpassword().sendKeys(confirmpassword);
		get_submit().click();
		//LoginPage.return getInstance(EmpPage.class);
	}
}
