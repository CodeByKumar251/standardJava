package javaBasics.com.learning.string;

public class Main {
	
	public static void main(String args[]) {
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		
		  // Using identityHashCode to print the hash codes (memory addresses) of the objects
        System.out.println("Memory location of s1: " + System.identityHashCode(s1));
        System.out.println("Memory location of s2: " + System.identityHashCode(s2));
        System.out.println("Memory location of s3: " + System.identityHashCode(s3));

        // Check if s1 and s2 refer to the same object
        System.out.println("s1 == s2: " + (s1 == s2)); // true (same reference in string pool)

        // Check if s1 and s3 refer to the same object
        System.out.println("s1 == s3: " + (s1 == s3)); // false (different reference)

        // Check if the content of s1 and s3 is the same
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (same content)
	}
}
