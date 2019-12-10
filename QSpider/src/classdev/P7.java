package classdev;

public class P7 {
int id;
String name;
String grade;
int noa;
		public static void main (String[] args){
			System.out.println("Main Started");
			P7 s1=new P7();
			P7 s2=new P7();
			s1.id=100;
			s1.name="Gurpreet";
			s1.grade="A+";
			s1.noa=21;
			s2.id=101;
			s2.name="Singh";
			s2.grade="A";
			s2.noa=22;
			s1.study();
			System.out.println("__________");
			s1.attendance();
			System.out.println("####################");
			s2.study();
			System.out.println("__________");
			s2.attendance();
			System.out.println("Main Ended");
	}
		void study()
		{
			System.out.println("Name is="+name);
			System.out.println("Id is="+id);
			System.out.println("Grade is="+grade);
		}
		void attendance()
		{
			System.out.println("Name is="+name);
			System.out.println("Id is="+id);
			System.out.println("Number of attendance is="+noa);	
		}
}
