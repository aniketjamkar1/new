package StaticKeyword;

public class StaticExample {
	
				static int a=10; //Static
				int b=20;		// nonstatic
				
				public static void m1() {
					System.out.println("This is static method m1");
				}
				
				public void m2() {
					System.out.println("This is non static method m2");
				}
				
				public void m3() {
					System.out.println("===========> this is method m3");
					
					System.out.println(a);
					System.out.println(b);
					m1();
					m2();
				}
						
				public static void main(String[] args) {
					//Rule 1-Static method can access static member directly (without creating object)
					
					System.out.println(a);
					m1();
					
					//Rule 2- static method can access non static members through object only.
					
					StaticExample se=new StaticExample();
					
					System.out.println(se.b);
					se.m2();
					
					//Rule 3-Nonstatic method can access both static and Nonstaic member directly.
					
					StaticExample se1=new StaticExample();
					
					se1.m3();
					
				}
}
