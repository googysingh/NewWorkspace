package testpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {

@Test	
public void firstmethod() {
	System.out.println("Good TeST");
}

@Test(groups= {"Smoke"})
public void secondmethod() {
	System.out.println("Bad Test");
}

@BeforeTest
public void beforetest() {
	System.out.println("Begining of Class 2");
}

@AfterTest
public void aftertest() {
	System.out.println("Ending of Class 2");
}

@BeforeMethod
public void beforemethod() {
	System.out.println("Before class 2 method");
}

@AfterMethod()

public void aftermethod(){
	System.out.println("After class 2 method");
}

@AfterSuite
public void aftersuite() {
	System.out.println("I am after suite");
}
}
