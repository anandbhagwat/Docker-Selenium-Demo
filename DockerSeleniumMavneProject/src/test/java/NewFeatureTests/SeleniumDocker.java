package NewFeatureTests;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumDocker {
	@Test
	public void main() throws MalformedURLException {
		// TODO Auto-generated method stub
		//Browser capabilties
		//DesiredCapabilities dc = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		//dc.setBrowserName("firefox");
		//dc.setPlatform(Platform.LINUX);
		WebDriver driver = new ChromeDriver();
		//Selenium Script
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Selenium Software");

		
		//Print
		System.out.println("Completed");
		
		//driver.close();
	}
}
