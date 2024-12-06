package collectionsdemo;

/**
 * Author :Voggu.Reddy
 *Date :06-Nov-2024
 *Time :12:01:08 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class Students implements Comparable<Students>{

	private int rollno;
	private String name;
	private int age;



	public Students(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
    


	public int getRollno() {
		return rollno;
	}



	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	@Override
	public int compareTo(Students s) {


		if(age==s.age)
			return 0;
		else if(age>s.age)
			return 1;
		else
			return -1;
	}

}
