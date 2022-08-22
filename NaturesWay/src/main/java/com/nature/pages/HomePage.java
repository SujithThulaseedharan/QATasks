package com.nature.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nature.base.TestBase;
import com.nature.utils.Wait;

public class HomePage extends TestBase {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	WebElement AcceptCookies;

	@FindBy(xpath = "//section[@class='shop-product-content']//div[@class='shop-product-wrapper']//a[@title='VITAMINS & MINERALS'][@class='btn btn-primary brand-btn']")
	WebElement ItemMenu;

	@FindBy(xpath = "//a[@title='5-HTP View Details'][@class='btn btn-primary view-more-btn btn-small']")
	WebElement ItemView;

	@FindBy(xpath = "//button[@title=\"Add to cart\"]")
	WebElement ItemAddToCart;

	@FindBy(xpath = "//a[@title='Click here to continue shopping']")
	WebElement ContinueShopping;

	@FindBy(xpath = "//div[@class='navigation-title field-navigationtitle']//a[@title='Products']")
	WebElement BacktoItemList;

	@FindBy(xpath = "//a[@title='Activated Charcoal View Details'][@class='btn btn-primary view-more-btn btn-small']")
	WebElement ItemNumberTwoView;

	@FindBy(xpath = "//input[@id='displayValue']")
	WebElement QuantityChange;

	@FindBy(xpath = "//a[@title='Active B-Complex View Details'][@class='btn btn-primary view-more-btn btn-small']")
	WebElement ItemNumberThreeView;



	public void AddingItemtoCart() throws InterruptedException {

		Wait.toBeclickable(AcceptCookies);
		AcceptCookies.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		Wait.toBeclickable(ItemMenu);
		ItemMenu.click();
		Wait.toBeclickable(ItemView);
		ItemView.click();
		Wait.toBeclickable(ItemAddToCart);
		ItemAddToCart.click();
		Wait.toBeclickable(ContinueShopping);
		ContinueShopping.click();
		Wait.toBeclickable(BacktoItemList);
		BacktoItemList.click();
		Wait.toBeclickable(ItemNumberTwoView);
		ItemNumberTwoView.click();
		Wait.toBeclickable(QuantityChange);
		QuantityChange.click();
		QuantityChange.clear();
		QuantityChange.sendKeys(prop.getProperty("itemtwoquantity"));
		Wait.toBeclickable(ItemAddToCart);
		ItemAddToCart.click();
		Wait.toBeclickable(ContinueShopping);
		ContinueShopping.click();
		Wait.toBeclickable(BacktoItemList);
		BacktoItemList.click();
		Wait.toBeclickable(ItemNumberThreeView);
		ItemNumberThreeView.click();
		Wait.toBeclickable(QuantityChange);
		QuantityChange.click();
		QuantityChange.clear();
		QuantityChange.sendKeys(prop.getProperty("itemthreequantity"));
		Wait.toBeclickable(ItemAddToCart);
		ItemAddToCart.click();

	}

	

}
