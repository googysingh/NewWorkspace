package day2.examples;
import java.util.Scanner;

public class BoilingWater {

	public static void main(String[] args) {
		double temp;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the temperature of water");
		temp=reader.nextInt();
		if(temp>=100 ){
			System.out.println("Water is boiling");
		}else if(temp<100 && temp>0){
			System.out.print("Water is normal");
		}else{
			System.out.println("Water is Freezing");
		}
	}

}
