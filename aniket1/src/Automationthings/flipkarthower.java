package Automationthings;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkarthower {
	
	  public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\Chrome_100 V\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  System.out.println(driver.getCurrentUrl());
		  
		  WebElement id = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		  id.sendKeys("9579433119");
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mitwa@1321");
		  WebElement button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		  button.click();
		  System.out.println(button.getText());
//     	  //WebElement ac = driver.findElement(By.xpath("//div[text()='My Account']"));
//		  List<WebElement> ac = driver.findElements(By.xpath("//div[contains(@class,\"_2Xfa2_\")]/div"));
//		  
//		 WebElement link = null  ;
//		for(int i=0;i<=ac.size();i++)
//			 link =ac.get(i);
//		Actions action = new Actions(driver);
//		  action.moveToElement(link);
//		  action.build().perform();
//		  
	}

}
