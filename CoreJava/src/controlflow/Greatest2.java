package controlflow;

import java.util.Scanner;

public class Greatest2 { 
	public static void main(String[] args) {



		int a,b;

		Scanner sc= new Scanner(System.in);

		a=sc.nextInt();
		b=sc.nextInt();

		if(a>b)
		{
			System.out.println( a+" IS greater");


		}
		else
		{
			System.out.println(b);
		}
		sc.close();

	}
}
