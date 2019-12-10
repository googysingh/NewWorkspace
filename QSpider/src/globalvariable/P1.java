package globalvariable;

public class P1 {

	//Global Variables can be access from any method
	static int a=10;
	public static void main(String[] args) {
		System.out.println(a);
		test();
	}
	public static void test()
	{
	System.out.println(a);
	}
}
