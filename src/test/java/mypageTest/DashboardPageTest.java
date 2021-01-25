package mypageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mypages.DashboardPage;
import mypages.LoginPage;

public class DashboardPageTest extends BaseTest {
	LoginPage loginPage;
	DashboardPage dashboardPage;

	@Test(priority=13)
	public void verifyProfilePage() {
		loginPage = page.getInstance(LoginPage.class);
		loginPage.mobileNumberField(get_Property_Data("EmpMobNum"));
		test.log(LogStatus.INFO, "Login with :"+get_Property_Data("EmpMobNum"));
		loginPage.passwordField(get_Property_Data("EmpPassword"));
		test.log(LogStatus.INFO, "Password with :"+get_Property_Data("EmpPassword"));
		test.log(LogStatus.INFO, "Succefully login");
		dashboardPage = page.getInstance(DashboardPage.class);
		Assert.assertTrue(dashboardPage.viewProfileNavigatonCheck());
		test.log(LogStatus.INFO, "All profile tab working as expected");
	}
	
	@Test(priority=14)
	public void verifyApplyLeaveScenarioWithoutLeaveBalance() {
		Assert.assertEquals(dashboardPage.applyLeave("Casual Leave",get_current_date_minus_one()), "You do not have sufficient leave balance..");
		test.log(LogStatus.INFO, "Apply leave flow working as expected");
	}
	
	@Test(priority=15)
	public void verifyEmpCanCheckin() {
		Assert.assertTrue(dashboardPage.checkInFlow());
		test.log(LogStatus.INFO, "Employee got successfully checked in");
	}
	
	@Test(priority=16)
	public void verifyEmpCanCheckout() {
		Assert.assertTrue(dashboardPage.checkOutFlow());
		test.log(LogStatus.INFO, "Employee got successfully checked out");
	}

}

