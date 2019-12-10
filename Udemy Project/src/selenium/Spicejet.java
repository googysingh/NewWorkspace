package selenium;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {
	static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		// Spicejet.selectbutton();
		Spicejet.dynamicdropdown();
		Spicejet.advancebutton();
		Spicejet.search();
		Spicejet.price();
		driver.close();
	}

	public static void dynamicdropdown() throws InterruptedException {
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[@value='KNU'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='KNU']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='18'])[1]")).click();
		Thread.sleep(2000);

	}

	public static void advancebutton() throws InterruptedException {
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

	public static void selectbutton() throws InterruptedException {
		driver.findElement(By.linkText("Hotels")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//span[contains(text(),'Hotels']")).click();
		// Dimension
		// len=driver.findElement(By.xpath("//select[@id='ddl_Adult_MST']")).getSize();
		Select set = new Select(driver.findElement(By.xpath("//select[@id='ddl_Adult_MST']")));
		ArrayList<WebElement> list = new ArrayList<WebElement>(set.getOptions());
		for (WebElement i : list) {
			System.out.println(i.getText());
		}
		for (int i = 1; i < 9; i++) {
			set.selectByIndex(i);
			Thread.sleep(1000);
		}
	}

	public static void search() {
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
	}

	public static void price() throws InterruptedException {
		Thread.sleep(5000);
		String price = driver.findElement(By.id("spanamnt")).getText();
		System.out.println(price);
	}
}
