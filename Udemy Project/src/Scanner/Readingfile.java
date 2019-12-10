package Scanner;

import java.io.*;

public class Readingfile {

	public static void main(String[] args) throws Exception{
		File fi=  new File("Gurpreetsingh.txt");
		/*Scanner scan= new Scanner(fi);
		while(scan.hasNext()) {
		String str=scan.nextLine();
		System.out.println(str);
		}
		scan.close();*/
		
		//More efficient way to read
		FileReader fr= new FileReader(fi);
		BufferedReader reader= new BufferedReader(fr);
		String read=reader.readLine();
		while(read!=null) {			
			System.out.println(read);
			read=reader.readLine();
		}
		
		reader.close();
		
        
		
	}
	

}
