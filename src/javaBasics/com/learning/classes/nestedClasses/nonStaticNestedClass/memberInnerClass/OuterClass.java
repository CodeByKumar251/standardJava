package javaBasics.com.learning.classes.nestedClasses.nonStaticNestedClass.memberInnerClass;

class OuterClass {
	
	int instanceVariable=10;
	int classVariable=20;
	
	class InnerClass{
		
		public void print() {
			System.out.println("I am inside member Inner class");
		}
	}

}
