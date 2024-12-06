package oopsdemo1;

/**
* Author :Voggu.Reddy
*Date :26-Oct-2024
*Time :11:48:42 am
*Email :Voggu.Reddy@coforge.com
*/
class Lamp
{
	//Stores status of Lamp
		private boolean isOn;
		
		//Default Constructor - 
		//Compiler Creates it for Automatic initialization of Object Properties
		
		//Method to turn On the Lamp
		public void turnOn() {
			isOn=true;
			System.out.println("Light On ? : "+isOn);
		}
		//Method to turn Off the Lamp
			public void turnOff() {
				isOn=false;
				System.out.println("Light On ? : "+isOn);
			}
}
public class LampTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stores status of Lamp
		
		Lamp led = new Lamp();
		Lamp halogen= new Lamp();
		// switch on led & halogen
		
		led.turnOn();
		halogen.turnOn();
		// switch off led and halogen
		led.turnOff();
		halogen.turnOff();
	

	}

}
