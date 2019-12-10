package xtraprograms;



public class StaticBlocks {
	static long a;

	static {
		System.out.println("Static block2");
	}

	public static void main(String args[]) {
		System.out.println("a = " + a);

		StaticBlocks s = new StaticBlocks();
		s = new StaticBlocks();
		s = new StaticBlocks();
		// System.out.println("a = "+a );
	}

	{
		a = System.currentTimeMillis();
		System.out.println("Static block1");
	}
}
