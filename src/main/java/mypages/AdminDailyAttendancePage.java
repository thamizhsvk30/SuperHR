package mypages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import listeners.MyListeners;

public class AdminDailyAttendancePage extends BasePage {

	public AdminDailyAttendancePage(WebDriver driver) {
		super(driver);
	}
	//static MyListeners base = new MyListeners();

	
	private By mobNumber = By.tagName("input");
	private By submitBtn = By.xpath("//button[@type='submit']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By nextBtn = By.xpath("//button[text()='Next']");
	private By clickAttandLeave = By.xpath("(//img[@class='normal mr-1'])[4]");
	private By ClickWaitingForApprove = By.xpath("//a[text()=' Leaves - Waiting for Approval']");
	private By clickReview = By.xpath("(//span[@class='leave-tab-label'])[1]");
	private By ClickApprove = By.xpath("(//button[text()='Approve'])[1]");
	private By ClickReject = By.xpath("(//button[text()='Reject'])[1]");
	//private By TotalLeave=By.xpath("(//td[@class='table-tdata ng-star-inserted'])[7]");
	private By TotalLeave = By.xpath("(//span[@class='ng-star-inserted'])[14]");
	
	private By clickDailyview = By.xpath("//a[@class='header-item header-sub-item active ng-star-inserted']");
	private By clickpresent = By.xpath("//button[@class='attendance-day-head-btn attendance-day-head-active ng-star-inserted']");
	private By clickOntimeEarly = By.xpath("(//span[@class='attendance-day-tab-label'])[1]");
	private By clickDelayed = By.xpath("(//span[@class='attendance-day-tab-label'])[2]");
	private By clickLate = By.xpath("(//span[@class='attendance-day-tab-label'])[3]");
	private By clickAbsent = By.xpath("(//button[@class='attendance-day-head-btn ng-star-inserted'])[1]");
	private By clickLeave = By.xpath("(//button[@class='attendance-day-head-btn ng-star-inserted'])[2]");
	
	private By AttendanceMonthly = By.xpath("//a[text()=' Attendance - Monthly']");
	private By Calendar = By.xpath("//input[@class='ng-tns-c96-0 attendance-month-calender-input p-inputtext p-component ng-star-inserted']");
	private By Dec = By.xpath("//span[@class='p-monthpicker-month ng-tns-c96-0 p-ripple ng-star-inserted p-highlight']");
	
	
	public WebElement get_AttendanceMonthly() {
		return get_Element(AttendanceMonthly);
	}
	public WebElement get_Calendar(String string) {
		return get_Element(Calendar);
	}
	public WebElement get_Dec() {
		return get_Element(Dec);
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
	public WebElement get_ClickAttandLeave() {
		return get_Element(clickAttandLeave);
	}
	public WebElement get_ClickDailyview() {
		return get_Element(clickDailyview);
	}
	public WebElement get_Clickpresent() {
		return get_Element(clickpresent);
	}
	public WebElement get_ClickOntimeEarly() {
		return get_Element(clickOntimeEarly);
	}
	
	public WebElement get_ClickDelayed() {
		return get_Element(clickDelayed);
	}
	public WebElement get_ClickLate() {
		return get_Element(clickLate);
	}
	public WebElement get_ClickAbsent() {
		return get_Element(clickAbsent);
	}
	public WebElement get_ClickLeave() {
		return get_Element(clickLeave);
	}
	public WebElement get_ClickWaitingForApprove() {
		return get_Element(ClickWaitingForApprove);
	}
	public WebElement get_clickReview() {
		return get_Element(clickReview);
	}
	public WebElement get_ClickApprove() {
		return get_Element(ClickApprove);
	}
	public WebElement get_ClickReject() {
		return get_Element(ClickReject);
	}

	public WebElement get_TotalLeave() {
		return get_Element(TotalLeave);
	}
	public void setTotalLeave(By totalLeave) {
		TotalLeave = totalLeave;
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
	public Boolean adminDailyAttendanceCheck() throws Throwable {
		try {
			
			wait_For_clickable_WebElement(clickAttandLeave);
			get_ClickAttandLeave().click();
			wait_For_clickable_WebElement(clickDailyview);
			get_ClickDailyview().click();
			get_Clickpresent().click();
			get_ClickOntimeEarly().click();
			//wait_For_WebElement_Appearance
			//getDataFromTable();
			get_ClickDelayed().click();
            //getDataFromTable();
			get_ClickLate().click();
			get_ClickAbsent().click();
			get_ClickLeave().click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	ArrayList<String> List_Employee;
	
	
	public void adminMonthlyView() throws Throwable {
		try {
		wait_For_clickable_WebElement(AttendanceMonthly);
		get_AttendanceMonthly().click();
		pageWait();
		get_Calendar(get_Property_Data("DecMonth"));
		get_Dec().click();
		
		
		List_Employee = new ArrayList<String>();
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='table w-100']/tbody/tr"));
		String row_xpath;	
		String EmployeeNames;
		
		for (int i = 0; i < row.size(); i++) {
				row_xpath = "//table[@class='table w-100']/tbody/tr["+ i +"]/td[1]";
				EmployeeNames = driver.findElement(By.xpath(row_xpath)).getText();
				List_Employee.add(EmployeeNames);
			}
		System.out.println(List_Employee);
		
		
		//get_Calendar().click();
		//get_Jan().click();
		//return true;
		}catch (Exception e) {
			//return false;
		}
		}
	
	public void clickLeaveapproval() {
		
		wait_For_clickable_WebElement(ClickWaitingForApprove);
		get_ClickWaitingForApprove().click();
		//get_clickReview().click();
	}
	public void leaveapproval() {
		
		wait_For_clickable_WebElement(TotalLeave);
		WebElement TotalLeave = get_TotalLeave();
		String Leave_Tot = TotalLeave.getText();
		int LeaveCount = Integer.parseInt(Leave_Tot);
		if (LeaveCount>0) {
			get_ClickApprove().click();
		}
		else
		{
			get_ClickReject().click();
		}
	}
	
	public void getDataFromTable() throws Throwable {
	 WebElement table = driver.findElement(By.tagName("table"));
	 List<WebElement> iRow = table.findElements(By.tagName("tr"));
	 for (int i = 1; i < iRow.size(); i++) {
		WebElement row = iRow.get(i);
		List<WebElement> iData = row.findElements(By.tagName("td"));
		for (int j = 0; j < iData.size()-3; j++) {
			WebElement data = iData.get(j);
			String text = data.getText();
			System.out.println(text);
		}
	}
	 
	}
	
	
	
	
	
	
	
	
	
}
