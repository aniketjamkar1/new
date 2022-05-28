package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntrger {
	
	public static void main(String[] args) {
		
	  ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(13);
		number.add(105);
		number.add(45);
		number.add(29);
		number.add(355);
		number.add(3165);
		number.add(265);
		
		System.out.println(number);
		
		Collections.sort(number);
		System.out.println(number);
		
		Collections.sort(number, Collections.reverseOrder());
		System.out.println(number);
		
	}

}
