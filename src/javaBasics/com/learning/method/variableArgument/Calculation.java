package javaBasics.com.learning.method.variableArgument;

public class Calculation {
	
	/*
	 * Variable argument:- 
	 * used when we don't know the number of arguments
	 */
	
	public int sum(int a, int ...variable) {
		int output=0;
		for(int var:variable) {
			output+=var;
		}
		return output;
	}

}
