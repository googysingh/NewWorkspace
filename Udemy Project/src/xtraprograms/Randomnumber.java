package xtraprograms;
import java.util.Random;
import java.util.Scanner;

public class Randomnumber{
public static void main(String args[])
{
	Scanner read=new Scanner(System.in);
	System.out.println("Enter number of digit for random number");
	int a=read.nextInt();
	read.close();
	int b=Random(a);
	System.out.println(b);
}
public static int Random(int i)
{
	int a=1;
	while(i>0){
		a=a*10;
		i=i-1;
	}
	Random rand= new Random();
	a=rand.nextInt(a);
	return a;
}
}

