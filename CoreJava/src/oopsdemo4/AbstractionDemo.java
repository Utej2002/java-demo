package oopsdemo4;

/**
* Author :Voggu.Reddy
*Date :30-Oct-2024
*Time :11:42:19 am
*Email :Voggu.Reddy@coforge.com
*/

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Training t1=new Marks("honey", "hyd", 67, 67.6);
		System.out.println(t1);
		double r=t1.calculateMarks();
		System.out.println(r);

	}

}
