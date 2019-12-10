package conditionalstatement;

public class P5 {

	public static void main(String[] args) {
		int res=mul(5,2);
		if(res%2==0)
		{
			System.out.println("This is a even number");
		}
		else{
			System.out.println("This is a odd number");
		}
	}
	public static int mul(int a, int b)
	{
		int c=a*b;
		return c;
	}
}
