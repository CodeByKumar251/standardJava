 package javaBasics.com.learning.classes.nestedClasses.staticNestedClass;

 class OuterClass {
	int instanceVariable=10;
	static int classVariable=20;
	
	static class NestedClass{
		public void print() {
			System.out.println(classVariable);
		}
		
	}
	
	
	

}
