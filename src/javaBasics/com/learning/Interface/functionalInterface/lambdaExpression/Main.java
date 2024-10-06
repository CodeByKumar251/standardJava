package javaBasics.com.learning.Interface.functionalInterface.lambdaExpression;

public class Main {
	/*
	 * Lambda expression:-
	 * (parameter)->
	 */
	
	public static void main(String args[]) {
		//implementation of functional interface using lambda expression
		
		Bird eagleObj=(String value)->{
			System.out.println("Egale Bird implementation");
		};
		
		eagleObj.canFly("Eagle");
	}

}
