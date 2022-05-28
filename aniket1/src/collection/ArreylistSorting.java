package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArreylistSorting {

	public static void main(String[] args) {

		 // sorting the String.
	  ArrayList<String> cars = new ArrayList<String>();
		  ArrayList<String> car = new ArrayList<String>();
		cars.add("BMW");
		cars.add("volksvagon");
		cars.add("audi");
		cars.add("Skoda");
		cars.add("Tata");
		cars.add("Mahindra");
		
		System.out.println(cars);
		//sort ascending order         here data type is mix upper+lowercase priority is upperclass the lowerclass
		Collections.sort(cars);
		System.out.println("Acending order "+cars);
		//sort descending order
		Collections.sort(cars, Collections.reverseOrder());
		System.out.println("Revers order "+cars);
		
		car.add("bmw");
		car.add("volksvagon");
		car.add("audi");
		car.add("skoda");
		car.add("tata");
		car.add("mahindra");
		
		System.out.println("original order"+car);
		
		Collections.sort(car);
		System.out.println("Acending order "+car);
		
		Collections.sort(car, Collections.reverseOrder());
		System.out.println("Decending order "+car);
		
		
		
		
		
		
	}

}
