package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	private By mobileNumber = By.tagName("input");
	private By otp = By.xpath("//input[@placeholder='Enter OTP']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By submitBtn = By.xpath("//button[@type='submit']");
	private By nextBtn = By.xpath("//button[text()='Next']");
	private By mobileNumErr = By.xpath("//span[contains(@class,'error-text')]");
	private By passwordErr = By.xpath("//p[contains(@class,'app-error-text')]");
	private By dashboardImgContainer = By.xpath("//div[contains(@class,'dashboard-image-container')]");
	
	public WebElement get_MobileNumber() {
		return get_Element(mobileNumber);
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
	
	public WebElement get_MobileNumErr() {
		return get_Element(mobileNumErr);
	}
	
	public WebElement get_PasswordErr() {
		return get_Element(passwordErr);
	}
	
	public void mobileNumberField(String mobileNo) {
		get_MobileNumber().clear();
		get_MobileNumber().sendKeys(mobileNo);
		get_SubmitBtn().click();
	}
	public void passwordField(String password) {
		get_Password().clear();
		get_Password().sendKeys(password);
		get_NextBtn().click();
	}
	
	public String get_MobileNumErrText() {
		return get_MobileNumErr().getText();
	}
	
	public String get_PasswordErrText() {
		return get_PasswordErr().getText();
	}

	public Boolean verify_PasswordField() {
		return wait_For_WebElement_Appearance(password);
	}
	
	public Boolean verify_DashboardPage() {
		return wait_For_WebElement_Appearance(dashboardImgContainer);
	}
	
	public void setOTP(String otp) {
		get_Otp().clear();
		get_Otp().sendKeys(otp);
		get_NextBtn().click();
	}
	
}
