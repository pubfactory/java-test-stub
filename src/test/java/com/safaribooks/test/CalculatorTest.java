package com.safaribooks.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**  
 * Java Test Part 2 of 2.
 * Fill in this test class with some unit tests that prove that the Calculator class provided has
 * bugs in it. For each bug found, add a comment saying what the bug is.
 * Hint: There are at least 3 bugs in the code.
 */
public class CalculatorTest {
	private Calculator calc;
	
	@Before
	public void setup() {
		calc = new Calculator();
	}
	
	/** An example of how to write a test */
	@Test public void testSample() {
		assertTrue(true);
	}
	

}
