package javaBasics.com.learning.collection.iterable.Vector;
import java.util.Vector;
public class Main {
	
	public static void main(String args[]) {
		Vector<Integer> vec=new Vector<>();
		vec.add(0, 200);
		System.out.println(vec.get(0));
	}

}
