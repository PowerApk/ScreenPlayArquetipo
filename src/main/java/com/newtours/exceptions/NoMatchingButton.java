package com.newtours.exceptions;

public class NoMatchingButton extends AssertionError{
	
	/**
	 * PowerApk Exceptions ¡¡¡¡
	 */
	private static final long serialVersionUID = 1L;

	public NoMatchingButton(String message, Throwable cause) {       
        super(message, cause);
    }
}
