package com.nature.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nature.base.TestBase;
import com.nature.utils.Wait;

public class DeleteItemFromCart extends TestBase{

	
	public DeleteItemFromCart() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//span[@class='prod-del'][@data-bind=\"click: $parents[1].removeItem\"]") 
	WebElement DeleteButton;
	
	
	
	public void DeleteItem() throws InterruptedException {
		
		Wait.toBeclickable(DeleteButton);
		DeleteButton.click();
		Thread.sleep(2000);
	}
	
	
	
}
