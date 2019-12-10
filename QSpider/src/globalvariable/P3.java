package globalvariable;

public class P3 {
	//if there are same global and local variables, then priority is given to local variable
	static int a=10;
	static int b=20;
	public static void main(String[] args) {
		int a=30;
		int b;
		System.out.println(a);
		//System.out.println(b); error as local variable is to initialized before using it.
	}

}
