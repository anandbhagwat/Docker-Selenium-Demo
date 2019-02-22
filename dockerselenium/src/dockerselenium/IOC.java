package dockerselenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IOC {
  @Test
  public void PortalModuleOrder() {
	 
	  DesiredCapabilities dc = new DesiredCapabilities();
	  System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://qualysguard.p01.eng.sjc01.qualys.com");
	  driver.findElement(By.name("UserLogin")).sendKeys("quays_pp6");
	  driver.findElement(By.name("UserPasswd")).sendKeys("abc12345");
	  driver.findElement(By.name("_form_action1")).click();
	 // WebDriverWait wait = new WebDriverWait(driver,10);
	  WebDriverWait wait = new WebDriverWait(driver,40);
	  WebElement welcomeMessage;
	  welcomeMessage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Welcome to QualysGuard Express ']")));
	  
	 // WebElement ModulePickerisHidden;
	  //ModulePickerisHidden= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='position: absolute; z-index: 20002; visibility: hidden; left: -10000px; top: -10000px;']")));
	  //=============================VM=====================================================
	  driver.findElement(By.xpath("//button[@aria-label='Opens Module Picker']")).click();
	  WebElement ModulePickerisVisible;
	  ModulePickerisVisible= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ext-comp-1004' and @style='position: absolute; z-index: 20002; visibility: visible; left: 28px; top: 78px;']")));
	  
	  List<WebElement> NumberOfmodules = driver.findElements(By.xpath("//div[@class='qx-module-name']"));
	  //String ActualVMModules ;
	  
	  List<String> ActualVMModules = new ArrayList<String>();
	  
	  //for(int IndexActualVMModules=0;IndexActualVMModules<=NumberOfmodules.size();IndexActualVMModules++)
	  System.out.println("VM Modules: ");
	  for (WebElement NumberOfmodulesNames : NumberOfmodules) {
		System.out.println("VM Modules: \n"+NumberOfmodulesNames.getText());
		ActualVMModules.add(NumberOfmodulesNames.getText());
		//System.out.println(ActualVMModules);
	}
	  
	  System.out.println("*************Array list*********"+"\n" +ActualVMModules);
	  
	  System.out.println("**********SIZE***********"+ActualVMModules.size());
	  
	  System.out.println("=====================================================END OF VM=========================");
	  
	  
	  
	  
	  
	  
	  
//	  System.out.println("=====================================================START OF ASSETVIEW=========================");
//	  driver.findElement(By.xpath("//button[@aria-label='Opens Module Picker']")).click();
//	  
//	  //String ActualVMModules ;
//	  
//	  //Clicking AssetView
//	  
//	  driver.findElement(By.xpath("//div[@class='qx-module-name' and text()='Cloud Agent']")).click();
//	  //driver.findElement(By.xpath("//button[text()='AssetView']")).click();
//	  WebElement AssetViewMainButton;
//	  AssetViewMainButton= wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//button[text()='Cloud Agent']"))));
//	  
//	  driver.findElement(By.xpath("//button[text()='Cloud Agent']")).click();
//	  //driver.findElement(By.xpath("//button[text()='AssetView']")).click();
//	  //driver.findElement(By.xpath("//button[text()='AssetView']")).click();
//	  WebElement AssetViewModulePickerisVisible;
//	  AssetViewModulePickerisVisible= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ext-comp-1022' and @style='position: absolute; z-index: 20002; visibility: visible; left: 58px; top: 76px;']")));
//	  
//	  List<WebElement> AssetViewNumberOfmodules = driver.findElements(By.xpath("//div[@class='qx-module-name']"));
//	  
//	  List<String> AssetViewActualVMModules = new ArrayList<String>();
//	  
//	  //for(int IndexActualVMModules=0;IndexActualVMModules<=NumberOfmodules.size();IndexActualVMModules++)
//	  System.out.println("AssetView Modules: ");
//	  for (WebElement AssetViewNumberOfmodulesNames : AssetViewNumberOfmodules) {
//		System.out.println(AssetViewNumberOfmodulesNames.getText());
//		AssetViewActualVMModules.add(AssetViewNumberOfmodulesNames.getText());
//		//System.out.println(ActualVMModules);
//	}
//	  
//	  System.out.println("*************Array list*********"+"\n" +AssetViewActualVMModules);
//	  
//	  System.out.println("**********SIZE***********"+AssetViewActualVMModules.size());
//	  
//	  
//  }
	
		
	
	  
	  //button[@aria-label='Opens Module Picker']
	  
	//div[@id='ext-comp-1004' and @style='position: absolute; z-index: 20002; visibility: hidden; left: -10000px; top: -10000px;']
	  
	//div[@id='ext-comp-1004' and @style='position: absolute; z-index: 20002; visibility: visible; left: 28px; top: 78px;']
	
	//div[@class='qx-module-name']
	  
	  //WebElement ElementPresent;
	  //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[text()='Welcome to QualysGuard Express ']")));
	  /*List<WebElement> NumberOfmodules = driver.findElements(By.xpath("//div[@class='qx-module-name']"));
	  //String ActualVMModules ;
	  
	  List<String> ActualVMModules = new ArrayList<String>();
	  
	  for(int IndexActualVMModules=0;IndexActualVMModules<=NumberOfmodules.size();IndexActualVMModules++)
	  for (WebElement NumberOfmodulesNames : NumberOfmodules) {
		System.out.println(NumberOfmodulesNames.getText());
		ActualVMModules[IndexActualVMModules]=NumberOfmodulesNames.getText();
		System.out.println(ActualVMModules[IndexActualVMModules]);
	}
  }*/
	  
	  
  } 
}
