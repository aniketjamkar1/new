package polymorphism;

public class MainMethodOverloading {
	
                public static void main(String[] args) {
                	
                	MainMethodOverloading mo = new MainMethodOverloading();  //here not coumpulsion of creat object bcoz this is staic mathod
                	
                    main(20);
                    main(20, 30);
                    main(15, 15.5);
                    mo.main(10, 10, 10);   // non static we create object here
                	
					
				}	
                public static void main(int a) {
                	System.out.println("Singel argumented main method "+a);
		
				}
                public static void main(int a,int b) {
                	System.out.println("Two integer argumented main method "+(a+b));
					
				}
                public static void main(int a,double b) {
                	System.out.println("two integer argumented main method "+(a+b));
					
				}
                
                // Non static method
                
                public void main(int a,int b, int c) {
                	System.out.println("Three integer argumented main method "+(a+b+c));
					
				}
                
                

}
