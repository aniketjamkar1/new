package Arrays;

public class SingelDimentional {

	public static void main(String[] args) {
		
	    		int a[]=new int[6];
	    		//add values in array
	    		a[0]=10;
	    		a[1]=20;
	    		a[2]=30;
	    		a[3]=40;
	    		a[4]=50;
	    		a[5]=60;
	    		
    		System.out.println("The size of array is "+a.length);
	    		
	    		//how to read single value in array
	    	System.out.println("========singel value======");	
	    		System.out.println(a[3]);
	    		
	    		// how to read all values in array
	    		System.out.println("=====all values in array===");
	             
	    		for(int i=0;i<a.length;i++) {
	    			System.out.println(a[i]);
	    		}	
	    			
	    	System.out.println("=====how to add multiple values in singel line=====");
	    	
	    	int c[]= {100,200,300,400};
	    	for(int i=0;i<=c.length;i++) {
	    		System.out.println(c[i]);
	    	}
	    		
	
	}

}
