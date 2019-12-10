package loopingstatement;

public class P5 {
// Nested for loop
	public static void main(String[] args) {
		System.out.println("Main Started");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=2;j++)
			{
				System.out.println("Hello");
				System.out.println(i+"********"+j);
			}
		}
		System.out.println("Main Ended");
	}
}
