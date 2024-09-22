package javaBasics.com.learning.classes.nestedClasses.inheriatnceInNestedClass.example1;

public class Main {
	
	public static void main(String args[]) {
		
		OuterClass outerClass=new OuterClass();
		OuterClass.InnerClass2 innerClass2=outerClass.new InnerClass2();
		innerClass2.display();
		
	}

}
