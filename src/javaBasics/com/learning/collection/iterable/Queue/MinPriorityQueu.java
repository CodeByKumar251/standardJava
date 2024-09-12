package javaBasics.com.learning.collection.iterable.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinPriorityQueu {
	
	public static void main(String args[]) {
		//min priority queue used to solve the problem for min heap
		PriorityQueue<Integer> minPQ=new PriorityQueue<Integer>();
		Queue<Integer> minPQ2=new PriorityQueue<>();
		minPQ.add(5);
		minPQ.add(2);
		minPQ.add(8);
		minPQ.add(1);
		
		//print at level order traversal
		minPQ.forEach((Integer val)->System.out.println(val));
		
		//remove top element from PQ and print
		while(!minPQ.isEmpty()) {
			int val=minPQ.poll();
			System.out.println("remove form top: "+val);
		}
	}
}
