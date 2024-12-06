package oopsdemo2;

/**
* Author :Voggu.Reddy
*Date :29-Oct-2024
*Time :11:22:17 am
*Email :Voggu.Reddy@coforge.com
*/
class Hyundai extends Car{
	
	public void hyundaiStart() {
		
		Engine heng=new Engine();//// Composition -hyundai class fully dependent on engine
		heng.startEngine();
	}
	
}
class Maruthi extends Car{
	
	public void maruthiStart() {
		
		Engine meng=new Engine();// Composition -maruthi class fully dependent on engine
		meng.startEngine();
	}
	
}
public class CompositionDemo {
	
	public static void main(String[] args) {
		
		Maruthi baleno =new Maruthi();
		
		baleno.setColor("Silver"); //car class methods
		baleno.setMax_speed(180);	//car class methods
		
		System.out.println("*******Maruti Car Details *********");
		System.out.println(baleno.getColor() +" Color");//car class methods
		System.out.println(baleno.getMax_speed()+" Speed");//car class methods
		
		baleno.maruthiStart(); // Maruti class method-- > call ENgine class method
		
		baleno=null;//  baleno object destroyed ,along with engine object
		System.gc();
		baleno.maruthiStart();
		System.out.println(baleno.getColor());
		
	}
	
	

}
