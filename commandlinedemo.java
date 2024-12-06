/* program to find sum & average of 3 numbers using command line arguments for input value sat run time */
public class CommandLineDemo
 {
 public static void main(String [] args)
 {
 String name;
 int num1,num2,num3,sum=0;
 float avg;
  // Take input from the user for commandprompt
 name=args[0];
num1=Integer.parseInt(args[1]);
num2=Integer.parseInt(args[2]);
num3= Integer.parseInt(args[3]);
// perform calulations
sum=num1+num2+num3;
avg=(float)sum/3;
System.out.println("The sum of three num is :"+sum);
System.out.println("The average of 3 num is :"+avg);
System.out.println("thank you Mr," +name+ "happy coding!!!");
}
}