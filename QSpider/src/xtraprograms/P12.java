package xtraprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P12 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add((int)(Math.random()*100));
		list.add((int)(Math.random()*100));
		list.add((int)(Math.random()*100));
		list.add((int)(Math.random()*100));
		list.add((int)(Math.random()*100));
		System.out.print("Original list="+list);
		Collections.sort(list);
		System.out.println();
		System.out.print("In asc order="+list);
		Collections.reverse(list);
		System.out.println();
		System.out.print("In desc order="+list);	
		
	}
	
}
