package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement footer=driver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']"));
		System.out.println(driver.getTitle());
			System.out.println("All links in page is "+driver.findElements(By.tagName("a")).size());
			System.out.println("Links present in footer section is "+footer.findElements(By.tagName("a")).size());
			driver.close();


	}

}
