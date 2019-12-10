package classdev;

public class P4 {
int i;
String j;
	public static void main(String[] args) {
		System.out.println("Main Started");
		P4.method();
		System.out.println("Main Ended");
	}
static void method()
{
	P4 s=new P4();
	s.i=10;
	s.j="abc";
	System.out.println(s.i);
	System.out.println(s.j);
}
}
