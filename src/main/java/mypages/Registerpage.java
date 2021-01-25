package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registerpage extends BasePage
{

	public Registerpage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By phonenumber = By.xpath("//input[@class='form-control pl-5 ng-untouched ng-pristine ng-valid']");
	private By OTP = By.xpath("//input[@class=\"form-control ng-untouched ng-pristine ng-invalid\"]");
	private By Resend=By.xpath("//button[@class=\"btn sign-green-text\"]");
	private By submit = By.xpath("//button[@class=\"btn long-green-btn mt-2\"]");
	
	public WebElement get_Phonenumber() 
	{
		return get_Element(phonenumber);
	}
	
	public WebElement get_OTP() 
	{
		return get_Element(OTP);
	}
	
	public WebElement get_Resend() 
	{
		return get_Element(Resend);
	}
	
	public WebElement get_submit() 
	{
		return get_Element(submit);
	}
	
	public void do_register(String OTP) 
	{
		wait_For_WebElement(Resend);
		get_OTP().sendKeys(OTP);
		get_submit().click();
	}

}
