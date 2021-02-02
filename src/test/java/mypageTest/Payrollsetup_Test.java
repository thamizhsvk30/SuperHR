package mypageTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mypages.BasePage;
import mypages.Payrollsetup_page;

public class Payrollsetup_Test extends BaseTest{

	BasePage basepage;
	Payrollsetup_page payrollsetuppage;
	
	@Test(priority=1)
	public void verifyPayrollCalendarpage() throws InterruptedException{
		payrollsetuppage  = page.getInstance(Payrollsetup_page.class);
		payrollsetuppage.mobileNumberField(get_Property_Data("MobNumber"));
		payrollsetuppage.passwordField(get_Property_Data("EmpPassword"));
		test.log(LogStatus.INFO,"Admin Logged in Successfully");
		page.getInstance(Payrollsetup_page.class).navigateToPayRollSetup();
		test.log(LogStatus.INFO,"Navigate to PayRoll Setup page Working as Expected");
		//payrollsetuppage.fillPayrollcalender();	
		//test.log(LogStatus.INFO,"PayRoll Calendar View Working as Expected");
	}
	
	@Test(priority=2)
	public void verifyPayrollTemplatepage() throws InterruptedException, IOException {
		payrollsetuppage  = page.getInstance(Payrollsetup_page.class);
		payrollsetuppage.navigateToPayrollTemplate();
		test.log(LogStatus.INFO,"Navigate to PayRoll Template as Expected");
		page.getInstance(Payrollsetup_page.class).editPayrollTemplate();
		test.log(LogStatus.INFO,"Edit PayRoll Template Working as Expected");
	}
}
