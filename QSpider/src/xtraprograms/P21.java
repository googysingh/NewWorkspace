package xtraprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P21 {
	
	WebDriver driver;
	
	@Test(priority=1, description="Starting Application")
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\My Auto\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		String currentURL= driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("facebook"));
		System.out.println(driver.getCurrentUrl());
	}
	 
	/*@Test(priority=2,dependsOnMethods="startapp")
	public void applogin()
	{
		driver.findElement(By.id("email")).sendKeys("googysingh");
		driver.findElement(By.id("pass")).sendKeys("Passw0rd123$");
		driver.findElement(By.id("u_0_r")).click();
		String ele= driver.findElement(By.id("userNavigationLabe")).toString();
		Assert.assertTrue(ele.contains("userNavigationLablel"));
		System.out.println(driver.getCurrentUrl());
	}*/
	
	@Test(priority=2, description= "Closing app and browser")
	public void applogout()
	{
		
		driver.quit();
		System.out.println("Browser Closed Succesfully");
	}
}

 