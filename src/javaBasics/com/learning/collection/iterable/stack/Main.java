package javaBasics.com.learning.collection.iterable.stack;

import java.util.Stack;
public class Main {
	
	public static void main(String args[]) {
		Stack<Integer> st=new Stack<>();
		
		st.push(1);
		st.push(2);
		System.out.println(st.pop());
	}

}
