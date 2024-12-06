package genericsdemo;

/**
 * Author :Voggu.Reddy
 *Date :05-Nov-2024
 *Time :11:24:53 am
 *Email :Voggu.Reddy@coforge.com
 */
class Sample<T>{// parametrs class or generics class
	private T data;

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

public class GenericsClassDemo {

	public static void main(String[] args) {
		Sample<String> s1=new Sample<String>("java generics");//objects of grnrrics class of type string

		System.out.println("  display fron generics class by passing string object:"+s1.getData());


		Sample<Integer> s2=new Sample<Integer>(200);

		System.out.println("  display fron generics class by passing integer object:"+s2.getData());

		Sample<Double> s3=new Sample<Double>(555.50);

		System.out.println("  display fron generics class by passing double object:"+s3.getData());

	}

}
