package mypageTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mypages.AdminDailyAttendancePage;
import mypages.BasePage;
import mypages.DashboardPage;

public class AdminDailyAttendPageTest extends BaseTest{

	AdminDailyAttendancePage admindailyattendpage;
	BasePage basepage;
	
	@Test(priority=19)
	public void verifyAdminLogin() throws Exception {
		admindailyattendpage = page.getInstance(AdminDailyAttendancePage.class);
		admindailyattendpage.mobileNumberField(get_Property_Data("MobNumber"));
		test.log(LogStatus.INFO, "Login with :"+get_Property_Data("MobNumber"));
		admindailyattendpage.passwordField(get_Property_Data("EmpPassword"));
		test.log(LogStatus.INFO, "Login with :"+get_Property_Data("EmpPassword"));
		test.log(LogStatus.INFO, "Successfully login For Admin");
	}
	
	@Test(priority=20)
	public void verifyAdminDailyViewFlow() throws Throwable {
		admindailyattendpage.adminDailyAttendanceCheck();
		test.log(LogStatus.INFO, "Absent presant And Leave Flow was working as expected");
	}

	@Test(priority=21)
	public void verifyAdminMonthlyViewFlow() throws Throwable {
		//admindailyattendpage.employee_List();
		admindailyattendpage.adminMonthlyView();
		test.log(LogStatus.INFO, "List Of Employees are Present In the December 2020 has been Verified");
	}
	
	
	@Test(priority=22)
	public void verifyAdminLeaveApproval() {
		admindailyattendpage.clickLeaveapproval();
		admindailyattendpage.leaveapproval();
		test.log(LogStatus.INFO, "Admin Leave Approval working as Expected");
	}
}



