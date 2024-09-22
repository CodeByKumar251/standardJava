package javaBasics.com.learning.classes.nestedClasses.nonStaticNestedClass.memberInnerClass;

public class Main {
	
	/*
	 * member inner class can be private, public , protected, default
	 */
	
	public static void main(String args[]) {
		
		OuterClass obj=new OuterClass();
		OuterClass.InnerClass obj1= obj.new InnerClass();
		
	}
	
	

}
