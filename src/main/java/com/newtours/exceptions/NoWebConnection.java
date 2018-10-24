package com.newtours.exceptions;

public class NoWebConnection extends AssertionError  {
	
	/**
	 * Excepcion para cuando no hay conexion con la web
	 */
	private static final long serialVersionUID = 1L;

	public NoWebConnection(String message, Throwable cause) {       
        super(message, cause);
    }

}
