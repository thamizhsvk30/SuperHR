package mypageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mypages.BasePage;
import mypages.EmployeeSetupForAdminPage;

public class EmployeeSetupForAdminPageTest extends BaseTest {

	EmployeeSetupForAdminPage empsetupforadminpage;
	BasePage basepage;
	
	@Test(priority=1)
	public void VerifyAddEmployeeFlow() throws Exception {
		empsetupforadminpage = page.getInstance(EmployeeSetupForAdminPage.class);
		empsetupforadminpage.mobileNumberField (get_Property_Data("MobNumber"));
		empsetupforadminpage.passwordField (get_Property_Data("EmpPassword"));
		Assert.assertTrue(empsetupforadminpage.addEmployeeFlow());
		test.log(LogStatus.INFO, "Add Employee Flow Working As Expected");

	}
}
