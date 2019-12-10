package xtraprograms;

public class P24 {

	public static void main(String[] args) {
		int n, input, sum=0,add=0;
		n=(int)(Math.random()*1000);
		input= n;
		while(input >0)
		{
			add=input%10;
			sum= sum+add;
			input=input/10; 
		}
		System.out.println("Sum of "+n+" is "+sum);
	}

}
