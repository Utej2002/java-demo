package exceptionsdemo;

/**
* Author :Voggu.Reddy
*Date :06-Nov-2024
*Time :3:27:10 pm
*Email :Voggu.Reddy@coforge.com
*/

public class ThrowDemo {

	public static void test(int a) {
		if(a==0)
			throw new ArithmeticException("pass non zero value");
		else {
			System.out.println("The value pased to the method:"+a);
		}
		
	}
		public static void main(String[] args) {
			ThrowDemo.test(250);
			ThrowDemo.test(0);
			
		
		
	}

}
