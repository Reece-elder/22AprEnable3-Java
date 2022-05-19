package com.qa.exceptions;

public class FancyCustomException extends Exception {

	public FancyCustomException(String string) {
		super(string); // passes in the string message into the Exception parent
	}
	
	

}
