package baze.Utils;


import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baze.TestBase.TestBase;




public class Wait {
	static WebDriverWait wait=new WebDriverWait(TestBase.driver, Duration.ofSeconds(30));

	public static void toBeclickable(WebElement element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public static void toBePresent(WebElement element)
	{
	
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
}
