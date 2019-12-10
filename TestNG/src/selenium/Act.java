package selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test
public class Act {

	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selfcare.actcorp.in/group/blr/myaccount");
		System.out.println(driver.getTitle());
		//driver.wait(300);
		driver.findElement(By.xpath("//span[contains(text(),'My Usage')]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Object> data= new ArrayList<Object>();
		
		data.add(driver.findElement(By.xpath("//*[text()='Total Upload : ']")).getText());
		data.add(driver.findElement(By.xpath("//*[text()='Total Upload : ']/following-sibling::td[1]")).getText());
		data.add(driver.findElement(By.xpath("//*[text()='Total Upload : ']/following-sibling::td[2]")).getText());
		data.add(driver.findElement(By.xpath("//*[text()='Total Upload : ']/following-sibling::td[3]")).getText());
		data.add(driver.findElement(By.xpath("//*[text()='Total Upload : ']/following-sibling::td[4]")).getText());
		data.add(driver.findElement(By.xpath("//*[text()='Total Upload : ']/following-sibling::td[5]")).getText());
		
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
		driver.close();
	}
	
@BeforeSuite
public void beforesuite() {
	System.out.println("I am before suite");
}
}
