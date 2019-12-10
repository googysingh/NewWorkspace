package crossbrowser;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\My Auto\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String s=driver.getTitle();
		Assert.assertTrue(s.contains("Facebook"));
		System.out.println(s);
		System.out.println("Facebook loaded Successfully");
		
		driver.findElement(By.id("email")).sendKeys("googysingh");
				
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Passw0rd123$");		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Facebook']"))));
		String exptitle="Facebook";
		String acttitle=driver.getTitle();
		System.out.println(acttitle);
		if(acttitle.contains(exptitle))
		{
			System.out.println("Logged in Successfully");
		}
		/*wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='pageLoginAnchor']"))));
		driver.findElement(By.xpath("//a[@id='pageLoginAnchor']")).click();
		wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Log out']"))));
		driver.findElement(By.xpath("//*[text()='Log out']")).click();
		Thread.sleep(5000);
		s=driver.getTitle();
		Assert.assertTrue(s.contains("Facebook"));
		System.out.println(s);
		System.out.println("Logged out Successfully");
 		driver.close();*/
	}

}
