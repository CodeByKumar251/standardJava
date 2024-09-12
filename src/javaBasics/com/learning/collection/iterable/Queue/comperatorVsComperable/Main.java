package javaBasics.com.learning.collection.iterable.Queue.comperatorVsComperable;

import java.util.Arrays;
public class Main {
	
	public static void main(String args[]) {
		int[] arr= {1,3,2,4};
		Arrays.sort(arr);
		
		for(int ele:arr) {
			System.out.println(ele);
		}
	}

}
