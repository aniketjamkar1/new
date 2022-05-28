package anotationExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
	
	//@beforeTest and @afterTest annotation
	
	    @BeforeTest
	    public void openDB() {
	    	System.out.println("DB is opened");
	    }
	    @AfterTest
	    public void closeDB() {
	    	System.out.println("DB is closed");
	    }
	    @Test
	    public void m1() {
	    	System.out.println("This is M1 Method");
	    }
	    @Test
	    public void m2() {
	    	System.out.println("This is M2 Method");
	    }
	    @Test
	    public void m3() {
	    	System.out.println("This is M3 Method");
	    }
	

}
