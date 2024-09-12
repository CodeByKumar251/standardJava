package oops.GenericClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		Print<Integer> printObj1=new Print<Integer>();
		printObj1.setPrintValue(1);
		Integer printValue=printObj1.getPrintValue();
		if(printValue==1) {
			//implement
			System.out.println(printValue);
		}
	}
}
