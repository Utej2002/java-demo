package controlflow;

/**
* Author :Voggu.Reddy
*Date :25-Oct-2024
*Time :10:04:46 am
*Email :Voggu.Reddy@coforge.com
*/

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		//outerloop
		
		for(int i= 1; i<=5;i++)
		{
			//nestedloop /Inner loop
			
			for(int j=1;j<=5;j++)
			{
				System.out.print("*" +"\t");
			}
			System.out.println();
		}
		System.out.println("...............................................");
        
		//outerloop
		for(int i= 1; i<=5;i++)
		{
			//nestedloop /Inner loop
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" +"\t");
			}
			System.out.println();
		}
		System.out.println("...............................................");
		
		
		for(int i= 1; i<=5;i++)
		{
			//nestedloop /Inner loop
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j +"\t");
			}
			System.out.println();
		}
		System.out.println("...............................................");


	}



	}


