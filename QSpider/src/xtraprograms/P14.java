package xtraprograms;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		int a;
		Scanner read= new Scanner(System.in);
		System.out.println("Enter any no");
		a=read.nextInt();
		fac(a);

	}
	
	public static int fac(int f)
	{
		int t=1;
		for(int i=f;i>1;i--)
		{
			t=t*i;
		}
		System.out.println("Factorial of +"+f+"+ is "+t);
		return f;
	}

}
