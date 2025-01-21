package week1.day2;

public class ForLoopTest {

	public static void main(String[] args) {
		// #1 Write a program to print numbers from 1 to 10 using a for loop.

		for (int i = 1; i <=10; i++)
		{
			System.out.println("Iteration:" + i);
		}
		
		System.out.println("REVERSE ORDER");
		// #2 Reverse Order
		
		for(int i=10;i>=1;i--)
		{
			System.out.println("Iteration:" + i);
		}
		
		//Test 3: Sum of Numbers / Write a program to calculate the sum of numbers from 1 to n (e.g., n = 5).
		System.out.println("SUM ");
		
		int n=5;
		int sum=0;
		
		for (int i=1; i<=n;i++)
		{
						
			sum=sum+i;
			
			System.out.println("sum:" + sum);
		}
		
		//Test 4:Write a program to print the multiplication table of 5.
		
		int num=5;
		
		for (int i=1; i<=10;i++)
		{
			System.out.println("Table of 5=" + num*i);
			
		}
		
	//Test 5: Write a program to print all even numbers from 1 to 20.
		
		for (int i=1; i<=20;i++)
		{
			if (i%2==0)
			{
				System.out.println("Even numbers:" + i);	
			}
			
		
		}
		
		
	}
}
	 