//exception propogation

package googleola;

public class GoogleMap {

	void findLocation(String loc) {
		try {
			System.out.println(loc.length());
		}catch(NullPointerException n) {
			System.out.println("Google map users use your eyes and fill the form");
			throw n;
		}
	}
}
