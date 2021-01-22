package mypageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mypages.BasePage;
import mypages.EmpLeaveCalendarpage;

public class EmpLeaveCalendarPageTest extends BaseTest {

	EmpLeaveCalendarpage empleaveCalenderpage;
	BasePage basepage;
	
	@Test(priority=11)
	public void verifyEmployeeview() {
		empleaveCalenderpage = page.getInstance(EmpLeaveCalendarpage.class);
		empleaveCalenderpage.mobileNumberField(get_Property_Data("MobNumber"));
		test.log(LogStatus.INFO, "Login with :"+get_Property_Data("MobNumber"));	
		empleaveCalenderpage.passwordField(get_Property_Data("EmpPassword"));
		test.log(LogStatus.INFO, "Password with :"+get_Property_Data("EmpPassword"));
		test.log(LogStatus.INFO, "Successfully login");
		Assert.assertTrue(empleaveCalenderpage.employeeSelction());
		test.log(LogStatus.INFO, "Employee Flow Start");
	}
	@Test(priority=12)
	public void verifyLeaveBalanceDetails() {
		empleaveCalenderpage.get_ClickViewall().click();
		String SickLeaveCount  = empleaveCalenderpage.get_SickLeavecount().getText();
		test.log(LogStatus.INFO, "Before Leave Apply Sick Leave Count"+SickLeaveCount);
		
		empleaveCalenderpage.applyLeave("Sick Leave",get_Property_Data("Date"));
		test.log(LogStatus.INFO, "Leave Apply flow working as expected");
		
		empleaveCalenderpage.refresh();
		String SickLeaveCount1  = empleaveCalenderpage.get_SickLeavecount().getText();
		test.log(LogStatus.INFO, "After Leave Apply Sick Leave Count"+SickLeaveCount1);

	}
	
	
	
}