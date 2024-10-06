package javaBasics.com.learning.classes.enumClass.enumWithAbstractMethod;

/*
 * enum can have abstract method which will be implemented by every constant
 */
public enum EnumWithAbstractMethod {

	MONDAY {
		public void dummyMethod() {
			System.out.println("inside monday dummy method");
		}
	},
	WEDNESDAY {
		public void dummyMethod() {
			System.out.println("inside wednesday dummy method");
		}

	},
	FRIDAY {
		public void dummyMethod() {
			System.out.println("inside friday dummy method");
		}
	};

	public abstract void dummyMethod();

}
