package hello;

public class Array {
public static void main(String args[])
{
	int i;
	int [] array= new int[4];
	array[0]=1;
	array[1]=array[0]+1;
	array[2]=array[1]+1;
	array[3]=array[2]+1;
	String [] St= new String [] {"My","Name","is","Gurpreet"};
	for(i = 0;i<=3;i++)
	{
	System.out.print(array[i]+" ");
	System.out.println(St[i]);
	}
	
}
}
