package mypageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mypages.BasePage;
import mypages.EmployeeAttendCalendarPage;

public class EmployeeAttendCalendarPageTest extends BaseTest{

	EmployeeAttendCalendarPage empattendCalPage;
	BasePage basepage;
	
	@Test(priority=16)
	public void verifyEmployeeview() throws Exception {
		
		empattendCalPage = page.getInstance(EmployeeAttendCalendarPage.class);
		empattendCalPage.mobileNumberField(get_Property_Data("MobNumber"));
		test.log(LogStatus.INFO, "Login with :"+get_Property_Data("MobNumber"));	
		empattendCalPage.passwordField(get_Property_Data("EmpPassword"));
		test.log(LogStatus.INFO, "Password with :"+get_Property_Data("EmpPassword"));
		test.log(LogStatus.INFO, "Successfully login");
		Assert.assertTrue(empattendCalPage.employeeSelction());
		test.log(LogStatus.INFO, "Employee Flow Start");
	}
	@Test(priority=17)
	public void verifyEmployeeAttendancePage() {
		//Assert.assertTrue(empattendCalPage.empAttendancetest());
		empattendCalPage.empAttendancetest();
		empattendCalPage.attendanceDetails();
		test.log(LogStatus.INFO, "Employee Flow Present & Absent was working as Expected");
	}
	
	
	
	
}
