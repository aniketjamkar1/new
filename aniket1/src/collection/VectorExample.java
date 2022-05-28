package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

	   Vector vec = new Vector();
	   
	   vec.add("PQR");
	   vec.add('A');
	   vec.add(3);
	   vec.add("Delhi");
	   vec.add("Pune");
	   vec.add(4585);
	   
	   System.out.println(vec);
	   System.out.println(vec.capacity());
	   
	   vec.set(3, "XYZ");
	   System.out.println(vec);
	   
	   vec.remove(5);
	   System.out.println(vec);
	   
	   System.out.println("Checking the emptyness "+vec.isEmpty());
	   System.out.println("Checking the size of vector "+vec.size());
	   System.out.println("The index of A is "+vec.indexOf('A'));
	   System.out.println("Contains method "+vec.contains(3));
		 System.out.println("to check the index "+vec.get(1));
		
		
		 //Cursors
		   Iterator itr = vec.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
		 
		  ListIterator litr = vec.listIterator();
		  while(litr.hasNext()) {
			  System.out.println(litr.next());
		  }
		    Enumeration en = vec.elements();
		    while(en.hasMoreElements()) {
		    	System.out.println(en.nextElement());
		    }
		    
	}

}
