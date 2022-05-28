package AutomationCustomizeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		
		  WebDriver  driver = new ChromeDriver();
		  
		  driver.get("https://amazon.com/");
		  
		 // basic xpath
		  
		 driver.findElement(By.xpath("//input[@type='text']"));
		  
		 //text()
		 
		 driver.findElement(By.xpath("//div[text()='Get to Know Us']"));
		
		//contains()
		
		 driver.findElement(By.xpath("//img[contains(@src,'https://images')]"));
		// starts-with()
	     driver.findElement(By.xpath("//img[starts-with(@src,'https://images')]"));
							
		// logical and
		driver.findElement(By.xpath("//input[@type='email'and@name='email']"));
        
		//logical or
		driver.findElement(By.xpath("//input[@type='email'and@name='email']"));
	}
	
}

