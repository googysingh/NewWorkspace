package javaclass;
//static variable
public class P1 {
static int a=10;
	public static void main(String[] args) {
		System.out.println(P1.a);
		System.out.println(PC1.b);
		//System.out.println(b); incorrect statement as b variable in different class
	}
}

class PC1
{
	static int b=20;
}
