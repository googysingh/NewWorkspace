package xtraprograms;

import java.util.Scanner;

public class Shorting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number digits");
		int num = scan.nextInt();
		scan.close();
		int[] array = new int[num];
		addnum(array);
		System.out.println();
		ArrayList.arrayprint(array);
		arrayshot(array);
		System.out.println();
		ArrayList.arrayprint(array);
		System.out.println();
		System.out.println("Highest number is " + array[num - 1]);
		System.out.println("Smallest number is " + array[0]);

	}

	public static void addnum(int[] a) {

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
	}

	public static void arrayshot(int[] a) {
		int l = a.length, temp = 0;
		for (int i = 0; i < l - 1; i++) {
			for (int j = i + 1; j < l; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}

}
