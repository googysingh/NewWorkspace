package classdev;

public class P3 {
	int id;
	String name;
	String desgination;
	double sal;
	static String companyname="TCS";
	public static void main(String[] args) {
		P3 e1=new P3();
		P3 e2=new P3();
		e1.id=1000;
		e1.name="Uday";
		e1.desgination="Test Engineer";
		e1.sal=512.31;
		e2.id=1001;
		e2.name="Kumar";
		e2.desgination="Developer";
		e2.sal=123123.123333333333333;
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.desgination);
		System.out.println(e1.sal);
		e1.work();
		e1.login();
		e1.logout();
		System.out.println("********************");
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.desgination);
		System.out.println(e2.sal);
		e2.work();
		e2.login();
		e2.logout();
	}
	
	void work()
	{
		System.out.println("I am working");
	}
	
	void login()
	{
		System.out.println("I login");
	}
	
	void logout()
	{
		System.out.println("I logout");
	}
}
