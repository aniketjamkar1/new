package AutomationCustomizeXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import AutomationPrograms.Seleniumutil;

public class Resizabel {
	
	             public static void main(String[] args) throws InterruptedException {
					
	            	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
	            	 WebDriver driver= new ChromeDriver();
	            	 driver.get("https://jqueryui.com/resizable/");
	            	 driver.manage().window().maximize();
	            	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            	// Seleniumutil.scrollDownJS(driver, 0, 330);
	                  WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	            	  driver.switchTo().frame(frame);
	            	  
	            	 WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	            	 Thread.sleep(2300);
				     Actions acti = new Actions(driver);
				     acti.dragAndDropBy(resize, 160, 60).build().perform();
	             }

}
