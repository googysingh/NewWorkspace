package xtraprograms;

public class Test {
	
	int i=1;
    public static void main(String[] args) {
	System.out.println("Hello");
	Test te= new Test();
	System.out.println(te.i);
	int st=te.method();
	te.method();
	System.out.println(st);
	}

   int method() {
	   System.out.println("This is method");
	   return 12;
   }
}
