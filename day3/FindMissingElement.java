package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int []Input = {1,4,3,2,8,6,7}; 
		Arrays.sort(Input);
		
		
	 int lengthOfArr = Input.length;
	 
	 for (int i=0;i<lengthOfArr;i++)
	 {
		 if (Input[i]!= i+1)
				 {
			
			 System.out.println("Missing number is: " + (i + 1));
             break; 
			 
				 }
	 }
		

	}

}
