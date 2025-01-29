package week2.day3;

public class Chrome extends Browser{

	public void openIncognito() {
		
		System.out.println("Open the incognito browser");
	}
	
public void clearCache() {
		
		System.out.println("clearing cache");
	}
	
	
	public static void main(String[] args) {
		
		Chrome cr = new Chrome();
		
		cr.clearCache();
		cr.openIncognito();
		cr.openURL();
		cr.closeBrowser();
		
	}

}
