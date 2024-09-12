package oops.constructor.chaining;

public class Engineer extends Person {
	String name;
	Engineer(String name,int id){
		super(id);
		this.name=name;
		System.out.println("This is Engineer class");
	}

}
