package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitialisation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		
		// ChromeDriver driver = new ChromeDriver();
		 
	       WebDriver driver = new ChromeDriver();   // for comparability
		
		 driver.get("https://www.google.com/");
		// driver.get("https://www.facebook.com/");
//		 Thread.sleep(7000);
//		driver.findElement(By.className("gLFyf gsfi")).sendKeys("facebook");
//		Thread.sleep(6000);
//		driver.findElement(By.linkText("search")).click();
//    
//		 WebElement wb = driver.findElement(By.name("q"));
//		 wb.sendKeys("facebook");
//		 Thread.sleep(6000);
//		 wb.submit();
//		 ((WebDriver) wb).close();
//		 
		
		 WebElement wb = driver.findElement(By.name("q"));
		 wb.sendKeys("amazon");
		 ((WebElement) driver.findElements(By.className("nav-search-field"))).click();
		 
		 Thread.sleep(6000);
		 wb.submit();
		 ((WebDriver) wb).close();
		
		
		
		
		
		

	}

}
