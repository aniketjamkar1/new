package AutomationCustomizeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bajaj {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		
		  WebDriver  driver = new ChromeDriver();
          driver.get("https://www.bajaj.com/");
          driver.findElement(By.xpath("//link[@rel='dns-perfetch')]"));
          driver.findElement(By.xpath("//a[text()='DIY Reactive TV Lights']"));
          driver.findElement(By.xpath("//a[contains(@rel,'bookmark']"));
          driver.findElement(By.xpath("//a[stars-with(@rel,'book']"));
          driver.findElement(By.xpath("//iframe[@scrolling='no'or@frameborder='no']"));
          

}
}