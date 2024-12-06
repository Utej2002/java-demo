package oopsdemo3;

/**
* Author :Voggu.Reddy
*Date :29-Oct-2024
*Time :5:05:11 pm
*Email :Voggu.Reddy@coforge.com
*/

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student student1=new Student(101,"Mary");
        Student student2=new Student(102,"King");
        Student student3=new Student(103,"John");
        Student student4=new Student(104,"David");

        System.out.println("************ Student Details ***************");
        student1.display();
        student2.display();
        student3.display();
        student4.display();
   //invoke static method for organization change of all students
        
        Student.organizationChange();
        
        System.out.println(" ********Student details after organization change****");
        student1.display();
        student2.display();
        student3.display();
        student4.display();
	}

}
