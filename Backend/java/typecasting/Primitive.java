package com.tyss.typecasting.pack1;

public class Primitive {
// implicit type casting
	byte b=4;
    short s=b;
	int i=b;
	float f=b;
	double d=b;
	void values() {
		System.out.println("Byte value is "+b);
		System.out.println("Short value is "+s);
		System.out.println("Intiger value is "+i);
		System.out.println("Float value is "+f);
		System.out.println("Double value is "+d);
	
	}
	
	//explicit type casting
	double pi=3.142;
	int j= (int)pi;
	
	void details() {
		System.out.println("Intiger value is "+j);
		
		System.out.println("Double value is "+pi);
	}
}
