package wwek3.day1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Removeduplicates {

	public static void main(String[] args) {
		
		String s = "google";
		char[] charArray1 = s.toCharArray();
	
		Set<Character> rduplicate=new LinkedHashSet<Character>();
		
		System.out.println("Before adding Character is" + rduplicate);
		
		for (int i=0; i<charArray1.length;i++)
		
					{
				rduplicate.add(charArray1[i]);
					}
		
		
		System.out.println(rduplicate);
		
		

	}

}
