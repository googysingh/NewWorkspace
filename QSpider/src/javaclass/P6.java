package javaclass;

public class P6 {
	int a=20;
public static void main(String[] args)
	{
	P6 var= new P6();
	System.out.println(var.a);
	System.out.println("Main Started");
	PC6 s=new PC6();
	System.out.println(s.a);
	float r=s.test();
	System.out.println(r);
	s.test();
	System.out.println("Main Ended");	
	}

}
class PC6
{
	int a=10;
	float test()
	{
		System.out.println("testing");
		float f=15.3f;
		return f;
	}
}
