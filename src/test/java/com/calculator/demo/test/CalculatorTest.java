package com.calculator.demo.test;

import org.junit.Assert;
import org.junit.Test;

import com.calculator.demo.exception.NegetiveNotSupportedException;
import com.calculator.demo.service.FunctionService;



public class CalculatorTest {

	
	@Test
	public void testWithCommaDelimiter() throws NegetiveNotSupportedException {
		String input = "1,2,3";
		FunctionService calculator  = new FunctionService();
		Assert.assertEquals(calculator.calculateSum(input), new Integer(6));
	}

	@Test
	public void testWithSpaceDelimiter() throws NegetiveNotSupportedException {
		String input = "1 2 3";
		FunctionService calculator  = new FunctionService();		
		Assert.assertEquals(calculator.calculateSum(input), new Integer(6));
	}
	
	@Test
	public void testWithBlank() throws NegetiveNotSupportedException {
		String input = "1,,3";
		FunctionService calculator  = new FunctionService();
		calculator.calculateSum(input);
		
		Assert.assertEquals(calculator.calculateSum(input), new Integer(4));	
	}
	
	@Test
	public void testWithGreaterThanhundered() throws NegetiveNotSupportedException {
		String input = "1,101,3";
		FunctionService calculator  = new FunctionService();
		calculator.calculateSum(input);
		Assert.assertEquals(calculator.calculateSum(input), new Integer(4));
	}
	
	@Test
	public void testWithNullInput() throws NegetiveNotSupportedException {
		String input = "1,null,3";
		FunctionService calculator  = new FunctionService();
		calculator.calculateSum(input);
		Assert.assertEquals(calculator.calculateSum(input), new Integer(4));		
	}
	
	@Test
	public void testWithNegetiveInput(){
			Throwable exception = Assert.assertThrows(NegetiveNotSupportedException.class,()->{
				String input = "1,-1,3";
				FunctionService calculator  = new FunctionService();
				calculator.calculateSum(input);
				});
			
			Assert.assertEquals("Negetive Number Not supported : -1", exception.getMessage());	
	}
	
	@Test
	public void testWithNegetiveInputWithBlankDel(){
			Throwable exception = Assert.assertThrows(NegetiveNotSupportedException.class,()->{
				String input = "1 -1 3";
				FunctionService calculator  = new FunctionService();
				calculator.calculateSum(input);
				});	
			Assert.assertEquals("Negetive Number Not supported : -1", exception.getMessage());
	
	}
}
