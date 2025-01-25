package week1.day4;

public class reverseOddString {

	public static void main(String[] args) {
	
		String test = "I am a software tester";
		
		StringBuilder sb = new StringBuilder(test);
		
		String reverse = sb.reverse().toString();
		
		System.out.println(reverse);
		
		for (int i=0;i<=test.length()-1;i++)
		{
			if (i%2!=0)
			{
				System.out.println("Odd reverse:" + test.charAt(i));
			}
		}
		
		
	}

}
