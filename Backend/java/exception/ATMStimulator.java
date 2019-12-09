package customexception;

public class ATMStimulator {
void withdraw(double amount) {
	if(amount>40000) {
		throw new DayLimitException("User exceeds day limit of withdraw amount");
	}
}
	
}
