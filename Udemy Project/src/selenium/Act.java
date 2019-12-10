package selenium;

import java.io.*;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act {
	public static File fi;
	
	{
		fi=new File("Dataused.txt");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selfcare.actcorp.in/group/blr/myaccount");
		System.out.println(driver.getTitle());
		// driver.wait(300);
		driver.findElement(By.xpath("//span[contains(text(),'My Usage')]")).click();
		Thread.sleep(4000);
		ArrayList<Object> data = new ArrayList<Object>();

		data.add(driver.findElement(By.xpath("//*[text()='Total Upload : ']")).getText());
		data.add(driver.findElement(By.xpath("//*[text()='Total Upload : ']/following-sibling::td[1]")).getText());
		data.add(driver.findElement(By.xpath("//*[text()='Total Upload : ']/following-sibling::td[2]")).getText());
		data.add(driver.findElement(By.xpath("//*[text()='Total Upload : ']/following-sibling::td[3]")).getText());
		data.add(driver.findElement(By.xpath("//*[text()='Total Upload : ']/following-sibling::td[4]")).getText());
		data.add(driver.findElement(By.xpath("//*[text()='Total Upload : ']/following-sibling::td[5]")).getText());

		for (int i = 0; i < data.size(); i++) {
			writefile((String) data.get(i));
		}
		driver.close();
		readfile();
	}

	public static void writefile(String st) throws IOException {
		FileWriter wr= new FileWriter(fi);
		BufferedWriter writer= new BufferedWriter(wr);
		try {
			writer.write(st);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void readfile() throws IOException {
		FileReader fr= new FileReader(fi);
		BufferedReader reader= new BufferedReader(fr);
		String read=reader.readLine();
		while(read!=null) {
			System.out.println(read);
			read=reader.readLine();
		}
		
	}
}
