package controlflow;

/**
* Author :Voggu.Reddy
*Date :25-Oct-2024
*Time :9:47:51 am
*Email :Voggu.Reddy@coforge.com
*/
/*
 * program to demonstrate break and continue statements
 */

public class JumpDemo {
	
	public static void main(String[] args) {
		
		
	for (int i = 1; i <=11; i++) {
		if(i==5) break;
		
			System.out.println(i);
			
		}
		
		System.out.println("*********continue ststement************");
		
		for(int i=1;i<=10;i++)
		{
			if(i>4 && i<9) continue;
			
			System.out.println(i);
		}
		  
	}

}
