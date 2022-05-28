package AutomationPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotAdv {
	
	     public static WebDriver driver ;
	     
	     
	public static void getscreenshot() throws IOException {
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  Date d=new Date();
	  System.out.println(d);
	  
	 String filename = d.toString().replace(" ", "_").replace(":", "_")+".png";
	  
		File detination = new File("C:\\Users\\Dell\\Desktop\\screenshot\\facebook"+filename);
		FileUtils.copyFile(src, detination);
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getscreenshot();
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		//driver.manage().timeouts().
		driver.findElement(By.xpath("//button[@name='websubmit']"));
		getscreenshot();
		
		
		
		
		
		
		
		
		
	}
	
	

}
