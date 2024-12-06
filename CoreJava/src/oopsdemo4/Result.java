package oopsdemo4;

/**
 * Author :Voggu.Reddy
 *Date :30-Oct-2024
 *Time :3:29:35 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class Result extends Candidate implements Exam{

	public Result(String name, int roll_no, int mark1, int mark2) {
		super(name, roll_no, mark1, mark2);
		System.out.println("***********candidate Result**********");
	}

	@Override
	public void percen_cal() {

		int total=(mark1+mark2);
		float percentage=total*100/200;
		System.out.println(" percentage:"+percentage+"%");
	}



}
