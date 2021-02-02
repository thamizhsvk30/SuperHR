package mypages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import listeners.MyListeners;

public class AdminDailyAttendancePage extends BasePage {

	public AdminDailyAttendancePage(WebDriver driver) {
		super(driver);
	}
	//static MyListeners base = new MyListeners();
	//static String fetch;
	List<String> List_Employee;
	List<String> Employee_List;
	List<WebElement> row;
	List<WebElement> ListEmployees;
	String row_xpath;
	String EmployeeName;
	String List__Employees;
	String Leave_Tot;
	
	
	// Login flow
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
	
	// Employee daily Status in Admin view
	private By clickDailyview = By.xpath("//a[@class='header-item header-sub-item active ng-star-inserted']");
	private By clickpresent = By.xpath("//button[@class='attendance-day-head-btn attendance-day-head-active ng-star-inserted']");
	private By clickOntimeEarly = By.xpath("(//span[@class='attendance-day-tab-label'])[1]");
	private By clickDelayed = By.xpath("(//span[@class='attendance-day-tab-label'])[2]");
	private By clickLate = By.xpath("(//span[@class='attendance-day-tab-label'])[3]");
	private By clickAbsent = By.xpath("(//button[@class='attendance-day-head-btn ng-star-inserted'])[1]");
	private By clickLeave = By.xpath("(//button[@class='attendance-day-head-btn ng-star-inserted'])[2]");
	
	// Employee Monthly view 
	private By AttendanceMonthly = By.xpath("//a[text()=' Attendance - Monthly']");
	private By Calendar = By.xpath("(//input[@type='text'])[1]");
	private By Dec = By.xpath("//span[text()=' Dec ']");
	
	// Get List_Employees Details
	private By Employee = By.xpath("//a[@ng-reflect-router-link='/employees']");
	private By EmployeeHead = By.xpath("//p[@class='view-total m-0']");
	private By EmpName = By.xpath("//p[@class='view-name pl-2 m-0']");
	private By Clickadhithya = By.xpath("(//p[@class='view-name pl-2 m-0'])[1]");
	private By Attendleave = By.xpath("(//a[@ng-reflect-ng-class=''])[7]");
	private By TakeShifttime = By.xpath("//span[@class='view-al-f15 ng-star-inserted']");
	
	public List<WebElement> get_TakeShifttime() {
		return get_Elements(TakeShifttime);
	}
	public WebElement get_Attendleave() {
		return get_Element(Attendleave);
	}
	
	public WebElement get_Clickadhithya() {
		return get_Element(Clickadhithya);
	}
	public List<WebElement> get_EmpNames() {
		return get_Elements(EmpName);
	}
	public WebElement get_Employee() {
		return get_Element(Employee);
	}
	public WebElement get_AttendanceMonthly() {
		return get_Element(AttendanceMonthly);
	}
	public WebElement get_Calendar() {
		return get_Element(Calendar);
	}
	public WebElement get_Dec() {
		return get_Element(Dec);
	}
	public WebElement get_EmployeeHead() {
		return get_Element(EmployeeHead);
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
	public void adminDailyAttendanceCheck() throws Throwable {
		try {
			/*Thread.sleep(4000);
			get_Employee().click();
			wait_For_clickable_WebElement(EmployeeHead);
			System.out.println(get_EmpNames().get(1).getText());
			
			get_Attendleave().click();
			String Shifttime = get_TakeShifttime().get(3).getText();
			System.out.println(Shifttime);
			
			String substring = Shifttime.substring(0,5);
			System.out.println(substring);
			
			String replace = substring.replace(":", ".");
			System.out.println(replace);
			
			int ActualShiftTime = Integer.parseInt(substring);
			System.out.println(ActualShiftTime);
			
			DateFormat df = new SimpleDateFormat("hh:mm");
			DateFormat df1 = new SimpleDateFormat("HH:mm");
			System.out.println(df1);*/
			
			
		
			
		
			
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
			//return true;
		} catch (Exception e) {
			
		}
	}
	
	
	public void adminMonthlyView() throws Throwable {
		try {
		
			//Get the Whole Employee Details
			Thread.sleep(4000);
			get_Employee().click();
			wait_For_clickable_WebElement(EmployeeHead);
			List_Employee = new ArrayList<String>();
		    ListEmployees = driver.findElements(By.xpath("//p[@class='view-name pl-2 m-0']"));
			//System.out.println(ListEmployees);
			for (int i = 0; i < ListEmployees.size(); i++) {
			    List__Employees = ListEmployees.get(i).getText();
				List_Employee.add(List__Employees);
				}
			System.out.println(List_Employee);
			
			//Get Employee Monthly Attendance Details
			wait_For_clickable_WebElement(clickAttandLeave);
			get_ClickAttandLeave().click();
			wait_For_clickable_WebElement(AttendanceMonthly);
			get_AttendanceMonthly().click();
			pageWait();
			get_Calendar().click();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_A);
			get_Calendar().sendKeys(get_Property_Data("DecMonth"));
			get_Dec().click();
		
			Thread.sleep(4000);
			Employee_List = new ArrayList<String>();
			row = driver.findElements(By.xpath("//table[@class='table w-100']/tbody/tr"));
			//System.out.println(row.size()); 
			
			for (int i = 1; i < row.size(); i++) {
				row_xpath = "//table[@class='table w-100']/tbody/tr["+i+"]/td[1]";
				EmployeeName = driver.findElement(By.xpath(row_xpath)).getText();
				Employee_List.add(EmployeeName);
			}
			//System.out.println(Employee_List.size());	
			System.out.println(Employee_List);
			//System.out.println("Below the Employee List is Perfectly Match to the Employee Details");
		}catch (Exception e) {
			//return false;
		}
        if (List_Employee.containsAll(Employee_List)) {
			System.out.println("In Both the List Employees Names have matched ");
		}
        else {
			System.out.println("Not Matched");
		}
		}
	
	public void clickLeaveapproval() {
		wait_For_clickable_WebElement(ClickWaitingForApprove);
		get_ClickWaitingForApprove().click();
		
	}
	
	public void leaveapproval() {
		
		wait_For_clickable_WebElement(TotalLeave);
		WebElement TotalLeave = get_TotalLeave();
		Leave_Tot = TotalLeave.getText();
		int LeaveCount = Integer.parseInt(Leave_Tot);
		if (LeaveCount>0) {
			get_ClickApprove().click();
		}
		else
		{
			get_ClickReject().click();
		}
	}
	
	
}
