package googleola;

public class Ola {
	GoogleMap g1;

	public Ola(GoogleMap g1) {
		super();
		this.g1 = g1;
	}

	
	void find (String a) {
		try {
			g1.findLocation(a);
		}catch(NullPointerException e) {
		System.out.println("Ola user fill the location Otherwise you will charge $100000 ");	
		}
		
	}
}

