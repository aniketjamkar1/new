package conditionalStatement;

public class IfelseStatment {

	public static void main(String[] args) {
		
		System.out.println("=======even odd program=====");
		
		int num=12345;
		 if(num%2==0) {
			 System.out.println("The number is even ");
		 }else {
			 System.out.println("The number is odd ");
		 }
			
	System.out.println("======largest of two number=======");
	
	int a=30;
	int b=60;
	  
	 if(a>b) {
		 System.out.println("a is largest number ");
	 }else {
		 System.out.println("b is largest number ");
	 }
	 
	   System.out.println("=====Positive Negative Zero========");
	   
	   int c=10;
	   
	   if(c>0) {
		   System.out.println("positive");
	   }else if(c<0) {
		   System.out.println("Negative");
	   }else {
		   System.out.println("Zero");
	   }
	
	
	System.out.println("=======String comparision=========");
	
	   String language="JAVA";
	   
	    if(language=="JAVA") {
	    	System.out.println(" its easy language");
	    }else {
	    	System.out.println(" its difficult language");
	    	
	    }
	    
	    
	    System.out.println("=======User Validation==========");
	     
	    int age=15;
	    
	    if (age>=18) {
	    	System.out.println("User can open facebook account");
	    }else {
	    	System.out.println("SORRY you cannot open facebook account");
	    }
	
	
	}

}
