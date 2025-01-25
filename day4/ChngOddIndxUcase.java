package week1.day4;

public class ChngOddIndxUcase {

	public static void main(String[] args) {
		
		String test = "changeme";
        char[] charArray = test.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 != 0) { // Check if the index is odd
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        String result = new String(charArray);
        System.out.println("Modified string: " + result);
	}

	
	}


