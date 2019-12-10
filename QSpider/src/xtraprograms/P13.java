package xtraprograms;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		int n;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number");
		n= reader.nextInt();
		int [] a= new int[n+2];
		a[0]=0;
		a[1]=1;
		
	for(int i=2;i<n+2;i++)
	{
		a[i]=a[i-1]+a[i-2];
	}
	for(int s=0;s<a.length;s++)
	{
	System.out.print(a[s]+" ");
	}
	System.out.println();
	System.out.println(a[n-1]);
	}
}
