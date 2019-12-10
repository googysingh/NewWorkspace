import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import Files.Resource;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Addrest {
	static Properties prop = new Properties();
	static {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\OneDrive\\workspace\\Rest Assured\\src\\Files\\env.properties");
			prop.load(fis);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop.get("HOST");
		prop.get("ADD");
		prop.get("DELETE");
	}

	public static void main(String[] args) {
		RestAssured.baseURI = prop.getProperty("HOST");

		Response res = given().queryParam("key", "qaclick123").
				body(Resource.addBody()).when()
				.post(prop.getProperty("ADD")).then().assertThat().statusCode(200).and().contentType(ContentType.JSON)
				.and().body("status", equalTo("OK")).extract().response();
		String response = res.asString();
		System.out.println(response);
		JsonPath js = new JsonPath(response);
		 String pid = js.get("place_id");
		System.out.println(pid);
		// return pid;
		System.out.println("__________Running delete__________");
		delete(pid);
	}

	public static void delete(String pid) {
		RestAssured.baseURI = prop.getProperty("HOST");

		System.out.println("Deleting Pid " + pid);
		Response res = given().queryParam("key", "qaclick123").body(Resource.delBody(pid)).when()
				.post(prop.getProperty("DELETE")).then().assertThat().statusCode(200).and()
				.contentType(ContentType.JSON).and().body("status", equalTo("OK")).extract().response();
		System.out.println(res.asString());
	}

}
