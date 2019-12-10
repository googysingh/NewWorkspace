package classdev;
public class P1 {
	int i;
	float j;
public static void main(String[] args) {
	System.out.println("Main Started");
	P1 s1=new P1();
	P1 s2=new P1();
	System.out.println(s1.i); // in both object different non static members can be access 
	System.out.println(s1.j);
	System.out.println(s2.i);
	System.out.println(s2.j);
	System.out.println("Main Ended");
	}
}
