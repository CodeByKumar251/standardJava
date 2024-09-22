package javaBasics.com.learning.classes.nestedClasses.inheriatnceInNestedClass.example1;

public class OuterClass {
	
	/*
	 * one inner class can inherit other inner class in same outer class.
	 */
	int instanceVariable=1;
	static int classVariable=2;
	
	class InnerClass1{
		int innerClass1=3;
	}
	
	class InnerClass2 extends InnerClass1{
		int innerClass2=4;
		
		public void display() {
			System.out.println("total sum="+(instanceVariable+classVariable+innerClass1+innerClass2));
		}
	}

}
