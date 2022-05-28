package validationEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class flipkartLogin {
	 WebDriver driver;
	 @BeforeClass
	 public void Login() {
	 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\Chrome_100 V\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
		  
		  @Test
		  public void VerifyLogin() {
		  WebElement id = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		  id.sendKeys("9579433119");
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mitwa@1321");
		  WebElement button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		  button.click(); 
		  String actualurl="https://www.flipkart.com/";
		  String expectedurl=driver.getCurrentUrl();
		  
		  Assert.assertEquals(expectedurl, actualurl);
		  Reporter.log(expectedurl,true);
		  }

}