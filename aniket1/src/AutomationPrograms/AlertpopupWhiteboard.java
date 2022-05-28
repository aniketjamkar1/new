package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertpopupWhiteboard {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/whiteboard.htm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='ancText']/div")).click();
        
		driver.findElement(By.xpath("//a[@title='Clear all']/div")).click();  //when you click then get alertpop
	   Thread.sleep(3600);
		Alert clear = driver.switchTo().alert();
		System.out.println(clear.getText());
		clear.accept();
		//clear.dismiss();
		
		
		
		
		
		
	}

}

