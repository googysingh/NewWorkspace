package arrayDemo;

public class SingleArrayDemo2 {

	public static void main(String[] args) {
	 /* Syntax
	  * datatype arrayname[]=new datatype[size];
	  */
		int student[]= new int[5];
		student[0]=(int)31.45;
		student[1]=43;
		student[2]=54;
		student[3]=64;
		student[4]=26;

		/*//For loop
		 * 
		 * for(int i=0;i<student.length;i++){
			int j=i+1;
			System.out.println(j+" Student is="+student[i] );
		}*/
		
		/*//While loop
		 * 
		 * int i=0;
		while(i<student.length){
			System.out.println("Student is="+student[i]);
			i++;
		}*/
		
		//Do while loop
		int i=0;
		do{
			System.out.println("Student is="+student[i]);
			i++;
		}while(i<student.length);
		}

}
