package java8features;

/**
* Author :Voggu.Reddy
*Date :08-Nov-2024
*Time :12:24:40 pm
*Email :Voggu.Reddy@coforge.com
*/

public class LambdaDemo1 {

	public static void main(String[] args) {
		
		
		NumericTest isEven=(n) ->(n%2==0);
		NumericTest isNegative=(n) ->(n<0);
		NumericTest isPositive=(n) ->(n>0);
		
		
		System.out.println("7 is even number:"+isEven.computeTest(7));
		System.out.println("-55 is negative number:"+isNegative.computeTest(-55));
	System.out.println("66 is a positive number:"+isPositive.computeTest(66));
       //boolean a=(n)-> (n%2==0); //error-lambda expression should be stored in instance of FI

	}

}
