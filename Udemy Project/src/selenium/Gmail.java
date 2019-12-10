package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {
	static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
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

		// Spicejet.selectbutton();
		Gmail.login(String.valueOf("googysingh@gmail.com"), String.valueOf("*9828335200#"));
		System.out.println(driver.getTitle());
		String str = driver.findElement(By.cssSelector("div.AO")).getText();
		System.out.println(str);
		driver.close();
	}

	public static void login(String userName, String password) {
		driver.findElement(By.id("identifierId")).sendKeys(userName);
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		WebDriverWait eX = new WebDriverWait(driver, 5);
		eX.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ENTER);

	}

}
