package day1.examples;
import java.util.Scanner;
public class ExampleFor {

	public static void main(String[] args) {
		int i,n,j=0;
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter the number");
	n= reader.nextInt();
	for(i=1;i<=10;i++){
		j=n*i;
		System.out.println(n+"X"+i+"="+j);
	}
	}
}
