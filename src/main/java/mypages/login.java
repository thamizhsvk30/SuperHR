package mypages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login extends BasePage 
{
	public login(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}	

	private By phonenumber = By.xpath("//input[@type=\"text\"]");
	private By newpassword = By.xpath("//input[@placeholder='New password']");
	private By confirmpassword = By.xpath("//input[@placeholder='Confirm password']");
	private By Adminpassword = By.xpath("//input[@type='password']");
	private By submit = By.xpath("//button[@type='submit']");
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
	
	public WebElement get_Phonenumber() 
	{
		return get_Element(phonenumber);
	}
	
	public WebElement get_Submit_Btn() 
	{
		return get_Element(submit);
	}
	
	public WebElement get_newpassword() 
	{
		return get_Element(newpassword);
	}
	
	public WebElement get_confirmpassword() 
	{
		return get_Element(confirmpassword);
	}
	
	public WebElement get_Adminpassword() 
	{
		return get_Element(Adminpassword);
	}
	
	
	public void do_signup(String phonenumber) 
	{
		get_Phonenumber().sendKeys(phonenumber);
		get_Submit_Btn().click();
	}
		
	public void loginpass() throws IOException, InterruptedException 
	{
		String logindetail	= get_Property_Data("loginSheetname");
		ArrayList <String> unname = readexceldatas(logindetail,0);
		ArrayList <String> pass	= readexceldatas(logindetail,1);
		
		for(int i=0;i<unname.size();i++)
		{
			get_Phonenumber().sendKeys(unname.get(i));
			get_Submit_Btn().click();
			get_Adminpassword().sendKeys(pass.get(i));
			get_Submit_Btn().click();

		}

	}
}
