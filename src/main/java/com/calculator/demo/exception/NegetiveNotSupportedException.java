package com.calculator.demo.exception;

public class NegetiveNotSupportedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegetiveNotSupportedException(String msg){
		
		super("Negetive Number Not supported : " + msg);
	}
}
