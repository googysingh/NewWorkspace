package stringDemo;

public class StringDemo4 {

	public static void main(String[] args) {
		String actual="Selenium-HP-QTP-Grid";
		String[] arr=actual.split("-");
		
		for(int i=0;i<=arr.length;i++){
			System.out.println("String split="+ arr[i]);
		}
	}

}
