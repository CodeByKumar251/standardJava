package javaBasics.com.learning.collection.iterable.Queue;

import java.util.PriorityQueue;

public class MaxPriorityQueue {
	
	public static void main(String args[]) {
		PriorityQueue<Integer> maxPQ=new PriorityQueue<Integer>((Integer a, Integer b) ->b-a);
		maxPQ.add(5);
		maxPQ.add(2);
		maxPQ.add(8);
		maxPQ.add(1);
		
		//print value at order level
		maxPQ.forEach((Integer val) ->System.out.println(val));
		
		//remove top element from maxPQ and print
		while(!maxPQ.isEmpty()) {
			int val=maxPQ.poll();
			System.out.println("remove from top:"+val);
		}
	}

}
