package Scanner;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("qwertyuiopasdfghj");
		System.out.println(sb1.capacity());
		StringBuffer sb=new StringBuffer(555);
		System.out.println(sb.capacity());
		StringBuffer in=new StringBuffer("abcd");
		System.out.println(in);
		in.insert(2, "xyz");
		System.out.println(in);
		StringBuffer big=new StringBuffer(1000);
		System.out.println(big.capacity());

	}

}
