package mypageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import mypages.Registerpage;
import mypages.Signuppage;


public class Registerpage_Test extends BaseTest 
{
	@Test(priority = 1)
	public void register() 
	{
		page.getInstance(Signuppage.class).do_signup(get_Property_Data("phonenumber1"));
		String phonenumber=page.getInstance(Registerpage.class).get_Phonenumber().getText();
		System.out.println("The entered phone number is"+phonenumber);
		page.getInstance(Registerpage.class).do_register(get_Property_Data("OTP"));
		Assert.assertEquals(phonenumber, get_Property_Data("phonenumber1"));
		boolean resend=page.getInstance(Registerpage.class).get_Resend().isDisplayed();
		Assert.assertEquals(resend, "false");
	}
}
