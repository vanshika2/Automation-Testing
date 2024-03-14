	/*
	given() to construct api (content type, set cookies,add auth, add param, set headers etc)
	when()- specify request type (get,post,put,delete)
	then()- validate status code, extract response,extract headers cookies & response body
	*/

import org.testng.annotations.Test;   
import static io.restassured.RestAssured.* ;                  //these three are the static restassured packages which needs to be manually import
import static io.restassured.matcher.RestAssuredMatchers.* ;
import static org.hamcrest.Matchers.*;

public class HTTPRequests {

	@Test
	void getUser()
	{
		given()
		   	
		.when()
		    .get("https://reqres.in/api/users?page=2")
		.then()
		    .statusCode(200)
		    .body("page", equalTo(2))
		    .log().all();
		    
	}
	
}
