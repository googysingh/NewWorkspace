package hello;

public class Static2 {
	int i;
	float j;
	public static void main(String args[]) {
		Static2 s1=new Static2();
		s1.i=10;
		s1.j=15.0f;
		s1.test();
	}
	void test()
	{
		Static2 s1=new Static2();
		System.out.println(s1.i);
		System.out.println(s1.j);
		System.out.println(i);
		System.out.println(j);
	}
}
