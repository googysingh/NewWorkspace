public class ArraysDemo {
	
public static void main(String[] args) {
	int[] myIntArray1;
	myIntArray1 = new int[10];
	
	myIntArray1[0]= 100;
	myIntArray1[1]= 90;
	
	System.out.println("0 index= "+ myIntArray1[0]);
	System.out.println("1st index="+ myIntArray1[1]);
	System.out.println("2nd index="+ myIntArray1[2]);
	
	String[] myStringArray1;
	myStringArray1 = new String[10];
	
	myStringArray1[0]= "bmw";
	myStringArray1[1]="audi";
	myStringArray1[2]= "honda";
	
	System.out.println("0 index="+ myStringArray1[0]);
	System.out.println("1 index="+ myStringArray1[1]);
	System.out.println("2 index="+ myStringArray1[2]);
	
	int len1=myIntArray1.length;
	int len2= myStringArray1.length;
	
	System.out.println("Length of int array is= "+ myIntArray1.length);
    System.out.println("Lenght of String array is= " + myStringArray1.length);
    
			
}
}
