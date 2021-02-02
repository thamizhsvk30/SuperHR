package mypageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mypages.AdminViewPage;
import mypages.LoginPage;
import mypages.NewAdminCreation_Page;
import mypages.PasswordPage;
import mypages.Registerpage;
import mypages.Signuppage;


public class AdminviewPage_Test extends BaseTest  
{
	LoginPage loginPage;
	NewAdminCreation_Page newAdminCreationPage;
	AdminViewPage adminViewPage;
	
	@Test(priority = 7)
	public void verifyNewAdminCreation() 
	{
		page.getInstance(Signuppage.class).do_signup(get_Property_Data("NewAdminphonenumber"));
		page.getInstance(Registerpage.class).do_register(get_Property_Data("OTP"));
		page.getInstance(PasswordPage.class).newpassword(get_Property_Data("newpassword"));
		page.getInstance(PasswordPage.class).confirmpassword(get_Property_Data("confirmpassword"));
		test.log(LogStatus.INFO, "Admin Created Successfully");
		page.getInstance(NewAdminCreation_Page.class).newCmpyCreation();
		test.log(LogStatus.INFO, "Done the Company Initial Setup as expected");
	}
	@Test(priority=8)
	public void verifyAdminView() throws InterruptedException {
		Assert.assertTrue(page.getInstance(AdminViewPage.class).cmpEdit());
		test.log(LogStatus.INFO, "Admin View folw Working as Expected");
		test.log(LogStatus.INFO, "Edit Company Details working as Expected ");	
	}
}
