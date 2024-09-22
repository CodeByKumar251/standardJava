package javaBasics.com.learning.classes.nestedClasses.staticNestedClass;

public class Main {
	/*
	 * nested class can be created with any types of access modifier.
	 * i,e public, private, protected, default, package-protected
	 */
	public static void main(String args[]) {
		
		/*
		 * Since static class can be access directly with the name of class. so, we will need the name of 
		 * outer class rather then object of outer class
		 */
		OuterClass.NestedClass nestedObj=new OuterClass.NestedClass();
		nestedObj.print();
	}

}
