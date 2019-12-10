package xtraprograms;

public class Singleton {
public static void main(String args[])
{
	//Singleton s1= new Singleton();
	Singleton s2= new Singleton();
}
	//private static Singleton obj=null;
	int a=10;
	private int b=20;
	
	private Singleton() {
		
	}
    
	static{
		Singleton s1= new Singleton();
		s1.test();
	}
	
	{
		Singleton s2= new Singleton();
		s2.test1();
	}

	public void test(){
		System.out.println("Test");
	}
	public void test1(){
		System.out.println("Test1");
	}
}
