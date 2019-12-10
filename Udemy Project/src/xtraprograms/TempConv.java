package day2.examples;
import java.util.Scanner;

public class TempConv {

	public static void main(String[] args) {
		double temp,f;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter temp in Celsius");
		temp= reader.nextInt();
		f=temp * 1.8 + 32.0;
		System.out.println("Temp in fahrenheit is "+ f );
	}
}