package xtraprograms;

import java.util.Scanner;

public class Paradrome {
public static void main(String[] args)
{
	String str1,str2="";
	Scanner read = new Scanner(System.in);
	System.out.println("Enter words");
	str1 = read.nextLine();
	read.close();
	int len=str1.length();
	for(int i=len-1;i>=0;i--)
	{
		//str2=str2.concat(str1.charAt(i));
		str2=str2 + str1.charAt(i);
	}
	System.out.println("Reverse string is " +str2);
	if(str1.equalsIgnoreCase(str2))
	{
		System.out.println("Entered string is Paradrome");
	}
	else
	{
		System.out.println("It is not a Paradrome");
	}
 }
}
