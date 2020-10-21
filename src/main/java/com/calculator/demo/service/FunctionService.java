package com.calculator.demo.service;

import com.calculator.demo.exception.NegetiveNotSupportedException;
import com.calculator.demo.validationservice.ValidationInput;

public class FunctionService {
	
	Calculator calculator = new Calculator();
	ValidationInput valinput = new ValidationInput();
	public Integer calculateSum(String input) throws NegetiveNotSupportedException{	
		int sum = 0;
			for (String inp : input.split(",|\\s+")) {
				
				if (valinput.convertIfEmptyToZero(inp) && valinput.validateGreaterThanHundred(inp) && valinput.validateNegative(inp)) {
					sum = calculator.add(sum , Integer.parseInt(inp));
				}
			}
			return sum;
		
	}

}
