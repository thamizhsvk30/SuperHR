package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeeSetupForAdminPage extends BasePage {

	public EmployeeSetupForAdminPage(WebDriver driver) {
		super(driver);
	}
	
	private By mobNumber = By.tagName("input");
	private By submitBtn = By.xpath("//button[@type='submit']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By nextBtn = By.xpath("//button[text()='Next']");
	private By Employee = By.xpath("(//a[@class='header-item'])[1]");
	private By AddEmployee = By.xpath("//button[@class='view-add-btn btn']");
	private By FirstName = By.xpath("//input[@placeholder='Enter first name']");
	private By MobileNUmber = By.xpath("//input[@placeholder='Enter phone number']");
	private By DateOfBirth = By.xpath("(//input[@placeholder='DD/MM/YYYY'])[1]");
	private By Male = By.xpath("(//span[@class='checkmark'])[1]");
	private By EmployeeType = By.xpath("(//select[@class='form-control mt-2 ng-pristine ng-invalid ng-star-inserted ng-touched'])[1]");
	private By GrossSalary = By.xpath("//input[@placeholder='Enter gross salary']");
	private By State = By.xpath("(//select[@class='form-control mt-2 ng-pristine ng-invalid ng-star-inserted ng-touched'])[2]");
	private By City = By.xpath("(//select[@class='form-control mt-2 ng-untouched ng-pristine ng-invalid ng-star-inserted'])[1]");
	private By Location = By.xpath("(//select[@class='form-control mt-2 ng-pristine ng-invalid ng-star-inserted ng-touched'])[3]");
	private By Shift = By.xpath("(//select[@class='form-control mt-2 ng-pristine ng-invalid ng-star-inserted ng-touched'])[4]");
	private By AttendanceMode = By.xpath("(//select[@class='form-control mt-2 ng-pristine ng-invalid ng-star-inserted ng-touched'])[5]");
	private By AddButton = By.xpath("//button[@class='btn long-green-btn px-5 employee-btn-width ng-star-inserted']");
	
	public WebElement get_MobNumber() {
		return get_Element(mobNumber);
	}
	public WebElement get_SubmitBtn() {
		return get_Element(submitBtn);
	}
	public WebElement get_Password() {
		return get_Element(password);
	}
	public WebElement get_NextBtn() {
		return get_Element(nextBtn);
	}
	public WebElement get_Employee() {
		return get_Element(Employee);
	}
	public WebElement get_AddEmployee() {
		return get_Element(AddEmployee);
	}
	public WebElement get_FirstName(String string) {
		return get_Element(FirstName);
	}
	public WebElement get_MobileNUmber(String string) {
		return get_Element(MobileNUmber);
	}
	public WebElement get_DateOfBirth(String string) {
		return get_Element(DateOfBirth);
	}
	public WebElement get_Male() {
		return get_Element(Male);
	}
	public WebElement get_EmployeeType() {
		return get_Element(EmployeeType);
	}
	public WebElement get_GrossSalary(String string) {
		return get_Element(GrossSalary);
	}
	public WebElement get_State() {
		return get_Element(State);
	}
	public WebElement get_City() {
		return get_Element(City);
	}
	public WebElement get_Location() {
		return get_Element(Location);
	}
	public WebElement get_Shift() {
		return get_Element(Shift);
	}
	public WebElement get_AttendanceMode() {
		return get_Element(AttendanceMode);
	}
	public WebElement get_AddButton() {
		return get_Element(AddButton);
	}
	
	public void mobileNumberField(String mobileNo) {
		get_MobNumber().clear();
		get_MobNumber().sendKeys(mobileNo);
		get_SubmitBtn().click();
	}
	public void passwordField(String password) {
		get_Password().clear();
		get_Password().sendKeys(password);
		get_NextBtn().click();
	} 
	public Boolean addEmployeeFlow() throws InterruptedException  {
		
		try {
			
			//wait_For_clickable_WebElement(Employee);
			//Thread.sleep(3000);
			get_Employee().click();
			//wait_For_clickable_WebElement(AddEmployee);
			get_AddEmployee().click();
			get_FirstName(get_Property_Data("Name"));
			get_MobileNUmber(get_Property_Data("Mobile"));
			get_DateOfBirth(get_Property_Data("DOB"));
			get_Male().click();
			dropdown_select(get_EmployeeType(),"Fulltime");
			get_GrossSalary(get_Property_Data("Salary"));
			dropdown_select(get_State(),"TamilNadu");
			dropdown_select(get_City(),"Coimbatore");
			dropdown_select(get_Location(),"R S puram");
			dropdown_select(get_Shift(), "morning");
			dropdown_select(get_AttendanceMode(),"In-app attendance");
			get_AddButton().click();
			return true;
			} catch (Exception e) {
			return false;
			}
	}
	
}
