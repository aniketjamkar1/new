package constructor;

public class DemoMain {

	public static void main(String[] args) {
				
		Demo d=new Demo();
		d.test();
		
		Demo d1=new Demo(125,"8th jan batch");
		d1.test();
		
		Demo d2=new Demo("abced",78);
		d2.test();
		
		
		
	}

}
