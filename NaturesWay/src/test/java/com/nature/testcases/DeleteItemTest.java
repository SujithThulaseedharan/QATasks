package com.nature.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nature.base.TestBase;
import com.nature.pages.DeleteItemFromCart;
import com.nature.pages.GetItemQuantity;
import com.nature.pages.HomePage;
import com.nature.pages.LoginPage;

public class DeleteItemTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	GetItemQuantity getItemQuantity;
	DeleteItemFromCart deleteItemCart;

	public DeleteItemTest() throws IOException {
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
	public void VerifyDeleteAction() throws InterruptedException {
		getItemQuantity = new GetItemQuantity();
		getItemQuantity.OpenCart();
		deleteItemCart = new DeleteItemFromCart();

	}

	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/
}
