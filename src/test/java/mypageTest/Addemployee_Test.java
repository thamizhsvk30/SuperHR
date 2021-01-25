package mypageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

//import mypages.AddEmployeePage;
import mypages.Addemp;
import mypages.DashboardPage;
import mypages.LoginPasswordPage;
import mypages.LogoutPage;
import mypages.Signuppage;
import mypages.login;

public class Addemployee_Test extends BaseTest
{
	login login;
	DashboardPage dashboardPage;
	Addemp Addemp;
	
	@Test(priority = 10)
	public void Addingemployee() throws InterruptedException 
	{
		login=page.getInstance(login.class);
		dashboardPage=page.getInstance(DashboardPage.class);
		Addemp=page.getInstance(Addemp.class);
		try
		{
			login.loginpass();
			Assert.assertEquals(dashboardPage.employeetabname(),"Employees");
			Addemp.Fillingpersonaldetails();
			Assert.assertEquals(dashboardPage.employeetabname(),"Employees");
		}
		catch(Exception e)
		{
			test.log(LogStatus.INFO, "Error message display as 'Please check the data again'");
			System.out.println("Some error occured while creating element");
			e.printStackTrace();
		}
	}
}
