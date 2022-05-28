package collection;

import java.util.HashMap;
import java.util.Map;

public class Haashmap {

	public static void main(String[] args) {
        // declare the hashmap 
		   HashMap<Integer, String> hm = new HashMap<Integer,String>();
		   hm.put(101,"ABC");
		   hm.put(102,"PQR");
		   hm.put(103, "LMN");
		   System.out.println(hm);
		// add one more elemnt  - you have next key.
		   // modify
		   hm.put(102, "XYZ");
		   System.out.println(hm);
		 // remove the element
		   hm.remove(102, "XYZ");
		   System.out.println(hm);
		   
		 // read hashmap.
		   for(Map.Entry m:hm.entrySet()) {
			   System.out.println(m.getKey()+" "+m.getValue());
		   }
				  
		   
		   
		   
		
		
		
		
	}

}
