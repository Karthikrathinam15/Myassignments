package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1="stops";
		String text2="potss";
		
		
		
	int len1 = text1.length();
	int len2=text2.length();
	
	System.out.println(len1);
	
	if (len1==len2)
	{
		System.out.println("Length of the two strings are equal");
	}
	else
		System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	
	
	
	char[] charArray1 = text1.toCharArray();
	char[] charArray2 = text2.toCharArray();

	
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
	
	if (charArray1!=charArray2)
			
			{
		System.out.println("The given strings are Anagram");
			}
	
	else 
	{
		System.out.println("The given strings are not an Anagram");
	}

	
	
	}
	
	

}
