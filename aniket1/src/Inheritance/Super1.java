package Inheritance;

public class Super1 extends Super {
	
	int a=60;
	static  int b= 10;
	public void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(super.a);
		System.out.println(Super.b);
	}
	    
	    public static void main(String[] args) {
			
	    	Super1 s1 = new Super1();
	    	s1.m1();
	    	
	    	
	    	
		}
	

}
