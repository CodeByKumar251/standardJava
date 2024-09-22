package javaBasics.com.learning.classes.nestedClasses.inheriatnceInNestedClass.example3;

public class Main extends OuterClass.InnerClass{
	
	/*
	 * as we know, when child class constructor invoked, it first invoked the constructor of parent
	 * here parent is inner class, so it can be only accessed by the object of outer class.
	 */
	Main(){
		new OuterClass().super();
	}
	
	public void display1() {
		display();
	}

}
