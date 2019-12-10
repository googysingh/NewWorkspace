package Files;


public class Resourcebody {
	
	public static String addStation() {
		String b="{\r\n" + 
				"    \"external_id\": \"GurpreetSingh\",\r\n" + 
				"    \"name\": \"San Francisco Test Station\",\r\n" + 
				"    \"latitude\": 37.76,\r\n" + 
				"    \"longitude\": -122.43,\r\n" + 
				"    \"altitude\": 150\r\n" + 
				"}";
		return b;
	}

	public static String delBody(String pid) {
		String b="{\r\n" + 
				"\"place_id\":\""+pid+"\"" + 
				"}";
		return b;
	}
}
