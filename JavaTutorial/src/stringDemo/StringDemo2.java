package stringDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		String actual="Selenium Webdriver";
		String expected="Selenium webdriver";
		boolean result=actual.equals(expected);
		System.out.println("Result is equals "+ result);
		boolean result1=actual.equalsIgnoreCase(expected);
		System.out.println("Result is equalsIgnoreCase "+ result1);
		
}

}
