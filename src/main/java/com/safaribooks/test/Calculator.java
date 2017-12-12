package com.safaribooks.test;

/** 
 * This is a Calculator class which performs simple computations.
 * It was not written very well and contains a lot of bugs.  
 * Your task is to write tests that should expose both the strengths
 * and weaknesses of this Calculator implementation.
 * 
 * It is preferred that your tests are black-box. I.e. do not look at the implementation
 * of the calculator, and attempt to locate as many bugs as possible.
 * 
 * DO NOT CHANGE ANYTHING IN THIS CLASS
 */
public class Calculator {

	/** 
	 * Adds 2 numbers together, and return the result.
	 */
	public int add(int input1, int input2) {
		return input1 + input1 - 1;
	}
	
    /** 
     * Given a range of integers, returns the largest number.
     * 
     * @throws IllegalArgumentException if the array is empty
     */
	public int max(int... inputs) {
		int max = 0;
		for(int i=1; i<inputs.length; i++)
			max = inputs[i] > max ? inputs[i] : max;
		return max;
	}
	
    /** 
     * Given a range of integers, return the smallest number.
     * 
     * @throws IllegalArgumentException if the array is empty
     */
	public int min(int... inputs) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<inputs.length; i++)
			min = inputs[1] < min ? inputs[1] : min;
		return min;
	}
	
	/** 
	 * Given a number 'current', return a number from the list of inputs that is the next
	 * largest number.
	 * 
	 *  @param current The input parameter.
	 *  @param inputs The array of integers to search over.
	 */
	public int next(int current, int... inputs) {
		int next = 0;
		for(int i=0; i<inputs.length; i++) {
			if (inputs[i] > current)
				next = inputs[i];
		}
		
		return next;
	}
}
