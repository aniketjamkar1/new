package assertionPractice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertEx {
	     
	     String s1 ="Hello";
	     String s2 = "Hi";
	     //assertequals=>actual vs expected if both results are same then testcase will pass otherwise it will fail
	     
	     @Test
	     public void test() {
	    	 Assert.assertEquals(s1, s2);   //false 
	     }
	     //assertNotequals=>actual vs expected if both results are NOT same then testcase will pass otherwise it will fail
	     @Test
	     public void test1() {
	    	 Assert.assertNotEquals(s1, s2);   //true
	     }
	     //assertNull=>actual vs expected if both results are same then testcase will pass otherwise it will fail
         @Test
         public void test3() {
        	 Assert.assertNull(s1);      //false
         }
	     //assertNotNull=>actual vs expected if both results are NOT same then testcase will pass otherwise it will fail
	     @Test
	     public void test4() {
	    	 Assert.assertNotNull(s2); //true
	     }
	     //assert.fail==>This method is used to intentionally fail the test method
	     @Test
	     public void test5() {
	    	 System.out.println("good");
	    	 Assert.fail();
	     }
	     
	     
}
