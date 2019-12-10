package unaryoperators;

public class P5 {

	public static void main(String[] args) {
		int a=1,b=2,c=3;
		int d=a++ + b++ + c++ + a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
