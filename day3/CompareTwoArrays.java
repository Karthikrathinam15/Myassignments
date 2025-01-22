package week1.day3;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
	
		//To compare two arrays and print matching items 
		
		//Declare An array for {3,2,11,4,6,7};
		
		int[] a= {3,2,11,4,6,7};
		
		int lengthOfArray1 = a.length;
		Arrays.sort(a);
		
		//Declare another array for {1,2,8,4,9,7}
		
		int[] b={1,2,8,4,9,7};
		int lengthOfArray2 = b.length;
		Arrays.sort(b);
		
		
		//Declare for loop iterator from 0 to array length
		
		for (int i=0;i<lengthOfArray1;i++)
		{
			for (int j=0;j<lengthOfArray2;j++)
			{
				if (a[i]==b[j])
				{
					System.out.println("Matching:" + a[i]);
				}
			}
			
			
		}
		
		
		
		

	}

	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
