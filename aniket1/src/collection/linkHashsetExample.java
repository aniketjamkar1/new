package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkHashsetExample {

	public static void main(String[] args) {
           
		LinkedHashSet l = new LinkedHashSet();
		
		l.add("one");
		l.add(125);
		l.add('A');
		l.add("two");
		l.add(65);
		l.add(77);
		l.add("ccd");
		
		System.out.println(l);
		// add duplicate
		l.add("one");
		l.add(125);
		System.out.println(l);
		
		System.out.println("The size is "+l.size());
		System.out.println("Check the present element "+l.contains(125));
		l.remove(77);
		System.out.println(l);
		System.out.println(l.remove("ccd"));
		System.out.println(l);
		
		//itrator
		  Iterator itr = l.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }

		   
		
		
		
		
		
		
		
	}

}
