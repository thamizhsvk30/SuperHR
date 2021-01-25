package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signuppage extends BasePage 
{

	public Signuppage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	private By phonenumber = By.xpath("//input[@type=\"text\"]");
	private By submit = By.xpath("//button[@type=\"submit\"]");
	
	public WebElement get_Phonenumber() {
		return get_Element(phonenumber);
	}
	
	public WebElement get_Submit_Btn() {
		return get_Element(submit);
	}
	
	public void do_signup(String phonenumber) {
		get_Phonenumber().sendKeys(phonenumber);
		get_Submit_Btn().click();
	}
	
	public void login(String phonenumber) {
		get_Phonenumber().sendKeys(phonenumber);
		get_Submit_Btn().click();
	}

}
