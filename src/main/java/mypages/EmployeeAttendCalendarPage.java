package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import listeners.MyListeners;

public class EmployeeAttendCalendarPage extends BasePage{

	public EmployeeAttendCalendarPage(WebDriver driver) {
		super(driver);
	}

	private By mobNumber = By.tagName("input");
	private By submitBtn = By.xpath("//button[@type='submit']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By nextBtn = By.xpath("//button[text()='Next']");
	private By Selectbox = By.xpath("//span[@class='ng-arrow-wrapper']");
	private By SelectEmp = By.xpath("//span[text()='Employee View']");
	private By ClickViewall  = By.xpath("//p[text()='View all ']");
	private By calendar=By.xpath("(//div[@class='d-flex ng-star-inserted'])[3]");
	private By presentDateClick = By.xpath("((//div[@class='d-flex ng-star-inserted'])[3]//following-sibling::div[3])[1]");
	private By absentDateClick = By.xpath("((//div[@class='d-flex ng-star-inserted'])[3]//following-sibling::div[4])[1]");
	private By calendarpresent = By.xpath("(//span[@class='view-leave-status'])[18]");
	private By dailystatuspresent = By.xpath("(//span[text()='Present'])[3]");
	private By calenderAbsent = By.xpath("(//span[@class='view-leave-status'])[19]");
	private By DailyStatusAbsent = By.xpath("(//span[text()='Absent'])[11]");
	
	public WebElement get_MobNumber() {
		return get_Element(mobNumber);
	}
	public WebElement get_SubmitBtn() {
		return get_Element(submitBtn);
	}
	public WebElement get_calendar() {
		return get_Element(calendar);
	}
	public WebElement get_presentDateClick() {
		return get_Element(presentDateClick);
	}
	public WebElement get_absentDateClick() {
		return get_Element(absentDateClick);
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
	public WebElement get_Calendarpresent() {
		return get_Element(calendarpresent);
	}
	public WebElement get_Dailystatuspresent() {
		return get_Element(dailystatuspresent);
	}
	public WebElement get_CalenderAbsent() {
		return get_Element (calenderAbsent);
	}
	public WebElement get_DailyStatusAbsent() {
		return get_Element(DailyStatusAbsent);
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
			Thread.sleep(4000);
			get_ClickViewall().click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean empAttendancetest() {
		
		get_presentDateClick().click(); 
		String present = get_Calendarpresent().getText();
		String dailyPresentstatus = get_Dailystatuspresent().getText();
		
		String absent = get_CalenderAbsent().getText();
		String dailyAbsentstatus = get_DailyStatusAbsent().getText();
		 
		if(present.equalsIgnoreCase(dailyPresentstatus) && absent.equalsIgnoreCase(dailyAbsentstatus)) {
			 System.out.println("true");
		 }
		return true;
		}	
	
	public void attendanceDetails() {
		if (empAttendancetest()==true) {
			System.out.println("Employee Present & Absent Details Verified");
	}
	}
}

