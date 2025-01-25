package week1.day4;

public class RemoveDups {

	public static void main(String[] args) {
		
		String text= "We learn Java basics as part of java sessions in java week1";
		
		char[] charArray1 = text.toCharArray();
		
            System.out.println(charArray1);
          
   String repl = text.replaceAll("java", " ");
   
   System.out.println(repl);
   
		


	}

}
