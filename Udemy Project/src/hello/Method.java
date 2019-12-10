package hello;
import java.util.*;
public class Method 
{
public static void main(String args[]) 
 {
	int a,b;
	float c,d;
	Scanner in= new Scanner(System.in);
	System.out.println("Method Practice");
	System.out.println("Enter two numbers");
	a=in.nextInt();
	b=in.nextInt();
	System.out.println("Enter number to divide into half");
	c=in.nextFloat();
	Allmethod.calculator(a,b);
	Allmethod.calculator();
	d =Allmethod.calculator(c);
	System.out.println("Half value of "+c+" is "+d);
 }
	
    
}

