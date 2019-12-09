package checkedException;

public class AgeLimitException extends Exception {
	String msg="Age should be more then 18";

	public AgeLimitException() {
		super();
	}

	public AgeLimitException(String msg) {
		super();
		this.msg = msg;
	}
	
 public String getMessage() {
	 return this.msg;
 }
}
