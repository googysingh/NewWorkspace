package collections;

import java.util.Map;
import java.util.TreeMap;

public class Hashmap {
public static void main(String args[])
{
	TreeMap<Integer, Integer> hm= new TreeMap<Integer,Integer>();
	hm.put(1, 10);
	hm.put(2, 20);
	hm.put(3, 30);
	hm.put(4, 40);
	hm.put(null, 50);
	//Set<Integer> set = hm.keySet();
	//System.out.println(hm);
	
	for(Map.Entry<Integer, Integer> i:hm.entrySet())
	{
		
		System.out.println(i.getKey() +":" +i.getValue());
	}
	System.out.println("______________");
	hm.put(null, 60);
	for(Map.Entry<Integer, Integer> i:hm.entrySet())
	{
		
		System.out.println(i.getKey() +":" +i.getValue());
	}
	}
}
