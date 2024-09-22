package javaBasics.com.learning.classes.superSubClass;

public class Main {
	
	/*
	 * subclass:-
	 * A class that is derived from another class is called subclass(like Employee)
	 * SuperClass:-
	 * From class through which subclass is derived its called super class
	 * In java, in the absence of any other explicit superclass, every class is implicitly a subclass of 
	 * Object class
	 * Object is topmost class in the java, It has some common methods like, clone(), toString(), equals(),
	 * notify(), wait() etc.
	 * 
	 */
	
	public static void main(String args[]) {
		Main obj=new Main();
		
		Object obj1=new Person(0);
		Object obj2=new Employee(1097, "guddu");
	}

}
