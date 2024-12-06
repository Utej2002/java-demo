package arraydemo;

/**
* Author :Voggu.Reddy
*Date :25-Oct-2024
*Time :12:10:32 pm
*Email :Voggu.Reddy@coforge.com
*/

public class ForEachDemo {

	public static void main(String[] args) {
		
		
int[] marks= {78,45,80,22,60,66,90,35,55,59};
		
		String[] name= {"Jack","Mike","Mary","James","Ron"}; //Declare fixed Array
		
		float[] scores;
		scores=new float[5]; //Array to store scores 
		
		//Initialize Array Elements -Input
		scores[0]=34.45f;
		scores[1]=80.50f;
		scores[2]=55.00f;
		scores[3]=89.00f;
		scores[4]=70.50f;
		
		//for each loop is used for iteraion in arrays in sequential manner
		
		System.out.println("integer array displayed using for each loop: ");
		for(int i:marks)
		{
			System.out.println(i+"\t");
			
		}
		System.out.println(" string array displayed for each loop:");
		
		for(String i:name)
		{
			System.out.println(i+ "\t");
			
		}
		System.out.println();
		
		System.out.println(" float array displayed for each loop:");
		
		for(float s:scores)
		{
			System.out.println(s+"\t ");
		}
		System.out.println();

	}

}
