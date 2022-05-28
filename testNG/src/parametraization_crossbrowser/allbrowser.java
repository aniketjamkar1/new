package parametraization_crossbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class allbrowser {
     WebDriver driver; //declared globally
	 @Parameters("browser")
     
	@Test(priority=1)
	public void crossbrowser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium all jar\\Chrome_100 V\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\Desktop\\selenium all jar\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
				
    	}else {
    		System.out.println("wrong browser is selcted");
    	}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Reporter.log("crossbrowser",true);
	    }
		
		@Test(priority=2)
		public void verifycurrenturl() {
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
			Reporter.log("verifycurrenturl",true);
		}
		
		@Test(priority=3)
		public void verifypageTitle() {
			Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");	
			Reporter.log("verifypageTitle");
        }
		
		@Test(priority=4)
		public void username() {
			WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
			Assert.assertTrue(username.isDisplayed());
			username.sendKeys("Aniket");
			Reporter.log("username",true);
		}
		
		@Test(priority=5)
		public void password() {
			WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
			Assert.assertTrue(password.isDisplayed(), "password field is not displayed");
			password.sendKeys("45789632");
			Reporter.log("password",true);
		}
		
		@Test(priority=6)
		public void loginBtn() {
			WebElement loginbtn = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
			Assert.assertTrue(loginbtn.isEnabled(), "login button is not enabeld");
			loginbtn.click();
			Reporter.log("loginbtn",true);
		}
		
		@AfterClass
		public void closebrowser() {
			driver.quit();
		}
}