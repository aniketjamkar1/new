package abstractConcrat;

public class Demo2 extends Demo1{
	public void test2() {
		
		System.out.println("TEST 2");
	}
			public static void main(String[] args) {
				
				Demo2 d2 = new Demo2();
				
				d2.test();
				d2.test1();
				d2.test2();
			}
}
