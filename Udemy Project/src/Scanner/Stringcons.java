package Scanner;

public class Stringcons{
	public static void main(String[] args) {
		string();
		StringBuffer sb1= new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("qwertyuiopasdfghj");
		StringBuffer sb=new StringBuffer("GurpreetSingh");
		System.out.println(sb1.capacity());
		
		string(sb);
		char[] ch= {'a','b','c','d','e'};
		byte[] b= {101,98,99,100};
		string(ch);
		string(b);
		
		String check="";
		System.out.println(check.isEmpty());
		System.out.println(check.length());
		String re="abababab";
		re.replace('a', 'b');
		System.out.println(re);
		System.out.println(re.substring(1,3));
				
	}
	
	public static void string() {
		String st= new String();
		System.out.println(st);
	}
	
	public static void string(StringBuffer sb) {
		String st=new String(sb);
		System.out.println(st);
	}
	
	public static void string(char ch[]) {
		String st= new String(ch);
		System.out.println(st);
	}
	
	public static void string(byte b[]) {
		String st=new String(b);
		System.out.println(st);
	}

}
