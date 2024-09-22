package javaBasics.com.learning.classes.nestedClasses.nonStaticNestedClass.LocalInnerClass;

/*
	 * These are those classes which are defined in any block like, for loop, while loop block, if condition
	 * block, method etc.
	 * 
	 * it can not be declare as private, protected, public . only default(not defined explicit) access 
	 * modifier is used.
	 * it can be be initiated outside of this block.
	 */

public class OuterCLass {
	
	int instanceVariable=1;
	static int classVariable=2;
	
	public void display() {
		int localVariable=3;
		/*
		 * It can be invoked inside the block only .As soon as scope of block will end its scope will be end
		 */
		class LocalInnerclass{
			int localInnerVariable=4;
			public void print() {
				System.out.println("sum of all variable="+(instanceVariable+classVariable+localVariable+localInnerVariable));
			}
			
		}
		
		LocalInnerclass obj=new LocalInnerclass();
		obj.print();
		
	}

}
