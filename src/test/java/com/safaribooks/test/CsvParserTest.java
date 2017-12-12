package com.safaribooks.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

/** 
 * The Safari Java Test part 1 of 2.
 * <p/>
 * Get all the tests in this class to pass. Tests are written in JUnit 4. The build uses Maven; you may introduce
 * new dependencies if you wish to use existing libraries. Check the Maven classpath on the left
 * under "Maven Dependencies" to see what libraries are available to help you right now.
 * 
 * DO NOT CHANGE THE TESTS THAT ARE HERE
 * You may however add any tests that you wish.
 */
public class CsvParserTest {
	
    @Test
    public void testCellValues() throws IOException {
		CsvParser parser = new CsvParser(new File("test.csv"));
		assertEquals("5083604", parser.getCellValue("SAP Customer", 0));
		assertEquals("Appalachian College Association Central Library (ACA)", parser.getCellValue("Name", 20));
		
		// empty rows
		assertEquals("445885", parser.getCellValue("AMS Subscription", 11));
		assertEquals("", parser.getCellValue("AMS Subscription", 12));

		assertEquals("31", parser.getCellValue("Total", 23));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testBadColumn() throws IOException {
		CsvParser parser = new CsvParser(new File("test.csv"));
		parser.getCellValue("Some bad column name", 0);
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void testLowIndex() throws IOException {
		CsvParser parser = new CsvParser(new File("test.csv"));
		parser.getCellValue("SAP Customer", -1);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testIndexTooLarge() throws IOException {
		CsvParser parser = new CsvParser(new File("test.csv"));
		parser.getCellValue("SAP Customer", 24);
	}

}
