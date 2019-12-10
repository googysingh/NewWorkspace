package xtraprograms;

public class Reversestring {

	public static void main(String[] args) {
		String st = "This is simple test";
		String[] arr = st.split(" ");
		for (int i = 0; i < arr.length; i++) {
			Reverse(arr[i]);
		}
	}

	public static void Reverse(String st) {
		String rev = "";
		for (int i = st.length() - 1; i >= 0; i--) {
			rev = rev + st.charAt(i);
		}
		System.out.println(rev);
	}

}
