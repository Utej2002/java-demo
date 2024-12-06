
/**
 * Author :Voggu.Reddy
 *Date :30-Oct-2024
 *Time :9:39:54 am
 *Email :Voggu.Reddy@coforge.com
 */

class MyDemo{

	private static final int MAX_AGE=55; //FINAL VARIABLE

	public void test() {

		/*
		 * MAX_AGE=60;//final variable cannot modified
		 */	}
	/*
	 * public final void test1() {
	 * 
	 * System.out.println("The age is:"+age); }
	 */

}
class myTemp extends MyDemo{

	/*
	 * public void test1() { System.out.println("The age is:"+age); } }
	 */
final class Hello{
	int a,b;

	public Hello(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Hello [a=" + a + ", b=" + b + "]";
	}
	/*class Worls extends Hello{*/
		
	}
	
	
	
}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}