import java.util.Scanner;

public class IT24200320Lab5Q1{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int num1 = input.nextInt();

		System.out.print("Enter the second integer: ");
		int num2 = input.nextInt();

		if (num1 != num2)
		{
			System.out.print("Enter the third integer: ");
			int num3 = input.nextInt();

			if ( (num1 != num3) && (num2 != num3) )

			{
				System.out.println();
				System.out.println("User entered number are : " +num1+" " +num2+ " "+num3);
				
				int small = Math.min(num1,Math.min(num2,num3));
				int large = Math.max(num1,Math.max(num2,num3));

				System.out.println("The Smallest number is: "+small);
				System.out.println("The Largest number is: "+large);

			}
			else
			{
				System.out.println("This number you entered before ");
			}
		}
		else
		{
			System.out.println("This number you entered before ");
		}
	}
}