package baze.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import baze.Listeners.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream fp = new FileInputStream(
					"D:\\WorkSpace\\BazeAPITest\\src\\main\\java\\baze\\Config\\Config.properties");

			prop.load(fp);

			// return prop;

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	

	@SuppressWarnings("deprecation")
	public static void EventHandlerInit() {

		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with
		// EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

	}

}
