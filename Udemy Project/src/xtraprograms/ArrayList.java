package xtraprograms;

import java.util.Random;

public class ArrayList {

	public static void main(String[] args) {
		int arr[]= {1,2};
		arr[0]=1;
		arr[1]=2;	
		String [] brr=new String[2];
		brr[0]="My name is";
		brr[1]="Gurpreet";
		arrayprint(arr);
		arrayprint(brr);
		int num=(int) (Math.random()*100);
		System.out.println(num);
	
	}
		
	
	public static void arrayprint(int [] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void arrayprint(String[] a) {
		for(String i: a) {
			System.out.println(i);
		}
	}

}
