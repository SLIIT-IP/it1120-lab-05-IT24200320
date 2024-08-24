import java.util.Scanner;

public class IT24200320Lab5Q3
{
	private static final int room_charge_perday = 48000;
	private static final int disc_3_4_days = 10;
	private static final int disc_5_or_more_days = 20;	
	
	public static void main(String[] args)
	{
	
	int start_date,end_date;


	
	Scanner input = new Scanner(System.in);

		System.out.print("Enter Start Date (1-31): ");
		start_date = input.nextInt();

		System.out.print("Enter End Date (1-31): ");
		end_date = input.nextInt();	
			
			
			
				
			if(start_date > 31 || end_date > 31 || start_date < 1 || end_date < 1)
			{
				System.out.print("Error: Days must be between 1 and 31" );
				return;
			}
			
			if (start_date > end_date)
			{
				System.out.println("Error: Start data must be less than End Date");
				return;
			}
			
			
			int no_of_days = end_date - start_date;
			int total_amount = no_of_days * room_charge_perday;
			int discount = 0;

				if (no_of_days >=3 && no_of_days <=4)
				{
				discount = disc_3_4_days;
				}
				else if (no_of_days >= 5)
				{
				discount = disc_5_or_more_days;
				}
			
			double discounted_amount = total_amount - (total_amount * discount /100);	
	
			System.out.println(" ");
			System.out.println("Room charge Per day: " + room_charge_perday + ("/="));
			System.out.println("Number of Days Reserved: " + no_of_days);
			System.out.print("Total Amount to be Paid: " + discounted_amount );



	}
} 