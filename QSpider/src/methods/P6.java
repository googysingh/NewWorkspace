package methods;

public class P6 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		char a=test();
		System.out.println(a);
		boolean b=test1();
		System.out.println(b);
		System.out.println("Main Ended");
	}
	public static char test()
	{
		System.out.println("I am test method");
		return 'A';
	}
	public static boolean test1()
	{
		System.out.println("I am test1 method");
		return false;
	}
}
