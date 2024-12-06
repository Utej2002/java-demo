package pacakagedemo;

/**
 * Author :Voggu.Reddy
 *Date :04-Nov-2024
 *Time :4:52:10 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class ObjectClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1=new Person("teja", 22);
		Person p2=new Person("teja", 22);
		Person p3=new Person("ajay",23);

		System.out.println("person 1"+p1.toString());
		System.out.println("person 3"+p3);
		System.out.println("person1 equals person 2:"+p1.equals(p2));
		System.out.println("person2 equals person 3:"+p2.equals(p3));
		System.out.println("person1 hash code:"+p1.hashCode());
		System.out.println("person2 hash code:"+p2.hashCode());
		System.out.println("person3 hash code:"+p3.hashCode());
		System.out.println("Class of person1:"+p1.getClass().getName());
	}

}
