package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAdminCreation_Page extends BasePage {

	public NewAdminCreation_Page(WebDriver driver) {
		super(driver);
	}

	private By mobileNumber = By.tagName("input");
	private By Resend=By.xpath("//button[@class=\"btn sign-green-text\"]");
	private By otp = By.xpath("//input[@placeholder='Enter OTP']");
	private By newPwd = By.xpath("//input[@placeholder='New password']");
	private By confirmPwd = By.xpath("//input[@placeholder='Confirm password']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By submitBtn = By.xpath("//button[@class='btn long-green-btn mt-2']");
	private By nextBtn = By.xpath("//button[text()='Next']");
	private By enterName = By.xpath("//input[@placeholder='Enter your name']");
	private By cmpName = By.xpath("//input[@placeholder='Enter your company name']");
	private By location = By.xpath("//input[@placeholder='Enter location']");
	private By totalEmp = By.xpath("//input[@placeholder='Enter total number of working employees']");
	private By panNum = By.xpath("//input[@placeholder='Enter your company PAN']");
	private By stateDropdown = By.xpath("//select[@ng-reflect-name='state_id']");
	private By cityDropdown = By.xpath("//select[@ng-reflect-name='city_id']");
	private By proceedBtn = By.xpath("//button[text()='Proceed']");
	private By addEmpNo = By.xpath("//button[@ng-reflect-ng-class='warning-cancel']");
	private By dashboardImgContainer = By.xpath("//div[contains(@class,'dashboard-image-container')]");
	private By CompanyHead = By.xpath("//p[@class='company-head']");
	
	

	public WebElement get_CompanyHead() {
		return get_Element(CompanyHead);
	}
	
	public WebElement get_MobileNumber() {
		return get_Element(mobileNumber);
	}
	public WebElement get_Resend() {
		return get_Element(Resend);
	}
	
	public WebElement get_Password() {
		return get_Element(password);
	}
	
	public WebElement get_SubmitBtn() {
		return get_Element(submitBtn);
	}
	
	public WebElement get_Otp() {
		return get_Element(otp);
	}
	
	public WebElement get_NextBtn() {
		return get_Element(nextBtn);
	}
	
	public WebElement get_NewPwd() {
		return get_Element(newPwd);
	}
	
	public WebElement get_ConfirmPwd() {
		return get_Element(confirmPwd);
	}
	
	public WebElement get_EnterName() {
		return get_Element(enterName);
	}
	
	public WebElement get_CmpName() {
		return get_Element(cmpName);
	}
	
	public WebElement get_StateName() {
		return get_Element(stateDropdown);
	}

	public WebElement get_CityDropdown() {
		return get_Element(cityDropdown);
	}	

	public WebElement get_Location() {
		return get_Element(location);
	}
	
	public WebElement get_TotalEmp() {
		return get_Element(totalEmp);
	}
	
	public WebElement get_PanNum() {
		return get_Element(panNum);
	}
	
	public WebElement get_ProceedBtn() {
		return get_Element(proceedBtn);
	}
	
	public WebElement get_AddEmpNo() {
		return get_Element(addEmpNo);
	}
	
	public void newCustomerLogin(String mobileNo) throws InterruptedException {
		get_MobileNumber().clear();
		get_MobileNumber().sendKeys(mobileNo);
		get_SubmitBtn().click();
		get_Otp().clear();
		wait_For_WebElement(Resend);
		Thread.sleep(4000);
		get_Otp().sendKeys("123456");
		get_NextBtn().click();
		get_NewPwd().clear();
		get_NewPwd().sendKeys("Admin@123");
		get_ConfirmPwd().clear();
		get_ConfirmPwd().sendKeys("Admin@123");
		get_SubmitBtn().click();
		Thread.sleep(4000);
	}
	
	public void newCmpyCreation() {
		try {
			wait_For_clickable_WebElement(CompanyHead);
			//get_EnterName().clear();
			get_EnterName().sendKeys("Vino");
			//get_CmpName().clear();
			get_CmpName().sendKeys("Heptagon Technologies pvt ltd");
			dropdown_select(get_StateName(),"Tamilnadu");
			dropdown_select(get_CityDropdown(),"Thanjavur");
			get_Location().sendKeys("Test location");
			get_TotalEmp().sendKeys("10");
			get_PanNum().sendKeys("BCJPA1000A");
			Thread.sleep(2000);
			get_NextBtn().click();
			Thread.sleep(2000);
			wait_For_clickable_WebElement(proceedBtn);
			Thread.sleep(2000);
			get_ProceedBtn().click();
			Thread.sleep(2000);
			wait_For_WebElement(addEmpNo);
			Thread.sleep(2000);
			get_AddEmpNo().click();
			Thread.sleep(2000);
			//return true;
		} catch (Exception e) {
			//return false;
		}
		
	}
}
