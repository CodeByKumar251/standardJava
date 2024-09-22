package javaBasics.com.learning.classes.nestedClasses.staticNestedClass.privateNested;

public  class OuterClass {
	
	int instanceVariale=10;
	static int classVariable=20;
	
	private static class NestedClass{
		
		public void print() {
			System.out.println("Inside print");
		}
	}
	
	public void display() {
		NestedClass obj=new NestedClass();
		obj.print();
	}

}
