package testNGBasic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class classAnotation {
	//scenario 2 login and logout perform only onece
	
	@BeforeClass
	public void login() {
		System.out.println("login");
		Reporter.log("login sucessfull");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout");
		Reporter.log("logout sucessfull");
	}
	@Test(priority=1)
	public void homeelement() {
		System.out.println("cheking the homepage");
		Reporter.log("cheking the homepage url");
	}
	@Test(priority=2)
	public void profilechek() {
		System.out.println("cheking the Profilepage");
		Reporter.log("cheking the Prifilepage url");
	}
	@Test(priority=3)
	public void notificationchek() {
		System.out.println("cheking the notification page");
		Reporter.log("cheking the notificationpage url");
	}
}
