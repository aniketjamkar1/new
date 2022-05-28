package Inheritance;

public class SingelLevel {
	
	public static void main(String[] args) {
		
	// on parent reference you can call only parent class method/variables
		
		Parent P = new Parent();
		P.m1();
		
	// on child class reference	you can call parent as well as child method/variables
		Child C=new Child();
		C.m1();
		C.m2();
	}

}
