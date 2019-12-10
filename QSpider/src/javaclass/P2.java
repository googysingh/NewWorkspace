package javaclass;
// Static methods
public class P2 {
	static int a=10;
	public static void main(String[] arg)
	{
		System.out.println("Main Started");
		P2.test();
		PC2.test();
		System.out.println("Main Ended");
	}
	
	public static void test()
	{
		System.out.println("I am in main class");
	}
}

class PC2
{
	public static void test()
	{
		System.out.println("I am another class");
		System.out.println(P2.a);
	}
}
