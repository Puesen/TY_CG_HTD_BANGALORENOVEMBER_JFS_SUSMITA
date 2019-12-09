package customexception;

public class DayLimitException extends RuntimeException {
	
	String msg="Exceeds day limit";


	public DayLimitException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage() {
		return this.msg;
	}

}
