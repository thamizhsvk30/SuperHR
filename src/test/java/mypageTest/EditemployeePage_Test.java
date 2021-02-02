package mypageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;


import mypages.DashboardPage;
import mypages.EditEmployeePage;
import mypages.login;

public class EditemployeePage_Test extends BaseTest
{
	login login;
	DashboardPage dashboardPage;
	EditEmployeePage Editemploy;
	
	@Test(priority = 10)
	public void Editingemployeedetails() throws InterruptedException 
	{
		login=page.getInstance(login.class);
		dashboardPage=page.getInstance(DashboardPage.class);
		Editemploy=page.getInstance(EditEmployeePage.class);
		try
		{
			login.loginpass();
			Assert.assertEquals(dashboardPage.employeetabname(),"Employees");
			test.log(LogStatus.INFO, "Logged with the mobile number and password");
			Editemploy.editingemployeedetails();
			Assert.assertEquals(dashboardPage.employeetabname(),"Employees");
			test.log(LogStatus.INFO, "Employee Details are edited");
		}
		catch(Exception e)
		{
			test.log(LogStatus.INFO, "Error message display as 'Please check the data again'");
			System.out.println("Some error occured while creating element");
			e.printStackTrace();
		}
	}
}
