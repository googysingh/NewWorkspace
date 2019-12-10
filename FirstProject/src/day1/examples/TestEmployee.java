package day1.examples;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Employee alex = new Employee();
		System.out.print("Enter the salary of Alex:");
		alex.bonus= reader.nextInt();
		System.out.print("Enter the bonus of Alex:");
		alex.salary=reader.nextInt();
		System.out.print("Alex's ");
		alex.calculateTotalPay();
	}

}
