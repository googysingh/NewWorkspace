package ClassDemo;

public class FirstClassDemo {

	int x=90,y=100;
	
	public static void main(String[] args) {
		System.out.println("Program Started");
		Calculator obj1= new Calculator();
		obj1.sum(100,50);
		obj1.sub(100,50);
		System.out.println("Program Ended");
		FirstClassDemo obj2= new FirstClassDemo();
		obj2.sum();

	}

    public void sum(){
    	int a=90;
    	int b=110;
    	int c=a+b;
    	System.out.println("Sum is "+ c);
    }
}
