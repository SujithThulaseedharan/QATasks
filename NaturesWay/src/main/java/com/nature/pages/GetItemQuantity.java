package com.nature.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nature.base.TestBase;
import com.nature.utils.Wait;

public class GetItemQuantity extends TestBase {
	HomePage homepage;

	public GetItemQuantity() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='inner-component hide-minicart']//a[@title='Cart']")
	WebElement OpenCart;

	@FindBy(xpath = "//span[@id='subTotalItem']")
	WebElement SubTotal;

	public char[] ItemQuantity;

	public void OpenCart() throws InterruptedException {
		homepage = new HomePage();
		Thread.sleep(3000);
		Wait.toBeclickable(OpenCart);
		OpenCart.click();

	}

	public String ItemQuantity() {
		Wait.toBeclickable(SubTotal);
		String element = SubTotal.getText();
		System.out.println(element);
		return element;
	}

}
