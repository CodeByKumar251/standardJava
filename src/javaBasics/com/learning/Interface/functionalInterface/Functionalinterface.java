package javaBasics.com.learning.Interface.functionalInterface;

/*
 * In functional interface, only one abstract method is allowed but we can have other method
 * like default, static method or Method inherited from the object class
 * 
 * 	 * Different way to implement the Functional interface
	 * 1)Using implements
	 * 2)using anonymous class
	 * 3)using Lambda expression
 */
@FunctionalInterface
public interface Functionalinterface {
	
	 void canfly(String val);
	 
	 default void getHeight() {
		 //implementation
	 }
	 
	 static void canEat() {
		 //my static method implementation
	 }
	 
	 String toString(); //object class method
	

}
