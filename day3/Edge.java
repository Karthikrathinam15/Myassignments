package week2.day3;

public class Edge extends Browser{

public void takeSnap() {
		
		System.out.println("take snap");
	}
	
public void clearCookies() {
		
		System.out.println("clearing cookies");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Edge ed = new Edge();
		ed.takeSnap();
		ed.closeBrowser();
		ed.navigateBack();
 
	}

}
