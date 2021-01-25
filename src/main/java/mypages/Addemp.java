package mypages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Addemp extends BasePage 
{

	public Addemp(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Employee screen buttons
	private By Addemployeebutton = By.xpath("//button[@class='view-add-btn btn']");
	private By Addbutton = By.xpath("//button[@type='submit']");
	private By mandatoaryalert = By.xpath("//span[@class='error-text pt-1']");
	// Personal Details fields
	private By upload = By.xpath("//input[@id='add-photo']");
	private By Firstname = By.xpath("//input[@placeholder='Enter first name']");
	private By Phonenumber = By.xpath("//input[@placeholder='Enter phone number']");
	private By DOB = By.xpath("//input[@placeholder='DD/MM/YYYY']");
	private By DOBclickdate = By.xpath("//span[@ng-reflect-ng-class='[object Object]' and @tabindex='0']");
	private By Age = By.xpath("//div[@class='d-flex align-items-center mt-2 employee-gender ng-star-inserted']");
	private By Male = By.xpath("//input[@type='radio' and @ng-reflect-value='Male']");
	private By Female = By.xpath("//input[@type='radio' and @ng-reflect-value='Female']");
	private By others = By.xpath("//input[@type='radio' and @ng-reflect-value='Others']");
	private By Resdentialaddress = By.xpath("//textarea[@placeholder='Enter residential address']");

	// Employment Details fields
	private By EmployeeType = By.xpath("//select[@ng-reflect-name='employment_type_id']");
	private By grosssalary = By.xpath("//input[@placeholder='Enter gross salary']");
	private By State = By.xpath("//div[@class='col-4 mb-3 ng-star-inserted']/select[@ng-reflect-name='state_id']");
	private By City = By.xpath("//select[@ng-reflect-name='city_id']");
	private By Location = By.xpath("//select[@ng-reflect-name='location_id']");
	private By Shift = By.xpath("//select[@ng-reflect-name='shift_id']");
	private By Attendencemode = By.xpath("//select[@ng-reflect-name='checkin_available_option_id']");
	private By Role = By.xpath("//select[@ng-reflect-name='role_id']");
	private By Designation = By.xpath("//input[@placeholder='Enter designation']");
	private By DOJ = By.xpath("//input[@placeholder='DD/MM/YYYY']");
	private By DOJclickdate = By.xpath("//span[@ng-reflect-ng-class='[object Object]' and @tabindex='0']");

	// Getting the element from the page
	public WebElement get_employeefields() {
		return get_Element(Addemployeebutton);
	}

	public WebElement clickingaddbutton() {
		return get_Element(Addbutton);
	}

	public List<WebElement> get_mandatoarymessage() {
		return get_Elements(mandatoaryalert);
	}

	public WebElement Uploadimage() {
		return get_Element(upload);
	}

	public WebElement Firstname() {
		return get_Element(Firstname);
	}

	public WebElement Phonenumber() {
		return get_Element(Phonenumber);
	}

	public List<WebElement> get_date() {
		return get_Elements(DOB);
	}

	public WebElement DOB() {
		return get_Element(DOB);
	}
	
	public WebElement DOBclick() {
		return get_Element(DOBclickdate);
	}

	public WebElement Male() {
		return get_Element(Male);
	}

	public WebElement Female() {
		return get_Element(Female);
	}

	public WebElement Others() {
		return get_Element(others);
	}

	public WebElement Resdentialaddress() {
		return get_Element(Resdentialaddress);
	}

	public Select employeetype() {
		return selectby(EmployeeType);
	}

	public WebElement grosssalary() {
		return get_Element(grosssalary);
	}
	
	public WebElement getstate() {
		return get_Element(State);
	}

	public Select state() {
		return selectby(State);
	}

	public Select city() {
		return selectby(City);
	}

	public Select Location() {
		return selectby(Location);
	}

	public Select shift() {
		return selectby(Shift);
	}

	public Select Attendencemode() {
		return selectby(Attendencemode);
	}

	public Select Role() {
		return selectby(Role);
	}

	public List<WebElement> get_doj() {
		return get_Elements(DOJ);
	}

	public WebElement designation() {
		return get_Element(Designation);
	}
	
	public WebElement DOJclick() {
		return get_Element(DOJclickdate);
	}
	
	public Actions movetoelement()
	{
		return action(Male);
	}
	
	public void employeetab()
	{
		By Configuration = By.xpath("//a[@ng-reflect-router-link='/employees']");
		get_Element(Configuration).click();
		wait_For_clickable_WebElement(Configuration);
	}
	

	// Actions in the page-Clicking the Addemployee button from employee menu
	public void Addemployeedetails() throws InterruptedException 
	{
		Thread.sleep(7000);
		wait_For_WebElement(Addemployeebutton);
		get_employeefields().click();
	}
	// Clicking the add button directly for validating the mandatory fields.
	public void clickingaddbuttonemployee() throws InterruptedException 
	{
		Thread.sleep(7000);
		wait_For_WebElement(Addbutton);
		clickingaddbutton().click();
		wait_For_clickable_WebElement(Addbutton);
	}
	//Getting the mandatory alert message
	public void Addemployeemandatoaryalert() 
	{
		int j = get_mandatoarymessage().size();
		for (int i = 0; i < j; i++) {
			String elementText = get_mandatoarymessage().get(i).getText();
			System.out.println(elementText);
		}
	}
	
	//Filling the employee personal details
	public void Fillingpersonaldetails() throws InterruptedException, IOException 
	{
		String Addemployee					=get_Property_Data("Addemployeesheetname");
		ArrayList <String> uploadimage		=readexceldatas(Addemployee,0);
		ArrayList <String> Firstname		=readexceldatas(Addemployee,1);
		ArrayList <String> Phonenumber		=readexceldatas(Addemployee,2);
		ArrayList <String> DOB				=readexceldatas(Addemployee,3);
		ArrayList <String> Gender			=readexceldatas(Addemployee,4);
		ArrayList <String> Resenditaladdress=readexceldatas(Addemployee,5);
		ArrayList <String> Employeetype		=readexceldatas(Addemployee,6);
		ArrayList <String> grosssalary		=readexceldatas(Addemployee,7);
		ArrayList <String> States			=readexceldatas(Addemployee,8);
		ArrayList <String> City				=readexceldatas(Addemployee,9);
		ArrayList <String> Location			=readexceldatas(Addemployee,10);
		ArrayList <String> Shift			=readexceldatas(Addemployee,11);
		ArrayList <String> Attendencemode	=readexceldatas(Addemployee,12);
		ArrayList <String> Role				=readexceldatas(Addemployee,13);
		ArrayList <String> Designation		=readexceldatas(Addemployee,14);
		ArrayList <String> DOJ				=readexceldatas(Addemployee,15);
		
		for(int i=1;i<Firstname.size();i++)
		{
			employeetab();
			Addemployeedetails();
			//Uploadimage().sendKeys(uploadimage.get(i));
			Firstname().sendKeys(Firstname.get(i));
			Phonenumber().sendKeys(Phonenumber.get(i));
			get_date().get(0).sendKeys(DOB.get(i));
			Thread.sleep(10000);
			DOBclick().click();
			Thread.sleep(5000);
			scrolldown();
			Resdentialaddress().sendKeys(Resenditaladdress.get(i));
				if (Gender.get(i).equals("Male"))
				{ 
					wait_For_WebElement(Male); Male().click(); 
				}
				 else if (Gender.get(i).equals("Female"))
					 Female().click(); 
				 else 
				 { 
					 Others().click();
				 }
			
			//Filling the employee employment details
			
			employeetype().selectByVisibleText(Employeetype.get(i));
			 grosssalary().sendKeys(grosssalary.get(i)); 
			 state().selectByValue(States.get(i));
			 Thread.sleep(5000);
			 city().selectByVisibleText(City.get(i)); 
			 Thread.sleep(5000);
			 Location().selectByVisibleText(Location.get(i)); 
			 Thread.sleep(2000);
			 shift().selectByVisibleText(Shift.get(i));
			 Attendencemode().selectByVisibleText(Attendencemode.get(i)); 
			 Role().selectByVisibleText(Role.get(i)); 
			 designation().sendKeys(Designation.get(i));
			 get_doj().get(1).sendKeys(DOJ.get(i));
			 Thread.sleep(5000);
			 DOJclick().click();
			 clickingaddbuttonemployee();
			 Thread.sleep(5000);
		}
		
	}
}
