package classdev;

public class P2 {
int i;
float f;
	public static void main(String[] args) {
		System.out.println("Main Started");
		P2 s1=new P2();
		P2 s2=new P2();
		s1.i=10; // Ini
		s1.f=15.5f;
		System.out.println(s1.i);
		System.out.println(s1.f);
		System.out.println(s2.i);
		System.out.println(s2.f);
		s1.i=15;// Re-ini
		s1.f=10.20f;
		System.out.println(s1.i);
		System.out.println(s1.f);
		System.out.println(s2.i);
		System.out.println(s2.f);
		System.out.println("Main Ended");
	}

}
