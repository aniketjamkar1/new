package assertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertEx {
	 
	 
//	 @Test  // hard assert
//	 public void sample() {
//		 String str1 = "hello";
//		 Assert.assertEquals(str1, "hi");
//		 System.out.println(str1);
//		 
//		 String str2 ="hi";
//		 Assert.assertEquals(str2, "hi");
//		 System.out.println(str2);
//	 }
//	  
//	 @Test 
//	 public void sample2() {
//		System.out.println("Automation"); 
//	 }
	 
	 
	 @Test  // soft assert
	 public void sample3() {
		 SoftAssert soft = new SoftAssert();
		 
		 String str1 ="hello";
		 soft.assertEquals(str1, "hi");
		 System.out.println(str1);
		 
		 String str2 = "hi";
	     soft.assertEquals(str2, "hi");
	     System.out.println(str2);
	     soft.assertAll();
	 }
      
	 @Test
	 public void sample4() {
		 System.out.println("Automation");
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
