package stringDemo;

public class StringDemo3 {

	public static void main(String[] args) {
		String actual="Selenium Webdriver is best automation tool";
		String expected="webdriver";
		String expected1="Webdriver";
		boolean result=actual.contains(expected);
		System.out.println("String is containing expected "+result);
		
		boolean result1=actual.contains(expected1);
		System.out.println("String is containing expected1 "+result1);
	}

}
