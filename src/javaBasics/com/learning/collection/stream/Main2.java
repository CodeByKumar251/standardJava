package javaBasics.com.learning.collection.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {
	
	public static void main(String args[]) {
		//Different ways to create a stream
		
		//1.0 From Collection
		List<Integer> salaryList=Arrays.asList(3000,3100,4100,9000,1000);
		Stream<Integer> streamFromIntegerList=salaryList.stream();
		
		//2.0 From Array
		Integer salaryList2[]= {3000,3100,4100,9000,1000};
		Stream<Integer> streamFromArray=Arrays.stream(salaryList2);
		
		//3.0 From static method
		Stream<Integer> streamFromSattic=Stream.of(3000,3100,4100,9000,1000);
		
		
		
	}

}
