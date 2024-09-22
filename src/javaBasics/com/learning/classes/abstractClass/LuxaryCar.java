package javaBasics.com.learning.classes.abstractClass;

public abstract class LuxaryCar extends Car {
	
	int maxSpeed;
	
	LuxaryCar(int milage, int maxSpeed) {
		super(milage);
		this.maxSpeed=maxSpeed;
	}

	public abstract void pressDualBreakSystem();
	
	@Override
	public void pressBreak() {
		System.out.println("Implementation of press break system");
		
	}

}
