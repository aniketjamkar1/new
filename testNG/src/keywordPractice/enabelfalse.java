package keywordPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class enabelfalse {

	
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Browser is Launched");
	}
	@AfterMethod
	public void closebrowser() {
		System.out.println("browser is closed");
	}
	@Test(priority=1)
	public void homepage() {
		System.out.println("homepage open is tested");
	}
	@Test(priority=2,invocationCount =5,enabled = false )
	public void profilepagetest() {
		System.out.println("profile page is tested");
	}

	
	
	
	
	
	
	
	
	
}
