package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe" );
         WebDriver driver= new ChromeDriver();
         driver.get("https://www.facebook.com/");
         
         //tag and id
         // tag#id
        WebElement id = driver.findElement(By.cssSelector("input#email"));
        id.sendKeys("aniket@gmail");
        
        WebElement password = driver.findElement(By.cssSelector("input#pass"));
        password.sendKeys("111515151");
       
        //tag and class
        // tag.class
//         driver.findElement(By.cssSelector("div._6ltg")).click();
         
      //tag and attribute
      //tagname[attribute=value]
         driver.findElement(By.cssSelector("button[name=login]")).click();
         
       // tag.class and attribute
       //tagname.class[attribute=value]
         driver.findElement(By.cssSelector("img.fb_logo[alt='Facebook']"));
      
      
      
	}

}
