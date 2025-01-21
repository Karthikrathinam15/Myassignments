package week1.day2;
import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
	// Write a logic to print the given number Positive or Negative.
		
		/*int n=10;
		
		if (n>0)
		{
			System.out.println("n is positive number" );
			
		}
		else

			System.out.println("n is a negative number");

	}
	*/

	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Entering a number value:");
	int number = scanner.nextInt();
	
	if(number>0)
	{
		System.out.println("The Number is Positive");
	}
	else if (number<0)
	{
		System.out.println("The Number is Negative");
		
	}
	
	else
	{
		System.out.println("The Number is 0");
	}
	
	
		
}
	
}



