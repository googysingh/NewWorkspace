import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Firebug {

public static void main(String[] args) {
System.out.println(System.getProperty("user.dir"));File firebug = new File(System.getProperty("user.dir") + "\\resources\\firebug-2.0.18.xpi");
//File netExport = new File(System.getProperty("user.dir") + "\\resources\\netExport-0.9b3.xpi");
FirefoxProfile profile = new FirefoxProfile();
try {
profile.addExtension(firebug);
//profile.addExtension(netExport);
} catch (IOException e) {
e.printStackTrace();
}profile.setPreference("app.update.enabled", false);//Setting Firebug preferences
profile.setPreference("extensions.firebug.currentVersion", "2.0");
profile.setPreference("extensions.firebug.addonBarOpened", true);
profile.setPreference("extensions.firebug.console.enableSites", true);
profile.setPreference("extensions.firebug.script.enableSites", true);
profile.setPreference(".enableSites", true);
profile.setPreference("extensions.firebug.previousPlacement", 1);
profile.setPreference("extensions.firebug.allPagesActivation", "on");
profile.setPreference("extensions.firebug.onByDefault", true);
profile.setPreference("extensions.firebug.defaultPanelName", "net");// Setting netExport preferences
/*profile.setPreference("extensions.firebug.netexport.alwaysEnableAutoExport", true);
profile.setPreference("extensions.firebug.netexport.autoExportToFile", true);
profile.setPreference("extensions.firebug.netexport.Automation", true);
profile.setPreference("extensions.firebug.netexport.showPreview", false);
profile.setPreference("extensions.firebug.netexport.defaultLogDir", "C:\\workspace\\CaptureNetworkTraffic");
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setBrowserName("firefox");*/
capabilities.setPlatform(org.openqa.selenium.Platform.ANY);
capabilities.setCapability(FirefoxDriver.PROFILE, profile);
//WebDriver driver = new FirefoxDriver(capabilities);
WebDriver driver;
System.setProperty("webdriver.gecko.driver", "C:\\My Auto\\geckodriver.exe");
driver =new FirefoxDriver(capabilities);
try {
Thread.sleep(10000);
driver.get("");
Thread.sleep(10000);
} catch(InterruptedException ie) {
ie.printStackTrace();
}
driver.quit();
}
}