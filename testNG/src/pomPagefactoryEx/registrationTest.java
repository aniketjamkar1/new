package pomPagefactoryEx;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class registrationTest {
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
 // static==> verification
	
	@Test
	public void RegistrationPageTest() {
		RegistrationPage rp = new RegistrationPage(driver);
		
		rp.clickFacebookSignupLink();
		rp.verifyFacebookRegistrationPagefbLogo();
		rp.verifyFacebookRegistrationPageAlredyaccLink();
		rp.setFacebookRegistrationPageFirstName();
		rp.setFacebookRegistrationPageLastName();
		rp.setFacebookRegistrationPagemobileEmail();
		rp.setFacebookRegistrationPageNewPassword();
		rp.setFacebookRegistrationPageBirthDay();
		rp.setFacebookRegistrationPageBirthMonth();
		rp.setFacebookRegistrationpageBirthYear();
		rp.setFacebookRegistrationpageGender("male");
		rp.clickFacebookRegistrationpageSignUpBtn();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
