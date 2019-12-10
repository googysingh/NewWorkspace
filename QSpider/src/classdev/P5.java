package classdev;
// it is possible to access non static properties from non static methods directly
public class P5 {
int i;
float j;
	public static void main(String[] args) {
		System.out.println("Main Started");
		P5 s1=new P5();
		P5 s2=new P5();
		s1.i=100;
		s1.j=150.50f;
		s2.i=101;
		s2.j=250.50f;
		s1.calling();
		System.out.println("_________");
		s2.calling();
		System.out.println("Main Ended");
	}
void calling()
{
	System.out.println(i);
	System.out.println(j);
}
}
