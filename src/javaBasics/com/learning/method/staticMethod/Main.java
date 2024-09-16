package javaBasics.com.learning.method.staticMethod;


public class Main {
	
	/*static method can not be override
	 * override is a dynamic binding means based on the object what instance your object hold whether
	 * child or whether parent  at runtime it decided which method has
	 * to be invoked  whether  of child or parent
	 * But static is compile time because it associated with class  
	 * 
	 * in this example if we will use @override annotation it will provide error
	 * without @override it has hide not override
	 */
	
	public static void main(String args[]) {
		
		Person.profession();
		Doctor.profession();
	}

}
