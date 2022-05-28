package com.zerodha.qa.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	 
	public void intializeBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\Chrome_100 V\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}else {
			System.out.println("Wrong Browser Selected");
		}
		driver.get("https://kite.zerodha.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	
}