package testNGBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class introduction {
          
//	    @Test
//	    public void openurl() {
//	     System.out.println("url is open" );
//	     Reporter.log("url is open");    
//	    }
//	    @Test
//	    public void login() {
//	    	System.out.println("login is successful");
//	    	Reporter.log("login is sucessfull");
//	    }
//	    
//	    @Test
//	    public void logout() {
//	    	System.out.println("logout is successfull");
//	    	Reporter.log("logout is sucessfull");
//	    }
	    // order of execution is openurl==>login==>logout is required but given login==>logout==>openurl  but out put is depeds on alfabatic order
	    // is required priority
	    
	    @Test (priority=1)
	    public void openurl() {
	     System.out.println("url is open" );
	     Reporter.log("url is open");    
	    }
	    @Test (priority=2)
	    public void login() {
	    	System.out.println("login is successful");
	    	Reporter.log("login is sucessfull");
	    }
	    
	    @Test(priority=3)
	    public void logout() {
	    	System.out.println("logout is successfull");
	    	Reporter.log("logout is sucessfull");
	    }
	 
	    
	    
}
