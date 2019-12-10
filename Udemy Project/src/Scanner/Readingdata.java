package Scanner;

import java.util.Scanner;

public class Readingdata {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter some text");
		String str=scan.nextLine();
		System.out.println(str);
		System.out.println("Enter some number");
		int t=scan.nextInt();
		System.out.println(t);
		scan.close();
	}

}
