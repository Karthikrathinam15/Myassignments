package week2.day4;

public class Concrete implements DatabaseConnection {


	@Override
	public void connect() {
		
		System.out.println("Connection Established");
	}

	@Override
	public void disconnect() {
		System.out.println("Connection is disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Updated");
		
	}

	public static void main(String[] args) {
		Concrete concimp = new Concrete();
		concimp.connect();
		concimp.disconnect();
		concimp.executeUpdate();
		

	}

	
	
}
