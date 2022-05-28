package keywordPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invocationCountwithThreadPoolsize {
	
	@Test(invocationCount=5, threadPoolSize=2)
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\Chrome_100 V\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	     
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	    driver.close();
           
	}
	
	
	
	
	

}
