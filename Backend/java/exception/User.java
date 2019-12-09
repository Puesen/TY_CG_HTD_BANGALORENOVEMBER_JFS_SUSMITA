package throwandthrows;

public class User {
	public static void main(String[] args) {
		System.out.println("Main Started");
		IRCTC i1=new IRCTC();
		Paytm p1=new Paytm(i1);
		p1.bookTicket();
		System.out.println("Main Ended");
	}

}
