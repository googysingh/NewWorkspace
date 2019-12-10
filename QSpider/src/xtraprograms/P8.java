package xtraprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P8 {

	public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add((int)(Math.random()*100));
	list.add((int)(Math.random()*100));
	list.add((int)(Math.random()*100));
	list.add((int)(Math.random()*100));
	list.add((int)(Math.random()*100));
	System.out.println(list);
	Collections.reverse(list);
	System.out.println();
	System.out.println(list);

}
}
