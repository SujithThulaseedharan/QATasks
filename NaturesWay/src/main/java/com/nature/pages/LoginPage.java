package com.nature.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nature.utils.Wait;

import com.nature.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//a[@title='Sign in']")
	WebElement SignInHome;
	
	@FindBy(xpath = "//input[@name='UserName'][@placeholder='Enter your email address']")
	WebElement UserNameSelection;

	@FindBy(xpath = "//input[@name='UserName'][@placeholder='Enter your email address']")
	WebElement UserName;

	@FindBy(xpath = "//input[@name='Password'][@placeholder='Enter your password']")
	WebElement PasswordSelection;
	
	@FindBy(xpath = "//input[@name='Password'][@placeholder='Enter your password']")
	WebElement Password;

	@FindBy(xpath = "//div[@class='login-submit']//button[@type='submit'][@id='SignInButton'][@data-loading-text='Sign In']")
	WebElement SignInButton;



	// Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Action
	public String validateLoginPageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();

	}

	public HomePage login(String username, String password) throws InterruptedException {

		SignInHome.click();
		Wait.toBeclickable(UserNameSelection);
		UserNameSelection.click();
		Wait.toBeclickable(UserName);
		UserName.sendKeys(username);
		Wait.toBeclickable(PasswordSelection);
		PasswordSelection.click();
		Wait.toBeclickable(Password);
		Password.sendKeys(password);
		Wait.toBeclickable(SignInButton);
		SignInButton.click();
		return new HomePage();
		
		

	}

	
}
