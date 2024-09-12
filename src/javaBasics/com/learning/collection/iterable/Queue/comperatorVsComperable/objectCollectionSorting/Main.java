package javaBasics.com.learning.collection.iterable.Queue.comperatorVsComperable.objectCollectionSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		Car carArray[]=new Car[3];
		carArray[0]=new Car("Sedan", "petrol");
		carArray[1]=new Car("SUV","diesel");
		carArray[2]=new Car("HatchBack","CNG");
		
		//lexographically descending order on the basis of car type
		Arrays.sort(carArray, (Car obj1, Car obj2) ->obj2.carType.compareTo(obj1.carType));
		for(Car car:carArray) {
			System.out.println(car.carName+"........."+car.carType);
		}
		
		//lexographically ascending order on the basis of car type
		Arrays.sort(carArray, (Car obj1, Car obj2) ->obj1.carType.compareTo(obj2.carType));
		for(Car car:carArray) {
			System.out.println(car.carName+"........."+car.carType);
		}
		
		//collection
		List<Car> cars=new ArrayList<>();
		cars.add(new Car("Sedan", "petrol"));
		cars.add(new Car("SUV","diesel"));
		cars.add(new Car("HatchBack","CNG"));
		
		Collections.sort(cars,(Car obj1, Car obj2)-> obj1.carName.compareTo(obj2.carName));
		
		System.out.println("...........");
		cars.forEach( (Car carObj)->System.out.println(carObj.carName+"......."+carObj.carType));
	}

}
