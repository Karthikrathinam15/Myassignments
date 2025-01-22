package week1.day3;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		
		int LengthOfArrays = num.length;
		
		System.out.println(LengthOfArrays);
		Arrays.sort(num);
		
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		
		
		for (int i=0;i<LengthOfArrays-1;i++)
		{
			if ( num[i]==num[i+1])
					{
				System.out.println("The duplication number" + num[i]);
					}
		}
		
		
		
	}

}
