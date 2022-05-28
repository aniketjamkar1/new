package AutomationPrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//get window handle => gives id for main page only
		//get window handles => gives is for main page as well as sub(child)page
		
//		String id = driver.getWindowHandle();  //for single tab
//		System.out.println(id);
		
		//for multiple windows
		// itrate==> getrespective window==>switch==>action
		
		Set<String> wind = driver.getWindowHandles();
		Iterator<String> itrate = wind.iterator();
		String firstwindow = itrate.next();  //1st window is parent window
		System.out.println(firstwindow);
		driver.switchTo().window(firstwindow);
		
		driver.findElement(By.xpath("//a[@title='Learn more about Facebook Pay']")).click();
		
		//second will open 2nd id will genrate
		// itrate==>getrespectivewindow==>switch==>action.
		
		wind=driver.getWindowHandles();
		itrate=wind.iterator();
		itrate.next();//1st is parent window
		String secondwindow = itrate.next();  //2nd window
		System.out.println(secondwindow);
		driver.switchTo().window(secondwindow);
		System.out.println("title of second window"+ driver.getTitle());
		
		
		driver.findElement(By.xpath("//a[text()='Facebook Payments Privacy Policy']")).click();
		
		//third will open 3rd id will genrate
		
		wind=driver.getWindowHandles();
		itrate=wind.iterator();
		itrate.next(); // 1st is parent window
		itrate.next();  // 2nd window
		String thirdwindow = itrate.next(); // 3rd window
		System.out.println(thirdwindow);
		driver.switchTo().window(thirdwindow);
		System.out.println("Title of third window"+driver.getTitle());
		
		
	}

}
