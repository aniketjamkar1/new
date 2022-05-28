package pomPagefactoryEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginPageTest {
	WebDriver driver;
	

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\Chrome_100 V\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void facebookLoginPageTest() {
		
		loginPage lp =new loginPage(driver);
		lp.verifyFacebookLoginPageFbLogo();
		lp.verifyFacebookLoginPageTagline();
		lp.verifyFacebookLoginPageForgotPasswdLink();
		lp.verifyFacebookLoginPageCreatPageLink();
		lp.verifyFacebookLoginPageFooterlinkSize();
		lp.setFacebookLoginPageUsername();
		lp.setFacebookLoginPagePassword();
		lp.clickFacebookLoginPageLoginBtn();
		lp.clickFacebookLoginPageCreateNewAccBtn();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
}
