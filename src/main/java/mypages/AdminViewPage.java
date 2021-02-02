package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminViewPage extends BasePage {

	public AdminViewPage(WebDriver driver) {
		super(driver);
	}
	
	private By mobileNumber = By.tagName("input");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By submitBtn = By.xpath("//button[@type='submit']");
	private By nextBtn = By.xpath("//button[text()='Next']");
	private By configuration = By.xpath("(//a[@href='/configuration/company'])[1]");
	private By adminMobilNum = By.xpath("//input[@ng-reflect-name='mobile_number']");
	private By cmpEditBtn = By.xpath("//button[contains(@class,'company-edit')]");
	private By editYourName = By.xpath("//input[@ng-reflect-name='admin_name']");
	private By loader = By.tagName("app-loader");
	
	public WebElement get_MobileNumber() {
		return get_Element(mobileNumber);
	}
	
	public WebElement get_Password() {
		return get_Element(password);
	}
	
	public WebElement get_SubmitBtn() {
		return get_Element(submitBtn);
	}
	
	public WebElement get_NextBtn() {
		return get_Element(nextBtn);
	}
	
	public WebElement get_Configuration() {
		return get_Element(configuration);
	}
	
	public WebElement get_AdminMobilNum() {
		return get_Element(adminMobilNum);
	}
	
	public WebElement get_CmpEditBtn() {
		return get_Element(cmpEditBtn);
	}
	
	public WebElement get_EditYourName() {
		return get_Element(editYourName);
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
	public String getAdminMobileNumber() throws InterruptedException {
		wait_For_WebElement(configuration);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
		Thread.sleep(2000);
		get_Configuration().click();
		wait_For_WebElement(adminMobilNum);
		return get_AdminMobilNum().getAttribute("value");
	}
	
	public boolean cmpEdit() throws InterruptedException {
		wait_For_element(configuration);
		get_Configuration().click();
		//System.out.println("Admin view Flow Working as Expected");
		wait_For_WebElement(cmpEditBtn);
		Thread.sleep(5000);
		//wait_For_clickable_WebElement(cmpEditBtn);
		get_CmpEditBtn().click();
		Thread.sleep(5000);
		get_EditYourName().clear();
		get_EditYourName().sendKeys("Vinoth edit");
		wait_For_WebElement(submitBtn);
		Thread.sleep(5000);
		get_SubmitBtn().click();
		wait_For_WebElement(cmpEditBtn);
		Thread.sleep(5000);
		if((get_EditYourName().getAttribute("value")).equals("Vinoth edit")) {
			return true;
		}
		else
			return false;
		}
}
