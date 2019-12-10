package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Qaclickacademy {
	static WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Qaclickacademy.checkingbutton();
		Qaclickacademy.allbutton();
		driver.close();

	}

	public static void checkingbutton() {
		WebElement element = driver.findElement(By.id("checkBoxOption1"));
		element.click();
		Assert.assertTrue(element.isSelected());
		System.out.println(element.isSelected());
		element.click();
		Assert.assertFalse(element.isSelected());
		System.out.println(element.isSelected());
	}

	public static void allbutton() {
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}
}
