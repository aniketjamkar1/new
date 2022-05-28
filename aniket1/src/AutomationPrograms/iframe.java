package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
                              // chose frame(String);
       // driver.switchTo().frame("iframeResult");//change focus main to iframe  [hear iframeResult is by id/name/class but declared in string or you simply go on xpath
     
        //OR XPATH
        
        WebElement iframeelement = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
         driver.switchTo().frame(iframeelement);   //chose frame(webelements)
          
        WebElement clickbutton = driver.findElement(By.xpath("//button[text()='Click Me!']"));//whenever you click the button chek the result==>hello java script on iframe
         clickbutton.click();
      
            driver.switchTo().parentFrame();      //[1]   //swith focus iframe to mainframe/default 
      //    driver.switchTo().defaultContent();   //[2]
  
        WebElement changetheam = driver.findElement(By.xpath("//a[@title='Change Theme']"));
        changetheam.click();
        
        
        
	}

}
