package variables;

public class P5 {
	public static void main(String [] args){
		int a=10; // Declaration + Initialization 
		float b=12.5f; // Declaration + Initialization 
		char c='A'; // Declaration + Initialization 
		System.out.println("A value is="+a);
		System.out.println("B value is="+b);
		System.out.println("C value is="+c);
		a= 15;
		b=15.4f;
		c='B';
		System.out.println("After Re-Initialization variables");
		System.out.println("A value is="+a); // Re-Initialization 
		System.out.println("B value is="+b); // Re-Initialization 
		System.out.println("C value is="+c); // Re-Initialization 
	}
}
