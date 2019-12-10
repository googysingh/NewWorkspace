package xtraprograms;

import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		int a;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter any no");
		a=read.nextInt();
		prime(a);
	}

	public static int prime(int p)
	{
		boolean t=false;
		for(int i=2;i<=p/2;i++)
		{
			if(p%i==0){
				t=true;
			}
		}
		if(t==false)
		{
			System.out.println("Number is Prime no");
		}
		else {
			System.out.println("It is not prime no");
		}
		return p;
	}
}
