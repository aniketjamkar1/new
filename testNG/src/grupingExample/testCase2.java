package grupingExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testCase2 {
	
	
	@BeforeClass(alwaysRun=true)
	   public void LaunchBrowser() {
		   System.out.println("Browser is open");
	   }
	   @AfterClass(alwaysRun=true)
	   public void CloseBrowser() {
		   System.out.println("Browser is Closed");
	   }
	   @Test(groups="sanity")
	   public void Test4() {
		   System.out.println("Test 4 success");
	   }
	   @Test(groups="functional")
	   public void Test5() {
		   System.out.println("Test 5 success");
	   }
	   @Test(groups= {"functional","regression"})
	   public void Test6() {
		   System.out.println("Test 6 success");
	   }


}
