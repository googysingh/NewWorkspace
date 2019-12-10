package methods;

public class P13 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		System.out.println(test());
		System.out.println(test1());
		System.out.println(test2());
		//System.out.println(test3()); Not possible in case of void method
		test3();
		System.out.println("Main Ended");		
	}
	public static int test()
	{
		return 12;
	}
	public static float test1()
	{
		return 12.6f;
	}
	public static boolean test2()
	{
		return true;
	}
	public static void test3()
	{
		System.out.println("Hello");
	}
}
