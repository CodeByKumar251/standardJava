package javaBasics.com.learning.collection.iterable.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
	
	public static void main(String args[]) {
		List<Integer> lst=new ArrayList<>();
		
		//add(int index, ELement e)
		lst.add(0,100);
		lst.add(1,200);
		lst.add(2,300);
		
		//add(int index, collection e)
		List<Integer> lst2=new ArrayList<>();
		lst2.add(0, 400);
		lst2.add(1, 500);
		lst2.add(2, 600);
		
		lst.addAll(2,lst2);
		
		lst.forEach((Integer ele)->System.out.println(ele));
		
		//replaceAll(ninaryOperator op)
		lst.replaceAll((Integer val)->-1*val);
		System.out.println("after replace all");
		lst.forEach((Integer val)->System.out.println(val));
		
		//sort(comperator c)
		lst.sort((Integer val1, Integer val2)->val1-val2);
		System.out.println("after sorting in ascending order");
		lst.forEach((Integer ele)->System.out.println(ele));
		
		//get(int index)
		System.out.println("value present at index 2 is:"+lst.get(2));
		
		//set(int index, Element e)
		lst.set(2, -4000);
		System.out.println("after set method");
		lst.forEach((Integer ele)->System.out.println(ele));
		
		//remove(int index)
		lst.remove(2);
		System.out.println("after remove method");
		lst.forEach((Integer val)->System.out.println(val));
		
		//indexOf(object o)
		System.out.println("index of -200 integer object is:"+lst.indexOf(-200));
		
		//need to provide the index in listIterator, from where it has to start
		ListIterator<Integer> lstIterator=lst.listIterator(lst.size());
		//traversing backword direction
		while(lstIterator.hasPrevious()) {
			int previousVal1=lstIterator.previous();
			System.out.println("traversing backward:"+previousVal1+", nextIndex:"+lstIterator.nextIndex()+", previous index:"+lstIterator.previousIndex());
			if(previousVal1==-100) {
				lstIterator.set(-50);
			}
		}
		
		lst.forEach((Integer val)->System.out.println("after set:"+val));
		
		//traversing forward direction
		ListIterator<Integer> lstIterator2=lst.listIterator();
		while(lstIterator2.hasNext()) {
			int val=lstIterator2.next();
			System.out.println("traversing forward:"+val+", nextIndex:"+lstIterator2.nextIndex()+", previous index:"+lstIterator2.previousIndex());
			if(val==-200) {
				lstIterator2.add(-100);
			}
		}
		
		lst.forEach((Integer val)->System.out.println("after add:"+val));
		
		
		List<Integer> subLst=lst.subList(1, 4);
		subLst.forEach((Integer val)->System.out.println(val));
		
		subLst.add(-900);
		lst.forEach((Integer val)->System.out.println("after value added in sublst:"+val));
		
		
		
		
		
		
	}

}
