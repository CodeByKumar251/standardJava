package javaBasics.com.learning.classes.abstractClass;

public class AudiCar extends LuxaryCar{

	AudiCar(int milage, int maxSpeed) {
		super(milage, maxSpeed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pressDualBreakSystem() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of pressDualBreakSystem");
		
	}

	@Override
	public void pressClutch() {
		// TODO Auto-generated method stub
		System.out.println("Implemetation of pressClutch");
		
	}

}
