package exceptionpropogation;

public class B {
static void n() {
	try {
		C.m();
	}
	catch(ArithmeticException e){
		System.out.println("B Class: "+ e.getMessage());
		throw e;
	}
}}
