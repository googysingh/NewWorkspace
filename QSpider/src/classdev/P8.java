package classdev;

public class P8 {
	int empid;
	String name,login,logout;
	float salary;
	public static void main(String[] args) {
		
		P8 s1=new P8();
		P8 s2=new P8();
		s1.empid=101;
		s1.name="Kumar";
		s1.login="9:00 AM";
		s1.logout="5:00 PM";
		s1.salary=10200.14f;
		s2.empid=102;
		s2.name="Singh";
		s2.login="10:00 AM";
		s2.logout="6:00 PM";
		s2.salary=10250.34f;
		s1.login();
		s1.logout();
		s1.work();
		s2.login();
		s2.logout();
		s2.work();
	}

	void login()
	{
		System.out.println("Employee id is="+empid);
		System.out.println("Employee name is="+name);
		System.out.println("Login time is="+ login);
	}
	
	void logout()
	{
		System.out.println("Employee id is="+empid);
		System.out.println("Employee name is="+name);
		System.out.println("Logout time is="+ logout);
	}
	
	void work()
	{
		System.out.println("Employee id is="+empid);
		System.out.println("Employee name is="+name);
		System.out.println("Salary is="+ salary);
	}
}
