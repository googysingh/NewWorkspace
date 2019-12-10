package methods;

public class P11 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		float a=sum(1,2.5f);
		System.out.println("Sum is="+a);
		float b=sum(10,10.5f);
		System.out.println("Sum is="+b);
		System.out.println("Main ended");
	}
	
	public static float sum(int a, float b)
	{
		System.out.println("First no is="+a);
		System.out.println("Second no is="+b);
		float c=a+b;
		return c;
	}
}
