package javaBasics.com.learning.classes.immutableClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		List<Object> petNames=new ArrayList<Object>();
		
		petNames.add("SJ");
		petNames.add("PJ");
		
		MyImmutableClass obj= new MyImmutableClass("myName", petNames);
		obj.getPetNameList().add("hello");
		System.out.println(obj.getPetNameList());
	}

}
