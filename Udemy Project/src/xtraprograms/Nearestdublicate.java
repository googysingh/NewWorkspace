package xtraprograms;

import java.util.Scanner;

public class Nearestdublicate {

	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 int number");

		for (int i = 0; i <= 9; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		
		int l=a.length;
		for(int i=0;i<l-1;i++) {
			if(a[i]==a[i+1]) {
				System.out.println("Dublicate value is "+a[i]);
				break;
			}
		}

	}

}
