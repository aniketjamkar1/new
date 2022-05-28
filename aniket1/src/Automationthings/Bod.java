package Automationthings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	     
	    WebElement birthday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	     Select s = new Select(birthday);
	    // s.selectByIndex(24);
           s.selectByValue("25");	     
	       s.selectByVisibleText("25");
	}

}

