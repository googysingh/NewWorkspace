package hello;

class Nonstatic {
	int a=10;
	public static void main(String args[]) {
		Nonstatic var= new Nonstatic();
		System.out.println(var.a);
		System.out.println(var.add());
		Test s = new Test();
		System.out.println(s.b);
	}
		int add() {
			int a=20,b=30,c;
			c=a+b;
			//System.out.println(c);
			return c;
		}	
}
class  Test 
{
	int b=20;
}
