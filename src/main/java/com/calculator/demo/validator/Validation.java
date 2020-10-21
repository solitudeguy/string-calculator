package com.calculator.demo.validator;

import com.calculator.demo.exception.NegetiveNotSupportedException;

public interface Validation {

	public Boolean convertIfEmptyToZero(String num);

	public Boolean validateNegative(String num) throws NegetiveNotSupportedException;

	public Boolean validateGreaterThanHundred(String num);

}
