package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class testscenarios  {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
    	
    	File firebug = new File(System.getProperty("user.dir") + "\\resources\\firebug-2.0.18.xpi");
    	File netExport = new File(System.getProperty("user.dir") + "\\resources\\netExport-0.9b3.xpi");
    	FirefoxProfile profile = new FirefoxProfile();
    	profile.addExtension(firebug);
    	profile.addExtension(netExport);
    	
    	//Setting Firebug preferences
    	profile.setPreference("extensions.firebug.currentVersion", "2.0.18");
    	profile.setPreference("extensions.firebug.addonBarOpened", true);
    	profile.setPreference("extensions.firebug.console.enableSites", true);
    	profile.setPreference("extensions.firebug.script.enableSites", true);
    	profile.setPreference(".enableSites", true);
    	profile.setPreference("extensions.firebug.previousPlacement", 1);
    	profile.setPreference("extensions.firebug.allPagesActivation", "on");
    	profile.setPreference("extensions.firebug.onByDefault", true);
    	profile.setPreference("extensions.firebug.defaultPanelName", "net");
    	
    	   	
    	WebDriver driver;
    	cap.setCapability(FirefoxDriver.PROFILE, profile);
    	System.setProperty("webdriver.gecko.driver", "C:\\My Auto\\geckodriver.exe");
    	driver =new FirefoxDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("test!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        
        //WebDriverWait.until(FindElement(By.id("_fZl")));
        //driver.findElement(By.id("_fZl")).click();
        //Close the browser
        driver.close();
    }

	//private static Predicate<WebDriver> FindElement(By id) {
		// TODO Auto-generated method stub
	//	return null;
	//}
}