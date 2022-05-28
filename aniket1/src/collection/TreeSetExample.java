package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
	
		  t.add("one");
		  t.add("two");
		  t.add("three");
		  t.add("four");
		  t.add("five");
		  t.add("six");
		  t.add("seven");
		  
		  System.out.println(t);
		  //add duplicate
		  t.add("two");
		  System.out.println(t);
		  //Gating the first value
		  System.out.println("First vale is "+t.first());
		  System.out.println("Last value is "+t.last());
		  
		  // immediate element
		  String val = "seven";
		  System.out.println("Higher member "+t.higher(val));
		  System.out.println("Lower value is "+t.lower(val));
		  
		  //removing first and last
		  t.pollFirst();
		  System.out.println(t);
		  t.pollLast();
		  System.out.println(t);
		  
		  //itrator
		   Iterator itr = t.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
		   
		   
		  
		  
	}

}
