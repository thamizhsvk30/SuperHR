package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import listeners.MyListeners;

public class EmpLeaveCalendarpage extends BasePage {

	public EmpLeaveCalendarpage(WebDriver driver) {
		super(driver);
	}
	static MyListeners base = new MyListeners();

	private By mobNumber = By.tagName("input");
	private By submitBtn = By.xpath("//button[@type='submit']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By nextBtn = By.xpath("//button[text()='Next']");
	private By Selectbox = By.xpath("//span[@class='ng-arrow-wrapper']");
	private By SelectEmp = By.xpath("//span[text()='Employee View']");
	private By ClickViewall  = By.xpath("(//span[@class='mr-1'])[3]");
	private By SickLeavecount = By.xpath("(//p[@class='leave-al-count my-auto py-3'])[2]");
	private By Dashboard = By.xpath("//a[@class='breadcrumb-nav-url']");
	
	private By applyLeaveBtn = By.xpath("//button[@class='long-green-btn btn px-4']");
	private By leaveHead = By.xpath("//p[contains(@class,'leave-head')]");
	private By leaveTypeDropdown = By.id("leave_type");
	private By fromdate = By.xpath("//input[@placeholder='Select From Date']");
	private By todate = By.xpath("//input[@placeholder='Select To Date']");
	private By textarea = By.tagName("textarea");
	private By submitLeaveBtn = By.xpath("//button[text()='Apply Leave ']");
	private By dialogBox = By.tagName("mat-dialog-container");
	private By closeBtn = By.xpath("//span[@class='commom-modal-close']");
	
	public WebElement get_Dashboard() {
		return get_Element(Dashboard);
	}
	
	public WebElement get_SickLeavecount() {
		return get_Element(SickLeavecount);
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
	public WebElement get_Fromdate() {
		return get_Element(fromdate);
	}
	public WebElement get_Todate() {
		return get_Element(todate);
	}
	public WebElement get_Textarea() {
		return get_Element(textarea);
	}
	public WebElement get_SubmitLeaveBtn() {
		return get_Element(submitLeaveBtn);
	}
	public WebElement get_DialogBox() {
		return get_Element(dialogBox);
	}
	public WebElement get_CloseBtn() {
		return get_Element(closeBtn);
	}
	
	
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
	public WebElement get_Selectbox() {
		return get_Element(Selectbox);
	}
	public WebElement get_SelectEmp() {
		return get_Element(SelectEmp);
	}
	public WebElement get_ClickViewall() {
		return get_Element(ClickViewall);
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
	public Boolean employeeSelction() {
		try {
			//wait_For_clickable_WebElement(Selectbox);
			get_Selectbox().click();
			get_SelectEmp().click();
			//wait_For_WebElement(ClickViewall);
			//Thread.sleep(3000);
			//get_ClickViewall().click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
//	public void empLeaveBalancecheck () {
		
	
	public void refresh() {
		driver.navigate().refresh();
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
			wait_For_clickable_WebElement(applyLeaveBtn);
			return leaveMsg;
		} catch (Exception e) {
			return "False";
		}
	}
	public String get_LeaveDialog() {
		return get_DialogBox().getText();
	}

}
