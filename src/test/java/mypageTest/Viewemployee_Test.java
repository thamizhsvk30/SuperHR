package mypageTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import mypages.EditEmployeePage;
import mypages.DashboardPage;
import mypages.LoginPasswordPage;
import mypages.LogoutPage;
import mypages.Signuppage;
import mypages.ViewEmployeePage;

public class Viewemployee_Test extends BaseTest
{
	Signuppage Signuppage;
	LoginPasswordPage LoginPasswordPage;
	DashboardPage dashboardPage;
	EditEmployeePage EditEmployeePage;
	ViewEmployeePage ViewEmployeePage;
	LogoutPage LogoutPage;
	@Test(priority = 12)
	public void viewemployeedetails() throws InterruptedException 
	{
		Signuppage =page.getInstance(Signuppage.class);
		LoginPasswordPage=page.getInstance(LoginPasswordPage.class);
		dashboardPage=page.getInstance(DashboardPage.class);
		EditEmployeePage=page.getInstance(EditEmployeePage.class);
		ViewEmployeePage=page.getInstance(ViewEmployeePage.class);
		LogoutPage=page.getInstance(LogoutPage.class);
		String loginSheet =get_Property_Data("loginSheetname");
		String employeeppersonal = get_Property_Data("Editpersonaldetails");
		try
		{

			System.out.println("Rows"+getRowCount(employeeppersonal));
			System.out.println("Rows"+getRowCount(loginSheet));
			for (int i=1;i<=getRowCount(loginSheet);i++)
		        {
					String UserName=get_Excel_Data(loginSheet, i, 0);
					String Pwd=get_Excel_Data(loginSheet, i, 1);
					String Firstname=get_Excel_Data(employeeppersonal, i, 2);
					Signuppage.login(UserName);
					test.log(LogStatus.INFO, "Logged with the mobile number"+UserName);
					LoginPasswordPage.Adminpassword(Pwd);
					test.log(LogStatus.INFO, "Password With"+Pwd);
					dashboardPage.clickingtheemployeetab();
					test.log(LogStatus.INFO, "Clicking the employee Tab Sucessfully");
				//	EditEmployeePage.searchemployeelist(Firstname);
					test.log(LogStatus.INFO, "Searching the employee from the list");
					ViewEmployeePage.pesronaldetailsverification(Firstname);
					test.log(LogStatus.INFO, "Checkig the employee personal details");
					ViewEmployeePage.employeedetailsverification(Firstname);
					test.log(LogStatus.INFO, "Checking the employee basic details");
					ViewEmployeePage.employeehistorydetailsverification(Firstname);
					test.log(LogStatus.INFO, "Checking the employee history details");
					ViewEmployeePage.statutorydetailsverification(Firstname);
					test.log(LogStatus.INFO, "Checking the employee statutory details");
					LogoutPage.logout();
					test.log(LogStatus.INFO, "Log-out from the application");
		        }
		}
		catch(Exception e)
		{
			System.out.println("Some error occured while creating element");
			e.printStackTrace();
		}	
					
	}
}
