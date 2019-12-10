package testpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Class1 {

   @Parameters({ "URL" })
	@Test
	public void secondmethod(String st) {
	System.out.println("Bye");
	System.out.println(st);
}	

@Test	
public void firstmethod() {
	System.out.println("Test");
}



@BeforeTest
public void beforetest() {
	System.out.println("Begining of BeforeClass 1");
}

@AfterTest
public void aftertest() {
	System.out.println("Ending of AfterClass 1");
}

@BeforeMethod
public void beforemethod() {
	System.out.println("Before class 1 method");
}

@AfterMethod

public void aftermethod(){
	System.out.println("After class 1 method");
}

@BeforeClass

public void beforeclass() {
	System.out.println("Before class method");
}
}
