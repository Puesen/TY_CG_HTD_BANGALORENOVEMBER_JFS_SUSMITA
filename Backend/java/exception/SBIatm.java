package customexception;

public class SBIatm {
	public static void main(String[] args) {

		System.out.println("Main Started");
		
		ATMStimulator a1= new ATMStimulator();
		try {
		a1.withdraw(40001);
		}catch(DayLimitException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Main Ended");
	}

}
