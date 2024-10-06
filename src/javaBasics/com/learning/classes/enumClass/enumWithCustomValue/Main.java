package javaBasics.com.learning.classes.enumClass.enumWithCustomValue;

public class Main {
	
	public static void main(String args[]) {
		EnumWithCustomValue enumWithCustomValue=EnumWithCustomValue.getEnumFromValue(107);
		EnumWithCustomValue enumWithCustomValue1=EnumWithCustomValue.TUESDAY;
		System.out.println(enumWithCustomValue.getComment());
		System.out.println(enumWithCustomValue1.getComment());
		System.out.println(EnumWithCustomValue.MONDAY.getValue());
		System.out.println(EnumWithCustomValue.MONDAY.getComment());
	}

}
