package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("#username")).sendKeys("Email");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Pass");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(2000);
		String error=driver.findElement(By.id("error")).getText();
		System.out.println(error);
		//driver.findElement(By.)
		//driver.findElement(By.id("loginbutton")).click();
		driver.close();
	}
	

}
