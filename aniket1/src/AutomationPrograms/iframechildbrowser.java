package AutomationPrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframechildbrowser {

	public static void main(String[] args) throws InterruptedException {
   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement menu = driver.findElement(By.xpath("//i[@class='fa fa-caret-down']"));
		menu.click();
		WebElement javascript = driver.findElement(By.xpath("//a[@href='/js/default.asp']"));
		javascript.click();
		WebElement next = driver.findElement(By.xpath("//a[text()='Next ❯']"));
		next.click();
		
		//for 1st window
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itrate = window.iterator();
		String firstwin = itrate.next();
		System.out.println(firstwin);
		driver.switchTo().window(firstwin);
		//2nd tab link
		WebElement tryityourself = driver.findElement(By.xpath("//a[@class='w3-btn']"));
		tryityourself.click();
		//switch 2nd window
		window=driver.getWindowHandles();
		itrate=window.iterator();
		itrate.next();
		String secondwin = itrate.next();
		System.out.println(secondwin);
		driver.switchTo().window(secondwin);
		
	    
		//driver.switchTo().frame("iframeResult");         //swich main to iframe
		   WebElement iframeele = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		    driver.switchTo().frame(iframeele);
					
			  WebElement lighton = driver.findElement(By.xpath("//button[text()='Turn on the light']"));
			   lighton.click();
				Thread.sleep(4000);
				  driver.switchTo().parentFrame();
					
					WebElement theme = driver.findElement(By.xpath("//a[@onclick='retheme()']"));
					  theme.click();
			Thread.sleep(2000);		
		driver.close();
		
		
		
		
		
		
		
	}

}
