package unaryoperators;

public class P8 {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int c=a++ + ++b + ++a + b++ + ++b + ++a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
