package stringoperation;

public class P1 {

	public static void main(String[] args) {
/*
String length()- length of the string
String charAt()- returns a char value at the given index number
String concat()- combines specified string at the end of the string
String contains()- returns true if chars are found in the string
String startsWith()- check if this string starts with given prefix
String endsWith()- checks if this string ends with given suffix
String equals() compares the contents of two given strings
String indexOf()- returns index of given character vale or substring
String isEmpty()- checks if this string is empty
String replace()- returns a string replacing all the old char to new char
String substring()- returns a part of the string
String toCharArray()- converts this string into character array
String toLowerCase()- returns the string in lowercase letter
String toUpperCase()- retunrs the string in uppercase letter
String trim()- eliminates leading and trailing spaces
*/
		String str = "This is the test string";
		String str1="Hello";
		String str2="Hello";
		String str3="Welcome";
		String str4="";
		String str5=" Space placed around    ";
		String str6=" & ";
		
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.concat(". This is the appended string."));
		String str7= str.concat(str6);
		System.out.println(str7);
		System.out.println();
		System.out.println(str.contains("is"));
		System.out.println(str.contains("one"));
		System.out.println(str.startsWith("This"));
		System.out.println(str.startsWith("one"));
		System.out.println(str.endsWith("string"));
		System.out.println(str.endsWith("one"));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str.indexOf("h"));
		System.out.println(str.indexOf("q"));
		System.out.println(str.isEmpty());
		System.out.println(str4.isEmpty());
		System.out.println("Trimming the space of String="+ str5.trim());
		System.out.println("Replace Example="+str1.replace("e", "a"));
		System.out.println("Substring example 1: " + str.substring(2));
		System.out.println("Substring example 2: " + str.substring(2, 7));
		
		char[] charArray = str.toCharArray();
		for(int i=0; i<charArray.length;i++){
			System.out.println("Index "+ i +" is: "+ charArray[i]);
		}
		System.out.println("Lower case= "+ str.toLowerCase());
		System.out.println("Upper case= "+ str.toUpperCase());
		
		//System.out.println(str.);
	}

}
