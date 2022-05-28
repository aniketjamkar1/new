package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistProgram {
	
           public static void main(String[] args) {
        	   
        	   //declaration of Aaraylist
        	   
        	   ArrayList al = new ArrayList();
        	   
        	   ArrayList ed = new ArrayList();
        	   
        	   
        	   
        	   //arraylist accepting heterogeneous data type
        	   
        	   al.add(15);
        	   al.add("ABC");
        	   al.add('b');
        	   al.add(15);
        	   al.add("XYZ");
        	   System.out.println(al);
        	   
        	   //add element basded on existing index
        	   
        	   al.add(2, 'a');
        	   System.out.println(al);
        	   
        	   //set method for replacement
        	   
        	   al.set(2, 'D');
        	   System.out.println(al);
        	   
        	   // to remove the element from respective position
        	   
        	   al.remove(2);
        	   System.out.println(al);
        	   
        	   System.out.println("cheking array is empty "+al.isEmpty());
        	   System.out.println("Checking array is empty "+ed.isEmpty());
        	   
        	   System.out.println("cheking size of array "+al.size());
        	   
        	   System.out.println(" The index of xyz is "+al.indexOf("XYZ"));
        	   
        	   System.out.println("contain method "+al.contains(35));
        	   
        	   System.out.println("to check the index "+al.get(1));
        	   
	           //Reading arraylist following approch
        	   
        	   // 1] regular for loop
        	   
//        	   for(int i=0;i<=al.size();i++) {
//        		   System.out.println(al.get(i));
//        	   }
        	   
        	   // 2] advance for loop
        	   
//        	   for(Object value:al) {
//        		   System.out.println(value);
//        	   }
       	   
        	   //declaring the itrator     this for any class in collection
        	   
 //                   Iterator itr = al.iterator();
                    
//                    while(itr.hasNext()) {
//                    	System.out.println(itr.next());
//                    }
                    
        	   // declaring list itrator     only applicable list itrator
        	   
//        	  ListIterator litr = al.listIterator();
//        	  
//        	  while(litr.hasNext()) {
//        		  System.out.println(litr.next());
//        		  
        	// reverse the arraylist
        		  System.out.println("Reverse the arraylist");
        		  
        		 Collections.reverse(al);
        		 System.out.println(al);
        		 
        		 Iterator itr = al.iterator();
                 
               while(itr.hasNext()) {
               	System.out.println(itr.next());
             }

        		  
        	  }
        	  
                    
        	   
 }

