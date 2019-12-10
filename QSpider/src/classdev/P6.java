package classdev;

public class P6 {
int i;
float j;
	public static void main(String[] args) {
	System.out.println("Main Started");
	P6 s1=new P6();
	s1.i=10;
	s1.j=15.50f;
	s1.test();
	System.out.println("Main Ended");
	}
	
	void test()
	{
		P6 s1=new P6();
		System.out.println(s1.i);// taking value as global default value
		System.out.println(s1.j);// taking value as global default value
		System.out.println(i);// taking value from init value in main class
		System.out.println(j);// taking value from init value in main class
	}
}
