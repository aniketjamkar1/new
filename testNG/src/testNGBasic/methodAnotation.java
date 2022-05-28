package testNGBasic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class methodAnotation {
	
	//scenario 
	//login==>homepage==>logout
	//login==>profilepage==>logout	
	//login==>notificationpage==>logout
	
	@BeforeMethod 
	public void login() {
		System.out.println("Login Successfully");
		Reporter.log("Login is done successfully");
	}		
	@AfterMethod
	public void logout() {
		System.out.println("Logout Successfully");
		Reporter.log("Logout is done successfully");	
	}
  
	@Test(priority=1)
	public void homepage() {
		System.out.println("Homepage Tested Successfully");
		Reporter.log("Homepage is Tested ");
		}
	@Test(priority=2)
	public void profilepage() {
		System.out.println("Profilepage Tested Successfully");
		Reporter.log("profilepage is tested ");
    	}
	@Test(priority=3)
	public void notificationpage() {
		System.out.println("Notification page Tested Successfully");
		Reporter.log("Notificationpage is tested");
	}
} 
