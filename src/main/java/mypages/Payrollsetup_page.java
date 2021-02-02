package mypages;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mypages.BasePage;

public class Payrollsetup_page extends BasePage {

	public Payrollsetup_page(WebDriver driver) {
		super(driver);
	}
	//Login Flow
	private By MobileNumber = By.tagName("input");
	private By SubmitBtn = By.xpath("//button[@type='submit']");
	private By Password = By.xpath("//input[@placeholder='Password']");
	private By NextBtn = By.xpath("//button[text()='Next']");
	
	//PayRollSetup Calendar Screen
	private By Configuration = By.xpath("//a[@ng-reflect-router-link='/configuration/company']");
	private By PayRollSetup = By.xpath("//a[@ng-reflect-router-link='/configuration/payroll-setup']");
	private By PayRollHead = By.xpath("//p[@class='payroll-head']");
	private By SelectFinancialYear = By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']");
	private By PayDate = By.xpath("(//input[@placeholder='DD-MM-YYYY'])[21]");
	private By PayDateClick = By.xpath("//span[@ng-reflect-ng-class='[object Object]' and @tabindex='0']");
	private By CutOffDate = By.xpath("(//input[@placeholder='DD-MM-YYYY'])[22]");
	private By UpdateBtn = By.xpath("//button[@type='submit']");
	
	//Payroll Template Screen
	private By PayrollTemplate = By.xpath("(//p[@class='payroll-name pl-2 m-0'])[2]");
	private By PayTemphead = By.xpath("//p[@class='payroll-head']");
	
	//Payroll Edit Screen
	private By EditButton = By.xpath("//button[@type='button']");
	private By TempName = By.xpath("//input[@placeholder='Enter Template Name']");
	private By PFyesButton = By.xpath("(//label[@class='custom mb-0 ng-star-inserted'])[1]");
	private By PFNoButton = By.xpath("(//label[@class='custom mb-0 ng-star-inserted'])[2]");
	private By BasicPercentageBtn = By.xpath("(//label[@class='custom mb-0 ng-star-inserted'])[3]");
	private By BasicAmountBtn = By.xpath("(//label[@class='custom mb-0 ng-star-inserted'])[4]");
	private By BasicInput = By.xpath("(//input[@placeholder='Enter'])[1]");
	private By HRAPercentageBtn = By.xpath("(//label[@class='custom mb-0 ng-star-inserted'])[5]");
	private By HRAamountBtn = By.xpath("(//label[@class='custom mb-0 ng-star-inserted'])[6]");
	private By HRAInput = By.xpath("(//input[@placeholder='Enter'])[2]");
	private By ConveyancePercentageBtn = By.xpath("(//label[@class='custom mb-0 ng-star-inserted'])[7]");
	private By ConceyanceamountBtn = By.xpath("(//label[@class='custom mb-0 ng-star-inserted'])[8]");
	private By ConveyInput = By.xpath("(//input[@placeholder='Enter'])[3]");
	private By SaveBtn = By.xpath("//button[@type='submit']");
	
	
	public WebElement get_SaveBtn() {
		return get_Element(SaveBtn);
	}
	public WebElement get_TempName() {
		return get_Element(TempName);
	}
	public WebElement get_PFyesButton() {
		return get_Element(PFyesButton);
	}
	public WebElement get_PFNoButton() {
		return get_Element(PFNoButton);
	}
	public WebElement get_BasicPercentageBtn() {
		return get_Element(BasicPercentageBtn);
	}
	public WebElement get_BasicAmountBtn() {
		return get_Element(BasicAmountBtn);
	}
	public WebElement get_BasicInput() {
		return get_Element(BasicInput);
	}
	public WebElement get_HRAPercentageBtn() {
		return get_Element(HRAPercentageBtn);
	}
	public WebElement get_HRAamountBtn() {
		return get_Element(HRAamountBtn);
	}
	public WebElement get_HRAInput() {
		return get_Element(HRAInput);
	}
	public WebElement get_ConveyancePercentageBtn() {
		return get_Element(ConveyancePercentageBtn);
	}
	public WebElement get_ConceyanceamountBtn() {
		return get_Element(ConceyanceamountBtn);
	}
	public WebElement get_ConveyInput() {
		return get_Element(ConveyInput);
	}
	
	public WebElement get_PayrollTemplate() {
		return get_Element(PayrollTemplate);
	}
	public WebElement get_PayTemphead() {
		return get_Element(PayTemphead);
	}
	public WebElement get_EditButton() {
		return get_Element(EditButton);
	}
	public WebElement get_PayDateClick() {
		return get_Element(PayDateClick);
	}
	public WebElement get_MobileNumber() {
		return get_Element(MobileNumber);
	}
	public WebElement get_SubmitBtn() {
		return get_Element(SubmitBtn);
	}
	public WebElement get_Password() {
		return get_Element(Password);
	}
	public WebElement get_NextBtn() {
		return get_Element(NextBtn);
	}
	public WebElement get_Configuration() {
		return get_Element(Configuration);
	}
	public WebElement get_PayRollSetup() {
		return get_Element(PayRollSetup);
	}
	public WebElement get_PayRollHead() {
		return get_Element(PayRollHead);
	}
	public WebElement get_SelectFinancialYear() {
		return get_Element(SelectFinancialYear);
	}
	public WebElement get_PayDate() {
		return get_Element(PayDate);
	}
	public WebElement get_CutOffDate() {
		return get_Element(CutOffDate);
	}
	public WebElement get_UpdateBtn() {
		return get_Element(UpdateBtn);
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
	public void navigateToPayRollSetup() throws InterruptedException  {
	
			try {
				Thread.sleep(4000);
				get_Configuration().click();
				wait_For_WebElement(PayRollSetup);
				Thread.sleep(3000);
				get_PayRollSetup().click();
				
			} catch (ElementClickInterceptedException e) {
		
				Thread.sleep(4000);
				get_Configuration().click();
				wait_For_WebElement(PayRollSetup);
				Thread.sleep(3000);
				get_PayRollSetup().click();
			
			} catch(StaleElementReferenceException e){
				
				Thread.sleep(4000);
				get_Configuration().click();
				wait_For_WebElement(PayRollSetup);
				Thread.sleep(3000);
				get_PayRollSetup().click();

			}
	}
	
	public void fillPayrollcalender() throws InterruptedException {
		
		wait_For_WebElement(PayRollHead);
		//get_SelectFinancialYear(get_Property_Data("Year"));
		Thread.sleep(4000);
		scrolldown();
		get_PayDate().clear();
		get_PayDate().sendKeys(get_Property_Data("Paydate"));
		get_PayDateClick().click();
		Thread.sleep(4000);
		get_CutOffDate().clear();
		get_CutOffDate().sendKeys(get_Property_Data("Cutoffdate"));
		wait_For_clickable_WebElement(UpdateBtn);
		get_UpdateBtn().click();
	}
	
	public void navigateToPayrollTemplate() throws InterruptedException {
		
		wait_For_clickable_WebElement(PayrollTemplate);
		get_PayrollTemplate().click();
		Thread.sleep(4000);
		wait_For_WebElement(PayTemphead);
		
	}
	
	public void editPayrollTemplate() throws IOException {
		
		String EditPayrollTemplate			= get_Property_Data("EditPayrolltemp");
		ArrayList <String> TemplateName		= readexceldatas(EditPayrollTemplate,0);
		ArrayList <String> Basic			= readexceldatas(EditPayrollTemplate,1);
		ArrayList <String> HRA    			= readexceldatas(EditPayrollTemplate,2);
		ArrayList <String> Conveyance		= readexceldatas(EditPayrollTemplate,3);
		
		get_EditButton().click();
		
		for (int i = 0; i < TemplateName.size(); i++) {
			
			
			get_TempName().clear();
			get_TempName().sendKeys(TemplateName.get(i));
			if (get_PFNoButton().isSelected()) {
				System.out.println("PF Is Not Deducted");
			}else {
				get_PFyesButton().click();
				System.out.println("PF is Deducted");
			}
			get_BasicInput().clear();
			get_BasicInput().sendKeys(Basic.get(i));
			get_HRAInput().clear();
			get_HRAInput().sendKeys(HRA.get(i));
			get_ConveyInput().clear();
			get_ConveyInput().sendKeys(Conveyance.get(i));
			scrolldown();
			get_SaveBtn().click();
				
		}
		
	}
	 

	
}
