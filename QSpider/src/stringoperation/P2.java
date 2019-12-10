package stringoperation;

import java.util.Scanner;

public class P2 {
		
	public static void main(String[] args) {
		String str1,str2="";
		int l;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Paragraph");
		str1= reader.nextLine();
		l=(str1.length());
		for(int i=l-1;i>=0;i--)
		{
			
			str2= str2 + str1.charAt(i);
		}
		System.out.println("reverse string "+str2);
		if(str1.equalsIgnoreCase(str2))
		{
						
			System.out.println("This is paradrome");
		}
		else
		{
			System.out.println("This is not paradrome");
		}
	}

}
