package stringoperation;

import java.util.Scanner;

public class Stringrev {

	public static void main(String[] args) {
		String s,r="";
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the String");
		s= reader.nextLine();
		int l= s.length();
		for(int i=l-1;i>=0;i--)
		{
			r=r+s.charAt(i);
			
		}
		System.out.println("Original String "+s);
		System.out.println("Reverse String "+r);
	}

}
