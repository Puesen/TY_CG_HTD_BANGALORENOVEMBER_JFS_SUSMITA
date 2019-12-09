package com.capgimini.junit.junit5planet;

import static org.junit.jupiter.api.Assertions.*;

import javax.crypto.AEADBadTagException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {
	Calculator c=null;
	@BeforeEach
	void createObject(){
		c=new Calculator();
	}
@Test
	public void test() {
		int i=c.add(10, 5);
	assertEquals(15,i);
	}

@Test
void testAddForNegative() {
	int i=c.add(10, -5);
	assertEquals(5, i);
}

@Test
public void testMultiply() {
	int i=c.multiply(10, 5);
assertEquals(50,i);
}
@Test
public void testSubtract() {
	int i=c.subtract(10, 5);
assertEquals(5,i);
}

@Test void testFindLength() {
	int res=c.findLength("priya");
	assertEquals(5, res);
}
@Test void testFindLengthForNull() {
	assertThrows(NullPointerException.class,
			()->{
				c.findLength(null);
			}
			);
}

@Test
public void testMultiplyNegative() {
	int i=c.multiply(-10, 5);
assertEquals(-50,i);
}

@Test
public void testDivision() {
	int i=c.division(10, 5);
assertEquals(2,i);
}
@Test
public void testDivForArithmeticException() {
	
	assertThrows(ArithmeticException.class,
			()->{
			c.division(10, 0);	
			});

}

}
