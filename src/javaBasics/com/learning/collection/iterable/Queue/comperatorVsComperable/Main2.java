package javaBasics.com.learning.collection.iterable.Queue.comperatorVsComperable;

import java.util.Arrays;

public class Main2 {
	
	public static void main(String args[]) {
		Integer[] a= {6,4,1,9,11};
		Arrays.sort(a, (Integer val1, Integer val2)-> val1-val2);
		Arrays.sort(a);
		
		for(int ele:a) {
			System.out.println(ele);
		}
		
		Integer b[]= {1,4,11,9,7};
		//descending order
		Arrays.sort(b, (Integer val1, Integer val2)->val2-val1);
		for(int ele:b) {
			System.out.println(ele);
		}
	}

}
