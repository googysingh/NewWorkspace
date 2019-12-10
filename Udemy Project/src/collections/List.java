package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class List {
	public static void main(String args[]) {
		/*
		 * int [] myarr= new int[10]; Scanner read=new Scanner(System.in);
		 * System.out.println("Enter 10 number"); for(int i=0;i<=9;i++) {
		 * myarr[i]=read.nextInt(); } read.close();
		 * System.out.println("Reverse order is"); for(int i=9;i>=0;i--) {
		 * System.out.println(myarr[i]); }
		 */
		System.out.println("my List");
		ArrayList<Object> words = new ArrayList<Object>();
		words.add("Gurpreet");
		words.add("Singh");
		words.add(10);
		words.add(15);
		System.out.println(words.size());
		System.out.println((String) words.get(0) + " " + (String) words.get(1));
		System.out.println(words.indexOf("Singh"));
		System.out.println((int) words.get(2) + (int) words.get(3));
		Integer i = 10;
		System.out.println(i);
		i = 15;
		System.out.println(i);

		LinkedList<Integer> list = new LinkedList<Integer>();
		int ik = new Integer(100);
		list.add(new Integer(ik));
		list.add(300);
		list.add(200);
		System.out.println(list.size());
		System.out.println(list.contains(200));
		for (int number : list) {
			System.out.println(number);
		}
		list.clear();
		System.out.println("After removal operation");
		for (int j : list) {
			System.out.println(j);
		}
	}
}
