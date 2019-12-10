package javaclass;
//non static variables
public class P3 {
	int a=10;
	public static void main(String[] args)
	{
		P3 s=new P3();//object created + address is stored
		System.out.println(s);// address of reference variable
		System.out.println(s.a);
	}
}
