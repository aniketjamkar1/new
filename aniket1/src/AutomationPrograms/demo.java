package AutomationPrograms;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
        driver.manage().window().maximize();	
        
        Dimension d=new Dimension(230, 110);
		driver.manage().window().setSize(d);
	    
	       Point p = new Point(145,555);
	       driver.manage().window().setPosition(p);
	    
	}
	

}
