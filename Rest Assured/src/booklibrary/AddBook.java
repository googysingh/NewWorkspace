package booklibrary;


import static io.restassured.RestAssured.given;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AddBook {

	@Test(dataProvider="BooksData")
	public void AddBooks(String isbn, String aisle) {
		RestAssured.baseURI = "http://216.10.245.166";

		Response res = given().header("Content-Type", "application/json").body(Resource.body("acvb", "1234")).when()
				.post("/Library/Addbook.php").then().assertThat().statusCode(200).and().contentType(ContentType.JSON)
				.and().extract().response();
		System.out.println(Resource.body(isbn, aisle));
		String response = res.asString();
		System.out.println(response);
		System.out.println("__________Running delete__________");
	}
	
	@DataProvider(name="BooksData")
	public Object[][] getData(){
		return new Object[][] { {"Gurpeet","0001"},{"Gurpreet","0002"},{"Gurpreet","0003"} };
	}

}
