package InheritanceDemo;

public class ChildcClass extends baseclass {

	public static void main(String[] args) {
		//Child class reference and child class object- This will allow to access all the methods of base class and child class
		
		ChildcClass obj=new ChildcClass();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}
	
	
	public void mul()
	{
		System.out.println("This is child class and mul is 250000");
	}

	public void div()
	{
		System.out.println("This is child class and divide is 50");
	}
}
