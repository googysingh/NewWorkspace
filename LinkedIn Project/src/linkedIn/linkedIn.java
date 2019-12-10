package linkedIn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class linkedIn {
	static WebDriver driver;

	@BeforeTest
	public void driverinit() {
		System.out.println("====== Initializing Selenium driver ======");
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void login() {
		driver.get("https://in.linkedin.com/");
		driver.findElement(By.xpath("//a[@class='nav__button-secondary']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Username", Keys.TAB);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password", Keys.ENTER);
		String error = driver.findElement(By.xpath("//div[@id='error-for-username']")).getText();
		System.out.println(error);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Username@gmail.com", Keys.TAB);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password", Keys.ENTER);
		error = driver.findElement(By.xpath("//div[@id='error-for-username']")).getText();
		System.out.println(error);
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
