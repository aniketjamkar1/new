package keywordPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class timeouts {
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Browser is Launched");
	}
	@AfterMethod
	public void closebrowser() {
		System.out.println("browser is closed");
	}
	@Test(priority=1, timeOut = 5000)
	public void homepage() throws InterruptedException {
		
		Thread.sleep(6000);  //for forcely stay long time
		
		System.out.println("homepage open is tested");
	}
	@Test(priority=2,invocationCount =5,enabled = false )
	public void profilepagetest() {
		System.out.println("profile page is tested");
	}

}
