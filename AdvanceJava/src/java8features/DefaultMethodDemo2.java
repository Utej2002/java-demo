package java8features;

/**
* Author :Voggu.Reddy
*Date :09-Nov-2024
*Time :11:44:06 am
*Email :Voggu.Reddy@coforge.com
*/

public class DefaultMethodDemo2 {

	public static void main(String[] args) {
		
		Vehicle car=new Car("BMW");
		
		//invoke overridden methods
		
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		
		
		//invoke default methods
		
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());
		
		//Invoke static methods to intrerface
		System.out.println(Vehicle.getHorsePower(2500, 400));

	}

}
