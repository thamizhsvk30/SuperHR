package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPasswordPage extends BasePage 
{

	public LoginPasswordPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By Adminpassword = By.xpath("//input[@type='password']");
	private By submit = By.xpath("//button[@type=\"submit\"]");
	
	public WebElement get_Adminpassword() 
	{
		return get_Element(Adminpassword);
	}
	
	public WebElement get_Submit_Btn() 
	{
		return get_Element(submit);
	}
	
	public void Adminpassword(String Adminpassword) 
	{
		//After clicking the submit button in sign-up/Login page
		get_Adminpassword().sendKeys(Adminpassword);
		get_Submit_Btn().click();
	}
	
}
