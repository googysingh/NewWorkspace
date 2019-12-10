import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Getrest {

	public static void main(String[] args) {
		RestAssured.baseURI="https://maps.googleapis.com/";
		
		Response res=given().param("key","AIzaSyBbaW3McCuvqvS0rrqCIjhy6zVeHU0bxgk").
		        param("location","12.994235, 77.765797").
		        param("radius","500").
		when().get("maps/api/place/nearbysearch/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("results[0].name",equalTo("Bengaluru")).
		extract().response();
		
		System.out.println(res.asString());

	}

}