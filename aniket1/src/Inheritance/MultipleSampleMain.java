package Inheritance;

public class MultipleSampleMain {
	
	public void m1() {
		System.out.println("This is m1 method from sample 1");
	}
	
	public void m2() {
		System.out.println("This is m2 method from sample 1 ");
	}

	public void m3() {
		System.out.println("This is m3 method from sample 2 ");
	}
	
	public void m4() {
		System.out.println("This is m4 method from sample 2");
	}
	
	public static void main(String[] args) {
		
		MultipleSampleMain sm = new MultipleSampleMain();
		
		sm.m1();
		sm.m2();
		sm.m3();
		sm.m4();
		
	}
}
