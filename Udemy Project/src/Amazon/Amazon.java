package Amazon;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		//Searching Apple
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple",Keys.ENTER);
		ArrayList<WebElement> list= new ArrayList<>();
		list.addAll(driver.findElements(By.cssSelector("span.a-price-whole")));
		for(WebElement el:list) {
		System.out.println(el.getText());
		}
		driver.close();

	}

}
