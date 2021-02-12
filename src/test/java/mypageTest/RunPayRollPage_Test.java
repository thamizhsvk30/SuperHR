package mypageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mypages.BasePage;
import mypages.Payroll_Page;
import mypages.Payrollsetup_page;
import mypages.RunPayroll_page;

public class RunPayRollPage_Test extends BaseTest {
	
	BasePage basepage;
	Payrollsetup_page payrollsetuppage;
	Payroll_Page payrollpage;
	RunPayroll_page runpayrollpage;
	
	@Test(priority=6)
	public void verifyRunpayrollPageView() throws InterruptedException {
		payrollsetuppage  = page.getInstance(Payrollsetup_page.class);
		payrollsetuppage.mobileNumberField(get_Property_Data("MobNumber"));
		payrollsetuppage.passwordField(get_Property_Data("EmpPassword"));
		test.log(LogStatus.INFO,"Admin Runpayroll Page Reached Successfully");
	}
	@Test(priority=7)
	public void verifyConfirmNewJoinee() throws InterruptedException {
		runpayrollpage = page.getInstance(RunPayroll_page.class);
		Assert.assertTrue(runpayrollpage.verifyConfirmNewJoineeName());
		test.log(LogStatus.INFO,"Confirm New Joinee Names Verified with total Employee names ");
		Assert.assertTrue(runpayrollpage.verifyEmployeeJoinDate());
		test.log(LogStatus.INFO,"Confirm New Joinee Join Date is Verified ok ");
	}
	@Test(priority=8)
	public void verifyConfirmExits() throws InterruptedException {
		runpayrollpage = page.getInstance(RunPayroll_page.class);
		Assert.assertTrue(runpayrollpage.verifyConfirmExitsName());
		test.log(LogStatus.INFO,"Confirm Exits Names Verified with Total Employees names ");
		Assert.assertTrue(runpayrollpage.verifyEmpExitDate());
		test.log(LogStatus.INFO,"Confirm Exits Date is  Verified ok ");
	}
	@Test(priority=9)
	public void verifyConfirmVariableDeduction() throws InterruptedException {
		runpayrollpage = page.getInstance(RunPayroll_page.class);
		page.getInstance(RunPayroll_page.class).variableDeduction();
		test.log(LogStatus.INFO,"Confirm Variable Deduction Verified and checked With Add Variable Deduction");
	}
	@Test(priority=10)
	public void verifyConfirmVariableEarnings() throws InterruptedException {
		runpayrollpage = page.getInstance(RunPayroll_page.class);
		page.getInstance(RunPayroll_page.class).variableEarnings();
		test.log(LogStatus.INFO,"Confirm Variable Earnings Verified With Add Variable Earnings ");
	}
	@Test(priority=11)
	public void verifyConfirmAttendanceAndLeaves() throws InterruptedException {
		runpayrollpage = page.getInstance(RunPayroll_page.class);
		Assert.assertTrue(runpayrollpage.verifyAttendanceandLeaves());
		test.log(LogStatus.INFO,"Confirm Attendance details Verified With Monthly Attendance Details ");
	}
	@Test(priority=12)
	public void verifyConfirmSalaryAdjustment() {
		runpayrollpage = page.getInstance(RunPayroll_page.class);
		Assert.assertTrue(runpayrollpage.verifySalary());
		test.log(LogStatus.INFO,"Confirm Salary Details Matched with Default salary details");
	}
	@Test(priority=13)
	public void verifyProcessPayrollScreen() {
		runpayrollpage = page.getInstance(RunPayroll_page.class);
		Assert.assertTrue(runpayrollpage.verifyProcessPayroll());
		test.log(LogStatus.INFO,"Process Payroll screen Working as Expected");
	}
	@Test(priority=14)
	public void verifyReviewOutput() {
		runpayrollpage = page.getInstance(RunPayroll_page.class);
		runpayrollpage.verifyReviewOutput();
		test.log(LogStatus.INFO,"Review Output screen Working as Expected");
	}
	@Test(priority=15)
	public void verifyClosePayrollandGeneratePayslip() throws InterruptedException {
		runpayrollpage = page.getInstance(RunPayroll_page.class);
		runpayrollpage.VeriffyClosePayroll();
		test.log(LogStatus.INFO,"ClosePayroll and GeneratePayslip working as Expected");
	}
	
}

