package Assignments;

import ignore.TestingUtils;

public class App {

	/**
	 * Given a string of odd length, return the middle 3 characters from the string,
	 * so the string <b>"Monitor"</b> yields <b>"nit"</b>. If the string length is
	 * less than 3, return the string as is. <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * middleThree("bunny") <b>---></b> "unn" <br>
	 * middleThree("peter") <b>---></b> "ete" <br>
	 * middleThree("Jamaica") <b>---></b>"mai" <br>
	 */

	public static String middleThree(String str) {
		String result = str;
		return result;
	}

//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		//TestingUtils.runTests();
		String test="GurpreetSin";
		int l=test.length();
		if(l%2==0){
			System.out.println("String is not odd");
		}
		else {
			System.out.println("Stirng is odd");
			String subString=middleString(test);
			System.out.println(test+"-->"+subString);
		}
	}
	
	public static String middleString(String str) {
		int l=str.length();
		int firstindex=l/2-1;
		String subStr=str.substring(firstindex, (firstindex+3));
		return subStr;
	}
}
