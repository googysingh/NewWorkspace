package xtraprograms;

import java.util.ArrayList;
import java.util.List;

public class P10 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); 
		list.add((int)(Math.random()*100));
		list.add((int)(Math.random()*100));
		list.add((int)(Math.random()*100));
		list.add((int)(Math.random()*100));
		list.add((int)(Math.random()*100));
		print(list);
		System.out.println();
		maxvalue(list);
		System.out.println();
		minvalue(list);
	}
	
	public static List<Integer> print(List<Integer> list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		return list;
	}

	public static List<Integer> maxvalue(List<Integer> list)
	{
		int m=0;
		for(int i=1;i<list.size();i++)
		{
			if(list.get(m)<list.get(i))
			{
				m=i;
			}
		}
		System.out.println("Largest element in array is="+list.get(m));
		return list;
	}
	
	public static List<Integer> minvalue(List<Integer> list)
	{
		int m=0;
		for(int i=1;i<list.size();i++)
		{
			if(list.get(m)>list.get(i))
			{
				m=i;
			}
		}
		System.out.println("Smallest element in array is="+list.get(m));
		return list;
	}
}
