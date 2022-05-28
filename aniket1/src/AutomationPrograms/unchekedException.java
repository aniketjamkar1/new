package AutomationPrograms;

public class unchekedException {
    
	public static void main(String[] args) {
		
		System.out.println("Enterd into the class");
		System.out.println("Enterd into the main method");
		
		// example 1
//		int a= 50;
//		//System.out.println(a/0);  // Exception in thread "main" java.lang.ArithmeticException: / by zero
//       
//		// how to handel this exception
//		try {
//			System.out.println(a/0);
//		}catch(Exception e) {
//		   e.printStackTrace();
//			System.out.println(a/2);
//		}

		// example 2
//		String s=null;
//        // System.out.println(s.length());  //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
//        
//         try {
//        	 System.out.println(s.length());
//         }catch(Exception e) {
//        	 e.printStackTrace();
//        	 System.out.println(s);
//         }
         
		// example 3
		
//		 String a="1532";
//		 try { 
//		       int i= Integer.parseInt(a);  //Exception in thread "main" java.lang.NumberFormatException: For input string: "aniket"
//                System.out.println(i);
//		 }catch(Exception e) {
//			 e.printStackTrace();
//		 	 }
		 
         //example 4 
         
		 int a[]=new int[5];
		     a[10]=500;
		 
		System.out.println("Exit from the main method");
		System.out.println("Exit from the class");
		
		
	}
}
