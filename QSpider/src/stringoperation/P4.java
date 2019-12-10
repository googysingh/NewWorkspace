package stringoperation;

public class P4 {

	public static void main(String[] args) {
		String str="aabbbccccaaa";
		StringBuffer cut=count(str);
		System.out.println(cut);
		System.out.println(count("ggggyyynnnkkkkkk"));
	}
	
	public static StringBuffer count(String s)
	{
		StringBuffer pro=new StringBuffer();
		int l=s.length();
		pro.append(s.charAt(0));
		int count=1;
		for(int i=1;i<l;i++)
		{
			if(s.charAt(i-1)==s.charAt(i))
			{
				count++;				
			}
			else
			{
				pro.append(count);
				pro.append(s.charAt(i));
				count=1;
			}
		}	
		pro.append(count);
		return pro;
	}
}
