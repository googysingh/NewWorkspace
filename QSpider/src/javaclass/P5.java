package javaclass;

public class P5 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		P5 s=new P5();
		int r=s.test();
		System.out.println(s);
		System.out.println("**********");
		System.out.println(r);
		System.out.println("Main Ended");

	}
int test()
{
	System.out.println("I am non static method");
	return 15;
}
}
