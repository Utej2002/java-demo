package oopsdemo3;

import java.security.PublicKey;

/**
* Author :Voggu.Reddy
*Date :29-Oct-2024
*Time :4:52:11 pm
*Email :Voggu.Reddy@coforge.com
*/
//static method .demo
public class MathUtil {

	
		
	public static int square(int num) {
		
		return num*num;
		
		
	}
	public static  int Myaddition(int a,int b) {
		return a+b;
	

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=MathUtil.square(5);
		System.out.println(" The square of 5 is:"+result);
		
		System.out.println(" The add of 2 no's :"+MathUtil.Myaddition(25,65));
}
}
