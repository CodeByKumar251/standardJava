package javaBasics.com.learning.collection.iterable.set;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class Main2 {
	public static void main(String args[]) {
		Set<Integer> set=new LinkedHashSet<>();
		set.add(2);
		set.add(77);
		set.add(82);
		set.add(63);
		set.add(5);
		
		Iterator<Integer> iterable=set.iterator();
		while(iterable.hasNext()) {
			int ele=iterable.next();
			System.out.print(ele+" ");
		}
		
		
	}
}
