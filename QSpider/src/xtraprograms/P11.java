package xtraprograms;

public class P11 {

	public static void main(String[] args) {
		int n=(int)(Math.random()*10000);
		String t="",r=String.valueOf(n);
		System.out.println(r);
		for(int i=r.length()-1;i>=0;i--)
		{
		t=t + r.charAt(i);
		}
		n=Integer.valueOf(t);
		System.out.println("Reversed integer "+n);

	}

}
