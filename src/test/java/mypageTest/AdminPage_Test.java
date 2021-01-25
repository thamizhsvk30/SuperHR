package mypageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mypages.AdminViewPage;
import mypages.DashboardPage;
import mypages.LoginPage;
import mypages.NewAdminCreationPage;
import mypages.NewAdminCreation_Page;

public class AdminPage_Test extends BaseTest {
	
	LoginPage loginPage;
	NewAdminCreation_Page newAdminCreationPage;
	AdminViewPage adminViewPage;
	
	@Test(priority=7)
	public void verifyAddNewAdmin() throws InterruptedException {
		newAdminCreationPage = page.getInstance(NewAdminCreation_Page.class);
		newAdminCreationPage.newCustomerLogin(get_Property_Data("NewAdminUserName"));
		newAdminCreationPage.newCmpyCreation();
		test.log(LogStatus.INFO, "Admin Created Successfully");
	}
	
	@Test(priority=8)
	public void verifyAdminView() throws InterruptedException {
		loginPage = page.getInstance(LoginPage.class);
		loginPage.mobileNumberField(get_Property_Data("NewAdminUserName"));
		loginPage.passwordField(get_Property_Data("AdminPassword"));
		adminViewPage = page.getInstance(AdminViewPage.class);
		Assert.assertEquals(adminViewPage.getAdminMobileNumber(), get_Property_Data("NewAdminUserName"));
		//test.log(LogStatus.INFO, "Admin View Successfully");
	}

	@Test(priority=9)
	public void verifyAdminEdit() throws InterruptedException {
		Assert.assertTrue(adminViewPage.cmpEdit());
		//Assert.assertEquals(adminViewPage.getAdminMobileNumber(), get_Property_Data("NewAdminUserName"));
		test.log(LogStatus.INFO, "Admin Edit View Working Successfully");
	}


}
