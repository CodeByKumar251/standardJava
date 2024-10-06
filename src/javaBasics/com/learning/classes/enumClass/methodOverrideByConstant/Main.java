package javaBasics.com.learning.classes.enumClass.methodOverrideByConstant;

public class Main {
	
	public static void main(String args[]) {
		
		EnumMethodOverrideByConstant.MONDAY.dummyMethod();
		EnumMethodOverrideByConstant thrusday = EnumMethodOverrideByConstant.THRUSDAY;
		thrusday.dummyMethod();
	}

}
