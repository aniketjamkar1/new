package AutomationCustomizeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		
		  WebDriver  driver = new ChromeDriver();
	     driver.get("https://www.makemytrip.com/");
          
	     driver.findElement(By.xpath("//input[@type='text']"));
	     driver.findElement(By.xpath("//span[text()='IN']"));
	     driver.findElement(By.xpath("//div[contains(@class,'interactivewidget']"));
	     driver.findElement(By.xpath("//div[stars-with(@class,'fsw')]"));
	     driver.findElement(By.xpath("//li[@data-cy='menu_Buses'and@class='menu_Buses']"));
}
}