package ClassDemo;

public class PassParameter {

	int x=90,y=100;
	
	public static void main(String[] args) {
		System.out.println("Program Started");
		PassParameter obj1= new PassParameter();
		int sum=obj1.sum(100,50);
		//double sub=obj1.sub(100,50);
		System.out.println("Sum is "+ sum);
		System.out.println("Sub is "+ obj1.sub(100,50));
		System.out.println("Program Ended");

	}

	public int sum(int a, int b){
		System.out.println("This will perform Addition");
		int c=a+b;
		return c;
	}

	
	public double sub(double c, double d){
		System.out.println("This will perform Substraction");
		double e=c-d;
		return e;
	}

}
