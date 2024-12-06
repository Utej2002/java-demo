package logicbuildingassignment;

/**
 * Author :Voggu.Reddy
 *Date :10-Nov-2024
 *Time :7:39:51 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class EmployeeManagement {

	public static void main(String[] args) {

		// Creating a manager with a maximum of 2 developers

		Manager manager = new Manager("Alice", 90000, 2);

		// Creating developer instances

		Developer dev1 = new Developer("Bob", 70000, "Java");
		Developer dev2 = new Developer("Charlie", 75000, "Python");

		// Adding developers to the manager's team

		manager.addDeveloper(dev1);
		manager.addDeveloper(dev2);

		// Printing manager details, including the managed developers

		System.out.println(manager.getDetails());
	}

}
