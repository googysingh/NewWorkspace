package xtraprograms;

import java.util.Scanner;

public class Inheritance extends A{
	
	public static void main(String args[])
	{
     int a,b,sum;
    Scanner read=new Scanner(System.in);
    System.out.println("Enter first number");
    a= read.nextInt();
	System.out.println("Enter second number");
	b=read.nextInt();
	read.close();
	A.Sum(a, b);
	//System.out.println("Sum is "+sum);
	}
}

class A{
	public static int Sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum of "+a+" & "+b+" is "+c);
		return c;
	}
}