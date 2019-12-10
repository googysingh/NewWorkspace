package day2.examples;
import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ReplaceNumber number= new ReplaceNumber();
		System.out.println("Enter first number");
		number.x= reader.nextInt();
		System.out.println("Enter second number");
		number.y=reader.nextInt();
		number.Switching();
	}
}
