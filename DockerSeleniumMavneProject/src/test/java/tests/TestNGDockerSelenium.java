package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNGDockerSelenium {
	@SuppressWarnings("null")
	@Parameters({"browser"})
  @Test
  public void testParallel(String browser) throws MalformedURLException {
	  
	  DesiredCapabilities dc = null;
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  dc = DesiredCapabilities.chrome(); 
		 // dc.setBrowserName(browser);
	  
	  }
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  dc = DesiredCapabilities.firefox(); 
		  // dc.setBrowserName(browser);
	  
	  }
	  //dc.setPlatform(Platform.LINUX);
	  WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		
		//Selenium Script
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Selenium Software");

		
		//Print
		System.out.println("Completed");
  }
}
