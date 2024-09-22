package javaBasics.com.learning.classes.genericClasses.inheritanceInGeneric.moreThenOneGeneric;

public class Main {
	
	public static void main(String args[]) {
		 Pair<String, Integer> map=new Pair<String, Integer>();
		 
		 map.put("guddu", 1);
		 System.out.println(map.get("guddu"));
	}

}
