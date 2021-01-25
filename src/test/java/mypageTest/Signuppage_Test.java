package mypageTest;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;


import mypages.BasePage;
import mypages.Signuppage;

public class Signuppage_Test extends BaseTest 
{

	@Test(priority = 0)
	public void verifylogintitle() 
	{
		page = page.getInstance(Signuppage.class);
		String title=page.get_Page_Title();
		System.out.println("Login page title is"+title);
		Assert.assertEquals(title, "SuperHR");
	}
	@Test(priority = 1)
	public void login() 
	{
		page.getInstance(Signuppage.class).do_signup(get_Property_Data("phonenumber"));
	}
}
