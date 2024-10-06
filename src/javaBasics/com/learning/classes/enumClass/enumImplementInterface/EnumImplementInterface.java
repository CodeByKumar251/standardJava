
package javaBasics.com.learning.classes.enumClass.enumImplementInterface;

public enum EnumImplementInterface implements MyInterface{
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THRUSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;

	@Override
	public String toLowerCase() {
		// TODO Auto-generated method stub
		return this.name().toLowerCase();
	}

}
