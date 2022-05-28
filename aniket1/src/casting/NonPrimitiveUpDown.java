package casting;

public class NonPrimitiveUpDown {

		public static void main(String[] args) {
	          // father class reference
			
//			  Father f = new Father();
//			   f.home();
//			   f.money();
//			   f.car();
//			  System.out.println("============"); 
//			  // child
//		       Son s = new Son();
//		       s.bike();
//		       s.car();
//		       s.home();
//	       s.money();
//		            
		       System.out.println("====up casting====");
		       
		         Father f= new Son();
		         f.home();
		         f.car();
		         f.money();
			  
			  
			  System.out.println("====down cast===="); 
	// when we perform down casting show compiler error		  
			  Son s = (Son) new Father();
			  
			  s.home();
			  s.bike();
			  s.money();
			  s.car();
			  
		}	
	}


