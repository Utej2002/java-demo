/**package oopsdemo3;

import oopsdemo3.Bank.Axis;
import oopsdemo3.Bank.SBI;
import oopsdemo3.Bank.icici;

/**
* Author :Voggu.Reddy
*Date :29-Oct-2024
*Time :2:43:47 pm
*Email :Voggu.Reddy@coforge.com


public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     SBI sbiBank=new SBI("SBI");
		
		Axis axisBank=new Axis("Axis");
		
		icici  IciciBank=new icici("ICICI");
		
		sbiBank.dispaly();
		System.out.println(" \t the interest rate is :"+sbiBank.getRateofInterest()+"%");
			
		}

		
		
		
		

	}

}
**/
