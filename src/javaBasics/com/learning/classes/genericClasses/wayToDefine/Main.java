package javaBasics.com.learning.classes.genericClasses.wayToDefine;

public class Main {
	
	public static void main(String args[]) {
		
		Print<Integer> printObj1=new Print<Integer>();
		
		printObj1.setPrintValue(1);
		Integer printvalue=printObj1.getPrintValue();
		printObj1.setName("guddu");
		String name=printObj1.getName();
		
		System.out.println("printvalue="+printvalue+" ,name="+printObj1.getName());
		
	}

}
