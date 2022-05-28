package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiths {

	public static void main(String[] args) {
                  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		//impliset
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		WebElement newbutton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//		newbutton.click();
//		
//	//expliset
//      WebDriverWait wait = new WebDriverWait(driver,30);
//     // wait.until(ExpectedCondition.elementToBeClickable(By.xpath("//button[@name='websubmit']")));
           
		
		
		
	}

}
