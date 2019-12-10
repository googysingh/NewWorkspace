package methods;

public class P12 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		int a=mod(2,5);
		System.out.println("Mod is="+a);
		int b=mod(4,2);
		System.out.println("Mod is="+b);
		System.out.println("Main Ended");

	}
	
	public static int mod(int a, int b)
	{
		System.out.println("First no is="+a);
		System.out.println("Second no is="+b);
		int c=a%b;
		return c;
	}

}
