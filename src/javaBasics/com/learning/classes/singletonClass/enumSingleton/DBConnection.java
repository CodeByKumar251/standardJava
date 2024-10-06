package javaBasics.com.learning.classes.singletonClass.enumSingleton;

/*
 * enum singleton:-
 * As we know in enum all constructor are private and only one object of enum is created per JVM
 * so, by default enum are singleton only
 */
public enum DBConnection {
	INSTANCE;

}
