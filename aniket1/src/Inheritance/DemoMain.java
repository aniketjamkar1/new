package Inheritance;

public class DemoMain implements Demo,Demo1{
	
	public void m1() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		DemoMain dm =new DemoMain();
		dm.m1();
	}
	
	

}
