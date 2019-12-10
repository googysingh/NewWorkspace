package day1.examples;
import java.util.Scanner;
public class ExampleIf {

	public static void main(String[] args) {
		int x,y;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter X value");
		x = reader.nextInt();
		System.out.println("Enter Y value");
		y = reader.nextInt();
		if(x<y){
		 System.out.println("Y is greater than X");
		}else if(x>y){
			System.out.println("X is greater that Y");
		}else{
		System.out.println("Both are equal");	
		}
	}
}
