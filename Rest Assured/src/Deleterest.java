import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Deleterest {

	public static void main(String[] args) {
		RestAssured.baseURI="http://216.10.245.166";
		String b="{\r\n" + 
				"\"place_id\":\"8ac49e39a2908945415692d3a4be1af5\"" + 
				"}";
		Response res=given().queryParam("key","qaclick123").
				body(b).
		when().post("/maps/api/place/delete/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("status",equalTo("OK")).extract().response();
		System.out.println(res.asString());
	}

}
