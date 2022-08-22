package bazeActivities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import baze.TestBase.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Login extends TestBase {

	// Initializing the page objects
	public Login() {
		PageFactory.initElements(driver, this);

	}

	public void  UserLogin(String UserName, String Password) throws InterruptedException {
		

		Map<String, Object>  map = new HashMap<>();
		map.put("email", UserName);
		map.put("password", Password);
		RestAssured.baseURI = "https://api.baze.com";
		RestAssured.given().log().all().body(map)
				.contentType(ContentType.JSON).when().post("/auth/token").then()
				.log().all().assertThat().statusCode(200);
	
		

	}
}
