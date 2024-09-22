package javaBasics.com.learning.classes.genericClasses.definition;

public class Main {
	/*
	 * Since object is parent of every class , we used it here . Now, here value can be of any type 
	 * i,e string, integer etc, . The only issue is that we will have to typecast it as per our use
	 */
	
	public static void main(String args[]) {
		
		Print obj=new Print();
		obj.setValue(1);
		Object ele=obj.getValue();
		
		if((int)ele==1) {
			//logic
		}
	}

}
