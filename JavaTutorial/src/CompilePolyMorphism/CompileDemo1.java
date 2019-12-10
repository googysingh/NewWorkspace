package CompilePolyMorphism;

public class CompileDemo1 {

	public static void main(String[] args) {
		CompileDemo1 obj= new CompileDemo1();
		obj.add(2,3);
		obj.add(2.5, 3);
		obj.add(2,3.5);
		obj.add(2,3,4);
	}
		public void add(int a,int b)
		{
			int c=a+b;
			System.out.println("Sum of two no is="+c);
		}
		
		public void add(double a,int b)
		{
			double c=a+b;
			System.out.println("Sum of two no is="+c);
		}
		
		public void add(int a,double b)
		{
			double c=a+b;
			System.out.println("Sum of two no is="+c);
		}
		
		public void add(int a,int b,int c)
		{
			int d=a+b+c;
			System.out.println("Sum of three no is="+d);
		}

	}

