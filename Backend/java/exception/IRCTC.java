package throwandthrows;

public class IRCTC {

	void confirmTicket() throws ClassNotFoundException{
		try {
			Class.forName("throwandthrows.Paytm");
			System.out.println("Ticket is Confirmed");
		} catch (ClassNotFoundException e) {
			System.out.println("Ticket is Confirmed");
			throw e;
		
		}
		
	}
}
