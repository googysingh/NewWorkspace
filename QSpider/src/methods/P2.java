package methods;

public class P2 {


	public static void main(String[] args) {
		System.out.println("Main Started");
		test1();
		System.out.println("Main Ended");
	}
	
	public static void test()
	{
		System.out.println("I am test method");
	}
	
	public static void test1()
	{
		System.out.println("Starting test1 method");
		test();
		System.out.println("Ending test1 method");
	}
}
