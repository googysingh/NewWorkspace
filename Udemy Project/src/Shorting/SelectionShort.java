package Shorting;

import java.util.Scanner;

public class SelectionShort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of digits");
		int l = scan.nextInt();
		scan.close();
		int[] arr = new int[l];
		for (int i = 0; i < l; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		display(arr);
		System.out.println();
		selectionShort(arr);
		System.out.println();
		display(arr);
	}

	public static void selectionShort(int[] arr) {
		int l = arr.length, i = 0, j = 0,temp=0;
		for (i = 0; i < l-1; i++) {
			temp=arr[i];
			for (j = i + 1; j < l; j++) {
				
				if(arr[j]<temp)
				{
					temp=arr[j];
				}
				swap(arr[i], temp);
			}
		}
	}

	public static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		return arr;
	}
	
	public static void display(int[] arr) {
		int j = 0,l=arr.length;
		while (j < l) {
			System.out.print(arr[j] + " ");
			j++;
		}
	}

}
