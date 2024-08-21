import java.util.Scanner;

public class  IT24200320Lab5Q1 
{

	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter the first integer: ");
	int first_int = input.nextInt();
		
	System.out.print("Enter the second integer: ");
	int second_int = input.nextInt();

	System.out.print("Enter the third integer: ");
	int third_int = input.nextInt();
	
	

	

	System.out.println();
	System.out.println("User entered number are : "+ first_int+ " "+ second_int +" " + third_int );

		if ( first_int<second_int)
		{
		System.out.println("The smallest number is: " + first_int);
		System.out.println("The largest number is: " + second_int);

		}else if (second_int<third_int)
		{
		System.out.println("The smallest number is: " + second_int);
		System.out.println("The largest number is: " + third_int);

		}else
		{
		System.out.println("The smallest number is: " + third_int);
	
		}
		
	
	}

}