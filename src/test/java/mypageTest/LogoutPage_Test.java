package mypageTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mypages.LoginPasswordPage;
import mypages.LogoutPage;
import mypages.Signuppage;

public class LogoutPage_Test extends BaseTest
{
	Signuppage Signuppage;
	LoginPasswordPage LoginPasswordPage;
	LogoutPage LogoutPage;
	
	
	@Test(priority = 6)
	public void logout() throws InterruptedException {
		Signuppage=page.getInstance(Signuppage.class);
		LoginPasswordPage=page.getInstance(LoginPasswordPage.class);
		LogoutPage=page.getInstance(LogoutPage.class);
		
		Signuppage.login(get_Property_Data("phonenumber1"));
		LoginPasswordPage.Adminpassword(get_Property_Data("pass"));
		Thread.sleep(5000);
		LogoutPage.logout();
		test.log(LogStatus.INFO, "LogOut Flow Working as Expected");
	}
}
