package AutomationCustomizeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		
		  WebDriver  driver = new ChromeDriver();
	
          driver.get("https://www.hdfc.com/");
          
          driver.findElement(By.xpath("//a[@title='APPLY ONLINE']"));
          driver.findElement(By.xpath("//h2[text()='HDFC Home Loan Products']"));
          driver.findElement(By.xpath("//div[contains(@class,'form-group')]"));
          driver.findElement(By.xpath("//a[starts-with(@title,'APPLY ONLINE')]"));
          driver.findElement(By.xpath("//select[@data-drupal-selector='edit-language-options'and@id='edit-language-options']"));
          driver.findElement(By.xpath("//select[@data-drupal-selector='edit-language-options'or@id='edit-language-options']"));
          
        	  
          
          
          
          
          
          
          
          
}
}