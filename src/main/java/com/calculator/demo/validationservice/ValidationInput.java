package com.calculator.demo.validationservice;

import com.calculator.demo.exception.NegetiveNotSupportedException;
import com.calculator.demo.validator.Validation;

public class ValidationInput implements Validation {

	public Boolean convertIfEmptyToZero(String num) {
		if (num.trim().equals("") || num.trim().equals("null"))
			return false;
		return true;
	}

	public Boolean validateNegative(String num) throws NegetiveNotSupportedException {
		Integer num1 = Integer.parseInt(num);
		if (num1 < 0)
			throw new NegetiveNotSupportedException(num);
		return true;
	}

	public Boolean validateGreaterThanHundred(String num) {
		Integer num1 = Integer.parseInt(num);
		if (num1 > 100)
			return false;
		return true;
	}

}
