package dockerselenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDocker {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//Browser capabilties
		DesiredCapabilities dc = new DesiredCapabilities();
		//System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.LINUX);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		
		//Selenium Script
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Selenium Software");

		
		//Print
		System.out.println("Completed");
		
		//driver.close();
	}
}
