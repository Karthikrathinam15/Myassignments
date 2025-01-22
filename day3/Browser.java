package week1.day3;

public class Browser{
	
	
	public String launchBrowser(String a) {
		
		return(a);
		

	}
	
	private void loadUrl() {
		
		System.out.println("Application url Load successfully");

	}

	public static void main(String[] args) {
	
Browser bNname=new Browser();

   System.out.println(bNname.launchBrowser("Browser Launched successfully"));
   bNname.loadUrl();

	}

}
