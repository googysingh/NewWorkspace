public class Test {

	public static void main(String[] args) {
		String a = "ab**cd";
		String b = "sm*eil*ly";
		String c = "sm***eil*ly";
		String d = "012*4567";
		char star = '*';
		/*
		 * for(int i=0;i<str.length()-1;i++) { if(str.charAt(1)==star) {
		 * if(str.charAt(i+1)==star) { text= } } }
		 */
		System.out.println(d.indexOf(star));
		System.out.println((d.lastIndexOf(star)));

	}

	public static String starkill(String str) {
		String starKill = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '*' && i - 1 >= 0 && c == str.charAt(i - 1))
				starKill += "";
			else
				starKill += c;
		}
		String resultLeft = "";
		String resultRight = "";
		for (int i = 0; i < starKill.length(); i++) {
			if (starKill.charAt(i) == '*') {
				int starIndex = starKill.indexOf("*");
				if (starIndex - 1 >= 1)
					resultLeft = starKill.substring(0, starIndex - 1);
				if (!((starIndex + 2) > starKill.length()))
					resultRight = starKill.substring(starIndex + 2);
				starKill = resultLeft + resultRight;
				i = 0;
			}
		}
		return starKill;
	}
}
