package arrayDemo;

public class TwoDarrayDemo {

	public static void main(String[] args) {
	 /* Syntax
	  * datatype arrayname[][]=new datatype[row][column];
	  */
		int student[][]= new int[2][2];
		student[0][0]=(int)31.45;
		student[0][1]=43;
		student[1][0]=54;
		student[1][1]=64;
		
		//For loop
		 for(int i=0;i<student.length;i++){
			for(int j=0;j<student.length;j++){
			System.out.println(" Student is["+i+"]"+"["+j+"]="+student[i][j] );
			}
		}
		
		/*//While loop
		 * 
		 * int i=0;
		while(i<student.length){
			System.out.println("Student is="+student[i]);
			i++;
		}*/
		
		/*//Do while loop
		int i=0;
		do{
			System.out.println("Student is="+student[i]);
			i++;
		}while(i<student.length);
		}*/
	}
}