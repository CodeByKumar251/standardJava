package javaBasics.com.learning.method.variableArgument;

public class Main {
	
	public static void main(String args[]) {
		Calculation cal=new Calculation();
		
		System.out.println(cal.sum(2));
		System.out.println(cal.sum(2,3,1,4,5));
		System.out.println(cal.sum(2,1,2,3,4,5,6,7,8));
	}

}
