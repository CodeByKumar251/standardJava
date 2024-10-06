package javaBasics.com.learning.classes.enumClass.enumWithCustomValue;
/*
 * -each of variable we define in enum class will be applicable for every constant in the class
 * in a way each constant is an object of enum class having defined variables.
 *  -we also need to defined parameterized constructor which will be invoked for every constant
 *  -To define a method for whole class(enum) we need to make it static, otherwise it will be 
 *  applicable for all the constants.
 */
public enum EnumWithCustomValue {
	
	MONDAY(101,"1st Day of the week"),
	TUESDAY(102,"2nd Day of the week"),
	WEDNESDAY(103,"3rd Day of the week"),
	THRUSDAY(104,"4th Day of the week"),
	FRIDAY(105,"5th Day of the week"),
	SATURDAY(106,"6th Day of the week"),
	SUNDAY(107,"7st Day of the week");
	
	private int value;
	private String comment;

	EnumWithCustomValue(int value, String comment) {
		// TODO Auto-generated constructor stub
		this.value=value;
		this.comment=comment;
		}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	public static EnumWithCustomValue getEnumFromValue(int value) {
		for(EnumWithCustomValue enumWithCustomValue:EnumWithCustomValue.values()) {
			if(enumWithCustomValue.value==value) {
				return enumWithCustomValue;
			}
		}
		return null;
	}
	
	

}
