package mypageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mypages.DashboardPage;
import mypages.LoginPage;


public class LoginPageTest extends BaseTest {
	LoginPage loginPage;
	
	@Test(priority=0)
	public void verifyWithInvalidMobileNum() {
		loginPage = page.getInstance(LoginPage.class);
		loginPage.mobileNumberField("asd344@@");
		test.log(LogStatus.INFO, "Login with invalid mobile number: asd344");
		Assert.assertEquals(loginPage.get_MobileNumErrText(), "Please enter 10-digit phone number");
		test.log(LogStatus.INFO, "Error message display as 'Please enter 10-digit phone number'");
	}
	
	@Test(priority=1)
	public void verifyWithValidMobileNum() {
		loginPage.mobileNumberField(get_Property_Data("EmpMobNum"));
		test.log(LogStatus.INFO, "Login with valid number: "+get_Property_Data("EmpMobNum"));
		Assert.assertTrue(loginPage.verify_PasswordField());
		test.log(LogStatus.INFO, "Application navigates to password page successfully");
	}
	
	@Test(priority=2)
	public void verifyWithInvalidPassword() {
		test.log(LogStatus.INFO, "Login with valid number: "+get_Property_Data("EmpMobNum"));
		loginPage.passwordField("Aasd344@@");
		test.log(LogStatus.INFO, "Login with invalid password: Aasd344@@");
		Assert.assertEquals(loginPage.get_PasswordErrText(), "Invalid Credentials");
		test.log(LogStatus.INFO, "Error message display as 'Invalid Credentials'");
	}
	
	@Test(priority=3)
	public void verifyWithValidCredentials() {
		test.log(LogStatus.INFO, "Login with valid number: "+get_Property_Data("EmpMobNum"));
		loginPage.passwordField(get_Property_Data("EmpPassword"));
		test.log(LogStatus.INFO, "Login with valid password: "+get_Property_Data("EmpPassword"));
		Assert.assertTrue(loginPage.verify_DashboardPage());
		test.log(LogStatus.INFO, "Successfully Logined in");
	}

}
