package oops.abstractClass;

public class BMW extends LuxaryCar{

	BMW(int milage) {
		super(milage);
		System.out.println("BMW class constructor");
	}

	@Override
	public int getCarPrice() {
		// TODO Auto-generated method stub
		System.out.println("Here Price of car will return");
		return 0;
	}


	@Override
	public void applyClutch() {
		// TODO Auto-generated method stub
		System.out.println("Here apply clutch will implemented");
		
	}

}
