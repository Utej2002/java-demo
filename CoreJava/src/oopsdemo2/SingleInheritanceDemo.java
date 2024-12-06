package oopsdemo2;

/**
* Author :Voggu.Reddy
*Date :28-Oct-2024
*Time :10:33:16 am
*Email :Voggu.Reddy@coforge.com
*/

public class SingleInheritanceDemo {
	
	public static void main(String[] args) {
		 Developer d1=new Developer(1111,"james gosling", 500, null);
		 Developer d2=new Developer(1115,"GAVIN KING", 500, null);
		 Developer d3=new Developer(11561,"Rod johnson", 500, null);
		 
		 d1.Display(); //invoke base class method
		 d1.dispalyDeveloperDetails();// invoke child class method
		 
		 d2.Display();
		 d2.dispalyDeveloperDetails();
		 
		 d3.Display();
		 d3.dispalyDeveloperDetails();
		 
		 
		 //create parent class object
		 
		 Employee employee1=new Employee(888,"michel john\n.....",3500);
		 Employee employee2=new Employee(777," mary smith",2500);
		 
		 
		 System.out.println(" *****Normal employee details******");
		 employee1.Display();
		 employee2.Display();
		 
		 
	}

	
}
