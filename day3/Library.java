package week1.day3;

public class Library {

	public String addbook(String bookTitle) 
	
	{
		
		return(bookTitle);

	}
	
	public void issuebook() {
		
		System.out.println("Book issued successfully");

	}
	
	public static void main(String[] args) {
		
		Library Book1= new Library();
		Book1.addbook("LOTR");
		System.out.println(Book1.addbook("LOTR"));
		Book1.issuebook();
		

	}

}
