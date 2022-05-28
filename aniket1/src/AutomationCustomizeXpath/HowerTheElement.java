package AutomationCustomizeXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowerTheElement {
	
	    public static void main(String[] args) {
			
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	    	driver.get("https://www.next.co.uk/");
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']/button")).click();
	    
	    	List<WebElement> allele = driver.findElements(By.xpath("//ul[@class='PrimaryDesktopNavigation']/li"));
	    	for(int i=0;i<=allele.size();i++) {
	    		WebElement link = allele.get(i);
	    		Actions action = new Actions(driver);
	    		action.moveToElement(link);
	    		action.build().perform();
	    		System.out.println(link.getAttribute("data-department")); 
	    		
	    	}
	    	
	    	
	    	
	    	
		}
	

}
