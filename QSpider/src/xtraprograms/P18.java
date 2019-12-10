package xtraprograms;

import java.util.Scanner;

public class P18 {

	public static void main(String[] args) {
		int a;
		@SuppressWarnings("resource")
		Scanner read= new Scanner(System.in);
		System.out.println("Enter no");
		a=read.nextInt();
		strong(a);
	}

	public static int strong(int as){
	int a=0,n=as,c=0;
	while(n>0)
	{
		a=n%10;
		n=n/10;
		c=c + fac(a) ;
	}
	if(as==c){
	System.err.println(as +" is strong number");
	}
	else
	{
		System.out.println(as+" is not a strong number");
	}
	return as;
}
	

	public static int fac(int f)
	{
		int t=1;
		for(int i=f;i>1;i--)
		{
			t=t*i;
		}
		System.out.println("Factorial of "+ f +" is "+t);
		return t;
	}
}
