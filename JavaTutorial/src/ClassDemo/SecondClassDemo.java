package ClassDemo;

public class SecondClassDemo {

	public static void main(String[] args) {
	
		SecondClassDemo obj=new SecondClassDemo();
		obj.sum(100, 50);
		obj.sub(100, 50);
		
		System.out.println("Name is "+ obj.name);
		System.out.println("Age is "+obj.age);
	
	}
	
	int age= 25;
	String name= "Test";
	public void sum(int a, int b){
		System.out.println("This will perform Addition");
		int c=a+b;
		System.out.println("Sum is "+ c);
	}

	
	public void sub(double c, double d){
		System.out.println("This will perform Substraction");
		double e=c-d;
		System.out.println("Sub is "+ e); 
	}

}
