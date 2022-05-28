package casting;

public class PrimitiveCasting {

	public static void main(String[] args) {
       // implicit
		int a=10;
		System.out.println(a);
		double b=a;
		System.out.println(b);
		double db =10.5;
		System.out.println(db);
		int in=(int) db;
		System.out.println(in);
        double db1 = 10.2647973261457896;
        System.out.println(db1);
        float f = (float) db1;
        System.out.println(f);
        
      // implicit casting
        System.out.println("=====implicit casting========"); 
        
        byte i =50;
        short j = i;
        int k = j;
        long l = k;
        float f1 = l;
        double d = f1;
        
        System.out.println("The byte value is "+i);
        System.out.println("The short value is "+j);
        System.out.println("The int value is "+k);
        System.out.println("The long value is "+l);
        System.out.println("The float value is "+f1);
        System.out.println("The double value is "+d);
        
        
        
        
	}

}
