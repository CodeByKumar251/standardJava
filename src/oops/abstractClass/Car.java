package oops.abstractClass;

public abstract class Car {
	int milage;
	
	Car(int milage){
		this.milage=milage;
		System.out.println("Car constructor");
	}
	
	public abstract void applyBrak();
	public abstract void applyClutch();
	
	public int getSpeed() {
		return 100;
	}

}
