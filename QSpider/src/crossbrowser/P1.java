package crossbrowser;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\My Auto\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String s=driver.getTitle();
		Assert.assertTrue(s.contains("Facebook"));
		System.out.println(s);
		System.out.println("Page loaded Successfully");
		
		Select dropdown= new Select(driver.findElement(By.id("day")));
		dropdown.selectByValue("13");
		
		
		String r= dropdown.getFirstSelectedOption().getText();
		System.out.println("Selected option was "+r);		
		driver.quit();
	}

}
