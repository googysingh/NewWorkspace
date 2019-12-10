package xtraprograms;

import java.util.Scanner;

public class Fabonacciseries {

	public static void main(String[] args)
	{
		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();

		int a[] = new int[num];
		a[0] = 0;
		System.out.print(a[0]);
		if (num == 1) {
			return;
		} else {
			a[1] = 1;
			for (int i = 2; i < num; i++) {
				a[i] = a[i - 1] + a[i - 2];
				System.out.println(a[i]);
			}
		}
		for()
	}
		
	/*	int a=0,b=1,c=0;
		System.out.print(a);
		if(num==1) {
			return;
		}else {
			for (int i=0;i<num;i++)
			{
				a=b;
				b=c;
				c=a+b;
				
				
				System.out.print(c);
			}		
		}		
	}*/
}
