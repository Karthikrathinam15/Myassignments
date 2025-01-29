package week2.day3;

public class Safari extends Browser {

public void readerMode() {
		
		System.out.println("reader mode");
	}
	
public void fullScreenMode() {
		
		System.out.println("full screen");
	}

	
	
	
	public static void main(String[] args) {
		Safari sf=new Safari();
		sf.navigateBack();
		sf.fullScreenMode();
		sf.openURL();

	}

}
