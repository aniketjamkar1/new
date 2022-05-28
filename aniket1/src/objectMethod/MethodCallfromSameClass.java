package objectMethod;

public class MethodCallfromSameClass {
	    
	           public static void test1() {
	        	   System.out.println("This is method one static");
	        	   
	           }
                 public static void test2() {
                	 System.out.println("This is method two static");
               }
                 public void test3() {
                	System.out.println("This is method three non static"); 
               }
                 public void test4() {
                 	System.out.println("This is method four non static"); 
                }
                 	
                 public static void main(String[] args) {
					//to call static method we can use ClassName.methodname();
                	 
                	 MethodCallfromSameClass.test1();
                	 MethodCallfromSameClass.test2();
                	 
                	 //to call non static method we can use object.methodname();  
                	 //to create object classname object =new classname();                	 
                	 MethodCallfromSameClass call=new MethodCallfromSameClass();
                	 call.test3();
                	 call.test4();
				}

                  



}
