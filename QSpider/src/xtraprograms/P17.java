package xtraprograms;

import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {
		int a;
		@SuppressWarnings("resource")
		Scanner read= new Scanner(System.in);
		System.out.println("Enter no");
		a=read.nextInt();
		arms(a);
	}

	public static int arms(int as){
		int a=0,n=as,c=0;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(as==c){
		System.err.println(as +" is armstrong number");
		}
		else
		{
			System.out.println(as+" is not a armstrong number");
		}
		return as;
	}
}
