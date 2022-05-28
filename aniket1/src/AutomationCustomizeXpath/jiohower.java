package AutomationCustomizeXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jiohower {

	public static void main(String[] args) {
 
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.get("https://www.jiomart.com/");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		  List<WebElement> menu = driver.findElements(By.xpath("//div[@class='explorer-menu']/ul/li/a"));
		   for(int i=0;i<=menu.size();i++) {
			   WebElement link = menu.get(i);
			   Actions action = new Actions(driver);
			   action.moveToElement(link);
			   action.build().perform();
			   System.out.println(link.getAttribute("title"));
		   }
		   
		   
		
	}

}

