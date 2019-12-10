package Scanner;

public class NumberminusTen {
	
	public static void main(String[] args) throws Exception {
		NumberminusTen num= new NumberminusTen();
		System.out.println(num.subtract10fromnumber(1));
	}

	public int subtract10fromnumber(int number) throws Exception {
		if(number<10) {
			throw new Exception("Number is less then 10");
		}
		return number-10;
	}

}
