package mypageTest;

import org.testng.annotations.Test;

import mypages.DashboardPage;
import mypages.LoginPasswordPage;
import mypages.Signuppage;

public class DashboardTest extends BaseTest
{
	DashboardPage DashboardPage;
	@Test(priority = 1)
	public void clickingconfiguration() throws InterruptedException 
	{
		DashboardPage=page.getInstance(DashboardPage.class);
		DashboardPage.clickingtheemployeetab();
	
	}
	
}
