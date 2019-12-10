package hello;

class Staticclass {
	static int a;
	public static void main(String args[])
	{
		int d,c=20;
		d=a+c;
		System.out.println(a);
		System.out.println(d);
		System.out.println("Method variable b value is "+demo.b);
		demo.test1();
	    String name=demo.test1();
		//System.out.println(name);
	}
}
class demo{
	static int b=90;
	public static String test1() 
	{
		System.out.println("My name is");
		return "Gurpreet Singh";
	}
}