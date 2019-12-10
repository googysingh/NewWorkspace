package testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class3 {

@Test(dataProvider="getdata")
public void dataprocessing(Object s1,Object s2) {
	System.out.println(s1);
	System.out.println(s2);
}



@DataProvider
public Object[][] getdata() {
	Object[][] data=new Object[3][2];
	data[0][0]="Firstusername";
	data[0][1]="Firstpassword";
	
	data[1][0]="Secondtusername";
	data[1][1]="Secondpassword";
	
	data[2][0]="Thirdusername";
	data[2][1]="Thirdpassword";
	return data;
	
}

}
