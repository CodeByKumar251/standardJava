package javaBasics.com.learning.collection.iterable.set;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Main3 {
	public static void main(String args[]) {
		Set<Integer> set=new TreeSet<>();
		set.add(45);
		set.add(2);
		set.add(77);
		
		Iterator<Integer> iterable=set.iterator();
		while(iterable.hasNext()) {
			int ele=iterable.next();
			System.out.print(ele+" ");
		}
		
	}
}
