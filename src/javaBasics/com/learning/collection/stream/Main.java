package javaBasics.com.learning.collection.stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String args[]){
		List<Integer> salaryList=new ArrayList<>();
		salaryList.add(3000);
		salaryList.add(4100);
		salaryList.add(9000);
		salaryList.add(1000);
		salaryList.add(3500);
		
		int count=0;
		for(int ele:salaryList) {
			if(ele>3000) {
				count++;
			}
		}
		
		System.out.println("total Employee with salary > 3000:"+count);
		
		//do same above things using stream
		long output=salaryList.stream().filter((Integer ele)->ele>3000).count();
		System.out.println("total Employee with salary > 3000:"+output);
		
	}

}
