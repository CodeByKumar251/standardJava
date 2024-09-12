package javaBasics.com.learning.collection.iterable.Deque;

import java.util.ArrayDeque;

public class Main {
	
	public static void main(String args[]) {
		ArrayDeque<Integer> arrayDQ=new ArrayDeque<>();
		
		//Deque as Queue
		arrayDQ.addLast(1);
		arrayDQ.addLast(2);
		arrayDQ.addLast(3);
		
		int ele=arrayDQ.removeFirst();
		System.out.println("first element:"+ele);
		
		//Deque as STACK(LIFO)
		
		ArrayDeque<Integer> stack=new ArrayDeque<>();
		stack.addFirst(1);
		stack.addFirst(2);
		stack.addFirst(3);
		
		while(!stack.isEmpty()) {
			System.out.println("ele:"+stack.removeFirst());
		}
	}

}
