package loopingstatement;

public class P7 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		for(int i=9;i>=7;i--)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("************");
		}

	}

}
