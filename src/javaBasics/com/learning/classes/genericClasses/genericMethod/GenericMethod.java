package javaBasics.com.learning.classes.genericClasses.genericMethod;

public class GenericMethod {
	
	/*
	 * generic method:-
	 * Type parameter should be before the return type of method declaration
	 * type parameter scope is limited to method only
	 */
	
	public <k,v> void printValue(Pair<k,v> pair1,Pair<k,v> pair2) {
		if(pair2.get().equals(pair1.get())) {
			//do something
			
		}
	}

}
