package javaBasics.com.learning.collection.iterable.set;

import java.util.Set;
import java.util.HashSet;

public class Main {
	
	public static void main(String args[]) {
		Set<Integer> set1=new HashSet<>();
		set1.add(12);
		set1.add(11);
		set1.add(33);
		set1.add(4);
		
		Set<Integer> set2=new HashSet<>();
		set2.add(11);
		set2.add(9);
		set2.add(88);
		set2.add(10);
		set2.add(5);
		set2.add(2);
		
		//union of 2 set
		set1.addAll(set2);
		System.out.println("after union");
		set1.forEach((Integer val)->System.out.print(val+" "));
		
		//Intersection of two set
		set1=new HashSet<>();
		set1.add(12);
		set1.add(11);
		set1.add(33);
		set1.add(4);
		
		set2=new HashSet<>();
		set2.add(11);
		set2.add(9);
		set2.add(88);
		set2.add(10);
		set2.add(5);
		set2.add(2);
		
		set2.retainAll(set1);
		System.out.println();
		System.out.println("after intersection");
		set2.forEach((Integer val)->System.out.print(val+" "));
		
//		Difference of two set
		set1=new HashSet<>();
		set1.add(12);
		set1.add(11);
		set1.add(33);
		set1.add(4);
		
		set2=new HashSet<>();
		set2.add(11);
		set2.add(9);
		set2.add(88);
		set2.add(10);
		set2.add(5);
		set2.add(2);
		
		set1.removeAll(set2);
		System.out.println();
		System.out.println("after difference");
		set1.forEach((Integer val)->System.out.print(val+" "));
		
		
		
		
		
	}

}
