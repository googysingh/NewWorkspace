package xtraprograms;

import java.util.Scanner;

public class P20 {

	public static void main(String[] args) {
		int n,t=1;
		Scanner read=new Scanner(System.in);
		System.out.println("Enter any no");
		n=read.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
		for(int a=1;a<=n-i;a++)
			{
				System.out.print(" ");
			}
			int k=1;
		for(int j=1;j<=t;j++)
		{
			if(j<i)
			{
				System.out.print(k);
				k=k+1;
			}
			else{
				System.out.print(k);
				k=k-1;
			}
			//System.out.print(j);
		}
		System.out.println();
		t=t+2;
		}
	}

}
