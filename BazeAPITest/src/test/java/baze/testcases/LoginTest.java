package baze.testcases;

import org.testng.annotations.Test;

import baze.TestBase.TestBase;
import bazeActivities.Login;

public class LoginTest extends TestBase {

	Login login;

/*	public LoginTest() throws IOException {
		super();
	}*/

	@Test(priority = 1, enabled = false)
	public void VerifyUserLogin() throws InterruptedException {
		login = new Login();
		login.UserLogin(prop.getProperty("UserName"), prop.getProperty("Password"));

	}



}
