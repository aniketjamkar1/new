package anotationExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC3 {
	
	//@beforeTest @beforeclass @test @Afterclass @AfterTest
	
	@BeforeTest
	public void openDB() {
		System.out.println("DB is opened");
	}
	@AfterTest
	public void closeDb() {
		System.out.println("DB is closed");
	}
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	@Test
	public void m1(){
		System.out.println("This is M1 method");
	}
	@Test
	public void m2() {
		System.out.println("This is M2 method");
	}
	@Test 
	public void m3() {
		System.out.println("This is M3 method");
	}
		
	

}
