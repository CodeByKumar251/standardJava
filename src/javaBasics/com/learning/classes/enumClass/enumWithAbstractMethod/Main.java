package javaBasics.com.learning.classes.enumClass.enumWithAbstractMethod;

public class Main {
	
	public static void main(String args[]) {
		EnumWithAbstractMethod enumWithAbstractMethod=EnumWithAbstractMethod.MONDAY;
		enumWithAbstractMethod.dummyMethod();
		EnumWithAbstractMethod.FRIDAY.dummyMethod();
	}
}
