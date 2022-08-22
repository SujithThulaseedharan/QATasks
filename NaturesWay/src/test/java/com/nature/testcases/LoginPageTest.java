package com.nature.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nature.base.TestBase;
import com.nature.pages.HomePage;
import com.nature.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homepage;

	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
		homepage = new HomePage();

	}
	
	@Test(priority = 1)
	public void VerifyPageTitle() {
		String title = loginPage.validateLoginPageTitle();
		System.out.println("Your page title is : " + title);
		Assert.assertEquals(title, "Home | Nature's Way");
		
		
	}
	

	@Test(priority = 2)
	public void LoginVerification() throws InterruptedException {

		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();

}

}