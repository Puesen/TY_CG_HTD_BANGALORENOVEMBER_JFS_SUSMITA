package exceptionpropogation;

public class D {
	static void o() throws ClassNotFoundException
	{
		Class.forName("exceptionpropogation.A");
	}
}
