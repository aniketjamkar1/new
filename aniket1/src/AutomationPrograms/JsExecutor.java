package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	    Seleniumutil.scrollDownJS(driver, 0,3600);

	    Seleniumutil.scrrollUpJS(driver, 0,200);
	    
	  //  WebElement down = driver.findElement(By.xpath("//a[@id='icp-touch-link-cop']"));
	  //  Seleniumutil.scrollIntoView(driver, down);

		
		WebElement serchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        Seleniumutil.borderbyJS(driver, serchbox);
	     
        String title = Seleniumutil.titleByJS(driver);
	    System.out.println(title);
	    
	    WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
	    Seleniumutil.ClickbyJS(driver, sell);
	
	    Seleniumutil.refreshByJS(driver);
	    
	    Seleniumutil.alertbyJS(driver, "Page is Refresh");
	
	

	
	    

	    
	    
	    
	
	
	
	}
}
