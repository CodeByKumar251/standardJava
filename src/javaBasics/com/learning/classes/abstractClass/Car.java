package javaBasics.com.learning.classes.abstractClass;

public abstract class Car {
	
	int milage;
	
	Car(int milage){
		this.milage=milage;
	}
	
	public abstract void pressBreak();  //abstract method
	public abstract void pressClutch(); //abstract method
	
	public int numberOfWheels() {       //non abstract method
		return 4;
	}

}
