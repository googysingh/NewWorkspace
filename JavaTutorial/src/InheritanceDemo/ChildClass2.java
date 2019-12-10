package InheritanceDemo;

public class ChildClass2 extends baseclass {

	public static void main(String[] args) {
		//Base class reference and base class object- this will allow to access all the methods of base class only.
		
		baseclass obj2=new ChildClass2();
		obj2.add();
		obj2.sub();
		//obj1.mul();
	//	obj1.div();

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
