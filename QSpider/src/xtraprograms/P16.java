package xtraprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		int a;
		Scanner read= new Scanner(System.in);
		System.out.println("Enter no");
		a=read.nextInt();
		arms(a);
	}

	public static int arms(int as){
		String s = Integer.toString(as);
		int x=0,tn=0;
		int t=s.length();
		
		int [] ar= new int[t];
		for(int j=0;j<t;j++)
		{
			ar[j]=(int)(s.charAt(j));
		
		}
		for(int i=0;i<s.length();i++)
		{
			x=(int)(s.charAt(i));
			tn= tn + ((int)s.charAt(i)* (int)s.charAt(i) * (int)s.charAt(i));
		}
		if(as==tn){
		System.err.println(as +" is armstrong number");
		}
		else
		{
			System.out.println(as+" is not a armstrong number");
		}
			
		return as;
	
	}
}
