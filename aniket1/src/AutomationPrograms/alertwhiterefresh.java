package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertwhiterefresh {

	
     public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/whiteboard.htm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='ancText']/div")).click();

		  JavascriptExecutor js=((JavascriptExecutor)driver);
	       js.executeScript("history.go(0);");
	
	       Alert al = driver.switchTo().alert();
	       al.accept();
}
}