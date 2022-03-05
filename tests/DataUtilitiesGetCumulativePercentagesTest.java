package org.jfree.data;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DataUtilitiesGetCumulativePercentagesTest
{
	private Mockery mockingContext;
	private KeyedValues data; 
	
	/* 
	 * Test Setup: Setup function played before every test.
	 * For this set up function, the Mockery used to make the
	 * mock as well as the KeyedValues class mock have been instantiated.
	 */
	@Before
	public void beforeTestSetup() throws Exception
	{
	    // setup
		mockingContext = new Mockery();
		data = mockingContext.mock(KeyedValues.class);
	}
	
	// Test Tear-Down: Clean-up function played after every test
	@After
	public void afterTestTeardown()
	{
	    // tear-down: NONE in this test method
	}
	
	/* 
	 * Test 1: This test case tests the intersects function under the following conditions:
	 *  - The KeyedValues object pointer, data, is null
	 *  - The object data is empty (no entries)
	 *  - All items in data do not have their values set to zero
	 *  - There is not only one item in data
	 */
	@Test
	public void getCumulativePercentagesNullArgument() throws InvalidParameterException
	{
		data = null;
		
		try
		{
		    //exercise
		    KeyedValues result = DataUtilities.getCumulativePercentages(data);
		}
	    catch (Exception e)
	    {
	    	//verify
	    	if (!(e instanceof InvalidParameterException))
	    	{
	    		Assert.fail("Asserstion Error: Expected Invalid Parameter Exception, got " + e.toString() + "\n");
	    	}
	    }
	}
	
	/* 
	 * Test 2: This test case tests the intersects function under the following conditions:
	 *  - The KeyedValues object pointer, data, is not null
	 *  - The object data is empty (no entries)
	 *  - All items in data do not have their values set to zero
	 *  - There is not only one item in data
	 */	
	@Test
	public void getCumulativePercentagesEmptyArray() throws InvalidParameterException
	{
		try
		{
			//setup
			mockingContext.checking(new Expectations() {
		        {
		            one(data).getItemCount();
		            will(returnValue(0));

		            one(data).getItemCount();
		            will(returnValue(0));
		        }
		    });
			
		    //exercise
		    KeyedValues result = DataUtilities.getCumulativePercentages(data);
		}
	    catch (Exception e)
	    {
	    	//verify
	    	if (!(e instanceof InvalidParameterException))
	    	{
	    		Assert.fail("Asserstion Error: Expected Invalid Parameter Exception, got " + e.toString());
	    	}
	    }
	}
	
	

	/* 
	 * Test 4: This test case tests the intersects function under the following conditions:
	 *  - The KeyedValues object pointer, data, is not null
	 *  - The object data not is empty
	 *  - All items in data have their values set to zero
	 *  - There is not only one item in data
	 */			
	@Test
	public void getCumulativePercentagesOnTwoItemsOfValueZero()
	{
		try
		{
			//setup
			mockingContext.checking(new Expectations() {
		        {	

		        	allowing(data).getItemCount();
		            will(returnValue(2));

		            allowing(data).getValue(0);
		            will(returnValue(0));

		            allowing(data).getKey(0);
		            will(returnValue(0));
		            
		            allowing(data).getValue(1);
		            will(returnValue(0));

		            allowing(data).getKey(1);
		            will(returnValue(1));
		        }
		    });
			
		    //exercise
		    KeyedValues result = DataUtilities.getCumulativePercentages(data);
		    Assert.assertEquals("Expected Zero", 1.0, result.getValue(0).doubleValue(), .000000001d);
		}
	    catch (Exception e)
	    {
	    	Assert.fail("Expected Zero");
	    }
	}
	
		
	
	
	/* 
	 * Test 6: This test case tests the intersects function under the following conditions:
	 *  - The KeyedValues object pointer, data, is not null
	 *  - The object data not is empty
	 *  - All items in data do not have their values set to zero
	 *  - There is not only one item in data
	 */		
	@Test
	public void getCumulativePercentagesOnTwoItemsOfValueNotZero()
	{
		try
		{
			//setup
			mockingContext.checking(new Expectations() {
		        {				            
		            allowing(data).getItemCount();
		            will(returnValue(2));

		            allowing(data).getValue(0);
		            will(returnValue(5));

		            allowing(data).getKey(0);
		            will(returnValue(0));
		            
		            allowing(data).getValue(1);
		            will(returnValue(9));

		            allowing(data).getKey(1);
		            will(returnValue(1));
		        }
		    });
			
		    //exercise
		    KeyedValues result = DataUtilities.getCumulativePercentages(data);
		    Assert.assertEquals("Expected 0.3571429", 0.3571429, result.getValue(0).doubleValue(), .000000001d);
		    Assert.assertEquals("Expected 1.0", 1.0, result.getValue(1).doubleValue(), .000000001d);
		}
	    catch (Exception e)
	    {
	    	Assert.fail("Expected Zero");
	    }
	}
}
