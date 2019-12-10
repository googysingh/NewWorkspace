package loopingstatement;

public class P9 {

	public static void main(String[] args) {
		int option=3;
		System.out.println("Main Started");
		switch(option)
		{
		case 1: System.out.println("Addition operation");
				int value = add(10,5);
				System.out.println("Sum is"+value);
				break;
				
		case 2: System.out.println("Multiplication operation");
				int value1=mul(5,2);
				System.out.println("Mul is="+value1);
		  		break;
		 
		case 3: System.out.println("Mod operation");
				mod(5,4);
				break;
		 		
		default:System.out.println("No such operation");
		}
		
		System.out.println("Main Ended");

	}

	public static int add(int a,int b)
{
	int r=a+b;
	System.out.println("Addition of "+a+" and "+b+" is="+r);
	return r;
}
	
	public static int mul(int a,int b)
	{
		int r=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is="+r);
		return r;
	}
	
	public static int mod(int a,int b)
	{
		int r=a%b;
		System.out.println("Mod of "+a+" and "+b+" is="+r);
		return r;
	}
}
