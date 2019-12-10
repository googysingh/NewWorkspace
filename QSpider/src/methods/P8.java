package methods;

public class P8 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		double a=test();
		System.out.println(a);
		System.out.println("Main Ended");
	}
	public static double test()
	{
		System.out.println("I am method");
		double x=15.24;
		return x;
	}
}
