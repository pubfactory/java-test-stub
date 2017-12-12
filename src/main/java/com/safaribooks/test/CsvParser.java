package com.safaribooks.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/** 
 * Retrieves values out of a CSV file.
 * Implement the getCellValue() method to make the CsvParserTest to pass.
 */
public class CsvParser {

    /** 
     * Creates the parser with the CSV file to parse.
     * @param file the CSV file to parse
     */
    public CsvParser(File file) throws IOException {
        super();
        // a little something to get you started...
        List<String> lines = FileUtils.readLines(file);
    }

    /** 
     * Returns the value of a specific cell.
     * 
     * DO NOT CHANGE THIS METHOD SIGNATURE
     * 
     * @param columnName the exact name of the column
     * @param rowIndex the 0-based index of the row not including the column header row
     * @return the cell value
     * @throws IllegalArgumentException if columnName does not match a column
     * @throws IndexOutOfBoundsException if rowIndex < 0 or > # of rows - 1
     */
    public String getCellValue(String columnName, int rowIndex) throws IOException {
        return null; // IMPLEMENT ME!
    }

}
