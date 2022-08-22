package bazeActivities;

import java.util.HashMap;
import java.util.Map;

import baze.TestBase.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class Reset extends TestBase{
	
	
	/*public Reset() {
		PageFactory.initElements(driver, this);

	}*/

	public void  ResetPassword(String UserName) throws InterruptedException {
		

		Map<String, Object>  map = new HashMap<>();
		map.put("email", UserName);
		RestAssured.baseURI = "https://api.baze.com";
		ValidatableResponse response =		RestAssured.given().log().all().body(map)
				.contentType(ContentType.JSON).when().post("/user/password/reset").then()
				.log().all().assertThat().statusCode(201);
		
		 String token=response.extract().path("token");
		 System.out.println(token);

		

	}

}
