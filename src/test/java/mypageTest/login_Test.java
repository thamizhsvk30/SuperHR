package mypageTest;

import java.io.IOException;

import org.testng.annotations.Test;

import mypages.LoginPasswordPage;
import mypages.Signuppage;
import mypages.login;

public class login_Test extends BaseTest
{
	login login;
	
	@Test(priority = 1)
	public void Loginasadmin() throws IOException, InterruptedException 
	{
		login=page.getInstance(login.class);

		login.loginpass();
		//page.getInstance(LoginPasswordPage.class).Adminpassword(Pwd);
	}

}
