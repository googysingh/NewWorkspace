package xtraprograms;

import java.util.Scanner;

public class Countnoofdigit {
public static void main(String args[])
{
	int n,r;
	Scanner read=new Scanner(System.in);
	System.out.println("Enter numbers");
	n= read.nextInt();
	read.close();
	System.out.println("Entered Digits are "+n);
	r=count(n);
	System.out.println("Total digits are "+r);
			
}
public static int count(int a)
{
	int n=0;
	while(a>0)
	{
		a=a/10;
		n=n+1;
	}
	return n;
}
}
