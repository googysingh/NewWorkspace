package conditionalstatement;

public class P6 {
	//Nested if-else statement
	public static void main(String[] args){
		int a=13,b=15;
		System.out.println("Main Started");
		if(a<b)
		{
			if(a!=13)
			{
				System.out.println("Hi");
			}
			else
			{
				System.out.println("Bye");
			}
		}
		else
			{
				System.out.println("Hi and Bye");
			}
	System.out.println("Main Ended");
		
	}
}
