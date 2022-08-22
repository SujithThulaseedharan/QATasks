package com.nature.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nature.base.TestBase;
import com.nature.pages.HomePage;
import com.nature.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;

	public HomePageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void VerifyAddProductToCart() throws InterruptedException {
		homepage = new HomePage();
		homepage.AddingItemtoCart();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
