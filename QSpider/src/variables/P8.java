package variables;

public class P8 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		int a=10;
		{
			int b=20;
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
		//System.out.println(b); b can't access as it is outside of context, a can be access anywhere bcoz it is initialized in begning 
		System.out.println("Main Ended");
	}

}
