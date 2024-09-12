package oops.abstractClass;

public abstract class LuxaryCar extends Car {

	LuxaryCar(int milage) {
		super(milage);
		System.out.println("LuxaryCar Constructor");
	}
	
	public abstract int getCarPrice();
	
	@Override
	public void applyBrak() {
		System.out.println("Implemenation of apply Break.");
	}
	
	

}
