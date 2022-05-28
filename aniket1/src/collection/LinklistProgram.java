package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinklistProgram {
	  public static void main(String[] args) {
		
		 LinkedList ll = new LinkedList();
		 ll.add(13);
		 ll.add("ABC");
		 ll.add('c');
		 ll.add(15);
		 System.out.println(ll);
		 System.out.println("Contain method "+ll.contains('z'));
		  
		 ll.add(1, "PQR");
		 System.out.println(ll);
		 ll.remove("PQR");
		 System.out.println(ll);
		 System.out.println("The sixe is "+ll.size());
		 System.out.println(ll.get(1));
		 
		 //itrate it
		Iterator itr = ll.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());//here o/p is random order itrator
		}	
			// listitrator
	      ListIterator litr = ll.listIterator();
	      
		while(litr.hasNext()) {
			System.out.println(litr.next());// o/p is sequent
		
		// these method not available arraylist and vector
			
			System.out.println("The fist element is "+ll.getFirst());
		   System.out.println("The last element is "+ll.getLast());
		  ll.addFirst("java");
		  ll.addLast("python");
		 System.out.println(ll);
		  ll.removeFirst();
		  ll.removeLast();
		  System.out.println(ll);
		
		}
			
		 
		 
	}
	

}
