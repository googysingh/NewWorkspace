package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.fb.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Email address");
		driver.findElement(By.id("pass")).sendKeys("Password");
		//driver.wait(2000);
		driver.findElement(By.linkText("Forgotten account?")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("identify_email")).sendKeys("Test");
		driver.findElement(By.name("did_submit")).click();
		System.out.println(driver.getTitle());
		//driver.findElement(By.)
		//driver.findElement(By.id("loginbutton")).click();
		driver.close();
	}
	

}
