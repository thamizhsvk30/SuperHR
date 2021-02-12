package mypageTest;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mypages.BasePage;
import mypages.Payroll_Page;
import mypages.Payrollsetup_page;

public class PayrollPage_Test extends BaseTest{

	BasePage basepage;
	Payrollsetup_page payrollsetuppage;
	Payroll_Page Payrollpage;
	
	@Test(priority=3)
	public void verifyPayRollPage() throws InterruptedException {
		payrollsetuppage  = page.getInstance(Payrollsetup_page.class);
		Payrollpage  = page.getInstance(Payroll_Page.class);
		payrollsetuppage.mobileNumberField(get_Property_Data("MobNumber"));
		payrollsetuppage.passwordField(get_Property_Data("EmpPassword"));
		test.log(LogStatus.INFO,"Admin Logged in Successfully");
		page.getInstance(Payroll_Page.class).navigatePayRoll();
		test.log(LogStatus.INFO,"Employee PayRoll View Working as Expected");
	}
	@Test(priority=4)
	public void verifyVariableDeductionPage() throws InterruptedException {
		//page.getInstance(Payroll_Page.class).addNewVariableDeduction();
		//test.log(LogStatus.INFO,"New Variable Deduction added Successfully");
		Assert.assertTrue(Payrollpage.verifyEmployeeDeduction());
		test.log(LogStatus.INFO,"New Variable Deduction has been Successfully verified");
	}
	
	@Test(priority=5)
	public void verifyVariableEarnings() throws InterruptedException{
		//Payrollpage.addNewVariableEarning();
		//test.log(LogStatus.INFO,"New Variable Earnings added Successfully");
		Assert.assertTrue(Payrollpage.verifyEmployeeveriableEaning());
		test.log(LogStatus.INFO,"New Variable Earnings has been Successfully verified");
}
}
