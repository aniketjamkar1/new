package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
       
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		   //implcitwaits is applicable to all next elements 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		  
		  WebElement craetnew = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")); 
		  craetnew.click();
		  
		 //explicitswaits its applicable for that element only
		  
		  WebDriverWait wait = new WebDriverWait(driver,20);
		    
		  WebElement signupbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='websubmit']")));
		    signupbtn.click();
		  
//		    WebElement sigeup = driver.findElement(By.xpath("//button[@name='websubmit']")); 
//		     sigeup.click();
//		 	
	      
		
        
		
		
		
		
	}

}
