package week2.day3;

public class APIClient {

	public void sendRequest(String s) {
		System.out.println(s);
	}
	
public void sendRequest(String s,String t, boolean b) {
		
	System.out.println(s + t + b);
	}
	
	
	public static void main(String[] args) {
		
		APIClient  APIparameters = new APIClient();
		
		APIparameters.sendRequest("1st Method with one string args");
		APIparameters.sendRequest("string1" + " " ,"string2" + " ", false);
		
	}

}
