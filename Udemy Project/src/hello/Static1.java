package hello;

public class Static1 {
	
	public static void main(String args[]) {
		int a=0;
		System.out.println(a);
		Static1 s1= new Static1();
		String test= s1.test();
	}
	String test() {
		System.out.println("Nonstatic Method");
		return "Gurpreet Singh";
	}
}
