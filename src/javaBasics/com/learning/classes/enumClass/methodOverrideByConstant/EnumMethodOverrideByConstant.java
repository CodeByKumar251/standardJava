package javaBasics.com.learning.classes.enumClass.methodOverrideByConstant;

/*
 * -since dummy method is not static, it is applicable for all constants
 * -we can override the method for a particular constant.
 */
public enum EnumMethodOverrideByConstant {
	MONDAY{
		@Override
		public void dummyMethod() {
			System.out.println("Monday Dummy method");
		}
	},
	TUESDAY,
	WEDNESDAY,
	THRUSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	public void dummyMethod() {
		System.out.println("Default dummy method");
	}

}
