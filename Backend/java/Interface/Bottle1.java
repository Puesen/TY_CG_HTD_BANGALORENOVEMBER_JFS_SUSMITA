package interfaceConcept;

public interface Bottle1 {

	void open();
	void drink();
    default void juice()
    {
    	System.out.println("really pepsy and fanta are juice");
    }
	static void close() {
		System.out.println("Close the bottle");
	}
}

