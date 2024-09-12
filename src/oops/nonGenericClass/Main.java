package oops.nonGenericClass;

public class Main {
	public static void main(String args[]) {
		Print obj=new Print();
		obj.setValue(1);
		
		Object printValue=obj.getValue();
		
		//here problem is that we don't know data types of printValue this problem will be solved by GenericClass
		if((int)printValue==1) {
			//implementation
		}
	}

}
