package javaBasics.com.learning.classes.enumClass;

public class Main {
	
	/*
	 * common functions which is used for enum
	 * values()
	 * ordinal()
	 * valueOf()
	 * name()
	 */
	public static void main(String args[]) {
		
		//1.usage of Values() and ordinal()
		for(EnumSample sample:EnumSample.values()) {
			System.out.println(sample.ordinal());
		}
		
		//2.usage of valuesOf() and name()
		EnumSample enumVariable=EnumSample.valueOf("FRIDAY");
		System.out.println(enumVariable.name());
	}

}
