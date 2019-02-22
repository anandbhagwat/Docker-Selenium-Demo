package FuncationTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDockerTest {

  @Test
  public void main() {
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
