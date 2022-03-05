package org.jfree.data;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

/*
 * class that contains the constraint methods and fucntionality for the range
 */
public class ConstraintRangeTest {
	private Range exampleRange;
	
	// Before setup, our range is from -5.0 to 5.0
	@Before 
	public void setUp() throws Exception { 
	exampleRange = new Range(-5.0, 5.0); 
	} 

	/*Test Case 1: FAIL
	 * -3.0 is closest to -5.0, so our output (constrained value) should be 5.0
	 * Instead our value remained -3.0 
	 */
	@Test
	public void isWithinRange() { 
		double constraintValue = exampleRange.constrain(-3.0); // Input value
		assertEquals(-5, constraintValue , .000000001d); 
		} 
	
	/*Test Case 2: FAIL
	 * 55.0 is outside the range of -5.0 < x < 5.0 meaning it should just output 55.0 
	 * Will not output a constrained value
	 * Instead it outputs 5.0, which is the closest constrained value (but not in range)
	 */
	@Test
	public void isNotWithinRange() { 
		double constraintValue = exampleRange.constrain(55.0); // Input value
		assertEquals(55.0, constraintValue , .000000001d); 
		} 
}
