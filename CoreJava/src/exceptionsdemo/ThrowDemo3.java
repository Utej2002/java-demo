package exceptionsdemo;

/**
 * Author :Voggu.Reddy
 *Date :06-Nov-2024
 *Time :3:37:30 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class ThrowDemo3 {
	// Method to demonstrate throw keyword
	public static void checkAge(int age) {
		if (age < 18) {
			// Throwing an ArithmeticException if age is less than 18
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Testing the checkAge method with different age values
		System.out.println("Testing with age 15:");
		try {
			checkAge(15);  // This will throw an exception
		} catch (ArithmeticException e) {
			System.err.println("Exception caught: " + e.getMessage());
		}
		//Continue flow of execution after exception is caught.
		// if not using exception handling program will terminate at this point
		System.err.println("\nTesting with age 20:");
		try {
			checkAge(20);  // This will not throw an exception
		} catch (ArithmeticException e) {

		}

	}
}
