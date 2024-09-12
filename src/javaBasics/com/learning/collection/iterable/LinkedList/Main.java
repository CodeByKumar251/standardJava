package javaBasics.com.learning.collection.iterable.LinkedList;
import java.util.LinkedList;
public class Main {
	
	public static void main(String args[]) {
		LinkedList<Integer> lst=new LinkedList<>();
		
		//using deque functionality
		lst.addLast(200);
		lst.addLast(300);
		lst.addLast(400);
		lst.addFirst(100);
		System.out.println(lst.getFirst());
		
		//using list functionality
		LinkedList<Integer> lst2=new LinkedList<>();
		lst2.add(0, 100);
		lst2.add(1, 300);
		lst2.add(2, 400);
		lst2.add(1, 200);
		System.out.println(lst2.get(1)+" and "+lst2.get(2));
	}

}
