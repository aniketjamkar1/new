package polymorphism;

public class TestMain {

	public static void main(String[] args) {
		
		Test t = new Test();
	    Test1 t1 = new Test1();
	    Test tt = new Test1();  //up casting object
			
		// calling non static
	    System.out.println("===non static====");
	    t.m1();
	    t1.m1();
	    tt.m1();   //casting aproch
	    
	    // calling static method
	    System.out.println("======static method=====");
	    
	    t.m2();
	    t1.m2();
	    tt.m2();// chek the output  i,e method hiding
	    
		

	}

}
