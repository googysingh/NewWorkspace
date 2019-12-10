package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebook {

	public static void main(String[] args) throws InterruptedException {
		//Initiate firefox Driver
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\My Auto\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		driver.findElement(By.id("u_0_1")).sendKeys("name");
		driver.findElement(By.id("u_0_3")).sendKeys("last");
		driver.findElement(By.id("u_0_6")).sendKeys("test@test.com");
		driver.findElement(By.id("u_0_d")).sendKeys("Passw0rd123$");
		driver.findElement(By.id("u_0_9")).sendKeys("Passw0rd123$");
		
		org.openqa.selenium.support.ui.Select sel1=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("day")));
		sel1.selectByValue("6");
		
		org.openqa.selenium.support.ui.Select sel2=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("month")));
		sel2.selectByIndex(3);
		
		org.openqa.selenium.support.ui.Select sel3=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("year")));
		sel3.selectByVisibleText("2006");
		
		driver.findElement(By.id("u_0_h")).click();
		
		driver.findElement(By.id("reg_pages_msg")).click();
		driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
		//driver.sleep(3000);
		driver.navigate().back();
		
		driver.quit();
	}

}
