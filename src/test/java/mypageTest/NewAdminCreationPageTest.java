package mypageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mypages.DashboardPage;
import mypages.LoginPage;
import mypages.NewAdminCreationPage;

public class NewAdminCreationPageTest extends BaseTest {
	
	LoginPage loginPage;
	NewAdminCreationPage newAdminCreationPage;
	
	@Test(priority=8)
	public void verifyAddNewAdmin() {
		newAdminCreationPage = page.getInstance(NewAdminCreationPage.class);
		newAdminCreationPage.newCustomerLogin(get_Property_Data("NewAdminUserName"));
		Assert.assertTrue(newAdminCreationPage.newCmpyCreation());
		test.log(LogStatus.INFO, "Admin Created Successfully");
	}


}
