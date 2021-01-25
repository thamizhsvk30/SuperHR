package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	private By viewProfile = By.xpath("//a[contains(@class,'dashboard-view-profile')]");
	private By personalDetails = By.xpath("//a[text()=' Personal Details ']");
	private By empDetails = By.xpath("//a[text()=' Employment Details ']");
	private By empHistory = By.xpath("//a[text()=' Employment History ']");
	private By statutoryDetails = By.xpath("//a[text()=' Statutory Details ']");
	private By dashboardMenu = By.xpath("//a[(@ng-reflect-router-link='/dashboard') and (contains(@class,'header-item'))]");
	private By applyLeaveBtn = By.xpath("//button[@class='dashboard-apply-leave']");
	private By leaveHead = By.xpath("//p[contains(@class,'leave-head')]");
	private By leaveTypeDropdown = By.id("leave_type");
	private By fromdate = By.xpath("//input[@placeholder='Select From Date']");
	private By todate = By.xpath("//input[@placeholder='Select To Date']");
	private By textarea = By.tagName("textarea");
	private By submitLeaveBtn = By.xpath("//button[text()='Apply Leave ']");
	private By dialogBox = By.tagName("mat-dialog-container");
	private By checkInBtn = By.xpath("//button[text()=' Check In ']");
	private By checkInTickIcon = By.xpath("//img[@class='checkin-tickicon']");
	private By checkOutBtn = By.xpath("//button[text()=' Check Out ']");
	private By checkOutIcon = By.xpath("//img[contains(@src,'icon-checkout')]");
	private By closeBtn = By.xpath("//span[@class='commom-modal-close']");
	
	public WebElement get_ViewProfile() {
		return get_Element(viewProfile);
	}
	
	public WebElement get_PersonalDetails() {
		return get_Element(personalDetails);
	}
	
	public WebElement get_EmpDetails() {
		return get_Element(empDetails);
	}
	
	public WebElement get_EmpHistory() {
		return get_Element(empHistory);
	}
	
	public WebElement get_StatutoryDetails() {
		return get_Element(statutoryDetails);
	}
	
	public WebElement get_DashboardMenu() {
		return get_Element(dashboardMenu);
	}
	
	public WebElement get_ApplyLeaveBtn() {
		return get_Element(applyLeaveBtn);
	}
	
	public WebElement get_LeaveHead() {
		return get_Element(leaveHead);
	}
	
	public WebElement get_LeaveTypeDropdown() {
		return get_Element(leaveTypeDropdown);
	}
	
	public WebElement get_Textarea() {
		return get_Element(textarea);
	}
	
	public WebElement get_Fromdate() {
		return get_Element(fromdate);
	}
	
	public WebElement get_Todate() {
		return get_Element(todate);
	}
	
	public WebElement get_SubmitLeaveBtn() {
		return get_Element(submitLeaveBtn);
	}
	
	public WebElement get_DialogBox() {
		return get_Element(dialogBox);
	}

	public WebElement get_CheckInBtn() {
		return get_Element(checkInBtn);
	}
	
	public WebElement get_CheckOutBtn() {
		return get_Element(checkOutBtn);
	}
	
	public WebElement get_CheckInTickIcon() {
		return get_Element(checkInTickIcon);
	}
	
	public WebElement get_CloseBtn() {
		return get_Element(closeBtn);
	}
	
	public Boolean viewProfileNavigatonCheck() {
		try {
			wait_For_clickable_WebElement(viewProfile);
			get_ViewProfile().click();
			wait_For_clickable_WebElement(personalDetails);
			get_PersonalDetails().click();
			get_EmpDetails().click();
			get_EmpHistory().click();
			get_StatutoryDetails().click();
			get_DashboardMenu().click();
			wait_For_clickable_WebElement(viewProfile);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public String applyLeave(String leavetype, String date) {
		try {
			wait_For_clickable_WebElement(applyLeaveBtn);
			get_ApplyLeaveBtn().click();
			wait_For_clickable_WebElement(leaveHead);
			dropdown_select(get_LeaveTypeDropdown(),leavetype);
			send_keys(fromdate,date);
			send_keys(todate,date);
			send_keys(textarea,leavetype);
			get_SubmitLeaveBtn().click();
			String leaveMsg = get_LeaveDialog();
			get_CloseBtn().click();
			get_DashboardMenu().click();
			return leaveMsg;
		} catch (Exception e) {
			return "False";
		}
	}
	
	public String get_LeaveDialog() {
		return get_DialogBox().getText();
	}
	
	public Boolean checkInFlow() {
		get_CheckInBtn().click();
		Boolean tickIconStatus = wait_For_WebElement_Appearance(checkInTickIcon);
		get_CloseBtn().click();
		return tickIconStatus;
	}
	
	public Boolean checkOutFlow() {
		get_CheckOutBtn().click();
		Boolean tickIconStatusout = wait_For_WebElement_Appearance(checkOutIcon);
		get_CloseBtn().click();
		return tickIconStatusout;
	}
	public void clickingtheemployeetab() throws InterruptedException 
	{
		try
		{
			//After login licking the employee tab
			By Configuration = By.xpath("//a[@ng-reflect-router-link='/employees']");
			get_Element(Configuration).click();
			wait_For_clickable_WebElement(Configuration);
		}
		catch(StaleElementReferenceException e)
		{
			By Configuration = By.xpath("//a[@ng-reflect-router-link='/employees']");
			get_Element(Configuration).click();
			wait_For_clickable_WebElement(Configuration);
		}
		catch(ElementClickInterceptedException e)
		{
			By Configuration = By.xpath("//a[@ng-reflect-router-link='/employees']");
			get_Element(Configuration).click();
			wait_For_clickable_WebElement(Configuration);
		}

	}
	
	public String employeetabname() throws InterruptedException 
	{
		try{
			//After login licking the employee tab
			Thread.sleep(5000);
			By Configuration = By.xpath("//a[@ng-reflect-router-link='/employees']");
			wait_For_WebElement(Configuration);
			return get_Element(Configuration).getText();
		}
		catch(StaleElementReferenceException e)
		{
			Thread.sleep(5000);
			By Configuration = By.xpath("//a[@ng-reflect-router-link='/employees']");
			wait_For_WebElement(Configuration);
			return get_Element(Configuration).getText();
		}
	}
}

