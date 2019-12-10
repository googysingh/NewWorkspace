package xtraprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P9 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add((int)(Math.random()*100));
		list.add((int)(Math.random()*100));
		list.add((int)(Math.random()*100));
		list.add((int)(Math.random()*100));
		list.add((int)(Math.random()*100));
		print(list);
		System.out.println();
		Collections.swap(list, 1, 2);
		print(list);
	}
	
	public static List<Integer> print(List<Integer> list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		return list;
	}

}
