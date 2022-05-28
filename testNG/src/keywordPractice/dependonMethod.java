package keywordPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependonMethod {
	
	   @Test(priority=1)
	   public void openurl() {
		   System.out.println("url is open");
		   
		   Assert.fail();  //this is use forcefully fail the method 
	   }
	   @Test(priority=2,dependsOnMethods="openurl")
	   public void login() {
		   System.out.println("login successfully");
	   }
	   @Test(priority=3,dependsOnMethods= {"openurl","login"})
	   public void logout() {
		   System.out.println("logout successfully");
	   }
	   

}
