package grupingExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testCase3 {

	
	@BeforeClass(alwaysRun=true)
	   public void LaunchBrowser() {
		   System.out.println("Browser is open");
	   }
	   @AfterClass(alwaysRun=true)
	   public void CloseBrowser() {
		   System.out.println("Browser is Closed");
	   }
	   @Test(groups="sanity")
	   public void Test7() {
		   System.out.println("Test 7 success");
	   }
	   @Test(groups="functional")
	   public void Test8() {
		   System.out.println("Test 8 success");
	   }
	   @Test(groups={"functional","regression"})
	   public void Test9() {
		   System.out.println("Test 9 success");
	   }

	
	
	
}
