package xtraprograms;

public class Swapwithouttemp {

	public static void main(String[] args) {
		int a=(int) (Math.random()*100);
		int b=(int) (Math.random()*100);
		System.out.println("Before");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After");
		System.out.println("a= "+a);
		System.out.println("b= "+b);

	}

}
