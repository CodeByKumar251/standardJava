package javaBasics.com.learning.classes.abstractClass;

public class Main {
	
	/*
	 *    abstract class:-
	 *    abstract class have both abstract method and non abstract method
	 *    we can not create an instance of abstract class
	 *    
	 */
	
	public static void main(String args[]) {
		AudiCar obj1=new AudiCar(40, 100);
		
		obj1.pressDualBreakSystem();
		obj1.pressClutch();
		obj1.pressBreak();
		obj1.numberOfWheels();
		
		LuxaryCar obj2=new AudiCar(10, 60);
		Car obj3=new AudiCar(0, 0);
		
		//Wrong always do new concreateClassName()
		//Car obj4=new Car(4);
	}

}
