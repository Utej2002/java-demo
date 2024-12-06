package oopsdemo1;

/**
* Author :Voggu.Reddy
*Date :26-Oct-2024
*Time :3:37:52 pm
*Email :Voggu.Reddy@coforge.com
*/

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1=new Time(12,45,55);
		Time  t2=new Time(10,30,30);
		
		t1.add(t2);
		t1.display();

	}

}
