package javaBasics.com.learning.classes.enumClass;

/*
 * enum class:-
 * It has collection of CONSTANTS(variable which values can not be changed) 
 * Its CONSTANTS are static and final implicitly(we do not have to write it)
 * it can not extend any class , as it internally extends java.lang.Enum class
 * it can implement interfaces
 * it can have variables, constructor, methods.
 * it can not be initiated(as its constructor will be private only, even you give default, in bytecode it 
 * make it private.
 * No other class can extend Enum class
 * it can have abstract method, and all the constant should implement that abstract method.
 * 
 * Internally for any constant we define in enum , a value is assigned starting from 0. So, monday will be 0.
 * tuesday will be 1 and so on, it will happen only if we don't define custom value.
 */
public enum EnumSample {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THRUSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
}
