package amazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EW1 {

	public static void main(String[] args) {
  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amzon.com/");
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9730561136");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
	}

}
