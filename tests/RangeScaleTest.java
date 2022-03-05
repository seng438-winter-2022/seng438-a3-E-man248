package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RangeScaleTest {

	/* Setup Before Any Test Occurs
	 * 
	 */
	@Before
	public void setupTest()
	{
		// No General Setup
	}

	/* Test Case 1: 
	 * The scale factor passed in is a value less than 0
	 */
	@Test
	public void scaleFactorLessThanZero()
	{
		double factor = -1;
		Range base = new Range(2.0,3.0);
		try
		{
			Range result = Range.scale(base, factor);
			fail("Null not permitted, failed test");
		}
		catch(Exception e) {
			
		}
	}
	
	/* Test Case 2: 
	 * The scale factor passed in is a value greater than 0
	 */
	@Test
	public void scaleFactorGreaterThanZero()
	{
		double factor = 2;
		Range base = new Range(2.0,3.0);
		
		// Exercise:
		Range result = Range.scale(base, factor);
		assertEquals("Output lower bound should be 4", 2, result.getLowerBound(), .000000001d);
		assertEquals("Output upper bound should be 6", 3, result.getUpperBound(), .000000001d);
	}

}
