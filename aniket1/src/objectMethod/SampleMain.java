package objectMethod;

public class SampleMain {

	public static void main(String[] args) {
	 Sample.m1();       //calling static method
	 Sample.m2();
	
	 Sample sam=new Sample();
	 
	 sam.m3();
	 sam.m4();

	System.out.println("==============================");	
		
		Sample.m1();
		Sample.m2();
		
		Sample sam2=new Sample();

		sam2.m3();
		sam2.m4();
		
	}

}
