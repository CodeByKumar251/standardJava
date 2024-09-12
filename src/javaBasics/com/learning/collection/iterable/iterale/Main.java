package javaBasics.com.learning.collection.iterable.iterale;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		List<Integer> values=new ArrayList<>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		
		//using iterator
		System.out.println("iterating the values using iterator method");
		Iterator<Integer> valuesIterator=values.iterator();
		while(valuesIterator.hasNext()) {
			int val=valuesIterator.next();
			System.out.println(val);
			if(val==3) {
				valuesIterator.remove();
			}
		}
		
		//using for-each loop
		System.out.println("iterating using for-each loop");
		for(int ele:values) {
			System.out.println(ele);
		}
		
		//using forEach method
		System.out.println("Iterating using forEach method");
		values.forEach((Integer val)-> System.out.println(val));
		
		
	}

}
