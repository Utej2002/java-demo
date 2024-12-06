package oopsdemo1;

/**
* Author :Voggu.Reddy
*Date :26-Oct-2024
*Time :4:48:43 pm
*Email :Voggu.Reddy@coforge.com
*/
/*
 * object class is a parent class of all java class
 */

class Test{
public class DestructorDemo {
	
	public static void main(String[] args) {
		//invoke default constructor
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		Test t4=new Test();
		
		//Deallocate memory -object destroyed explicitly
		
		t1=null;
		t2=null;
		t3=null;
		
		System.gc();//Invoke service method gc(),wich in turn involves finalize method
		
	}

}
}
