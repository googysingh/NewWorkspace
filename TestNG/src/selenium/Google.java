package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			try {
				driver.get("https:www.google.com");
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("sikuli with selenium");
				driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				System.out.println(driver.findElement(By.cssSelector("div#resultStats")).getText());
				String result = driver.findElement(By.xpath("//div[@class='card-section']")).getText();
				System.out.println("-------------------");
				System.out.println(result);
				System.out.println("-------------------");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				driver.close();
			}
		}
	}
}