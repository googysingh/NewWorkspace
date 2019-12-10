package stringoperation;

public class P3 {

	public static void main(String[] args) {
		String str="I am at Harman";
		String[] cha= str.split(" ");
		for(String st: cha)
	   {
		  System.out.print(reve(st)+" ");
       }
	}
	
	public static String reve(String s)
	{
		int l=s.length();
		String temp="";
		for(int i=l-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);
		}
		return temp;
	}

}
