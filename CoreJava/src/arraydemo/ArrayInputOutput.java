package arraydemo;

/**
* Author :Voggu.Reddy
*Date :25-Oct-2024
*Time :11:53:06 am
*Email :Voggu.Reddy@coforge.com
*/

public class ArrayInputOutput {

	public static void main(String[] args) {
		
		//define array reference 'marks' & create array of int to hold 10 values
		
		int[] marks=new int[10];
		 String[] name = {"jack","mike"," mary"," james ", "ron"};
		 
		 float[] scores;
		 
		 scores=new float[5];
		 
		 // intialize array elements input 
		 scores[0]=34.45f;
		 scores[1]=80.45f;
		 scores[2]=60.45f;
		 
		 // intialize array elements using loop
		 
		 for(int i=0; i<marks.length;i++)
		 {
			 marks[i]= i*50;
			 
		 }
		 
		 //output
		 
		 System.out.println(" *********integer array contents*********");
		 
		 for(int i=0; i<marks.length;i++)
		 {
			 System.out.println(marks[i]+"\t");
		 }
		 System.out.println();
		 
		//Iterate in nonLinear
			System.out.println("*********Integer Array Contents in Even Index ************");
			for (int i = 0; i < marks.length; i=i+2) {
				System.out.print(marks[i]+"\t");
			}
			System.out.println();
		 
		 

	}

}
