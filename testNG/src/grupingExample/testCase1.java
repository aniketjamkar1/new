package grupingExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testCase1 {
                        
	@BeforeTest(alwaysRun=true)
	public void OpenDB() {
		System.out.println("data base is open");
	}
	@AfterTest(alwaysRun=true)
	public void CloseDB() {
		System.out.println("data base is closed");
	}
   @BeforeClass(alwaysRun=true)
   public void LaunchBrowser() {
	   System.out.println("Browser is open");
   }
   @AfterClass(alwaysRun=true)
   public void CloseBrowser() {
	   System.out.println("Browser is Closed");
   }
   @Test(groups="sanity")
   public void Test1() {
	   System.out.println("Test 1 success");
   }
   @Test(groups="functional")
   public void Test2() {
	   System.out.println("Test 2 success");
   }
   @Test(groups= {"functional","regression"})
   public void Test3() {
	   System.out.println("Test 3 success");
   }



}
