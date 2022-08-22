package baze.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import baze.TestBase.TestBase;
import bazeActivities.Login;
import bazeActivities.Reset;

public class ResetTest extends TestBase{

	
	
	Login login;
	Reset reset;

	public ResetTest() throws IOException {
		super();
	}

	@Test(priority = 1)
	public void VerifyResetPassord() throws InterruptedException {
		reset = new Reset();
	reset.ResetPassword(prop.getProperty("UserName"));
	

	}

	
}
