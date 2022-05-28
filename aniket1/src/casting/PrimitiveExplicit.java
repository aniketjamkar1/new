package casting;

public class PrimitiveExplicit {

	public static void main(String[] args) {

		//explicit casting
		double d= 75.56;
		float f=(float) d;
		long l = (long) f;
		int in =(int) l;
		short s = (short) in;
		byte b = (byte) s;
		
		System.out.println("The double value is "+d);
		System.out.println("The float value is "+f);
		System.out.println("The long value is "+l);
		System.out.println("The int value is "+in);
		System.out.println("The short value is "+s);
		System.out.println("The byte value is "+b);
		
				
		
		
		
		
		
	}

}
